const antlr4 = require('antlr4');
const GramaticaVisitor = require('./GramaticaVisitor').GramaticaVisitor;

class CustomGramaticaVisitor extends GramaticaVisitor {
    constructor() {
        super();
        this.output = [];
        this.functions = {};
    }

    // Visita el nodo raíz (comando)
    visitcomando(ctx) {
        const prefix = this.visitPrefijo(ctx.Prefijo());
        const commandName = ctx.Nombre().getText();
        const args = [];
        
        // Procesar todos los argumentos
        for (let i = 0; i < ctx.Argumento().length; i++) {
            args.push(this.visitArgumento(ctx.Argumento(i)));
        }

        // Generar código JavaScript basado en el comando
        const jsCode = this.generateFunction(prefix, commandName, args);
        this.output.push(jsCode);
        
        return jsCode;
    }

    visitPrefijo(ctx) {
        // Extraer el símbolo de prefijo (!, ?, %, /)
        return ctx.getText();
    }

    visitArgumento(ctx) {
        // Determinar si es posicional u opcional
        if (ctx.ArgumentoPosicional()) {
            return this.visitArgumentoPosicional(ctx.ArgumentoPosicional());
        } else if (ctx.ArgumentoOpcional()) {
            return this.visitArgumentoOpcional(ctx.ArgumentoOpcional());
        }
        return null;
    }

    visitArgumentoPosicional(ctx) {
        // Manejar los tres tipos de argumentos posicionales
        if (ctx.TEXTO()) {
            return ctx.TEXTO().getText(); // Mantener las comillas
        } else if (ctx.PALABRA()) {
            return ctx.PALABRA().getText();
        } else if (ctx.NUMERO()) {
            return parseFloat(ctx.NUMERO().getText());
        }
        return null;
    }

    visitArgumentoOpcional(ctx) {
        const optionName = this.visitNombreArgumento(ctx.NombreArgumento());
        let optionValue = null;
        
        if (ctx.ValorArgumento()) {
            optionValue = this.visitValorArgumento(ctx.ValorArgumento());
        }

        return {
            option: optionName,
            value: optionValue
        };
    }

    visitNombreArgumento(ctx) {
        // Extraer el nombre de la opción (sin los --)
        let name = '';
        for (let i = 0; i < ctx.children.length; i++) {
            const child = ctx.children[i];
            if (child.symbol) {
                if (child.symbol.type === this.parser.LETRA) {
                    name += child.getText();
                }
            } else if (child.ValorArgumento) {
                name += this.visitValorArgumento(child);
            }
        }
        return name;
    }

    visitValorArgumento(ctx) {
        // Manejar los tres tipos de valores
        if (ctx.TEXTO()) {
            return ctx.TEXTO().getText();
        } else if (ctx.PALABRA()) {
            return ctx.PALABRA().getText();
        } else if (ctx.NUMERO()) {
            return parseFloat(ctx.NUMERO().getText());
        }
        return null;
    }

    // Método principal para generar funciones JavaScript
    generateFunction(prefix, commandName, args) {
        const positionalArgs = args.filter(arg => typeof arg !== 'object');
        const optionalArgs = args.filter(arg => typeof arg === 'object');
        
        let functionBody = '';
        let functionCall = '';
        
        switch(prefix) {
            case '!':
                // Comando de ejecución inmediata
                functionBody = this.generateExecutionBody(commandName, positionalArgs, optionalArgs);
                functionCall = functionBody; // Se autoejecuta
                break;
            case '?':
                // Comando de consulta
                functionBody = this.generateQueryBody(commandName, positionalArgs, optionalArgs);
                functionCall = `console.log(${functionBody});`;
                break;
            case '%':
                // Comando de asignación
                functionBody = this.generateAssignmentBody(commandName, positionalArgs, optionalArgs);
                functionCall = functionBody;
                break;
            case '/':
                // Comando de función pura
                functionBody = this.generatePureFunction(commandName, positionalArgs, optionalArgs);
                functionCall = `${functionBody}\n${commandName}(${positionalArgs.join(', ')});`;
                break;
            default:
                functionBody = `// Implementación por defecto para ${commandName}`;
                functionCall = `console.log("Comando no reconocido");`;
        }
        
        return functionCall;
    }

    generateExecutionBody(commandName, positionalArgs, optionalArgs) {
        const argsStr = positionalArgs.map(arg => 
            typeof arg === 'string' ? arg : JSON.stringify(arg)
        ).join(', ');
        
        return `(function ${commandName}() {\n` +
               `  // Ejecución: ${commandName}\n` +
               `  console.log(${argsStr});\n` +
               `})();`;
    }

    generateQueryBody(commandName, positionalArgs, optionalArgs) {
        const options = optionalArgs.map(opt => 
            `${opt.option}: ${JSON.stringify(opt.value)}`
        ).join(', ');
        
        return `"Resultado de ${commandName} con ` +
               `${positionalArgs.join(', ')}` +
               (options ? ` y opciones: {${options}}` : '') +
               `"`;
    }

    generateAssignmentBody(commandName, positionalArgs, optionalArgs) {
        if (positionalArgs.length === 0) return '// Sin argumentos para asignación';
        
        const varName = positionalArgs[0];
        const varValue = positionalArgs.length > 1 ? positionalArgs[1] : 'null';
        
        return `let ${varName} = ${JSON.stringify(varValue)};` +
               `\n// ${commandName} asignado` +
               (optionalArgs.length > 0 ? 
                   `\n// Opciones: ${optionalArgs.map(o => o.option).join(', ')}` : 
                   '');
    }

    generatePureFunction(commandName, positionalArgs, optionalArgs) {
        const params = positionalArgs.map((arg, i) => 
            `arg${i + 1}`).join(', ');
        
        const optionsParam = optionalArgs.length > 0 ? 
            `, options = {${optionalArgs.map(o => 
                `${o.option}: ${JSON.stringify(o.value)}`).join(', ')}}` : 
            '';
        
        return `function ${commandName}(${params}${optionsParam}) {\n` +
               `  // Función pura: ${commandName}\n` +
               `  return ${params.length > 0 ? params.split(', ')[0] : 'null'};\n` +
               `}`;
    }

    getOutput() {
        return this.output.join('\n\n');
    }
}

module.exports = CustomGramaticaVisitor;
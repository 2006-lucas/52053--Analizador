
# Analizador de Lenguaje Específico

Analizador sintáctico para un lenguaje definido por EBNF que procesa archivos de entrada.

## 📋 Gramática

![ScreenHunter_642 May  19 16 39](https://github.com/user-attachments/assets/c94ba2fe-bbb6-4272-95ef-bb67a87f9be8)


##  Requisitos 

- **Git** ([Descargar](https://git-scm.com/downloads))
- **Node.js v18+** ([Descargar](https://nodejs.org/))
- **Java JRE 8+** (Solo para regenerar el analizador, [Descargar](https://www.java.com/download/))

#  Clonación e Instalación

Sigue estos pasos para clonar e instalar dependencias del proyecto:

1. **Abre Git Bash/PowerShell** (Windows) o **Una terminal** (Linux/Mac) en la carpeta donde quieres clonar el repositorio Github.

2. Ejecutar lo siguiente en el **Git Bash/PowerShell** (Windows) o **Una terminal** (Linux/Mac)
   ```bash
   git clone https://github.com/2006-lucas/52053--Analizador.git
3. **Instalar Dependencias:**
   ```bash
   # Instalar dependencias de Node.js (ANTLR4 runtime y demás)
   npm install

   # Instalar ANTLR4 globalmente (opcional, solo si necesitas regenerar el analizador)
   npm install -g antlr4
 4. Generar los archivos del parser y lexer con ANTLR
```bash
antlr4 -Dlanguage=JavaScript -o generated Analizador.g4

```

## Instrucciones de uso🛠
1. Escribir un cadena valida o no valida en el archivo input.txt, por ejemplo:
```sh
   . ! saludar "Juan Pérez" --modo=formal 123
   . ! saludar @ana --modo=formal
   . ! 123buscar "archivo"
   . #ejecutar @usuario 123abc

```
2. Ejecutar el intérprete:
```sh
npm start
```
3. Vera en la consola

    - La tabla de tokens generados por el lexer.
    - El árbol de derivación.
    - La ejecución de las instrucciones definidas en el input.
   
4. Para ver el parser tree Apretar F5
   ![image](https://github.com/user-attachments/assets/fa436cc7-c3d5-459a-83d2-a864b5d88f40)
   
  ### Atencion
Abrir vscode en la carpeta lenguaje no en la carpeta 52053, por lo contrario no mostrará el arbol ya que vscode tomará el lauch.json de la carpeta raiz(52053) el cual no esta configurado para mostrar el parser tree.

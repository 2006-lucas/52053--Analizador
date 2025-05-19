
# Analizador de Lenguaje Específico

Analizador sintáctico para un lenguaje definido por EBNF que procesa archivos de entrada.

## 📋 Gramática

![![ScreenHunter_642 May  19 16 39](https://github.com/user-attachments/assets/c94ba2fe-bbb6-4272-95ef-bb67a87f9be8)
]


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
4. 3. Generar los archivos del parser y lexer con ANTLR
```sh
antlr4 -Dlanguage=JavaScript -o generated Analizador.g4
```

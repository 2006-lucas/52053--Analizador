# Lenguaje.g4

Este proyecto implementa un lenguaje de programación simple utilizando ANTLR4. Está diseñado para demostrar el proceso de análisis léxico, sintáctico y semántico. El lenguaje permite imprimir mensajes en consola, repetir instrucciones y finalizar la ejecución mediante una condición booleana.

## Instalacion

1. Clona este repositorio: git clone 
2. Instalar dependencias necesarias
sh
npm install

3. Generar los archivos del parser y lexer con ANTLR
sh
antlr4 -Dlanguage=JavaScript -o generated Programa.g4


## Instrucciones de uso
1. Escribir un programa en el archivo input.txt, por ejemplo:
sh
repetir{
  imprimir("Hola!");
  imprimir("Como estas?");
  salir;
} hasta verdadero;
 

2. Ejecutar el intérprete:
sh
npm start

3. Vera en la consola

    - La tabla de tokens generados por el lexer.
    - El árbol de derivación.
    - La ejecución de las instrucciones definidas en el input.

![image](https://github.com/user-attachments/assets/eeb9b832-d533-425f-83d3-5312f6e1f447)

4. Para ver el parser tree Apretar F5

![image](https://github.com/user-attachments/assets/f04732ea-d440-46ec-ae4c-f2457e0794a3)

### Atencion
Abrir vscode en la carpeta lenguaje no en la carpeta 52519, por lo contrario no mostrará el arbol ya que vscode tomará el lauch.json de la carpeta raiz(52519) el cual no esta configurado para mostrar el parser tree.

## Comentarios adiccionales
1. No es necesario el archivo input.txt es posible eliminarlo y el progrma seguira funcionando.

    Si lo elimina se le pedira en la terminal que ingresar una cadena para analizar
   
3. Si hay un error de sintaxis en la cadena ah anlizar el parser dará error y mostrara la tabla de lexemas y tokens con cada una de las letras como lexemas.

![image](https://github.com/user-attachments/assets/e124857f-db9f-489a-a337-8161b6f63522)

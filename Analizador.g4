grammar Analizador;

//PARSER
comando : Prefijo Nombre Argumento* ;
Prefijo : '!' | '#' | '&'|'/';
Nombre : PALABRA ;
Argumento : ArgumentoPosicional | ArgumentoOpcional ;
ArgumentoPosicional : TEXTO | PALABRA | NUMERO ;
ArgumentoOpcional : '--' NombreArgumento ('=' ValorArgumento)? ;
NombreArgumento : LETRA (LETRA | ValorArgumento)* ;
ValorArgumento : TEXTO | NUMERO | PALABRA ;

//LEXER
TEXTO  : '"' (~["\r\n])* '"' ;         
NUMERO : [0-9]+ ;
PALABRA: [a-zA-ZÁÉÍÓÚÑáéíóúñ_][a-zA-ZÁÉÍÓÚÑáéíóúñ_0-9]* ;
LETRA  : [a-zA-Z] ;
ESPACIOS : [ \t\r\n]+ -> skip ;


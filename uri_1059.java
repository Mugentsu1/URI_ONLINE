/*
URI Online Judge | 1059
Números Pares
Faça um programa que mostre os números pares entre 1 e 100, inclusive.

Entrada
Neste problema extremamente simples de repetição não há entrada.

Saída
Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.

----------------------------------------------------
        Exemplo de Entrada	    Exemplo de Saída
                                    2
                                    4
                                    6
                                    ...
                                    100
----------------------------------------------------
*/

public class uri_1059{
    public static void main(String[] args){
        for(int a=2; a<=100; a+=2){
            System.out.println(a);
        }
    }
}
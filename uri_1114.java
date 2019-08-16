/*
URI Online Judge | 1114
Senha Fixa

Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o 
algoritmo encerrado. Considere que a senha correta é o valor 2002. 

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.

Exemplo de Entrada	Exemplo de Saída
2200                Senha Invalida
1020                Senha Invalida
2022                Senha Invalida
2002                Acesso Permitido

Formatação e inserção no portal por Cássio Favaretto.*/

import java.util.Scanner;
public class uri_1114{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n=2002, x;
        do{
            x= entrada.nextInt();

            if(n == x){
                System.out.println("Acesso Permitido");
            }
            else{
                System.out.println("Senha Invalida");
        }
    }
    while(x !=n);
entrada.close();
    }
}
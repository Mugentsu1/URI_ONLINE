/*
URI Online Judge | 1143
Quadrado e ao Cubo

Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas 
de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

------------------------------------------------------------
        Exemplo de Entrada	    Exemplo de Saída
        5                           1 1 1
                                    2 4 8
                                    3 9 27
                                    4 16 64
                                    5 25 125
------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1143{
    public static void main(String[] argS){
        Scanner entrada = new Scanner(System.in);
        int n, x=1;

        n = entrada.nextInt();

        for(int i=x; i<=n; i++){
            System.out.printf("%d %d %d\n", x, x*x, x*x*x );
            x = x+1;
        }

entrada.close();
    }
}
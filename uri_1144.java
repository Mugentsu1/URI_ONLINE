/*
URI Online Judge | 1144
Sequência Lógica

Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas na 
execução do programa, seguindo a lógica do exemplo abaixo. Para valores com mais de 6 dígitos, 
todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.
-----------------------------------------------------------------------
        Exemplo de Entrada	        Exemplo de Saída
        5                               1 1 1
                                        1 2 2
                                        2 4 8
                                        2 5 9
                                        3 9 27
                                        3 10 28
                                        4 16 64
                                        4 17 65
                                        5 25 125
                                        5 26 126
-----------------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1144{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n, x, y, z, a;
        n = entrada.nextInt();

        for(int i=1; i<=n; i++){
            x = i * i;
            y = i * i * i;
            System.out.printf("%d %d %d\n",i, x, y);
            z = x + 1;
            a = y + 1;
            System.out.printf("%d %d %d\n",i, z, a);

        }
        

entrada.close();
    }
}
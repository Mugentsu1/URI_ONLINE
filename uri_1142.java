/*
URI Online Judge | 1142
PUM

Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que 
serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
-------------------------------------------------------
Exemplo de Entrada	        Exemplo de Saída
7                           1 2 3 PUM
                            5 6 7 PUM
                            9 10 11 PUM
                            13 14 15 PUM
                            17 18 19 PUM
                            21 22 23 PUM
                            25 26 27 PUM
-------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1142{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int x=1, n;

        n = entrada.nextInt();

        for(int i=x; i<=n; i++){
            System.out.printf("%d %d %d PUM\n", x, x+1, x+2);
            x = x + 4;
        }
        

entrada.close();
    }
}
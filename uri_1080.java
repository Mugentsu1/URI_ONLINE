/*
URI Online Judge | 1080
Maior e Posição

Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

------------------------------------------------------------
||||    Exemplo de Entrada  |   Exemplo de Saída        ||||
||||    2                   |       34565               ||||
||||    113                 |       4                   ||||
||||    45                  |                           ||||
||||    34565               |                           ||||
||||    6                   |                           ||||
||||    ...                 |                           ||||
||||    8                   |                           ||||
------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1080{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int N, Maior, posicao = 0;

        Maior = Integer.MIN_VALUE;
        for(int i=1; i<=100; i++){
            N = entrada.nextInt();
            if(N > Maior){
                Maior = N;
                posicao = i;
            }
        }
        System.out.println(Maior);
        System.out.println(posicao);


entrada.close();
    }
}
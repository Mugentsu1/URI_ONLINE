/*
URI Online Judge | 1101
Sequência de Números e Soma

Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor 
ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros 
consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N. 
A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
---------------------------------------------------------
        Exemplo de Entrada	        Exemplo de Saída
        5 2                         2 3 4 5 Sum=14
        6 3                         3 4 5 6 Sum=18
        5 0
---------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1101{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int M = 1000, N = 1000, soma=0;

        while((M > 0) & (N > 0)){
            M = entrada.nextInt();
            N = entrada.nextInt();
            soma = 0;

            if(M < N){
                for(int i=M; i<=N; i++){
                    System.out.print(i);
                    soma+=i;
                }
                System.out.println("Sum=" + soma);
            }
            else{
                for(int i=N; i<=M; i++){
                    System.out.print(i + " ");
                    soma+=i;
                }
                System.out.println("Sum=" + soma);
            }
        }

        //Resposta ta dando Wrong answer (15%)
        //Codigo está com saida normal
entrada.close();
    }
}
/*
URI Online Judge | 1132
Múltiplos de 13

Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são
múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, 
inclusive ambos se for o caso.
-----------------------------------------------
        Sample Input	Sample Output
        100             13954
        200
-----------------------------------------------
*/
import java.util.Scanner;
public class uri_1132{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int x, y, soma=0;
        x = entrada.nextInt();
        y = entrada.nextInt();

        if(x < y){
            for(int i = x; i<=y; i++){
                if(i % 13 !=0){
                    soma += i;
                }
            }
        }
        else{
            for(int i = y; i<=x; i++){
                if(i % 13 !=0){
                    soma += i;
                }
            }
        }
        System.out.println(soma);

entrada.close();
    }
}
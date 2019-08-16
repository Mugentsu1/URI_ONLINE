/*
URI Online Judge | 1133
Resto da Divisão

Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo 
resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
-----------------------------------------------------
    Sample Input      	Sample Output
    10                  12
    18                  13
                        17
-----------------------------------------------------
*/
import java.util.Scanner;
public class uri_1133{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int x, y, z;

        x = entrada.nextInt();
        y = entrada.nextInt();

        if(x>y){
            z=x;
            x=y;
            y=z;
        }

        for(int i = x+1; i < y; i++){
            if((i % 5 == 2) || (i % 5 == 3)){
                System.out.println(i);
            }
        }

entrada.close();
    }
}

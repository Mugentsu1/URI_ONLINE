/*
URI Online Judge | 1065
Pares entre Cinco Números

Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e 
mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

------------------------------------------------------------
        Exemplo de Entrada	 |   Exemplo de Saída
        7                    |   3 valores pares
        -5                   |
        6                    |
        -4                   |
        12                   |
----------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1065{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int contadores=0;

        for(int i=0; i <5; i++){
            int numero = input.nextInt();
            
            if(numero %2 == 0){
            contadores+=1;
            }
        }

        System.out.printf("%d valores pares\n", contadores);

input.close();
    }
}
/*
URI Online Judge | 1066
Pares, Ímpares, Positivos e Negativos

Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores 
digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha 
após cada uma.

--------------------------------------------------------------------
||||    Exemplo de Entrada	|    Exemplo de Saída               ||||
||||    -5                  |    3 valor(es) par(es)            ||||
||||    0                   |    2 valor(es) impar(es)          ||||
||||    -3                  |    1 valor(es) positivo(s)        ||||
||||    -4                  |    3 valor(es) negativo(s)        ||||
||||    12                  |                                   ||||
--------------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1066{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, par = 0, impar = 0, positivo = 0, negativo = 0;

        for(int i = 0; i < 5; i++){
            n = input.nextInt();

            if(n % 2 == 0){
                par++;
            }
            else{
                impar++;
            }

            if(n > 0){
                positivo++;
            }

            else if(n < 0){
                negativo++;
            }

        }

        System.out.println(par +" valor(es) par(es)");
        System.out.println(impar +" valor(es) impar(es)");
        System.out.println(positivo +" valor(es) positivo(s)");
        System.out.println(negativo +" valor(es) negativo(s)");

        input.close();
    }
}
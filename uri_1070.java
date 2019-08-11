/**
URI Online Judge | 1070
Seis Números Ímpares

Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, 
um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

------------------------------------------------------------
||||    Exemplo de Entrada  |  	Exemplo de Saída        ||||
||||    8                   |       9                   ||||
||||                        |       11                  ||||
||||                        |       13                  ||||
||||                        |       15                  ||||
||||                        |       17                  ||||
||||                        |       19                  ||||
------------------------------------------------------------
 */
import java.util.Scanner;
 public class uri_1070{
     public static void main (String[] args){
         Scanner entrada = new Scanner(System.in);
         int numero;

         numero = entrada.nextInt();

         for(int i=numero; i < numero + 12  ; i++){
             if(i % 2 == 1){
            System.out.println(i);
             }
         }


entrada.close();
     }
     
 }
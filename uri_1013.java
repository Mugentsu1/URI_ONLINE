/*
URI Online Judge | 1013
O Maior

Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem 
“eh o maior”. Utilize a fórmula:

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

------------------------------------------------------------
||||||| Exemplos de Entrada	 |   Exemplos de Saída      |||||
||||||| 7 14 106             |       106 eh o maior     |||||
|||||||----------------------|-------------------------------
||||||| 217 14 6             |       217 eh o maior     |||||
-------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1013{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int a, b, c;
        int MaiorABC = 0;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if(a > MaiorABC){
            MaiorABC = a;
        }

        if(b > MaiorABC){
            MaiorABC = b;
        }

        if(c > MaiorABC){
            MaiorABC = c;   
        }

        System.out.println(MaiorABC + " eh o maior");

        entrada.close();
    }
}
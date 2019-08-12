/*
URI Online Judge | 1075
Resto 2

Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão 
resto igual a 2.

Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.

----------------------------------------------------------
        Exemplo de Entrada	    Exemplo de Saída
                13                  2
                                    15
                                    28
                                    41
----------------------------------------------------------...
*/
import java.util.Scanner;
public class uri_1075{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        for(int i=1; i<10000; i++){
            if(i % n == 2){
                System.out.println(i);
            }
        }


entrada.close();
    }
}
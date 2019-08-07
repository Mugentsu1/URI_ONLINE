/*
URI Online Judge | 1007
Diferença
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B 
pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em 
branco antes e depois da igualdade.

----------------------------------------------------------------
||||    Exemplos de Entrada	        Exemplos de Saída       ||||
||||    5                                                   ||||
||||    6                            DIFERENCA = -26        ||||
||||    7                                                   ||||
||||    8                                                   ||||
||||--------------------------------------------------------||||
||||    0                                                   ||||
||||    0                            DIFERENCA = -56        ||||
||||    7                                                   ||||
||||    8                                                   ||||
||||--------------------------------------------------------||||
||||    5                                                   ||||
||||    6                            DIFERENCA = 86         ||||
||||    -7                                                  ||||
||||    8                                                   ||||
----------------------------------------------------------------
        
*/
import java.util.Scanner;
public class uri_1007{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int CALCULO;

      
        A = entrada.nextInt();

   
        B = entrada.nextInt();

    
        C = entrada.nextInt();


        D = entrada.nextInt();


        CALCULO = (A * B - C * D);


        System.out.println("DIFERENCA = " + CALCULO);

        entrada.close();
    }
}
/*
URI Online Judge | 1042
Sort Simples

Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.

-------------------------------------------------
|||| Exemplo de Entrada	Exemplo de Saída     ||||
||||    7 21 -14               -14           ||||
||||                            7            ||||
||||                            21           ||||
||||                                         ||||
||||                            7            ||||
||||                            21           ||||
||||                            -14          ||||
-------------------------------------------------
||||    -14 21 7               -14           ||||
||||                            7            ||||
||||                            21           ||||
||||                                         ||||
||||                            -14          ||||
||||                            21           ||||
||||                            7            ||||
-------------------------------------------------
*/
import java.util.Scanner;
public class uri_1042{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int N1, N2, N3;

        N1 = entrada.nextInt();
        N2 = entrada.nextInt();
        N3 = entrada.nextInt();

        if((N1 < N2) & (N2 < N3)){
            System.out.println(N1);
            System.out.println(N2);
            System.out.println(N3);
        }

        else if((N1 < N3) & (N3 < N2)){
            System.out.println(N1);
            System.out.println(N3);
            System.out.println(N2);
        }

        else if((N2 < N1) & (N1 < N3)){
            System.out.println(N2);
            System.out.println(N1);
            System.out.println(N3);
        }

        else if((N2 < N3) & (N3 < N1)){
            System.out.println(N2);
            System.out.println(N3);
            System.out.println(N1);
        }

        else if((N3 < N1) & (N1 < N2)){
            System.out.println(N3);
            System.out.println(N1);
            System.out.println(N2);
            
        }
        
        else{
            System.out.println(N3);
            System.out.println(N2);
            System.out.println(N1);
        }

        System.out.println("\n" + N1);
        System.out.println(N2);
        System.out.println(N3);


        entrada.close();
        


    }
}
/*
URI Online Judge | 1099
Soma de Ímpares Consecutivos II

Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares 
existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.

--------------------------------------------------------------
        Exemplo de Entrada      	Exemplo de Saída
        7                               0
        4 5                             11
        13 10                           5
        6 4                             0
        3 3                             0
        3 5                             0
        3 4                             12
        3 8
--------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1099{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int N, X, Y, total;

        N = entrada.nextInt();

        for(int z=0; z<N; z++){
            X = entrada.nextInt();
            Y = entrada.nextInt();
            total = 0;

            if(X < Y){
                for(int i=X+1; i<Y; i++){
                    if(i % 2 !=0){
                    total+=i;
                    }
                }
            }
            else{
                for(int i=Y+1; i<X; i++){
                    if(i % 2 !=0){
                    total+=i;
                    }
                }
            }
            System.out.println(total);        
        }
entrada.close();
    }
}
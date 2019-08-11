/*
URI Online Judge | 1072
Intervalo 2

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.

--------------------------------------------------------
||||    Exemplo de Entrada  |	Exemplo de Saída    ||||
||||    4                   |    2 in               ||||
||||    14                  |    2 out              ||||
||||    123                 |                       ||||
||||    10                  |                       ||||
||||    -25                 |                       ||||
--------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1072{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int N, X, in=0, out=0;

        N = entrada.nextInt();

        for(int i=0; i<N; i++){
            X = entrada.nextInt();
            if((X >= 10) &(X <= 20)){
                in++;
            }
            else{
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

entrada.close();
    }
}
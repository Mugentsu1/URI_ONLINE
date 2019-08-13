/*
URI Online Judge | 1079
Médias Ponderadas

Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que 
o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de 
teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.

------------------------------------------------------------
||||    Exemplo de Entrada  |	Exemplo de Saída        ||||
||||    3                   |       5.7                 ||||
||||    6.5 4.3 6.2         |       6.3                 ||||
||||    5.1 4.2 8.1         |       9.3                 ||||
||||    8.0 9.0 10.0        |                           ||||
------------------------------------------------------------
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class uri_1079{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int N; //Quantidade de entrada para inserir as notas
        double t1, t2, t3, media;

        N = entrada.nextInt();

        for(int i=0; i<N; i++){
            t1 = entrada.nextDouble();
            t2 = entrada.nextDouble();
            t3 = entrada.nextDouble();
            media = (2*t1 + 3*t2 + 5*t3)/10;

            System.out.println(df.format(media));
        }


entrada.close();
    }
}
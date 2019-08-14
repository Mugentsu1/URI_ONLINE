/*
URI Online Judge | 1094
Experiências
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar 
os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias 
foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, 
o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias 
utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de 
cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois 
dígitos após o ponto.

Exemplo de Entrada	    Exemplo de Saída
10                      Total: 92 cobaias    
10 C                    Total de coelhos: 29
6 R                     Total de ratos: 40
15 S                    Total de sapos: 23
5 C                     Percentual de coelhos: 31.52 %
14 R                    Percentual de ratos: 43.48 %
9 C                     Percentual de sapos: 25.00 %
6 R
8 S
5 C
14 R
*/
import java.util.Scanner;
public class uri_1094{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // int N, C=0, R=0, S=0, soma=0, E;
        // char t;

       // N = entrada.nextInt();

        // for(int i=1; i<=N; i++){
        //}




        System.out.printf("Total: %d cobaias\n, soma");
        System.out.printf("Total de coelhos: %d\n, C");
        System.out.printf("Total de ratos: %d\n, R");
        System.out.printf("Total de sapos: %d\n, S");
        System.out.printf("Percentual de coelhos: %.2f\n, C");
        System.out.printf("Percentual de ratos: %.2f\n, R");
        System.out.printf("Percentual de sapos: %.2f\n, S");
        
            //Atividade incompleta


entrada.close();
    }
}
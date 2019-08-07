/*
URI Online Judge | 1046
Tempo de Jogo

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e 
máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

----------------------------------------------------------------
|||| Exemplo de Entrada  	    Exemplo de Saída            ||||
||||    16 2                    O JOGO DUROU 10 HORA(S)     ||||
----------------------------------------------------------------
||||    0 0                     O JOGO DUROU 24 HORA(S)     ||||
----------------------------------------------------------------
||||    2 16                    O JOGO DUROU 14 HORA(S)     ||||
----------------------------------------------------------------

*/
import java.util.Scanner;
public class uri_1046{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int N1, N2, Calculo=0;

        N1 = entrada.nextInt();
        N2 = entrada.nextInt();

        if(N1 < N2){
            Calculo = N2 - N1;
            System.out.println("O JOGO DUROU " + Calculo + " HORA(S)");
        }
        else if(N1 >= N2){
            Calculo = 24 + N2 - N1;
            System.out.println("O JOGO DUROU " + Calculo + " HORA(S)");
        }


    entrada.close();
    }
}
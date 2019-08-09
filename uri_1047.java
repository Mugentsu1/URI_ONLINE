/*
URI Online Judge | 1047
Tempo de Jogo com Minutos

Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU HORA(S) E  MINUTO(S)” .

--------------------------------------------------------------------------------
||||    Exemplo de Entrada  	Exemplo de Saída                            ||||
||||    7 8 9 10                O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)        ||||
--------------------------------------------------------------------------------
||||    7 7 7 7                 O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)       ||||
--------------------------------------------------------------------------------
||||    7 10 8 9                O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)       ||||
--------------------------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1047{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int hora_inicio, min_inicio, hora_fim, min_fim, todos_minutos_inicio, todos_minutos_fim, diferenca_minutos;

        hora_inicio = entrada.nextInt();
        min_inicio = entrada.nextInt();
        todos_minutos_inicio = hora_inicio * 60 + min_inicio;

        hora_fim = entrada.nextInt();
        min_fim = entrada.nextInt();
        todos_minutos_fim = hora_fim * 60 + min_fim;

        diferenca_minutos = (24 * 60 - todos_minutos_inicio) + todos_minutos_fim;

        int horas = diferenca_minutos / 60;
        int minutos = diferenca_minutos %60;

        if(horas >= 24 & minutos >=1){
            horas = horas%24;
        }

        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);       

    entrada.close();
    }
}
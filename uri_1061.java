
/*
URI Online Judge | 1061
Tempo de um Evento

Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, 
iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento 
vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho 
a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no 
qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, 
no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo 
formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
--------------------------------------------------------------
        Exemplo de Entrada	        Exemplo de Saída
        Dia 5                       3 dia(s)
        08 : 12 : 23                22 hora(s)
        Dia 9                       1 minuto(s)
        06 : 13 : 23                0 segundo(s)
--------------------------------------------------------------
*/
import java.util.Scanner;

public class uri_1061 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int dia_inicio, dia_fim, hora_inicio, hora_fim, minuto_inicio, minuto_fim, segundo_inicio, segundo_fim;
        int dias, horas, minutos, segundos;
        String inicio, fim;

        dia_inicio = entrada.nextInt();
        inicio = entrada.next();
        dia_fim = entrada.nextInt();
        fim = entrada.next();
// hh:mm:ss
        hora_inicio = Integer.parseInt(inicio.substring(0,2));
        hora_fim = Integer.parseInt(fim.substring(0,2));
        minuto_inicio = Integer.parseInt(inicio.substring(3,5));
        minuto_fim = Integer.parseInt(fim.substring (3,5));
        segundo_inicio = Integer.parseInt(inicio.substring(6,8));
        segundo_fim = Integer.parseInt(fim.substring(6,8));

        // diferença

        dias = dia_fim - dia_inicio;
        horas = hora_fim - hora_inicio;
        minutos = minuto_fim - minuto_inicio;
        segundos = segundo_fim - segundo_inicio;

        if(horas < 0){
            horas += 24;
            dias--;
        }

        if(minutos < 0){
            minutos += 60 ;
            horas --;
        }

        if(segundos < 0){
            segundos += 60;
            minutos --;
        }

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");

// Runtime erro no URI
// Sistema rodando normalmente.
entrada.close();
    }
}
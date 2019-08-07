/*URI Online Judge | 1020
Idade em Dias

Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido. 
*/


import java.util.Scanner;

public class uri_1020 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int ano, mes, dia, dias;
        dias = entrada.nextInt();

        ano = (dias / 365);
        mes = (dias  % 365)/30;
        dia = (dias % 365) % 30;
        

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);


entrada.close();
    }

}
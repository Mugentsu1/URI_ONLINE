/*
URI Online Judge | 1117
Validação de Nota

Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas 
(uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. 
O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " 
seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal.

Exemplo de Entrada	    Exemplo de Saída
-3.5                    nota invalida
3.5                     nota invalida
11.0                    media = 6.75
10.0
*/
import java.util.Scanner;
public class uri_1117{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int c=0;
        double soma=0, n;
        
        while(c<2){
            n=entrada.nextDouble();
            if((n >= 0) & (n <= 10)){
                c++;
                soma+=n;
            }
            else{
                System.out.println("nota invalida");
            }
        }

        System.out.println("media = " + soma*0.5);

entrada.close();
    }
}
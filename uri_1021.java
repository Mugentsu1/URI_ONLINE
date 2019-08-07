/** URI Online Judge | 1021
 * Notas e Moedas

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. 
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, 
conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal. 
*/


import java.util.Scanner;

public class uri_1021{

    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        double dinheiro, n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, centavos, m1=0, m050=0, m025=0, m010=0, m005=0, m001=0;        

        dinheiro = entrada.nextDouble();

        centavos = dinheiro * 100;

        n100 = dinheiro / 100;
        dinheiro %= 100;

        n50 = dinheiro / 50;
        dinheiro %= 50;

        n20 = dinheiro / 20;
        dinheiro %= 20;

        n10 = dinheiro / 10;
        dinheiro %= 10;

        n5 = dinheiro / 5;
        dinheiro %=5;

        n2 = dinheiro / 2;
        dinheiro %= 2;

        centavos = centavos % 100;

        m1 = dinheiro / 1;
        dinheiro %=1;

        m050 = centavos / 50;
        centavos %= 50;

        m025 = centavos / 25;
        centavos %= 25;

        m010 = centavos / 10;
        centavos %= 10;

        m005 = centavos / 5;
        centavos %= 5;

        m001 = centavos;

        System.out.print("NOTAS:\n");
        System.out.print((int)n100 + " nota(s) de R$ 100.00\n");
        System.out.print((int)n50 + " nota(s) de R$ 50.00\n");
        System.out.print((int)n20 + " nota(s) de R$ 20.00\n");
        System.out.print((int)n10 + " nota(s) de R$ 10.00\n");
        System.out.print((int)n5 + " nota(s) de R$ 5.00\n");
        System.out.print((int)n2 + " nota(s) de R$ 2.00\n");
        System.out.print("MOEDAS:\n");
        System.out.print((int)m1 + " moeda(s) de R$ 1.00\n");
        System.out.print((int)m050 + " moeda(s) de R$ 0.50\n");
        System.out.print((int)m025 + " moeda(s) de R$ 0.25\n");
        System.out.print((int)m010 + " moeda(s) de R$ 0.10\n");
        System.out.print((int)m005 + " moeda(s) de R$ 0.05\n");
        System.out.print((int)m001 + " moeda(s) de R$ 0.01\n");

        

        
        entrada.close();
    }
}
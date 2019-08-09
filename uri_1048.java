/*
URI Online Judge | 1048
Aumento de Salário

A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a 
tabela abaixo:

--------------------------------------------------------------------
----    Salário	              ||    Percentual de Reajuste      ----
----    0 - 400.00            ||            15%                 ----
----    400.01 - 800.00       ||            12%                 ----
----    800.01 - 1200.00      ||            10%                 ----
----    1200.01 - 2000.00     ||            7%                  ----
----    Acima de 2000.00      ||            4%                  ----    
--------------------------------------------------------------------

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste 
ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual 
de reajuste ganho, conforme exemplo abaixo.

--------------------------------------------------------------------
||||    Exemplo de Entrada  |  	Exemplo de Saída                ||||
||||    400.00              |    Novo salario: 460.00           ||||
||||                        |    Reajuste ganho: 60.00          ||||
||||                        |    Em percentual: 15 %            ||||
--------------------------------------------------------------------
||||    800.01              |   Novo salario: 880.01            ||||
||||                        |   Reajuste ganho: 80.00           ||||
||||                        |   Em percentual: 10 %             ||||
--------------------------------------------------------------------
||||    2000.00             |   Novo salario: 2140.00           ||||
||||                        |   Reajuste ganho: 140.00          ||||
||||                        |   Em percentual: 7 %              ||||
--------------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1048{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double salario, aumento;

        salario = entrada.nextDouble();

        if((salario >= 0.0) & (salario <= 400.00)){
            aumento = salario * 0.15;
            System.out.printf("Novo salario: %.2f\n", salario + aumento);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 15 %\n");
        }

        else if((salario >= 400.01) & (salario <= 800.00)){
            aumento = salario * 0.12;
            System.out.printf("Novo salario: %.2f\n", salario + aumento);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 12 %\n");
        }

        else if((salario >= 800.01) & (salario <= 1200.00)){
            aumento = salario * 0.10;
            System.out.printf("Novo salario: %.2f\n", salario + aumento);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 10 %\n");
        }

        else if((salario >= 1200.01) & (salario <= 2000.00)){
            aumento = salario * 0.07;
            System.out.printf("Novo salario: %.2f\n", salario + aumento);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 7 %");
        }

        else if(salario >= 2000.01){
            aumento = salario * 0.04;
            System.out.printf("Novo salario: %.2f\n", salario + aumento);
            System.out.printf("Reajuste ganho: %.2f\n", aumento);
            System.out.println("Em percentual: 4 %");
        }


    entrada.close();
    }
    // Funcionando mas o resultado o sistema do URI informa que tem algo descrito errado.
}
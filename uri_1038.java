/*
URI Online Judge | 1038
Lanche

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
A seguir, calcule e mostre o valor da conta a pagar.

---------------------------------------------
|    Codigo | Espercificação     | Preço    |
|        1  | Cachorro - Quente  | R$ 4.00  |
|        2  | X-Salada           | R$ 4.50  |
|        3  | X-Bacon            | R$ 5.00  |
|        4  | Torrada simples    | R$ 2.00  |
|        5  | Refrigerante       | R$ 1.50  |
---------------------------------------------

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item 
conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas 
após o ponto decimal.
-------------------------------------------------
|    Exemplo de Entrada	    Exemplo de Saída    |
|    3 2                     Total: R$ 10.00    |
|                                               |
|    4 3                     Total: R$ 6.00     |
|                                               |
|    2 3                     Total: R$ 13.50    |
-------------------------------------------------

*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class uri_1038{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int codigo, quantidade;
        double preco, total;
   
        codigo = entrada.nextInt();
        quantidade = entrada.nextInt();

        if(codigo == 1){
            preco = 4.0;
        }

        else if(codigo == 2){
            preco = 4.5;
        }

        else if(codigo == 3){
            preco = 5.0;
        }

        else if(codigo == 4){
            preco = 2.0;
        }

        else{
            preco = 1.5;
        }
        
        total = quantidade * preco;

        System.out.println("Total: R$ " + df.format(total));

        entrada.close();
    }
}
/*
URI Online Judge | 1113
Crescente e Decrescente

Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y 
uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. 
A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, 
caso contrário imprima a mensagem “Decrescente”.
--------------------------------------------------------------------
        Exemplo de Entrada      	Exemplo de Saída
        5 4                         Decrescente
        7 2                         Decrescente
        3 8                         Crescente
        2 2
--------------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1113{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int X , Y;

        do{
            X = entrada.nextInt();
            Y = entrada.nextInt();

            if(X < Y){
                System.out.println("Crescente");
            }
            else if(X > Y){
                System.out.println("Decrescente");
            }
        }
        while(X != Y);

entrada.close();       
    }
}
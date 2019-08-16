/*
URI Online Judge | 1116
Dividindo X por Y

Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. 
Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) 
que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” 
caso não seja possível efetuar o cálculo.

Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. 
Utilize cast :)

----------------------------------------------------------
        Exemplo de Entrada	    Exemplo de Saída
        3                       -1.5
        3 -2                    divisao impossivel
        -8 0                    0.0
        0 8
----------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1116{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;
        double x, y, divisao;

        n = entrada.nextInt();

        for(int i=0; i<n; i++){
            x = entrada.nextInt();
            y = entrada.nextInt();
            
            if(y==0){
                System.out.println("divisao impossivel");
            }
            else{
                divisao = x / y;
                System.out.println(divisao);
            }
        }

entrada.close();     
    }
}
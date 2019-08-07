/*
URI Online Judge | 1045
Tipos de Triângulos

Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A 
representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, 
com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.

----------------------------------------------------------------
|||| Exemplos de Entrada	    Exemplos de Saída           ||||
||||    7.0 5.0 7.0             TRIANGULO ACUTANGULO        ||||
||||                            TRIANGULO ISOSCELES         ||||
----------------------------------------------------------------
||||    6.0 6.0 10.0             TRIANGULO OBTUSANGULO      ||||
||||                             TRIANGULO ISOSCELES        ||||
----------------------------------------------------------------
||||    6.0 6.0 6.0              TRIANGULO ACUTANGULO       ||||
||||                             TRIANGULO EQUILATERO       ||||
----------------------------------------------------------------
||||    5.0 7.0 2.0               NAO FORMA TRIANGULO       ||||
----------------------------------------------------------------
||||    6.0 8.0 10.0              TRIANGULO RETANGULO       ||||
----------------------------------------------------------------

*/
import java.util.Scanner;
public class uri_1045{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double A, B, C, A2, B2, C2;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        A2 = A*A;
        B2 = B*B;
        C2 = C*C;

        if(A >= (B+C)){
            System.out.println("NAO FORMA TRIANGULO");
        }

        else if((A2) == (B2 + C2)){
            System.out.println("TRIANGULO RETANGULO");
        }

        else if(A2 > (B2 + C2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        else if(A2 < (B2 + C2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        
        else if((A == B) & (B == C) & (A == C)){
            System.out.println("TRIANGULO EQUILATERO");
        }

        else if((A == B) || (A == C) || (B == C)){
            System.out.println("TRIANGULO ISOSCELES");
        }
        else{};
    
    entrada.close();

    // Questão infelizmente não obteve saída como esperado.
    }
}
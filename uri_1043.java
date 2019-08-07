/*
URI Online Judge | 1043
Triângulo

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, 
calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, 
mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

---------------------------------------------------------------
||||||| Exemplo de Entrada   |   Exemplo de Saída       |||||||
||||||| 6.0 4.0 2.0          |      Area = 10.0         |||||||
|||||||                      |                          |||||||
||||||| 6.0 4.0 2.1          |      Perimetro = 12.1    |||||||
---------------------------------------------------------------
  
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class uri_1043{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double A, B, C;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        if(((B - C) < A) & (A < B + C) & ((A - C) < B) & (B < A + C) & ((A - B) < C) & (C < A + B)){
            System.out.println("Perimetro = " + df.format(A + B + C));
        }

        else{
            System.out.println("Area = " + df.format(((A + B) * C)/2));
        }



entrada.close();
    }
}
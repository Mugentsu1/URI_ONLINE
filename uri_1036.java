/*
URI Online Judge | 1036
Fórmula de Bhaskara

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem 
correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.

////////////////////////////////////////////
/// Exemplos de Entrada	Exemplos de Saída //    
/// 10.0 20.1 5.1                         //
///                                       //
/// R1 = -0.29788                         //
/// R2 = -1.71212                         //
///                                       //
/// 0.0 20.0 5.0                          //
///                                       //
/// Impossivel calcular                   //
///                                       //
/// 10.3 203.0 5.0                        //
///                                       //
/// R1 = -0.02466                         //
/// R2 = -19.68408                        //
///                                       //
/// 10.0 3.0 5.0                          //
///                                       //
///  Impossivel calcular                  //
////////////////////////////////////////////

*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class uri_1036{
public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00000");
    
    double A,B,C,R1,R2;
    A = entrada.nextDouble();
    B = entrada.nextDouble();
    C = entrada.nextDouble();

    if((A == 0)  | (B*B - 4 * A * C < 0)){
        System.out.println("Impossivel calcular");
    }
    else{

    R1 = (- B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
    R2 = (- B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);

    System.out.println("R1 = " + df.format (R1));
    System.out.println("R2 = " + df.format (R2));

    }

    entrada.close();

    }
}
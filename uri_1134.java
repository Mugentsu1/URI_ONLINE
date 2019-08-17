/*
URI Online Judge | 1134
Tipo de Combustível

Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código 
informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada 
tipo de combustível, conforme exemplo.
-------------------------------------------------------------
        Exemplo de Entrada	        Exemplo de Saída
        8                           MUITO OBRIGADO
        1                           Alcool: 1
        7                           Gasolina: 2
        2                           Diesel: 0
        2
        4
-------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1134{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int Alcool = 0, Gasolina = 0,Diesel = 0, codigo = 0;
        
        codigo = entrada.nextInt();

        //Informar mensagem de codigo invalido se for menor que 1 e superior a 4;
        while ((codigo < 1) || (codigo > 4)) {
            codigo = entrada.nextInt();       
        }

        //Apenas codigo entre 1 e 4 serão aceitos
        while ((codigo >= 1) || (codigo <=4)) {

            //Codigo 1 é igual a àlcool
            if(codigo == 1){
                //Soma + 1 da variavel alcool atribui resultado dela mesma.
                Alcool +=1;
            }
            //codigo 2 é igual a gasolina
            else if(codigo == 2){
                Gasolina +=1;
            }

            //codigo 3 é igual a Disel
            else if(codigo == 3){
                Diesel +=1;
            }

            //codigo 4 - fim do processo
            else if(codigo == 4){
                break; //interromper o processo do laço, executa a proxima linha fora do while.
            }
            codigo = entrada.nextInt();
        }
        System.out.println("MUITO OBRIGADO\n");
        System.out.println("Alcool: "+ Alcool +"\n");
        System.out.println("Gasollina: "+ Gasolina +"\n");
        System.out.println("Diesel: "+ Diesel + "\n");


entrada.close();
    }
}
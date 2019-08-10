/*
URI Online Judge | 1050
DDD

Leia um número inteiro que representa um código de DDD para discagem interurbana. 
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

                -------------------------------
                |   DDD      |    Destination |
                -------------------------------
                    61       |   Brasilia
                    71       |   Salvador
                    11       |   Sao Paulo
                    21       |   Rio de Janeiro
                    32       |   Juiz de Fora
                    19       |   Campinas
                    27       |   Vitoria
                    31       |   Belo Horizonte


Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, 
o programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado 
caso não existir DDD correspondente ao número digitado.

---------------------------------------------------------
||||    Exemplo de Entrada	Exemplo de Saída         ||||
||||    11                      Sao Paulo            ||||
---------------------------------------------------------

*/
import java.util.Scanner;
public class uri_1050{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int DDD;

        DDD = entrada.nextInt();

        if(DDD == 61){
            System.out.println("Brasilia");
        }

        else if(DDD == 71){
            System.out.println("Salvador");
        }

        else if(DDD == 11){
            System.out.println("Sao Paulo");
        }

        else if(DDD == 21){
            System.out.println("Rio de Janeiro");
        }
        
        else if(DDD == 32){
            System.out.println("Juiz de Fora");
        }

        else if(DDD == 19){
            System.out.println("Campinas");
        }

        else if(DDD == 27){
            System.out.println("Vitoria");
        }

        else if(DDD == 31){
            System.out.println("Belo Horizonte");
        }

        else{
            System.out.println("DDD nao cadastrado");
        }

        entrada.close();
    }
}
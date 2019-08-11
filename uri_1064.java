/*
URI Online Judge | 1064
Positivos e Média

Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito 
após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. 
A próxima linha deve mostrar a média dos valores positivos digitados.

----------------------------------------------------------------
||||    Exemplo de Entrada     | 	Exemplo de Saída        ||||
||||    7                      |     4 valores positivos    ||||
||||    -5                     |     7.4                    ||||
||||    6                      |                            ||||
||||    -3.4                   |                            ||||
||||    4.6                    |                            ||||
||||    12                     |                            ||||
----------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1064{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double n, soma=0.0, media;
        int x=0;

        for(int i=0; i<6; i++){
            n = entrada.nextDouble();
            if(n > 0.0){
                x++;
                soma+=n;
            }
        }
        media = soma/x;
        System.out.printf(x + "%d valores positivos");
        System.out.println(media);        

        // erro não encontrado. 
        // Codigo funcionando

entrada.close();    
    }
}
/*
URI Online Judge | 1049
Animal

Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo 
o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi 
escolhido, através das três palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.

----------------------------------------------------------------
||||    Exemplos de Entrada	        Exemplos de Saída       ||||    
||||    vertebrado                      homem               ||||
||||    mamifero                                            ||||
||||    onivoro                                             ||||
----------------------------------------------------------------
||||    vertebrado                      aguia               ||||
||||    ave                                                 ||||
||||    carnivoro                                           ||||
----------------------------------------------------------------
||||    invertebrado                    minhoca             ||||
||||    anelideo                                            ||||
||||    onivoro                                             ||||
----------------------------------------------------------------
*/
import java.util.Scanner;
public class uri_1049{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String palavra_1, palavra_2, palavra_3;

        palavra_1 = entrada.nextLine();
        palavra_2 = entrada.nextLine();
        palavra_3 = entrada.nextLine();

        if(palavra_1.equals("vertebrado") & palavra_2.equals("ave") & palavra_3.equals("carnivoro")){
            System.out.println("aguia");
        }

        else if(palavra_1.equals("vertebrado") & palavra_2.equals("ave") & palavra_3.equals("onivoro")){
            System.out.println("pomba");
        }

        else if(palavra_1.equals("vertebrado") & palavra_2.equals("mamifero") & palavra_3.equals("onivoro")){
            System.out.println("homem");
        }

        else if(palavra_1.equals("vertebrado") & palavra_2.equals("mamifero") & palavra_3.equals("herbivoro")){
            System.out.println("vaca");
        }

        

        else if(palavra_1.equals("invertebrado") & palavra_2.equals("inseto") & palavra_3.equals("hematofago")){
            System.out.println("pulga");
        }

        else if(palavra_1.equals("invertebrado") & palavra_2.equals("inseto") & palavra_3.equals("herbivoro")){
            System.out.println("lagarta");
        }

        else if(palavra_1.equals("invertebrado") & palavra_2.equals("anelideo") & palavra_3.equals("hematofago")){
            System.out.println("sanguessuga");
        }

        else if(palavra_1.equals("invertebrado") & palavra_2.equals("anelideo") & palavra_3.equals("onivoro")){
            System.out.println("minhoca");
        }

    entrada.close();

    }
}
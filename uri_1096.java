/*
URI Online Judge | 1096
Sequencia IJ 2
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
---------------------------------------------------
    Exemplo de Entrada	    Exemplo de Saída
                                I=1 J=7
                                I=1 J=6
                                I=1 J=5
                                I=3 J=7
                                I=3 J=6
                                I=3 J=5
                                ...
                                I=9 J=7
---------------------------------------------------
*/
public class uri_1096{
    public static void main(String[] args){
        int cont=0, sequencia =7 ;
        
        for(int i=1; i<=9;){
            System.out.println("I="+i+" J="+sequencia);
            sequencia--;
            cont++;

            if(cont==3){
                i = i + 2;
                cont = 0;
                sequencia = 7;
            }
        }
    
    }
}
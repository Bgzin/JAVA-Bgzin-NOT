package IteracaoWhile;


import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc= new Scanner(System.in);

    public void iteracao(){
       int iteracao= 0;
       while (iteracao<1000) {
        iteracao+=1;
        System.out.println("essa é a iteracao de n°"+iteracao);
        }

        
    }
    
    public void exemplo4(){
        Random rd= new Random();
        int nSorteado = rd.nextInt(10);
        boolean tenteNovamente=true;
        while (tenteNovamente) {
            System.out.println("Digite um N°");
            int nDigitado = sc.nextInt();
            if (nDigitado==nSorteado){
                System.out.println("Acertou Miseravi");
                tenteNovamente=false;
            } else{
                System.out.println("Erroooou");
                tenteNovamente=true;
            }

    }
    
    }

    public void exemplo5(){
        int vetor[] = new int[5];
        int i = 0;
        while(i<5);{
                System.out.println("Digite o valor par ao vetor["+i+"]");
            vetor[i]=sc.nextInt();
            i++;
        }
        i=0;
        while(i<5);{
            System.out.println("o valor do vetor ["+i+"] é "+vetor[i]);
            i++;
        }


    }
}

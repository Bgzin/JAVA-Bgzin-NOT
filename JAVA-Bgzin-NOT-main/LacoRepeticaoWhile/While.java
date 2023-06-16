package LacoRepeticaoWhile;

import java.util.Scanner;
import java.util.Random;

public class While {
    Scanner sc = new Scanner(System.in);

    public void exemplo1(){
     int iteracao=0;
     while (iteracao<10) {
    
        iteracao +=1;
        System.out.println("O n° da iteração é"
        +iteracao);

        
     }
      

    






    }


    public void Random(){
    Random rd= new Random();
    int nSorteado = rd.nextInt(10);
    boolean tenteNovamente;
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
        
    }


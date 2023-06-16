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
 
    public void exercicio7(){
    Scanner sc= new Scanner(System.in);
    String letras []= new String[]{"a","b","c","d","e","f","g","h","i","j"};
    int i=0;
    int cont= 0;
    while(i<letras.length){
    if(letras[i]=="a"|| letras[i]=="e"|| letras[i]=="i"
    || letras[i]=="o"|| letras[i]=="u"){
     } else{
        cont++;
        System.out.println(letras[i]+ " é consoante");
     }
     i++;
    } 
    System.out.println("o n° de consoantes é " +cont);


    }

public void exercicio8(){
    int vetorNum[]= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int i=0;
    int contPar=0;
    int contImpar=0;
    while(i<vetorNum.length){
        if(vetorNum[i]%2==0){
            contPar++;
        }else{
            contImpar++;
        }
        i++;
    }
   int vetorPar[]=new int[contPar];
   int vetorImpar[]=new int[contImpar];
   i=0;
   contPar=0;
   contImpar=0;
   while(i<vetorNum.length){
    if(vetorNum[i]%2==0){
        vetorPar[contPar]=vetorNum[i];
        contPar++;
    }else{
        vetorImpar[contImpar]=vetorNum[i];
        contImpar++;
    }
    i++;
   }
   i=0;
   while(i<vetorNum.length){
    System.out.println("vetorNum["+i+"]="+vetorNum[i]);
    i++;
   }
   i=0;
   while(i<vetorPar.length){
    System.out.println("vetor par ["+i+"]=" +vetorPar[i]);
    i++;
   }
   i=0;
   while(i<vetorImpar.length){
    System.out.println("vetor impar ["+i+"]=" +vetorImpar[i]);
    i++;
   }
}
}

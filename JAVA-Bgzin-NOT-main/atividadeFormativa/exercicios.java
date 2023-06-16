package atividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class exercicios {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Após esse aviso digite o numero de Linhas, e em seguida o numero de colunas");
        int matriz[][] = new int[sc.nextInt()][sc.nextInt()];
        // preenchendo a matriz com numeros random

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(10);
                if (i > j) {
                    matriz[i][j] = 1;
                }
                if (i == j) {
                    matriz[i][j] = 0;

                }
                if (j > i) {
                    matriz[i][j] = 3;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]="
                        + matriz[i][j]);

            }
        }
    }

    public void exercicio2() {
        System.out.println("Digite um N°");
        int nSorteado = rd.nextInt(1000);rd.nextInt(1000);
        int nDigitado = sc.nextInt();

        int contador = 1;
        while(nSorteado != nDigitado){

            // falar se é ><  
            if(nDigitado==0){
System.out.println("Digite um valor válido");
            }
            if (nDigitado > nSorteado) {
                System.out.println("Seu palpite foi maior que o n Sorteado");
            }
            if (nDigitado < nSorteado) {
                System.out.println("Seu palpite foi menor que o n Sorteado");
            }contador++;
            System.out.println("Re-digite um numero");
            nDigitado=sc.nextInt();
            
            if (nDigitado == nSorteado) {
                System.out.println("Parabens voce tem o #! para a lua");
            }
        }
        System.out.println("o Numero de tentativas foi de " +contador);
    }

    public void exercicio3(){
        //criar um vetor de tamanho de 100-100
        int tamanhoVETOR = rd.nextInt(900)+100; 
        int vetor[]= new int [tamanhoVETOR];
        //preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
           vetor[i]=rd.nextInt(100)+1; 
        }
        int contImparNoPar=0;
        int contParNoImpar=0;
        //imprimir os n pares do vetor
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==0){
                System.out.println(vetor[i]);
                if (i%2==0){
                    contParNoImpar++;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==1){
                System.out.println(vetor[i]);
                if (i%2==0){
                    contImparNoPar++;
                }
    }
}


}
}

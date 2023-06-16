package Matriz;

import java.util.Random;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.text.html.FormView;

public class MatrizExemplo {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplolz() {
        // gerar, preencher, imprimir e manipular matrizes
        // criar uma matriz 10x9
        int matriz[][] = new int[10][9]; // bidimensional 10x9
        int soma = 0;
        // preencher minha matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                // System.out.println("matriz["+i+"]["+j+"]=");
                matriz[i][j] = rd.nextInt(10);
            }

            // imprimir elemento por elemento da minha matriz
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.println("matriz[" + i + "][" + j + "]="
                            + matriz[i][j]);
                }
            }
            // imprimir a matriz em formato linha x coluna
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("|");

                int somaLinha = 0;
                for (int i = 0; i < 9.; i++) {
                    somaLinha += matriz[3][i];
                }
                System.out.println("+++++++++++++++++");
                System.out.println("a Soma da linha 4 é " + somaLinha);

            }
            for (int j = 0; j < 10; j++) {
                int somaColuna = 0;
                somaColuna += matriz[i][3];
                System.out.println("++++++++");
                System.out.println("a soma da coluna 4 é " + somaColuna);
            }
        }
    }

public void exercicio1(){
 int matriz[][]= new int [5][5];  //criei uma matriz 5x5
 //preencher a matriz
 for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz.length; j++) {
      if(i==j){   //matriz í
        matriz[i][j]=1;
    }else {
        matriz[i][j]=0;  
    }
    
 }  
}
for (int i = 0; i < matriz.length; i++) {
    System.out.print("| ");
    for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j]+" ");
    }
    System.out.println("|");
}
}

public void exercicio2(){
  int matriz [][]= new int[4][4];
  for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz.length; j++) {
        matriz[i][j]= rd.nextInt(10);
    }
    System.out.print("| ");
    for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j]+" ");
    }
    System.out.println("|");    
  }
  System.out.println("+++++++"); 
for (int i = 0; i < matriz.length; i++) {
    System.out.print("| ");
    for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[j][i]+" ");
    }
    System.out.println("|");
}
int soma=0;
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz.length; j++) {
        if(i==j){
            soma+=matriz[i][j];
        }
    }
    System.out.println("a soma da diagonal é "+soma);
}
}
}
package VetoresArray;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;



public class Vetores {
    Scanner sc=new Scanner(System.in);
    public void exemplo1(){
        //criando um vetor
        double [] valores= new double[]{10.5,20.7,30.6, 40.4};
        System.out.println("1° Posição- Indice[0]:"+valores[0]);
        System.out.println("2° Posição- Indice[1]:"+valores[1]);
        System.out.println("3° Posição- Indice[2]:"+valores[2]);
        System.out.println("4° Posição- Indice[3]:"+valores[3]);
        //mudando valores de uma posição definida
        valores[0] = 15.6; // mudando o valore do Indice [0]
        System.out.println("1° Posição- Indice [0]"+valores [0]);
        


    }
    public void exemplo2(){
      //criando um vetor
      int valoresInt[] = new int[5];
      System.out.println("Digite 5 n° Inteiros");
      valoresInt[0]= sc.nextInt();
      valoresInt[1]= sc.nextInt();
      valoresInt[2]= sc.nextInt();
      valoresInt[3]= sc.nextInt();
      valoresInt[4]= sc.nextInt();
      valoresInt[5]= sc.nextInt();
      System.out.println("1° Posição- Indice[0]:"+valoresInt[0]);
      System.out.println("2° Posição- Indice[1]:"+valoresInt[1]);
      System.out.println("3° Posição- Indice[2]:"+valoresInt[2]);
      System.out.println("4° Posição- Indice[3]:"+valoresInt[3]);
      System.out.println("5° Posição- Indice[3]:"+valoresInt[4]);


    }

    public void exercicio2(){
    //Criando um vetor
    double valoresDb[] = new double[10];
    System.out.println("Digite 10 n° Reais");
    valoresDb[0]= sc.nextDouble();
    valoresDb[1]= sc.nextDouble();
    valoresDb[2]= sc.nextDouble();
    valoresDb[3]= sc.nextDouble();
    valoresDb[4]= sc.nextDouble();
    valoresDb[5]= sc.nextDouble();
    valoresDb[6]= sc.nextDouble();
    valoresDb[7]= sc.nextDouble();
    valoresDb[8]= sc.nextDouble();
    valoresDb[9]= sc.nextDouble();
    System.out.println("10° Posição-Indice[9]:"+valoresDb[9]);
    System.out.println("9° Posição-Indice[8]:"+valoresDb[8]);
    System.out.println("8° Posição-Indice[7]:"+valoresDb[7]);
    System.out.println("7° Posição-Indice[6]:"+valoresDb[6]);
    System.out.println("6° Posição-Indice[5]:"+valoresDb[5]);
    System.out.println("5° Posição-Indice[4]:"+valoresDb[4]);
    System.out.println("4° Posição-Indice[3]:"+valoresDb[3]);
    System.out.println("3° Posição-Indice[2]:"+valoresDb[2]);
    System.out.println("2° Posição-Indice[1]:"+valoresDb[1]);
    System.out.println("1° Posição-Indice[0]:"+valoresDb[0]);
    }





public void exemplo4(){
    //criar o array das notas
    double notas[] = new double[4];
    System.out.println("Digite as 4 notas do aluno");
    notas[0] = sc.nextDouble();
    notas[1]= sc.nextDouble();
    notas[2]= sc.nextDouble();
    notas[3]= sc.nextDouble();
    double media= (notas[0]+notas[1]+notas[2]+notas[3]) /4;
    System.out.println("A media é"+media);

}

public void exercicio1(){

}


}




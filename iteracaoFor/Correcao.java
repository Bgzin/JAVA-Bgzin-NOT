package iteracaoFor;

import java.util.Scanner;

public class Correcao {
    Scanner sc = new Scanner(System.in);
    //criar um vetor de 5 n e imprimir
   public void Exercicio1() {
        //criar um vetor de 5 posições
        int vetor[]=new int[5];  //sempre declarar o tipo de vetor e o tamanho
        // preencher o vetor com o "for"
        for (int i = 0; i < vetor.length; i++) {
            // solicitar para o usuario escrever o numero
            System.out.print("Informe o valor do valor ["+i+"]=");
            //ler o valor digitado e atribuir a posição do vetor
            vetor[i]=sc.nextInt();  
          }
          //imprimir o vetor "for"
          for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor ["+i+"]="+vetor[i]);
            
          }

    }
   //
    public void Exercicio2(){
     double vetor[]=new double[10];
     for (int i = 0; i < vetor.length; i++) {
        System.out.print("Informe o valor do valor ["+i+"]=");
        //ler o valor digitado e atribuir a posição do vetor
        vetor[i]=sc.nextDouble();  
     }
     //imprimir o vetor na ordem inversa
     for(int i= 9 ;i>0;i--){ //do 9 para o 0]
        System.out.println("vetor["+i+"]=");

     }
    }

    public void Exercicio3(){
        // criar um vetor para receber as medias
        double notas[]=new double[4];//vetor de tamanho 4
        //preencher o vetor com as notas
        for (int i = 0; i < notas.length; i++) {
            //solicitar as notas para o usuario
            System.out.print("Informe a Nota "+(i+1)+" do Aluno");
            //ler a nota com o Scanner
            notas[i]=sc.nextDouble();
        }
        //imprimir as notas e calcular a media
        double media =0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota ["+(i+1)+"]="+notas[i]);
            //acumular as notas
            media+=notas[i];
        }
        //dividir a media pelo n denotas
        media /=notas.length;
        //imprimir a media
        System.out.println("A media é"+media);
    }
    public void exercicio4() {
       // char letras[]= new char[]{'a','b','c','d','e','f','g','h','i','j'};
        String letras2[]= new String[]{"a","b","c","d","e","f","g","h","i", "j"};
        //percorrer o vetor para procurar letras vogais e consoantes
        //contar o n de consoantes
        int cont=0;
        for (int i = 0; i < letras2.length; i++) {
            if(letras2[i]!="a" && letras2[i]!="e" &&
            letras2[i]!="i" && letras2[i]!="o" && letras2[i]!="u");
            System.out.println(letras2[i]+ " é consoante");
            cont++;
        }        
        //mostrar o contador de consoantes
       System.out.println("O nmr de consoantes é "+cont);


        }
        //exercicio 4 extra - ler as consoantes de uma palavra digitada
        public void exercicio4ex() {
            System.out.println("Digite uma Palavra");
             String palavra = sc.next(); //ler a palavra digitada
             palavra = palavra.toLowerCase();
             //percorrer a String para procurar letras vogais e consoantes
             //contar o n de consoantes
             int cont=0;
             for (int i = 0; i < palavra.length(); i++) {
                char c = palavra.charAt(i);

                 if(c !='a' && c!='e' &&
                 c !='i' && c !='o' && c!='u');
                 System.out.println(c + " é consoante");
                 cont++;
             }        
             //mostrar o contador de consoantes
            System.out.println("O nmr de consoantes é "+cont);

    }
    public void exercicio5() {
        int numeros[]= new int[20];
        int contPar=0;
        int contImpar=0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o ["+i+"]=");
            numeros[i]=sc.nextInt();
            if(numeros[i]%2==0){
                contPar++;   
            }else {
                contImpar++;
            }
          }
          //apos a contagem dos pares e impares criar os respectivos vetores
          int nPar[]=new int[contPar];
          int nImpar[]=new int[contImpar];
          //distribuir os n do vetor n para os vetores par e impar
          contPar=0;
          contImpar=0;
          for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                nPar[contPar]=numeros[i];
                contPar++;
            }else{
                nImpar[contImpar]=numeros[i];
                contImpar++;
            }
            
          }
       }
   }


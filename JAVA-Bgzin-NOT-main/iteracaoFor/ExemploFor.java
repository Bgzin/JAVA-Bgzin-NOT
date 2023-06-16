package iteracaoFor;
import java.util.Scanner;
public class ExemploFor {
    Scanner sc= new Scanner(System.in);

    public void exemplo1(){
        for(int i=0;i<10;i++){
System.out.println("o n° da iteração é "+i);}
    }

      public void exemplo2(){
        int vetor[] = new int[10]; //criando o vetor 10 posiçoes
        //preenchendo o vetor com "fori"
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor["+i+"]");
            vetor[i]=sc.nextInt();
        }
        //imprimir o vetor na forma inversa
            for (int i=9;i>=0;i--){
            System.out.println("vetor["+i+"]="+vetor[i]);}
      }

      public void exemplo3(){
        //carrinho de compra
        double carrinhoCompra[]=new double[]{19.90, 35.70, 56.80, 97.50};
        double valorFinal= 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
        //mostrar valor parcial
        System.out.println("o valor Parcial da compra é R$ "
                                            +valorFinal);
            }
    System.out.println("o Valor da compra é R$ "
                                             +valorFinal);
      }

      public void exemplo4(){
        double vetorNotas[]= new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a nota"+(i+1)+":");
            vetorNotas[i]=sc.nextDouble();
        }
        //imprimir as 4 notas e calcular a média
        double mediaNotas=0;
        for (int i = 0; i < vetorNotas.length; i++) {
        mediaNotas+=vetorNotas[i];
        System.out.println("A "+(i+1)+"1° Nota é"
                                         +vetorNotas[i]);    
        }
        mediaNotas/=vetorNotas.length;
        System.out.println("A media do aluno é "
                                          +mediaNotas);
      }

      public void exemplo6(){
        //ler 4 notas de 10 alunos
        // vetor guardar as médias
        double vetorMedia[]= new double[3];
        //prenchendo o vetor de médias
        for (int i = 0; i < vetorMedia.length; i++) {
         double notas=0;
            for(int j=0;j<4;j++);{
                System.out.println("Nota "+(j+1)+" Aluno " +(i+1)+":"); 
                notas+=sc.nextDouble();
               
            }
            notas/=4;
            vetorMedia[i]=notas; //coloca a média no vetor
        }
        //imprimir notas >=7 do vetor Médias
        for (int i = 0; i < vetorMedia.length; i++) {
            if(vetorMedia[i]>=7){
            System.out.println("a Média do Aluno"+(i+1)+"é "
                                                   +vetorMedia[i]);
            }
        }
      }

      public void exemplo7(){
        int vetorNm[]= new int[5];
       
        for (int i = 0; i < vetorNm.length; i++) {
            System.out.println("Digite um algum valor inteiro ");
            vetorNm[i]=sc.nextInt();
          
            System.out.println("Numeros Guardados com sucesso");
        }

      }

      public void correcao(){
        
      }
}

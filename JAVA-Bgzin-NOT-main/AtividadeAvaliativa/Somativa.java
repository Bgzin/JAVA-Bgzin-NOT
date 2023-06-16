package AtividadeAvaliativa;


import java.util.Scanner;

public class Somativa {

public void Questao1() {

Scanner sc = new Scanner(System.in); 


System.out.println("Digite o Primeiro Valor");
double valor1= sc.nextDouble();
System.out.println("Digite o Segundo Valor");
double valor2= sc.nextDouble();
System.out.println("Escolha 1 para Somar, 2 para subtrair, 3 para dividir e 4 para multiplicar");
int nDigitado = sc.nextInt();
if (nDigitado==1) {
    double valorTotal1= valor1+=valor2;
    System.out.println("o Valor total é "+valorTotal1);
     }
      else if (nDigitado==2){ 
        double valortotal2= valor1-valor2;
        System.out.println("o valor total é "+valortotal2);
     } else if(nDigitado==3){
        double valortotal3= valor1/valor2;
        System.out.println("o valor total é "+valortotal3);
     } else {
        double valortotal4= valor1*valor2;
        System.out.println("o valor total é "+valortotal4);
     }

     }

     public void Questao2()  {
        Scanner sc = new Scanner(System.in); 
         System.out.println("digite o N° de Matricula");
        double nDigitado2 = sc.nextDouble();
          if (nDigitado2<9){
          System.out.println("Parabens você foi selecionado para Entrar no Time do Chris");}

         else if (nDigitado2>=10 && nDigitado2<15 ){
        System.out.println(" Parabens você foi selecionado para Entrarno time do Jerome");
    } else if (nDigitado2>=15 && nDigitado2<20 ){
        System.out.println("Parabens voce foi selecionado para Entrar no time do Caruso");
    } else {
        System.out.println("Parabens voce foi selecionado para Entrar no time do Greg");
       
    }

     }
    

      public void Questao3(){

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do KG do seu morango");
    int kGmorangos= sc.nextInt();
    System.out.println("Digite o valor do KG das suas maçãs");
    int kGmaçãs= sc.nextInt();
    System.out.println("Digite o valor do KG das suas Bananas");
    int kGbananas= sc.nextInt();
    System.out.println();
    int totalKg = kGmorangos+kGmaçãs+kGbananas;
    System.out.println("O valor em KG da sua sacola é "+totalKg);
    double Desconto= 0.90;
    double valorKgMorango = kGmorangos*2.50;
    double valorKgMacas= kGmaçãs*1.80;
    double valorkGbananas= kGbananas*1.30;
    double ValorTotal= valorKgMorango+valorKgMacas+valorkGbananas;
    System.out.println("o Valor total da sua compra foi R$"+ ValorTotal);

    if (ValorTotal>=0) {
        Desconto=0;
        
    }else if (ValorTotal>=25){
        Desconto=0.90;

    }else{
           Desconto=0.90;
    }
    double valorTotalDesconto= ValorTotal*Desconto;
    System.out.println("O valor total da Sua compra com Desconto é R$"+valorTotalDesconto);
    
    }   
}


     







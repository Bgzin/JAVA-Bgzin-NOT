package ExercicioIfElse;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exercicios {
 Scanner sc = new Scanner (System.in);
 
 public void exercicio1() {
   
    System.out.println("Digite o Valor 1");
    int valor1 = sc.nextInt();
    System.out.println("Digite o Valor 2");
    int valor2 = sc.nextInt();
    if (valor1>valor2) {
      System.out.println("O Maior Valor é"
               +valor1);
    } else{
      System.out.println("O maior valor é "
      +valor2);
    }
 }

 public void exercicio2() {

   System.out.println("Informe o ano do seu Nascimento");
   int AnoNascimento = sc.nextInt();
   int AnoMinimo=2007 ;
   if (AnoNascimento<AnoMinimo){
      System.out.println("Você não poderá Votar esse ano");}
   else{
      System.out.println("Você podera Votar esse ano");

   }
   }

       
 public void exercicio3() {
   System.out.println("Digite a senha correta");
   int Senha = sc.nextInt();
   int SenhaCorreta=1234;
   if (Senha==SenhaCorreta){
      System.out.println("ACESSO PERMITIDO");}
      else {
         System.out.println("ACESSO NEGADO");
      }
      
   }
    



 public void exercicio4() {
   System.out.println("Quantidade de maças");
        int quantidade = sc.nextInt();
        double valorDesconto = 0.0;
        if (quantidade == 0) {
            valorDesconto = 0.0;
        } else if (quantidade >= 12) {
            valorDesconto = 0.25;
        } else {
            valorDesconto = 0.30;
        }
        double valorTotalDesconto = (quantidade * valorDesconto);
        System.out.println("Valor da sua compra é" + valorTotalDesconto);  
      }







 public void exercicio5()
  {
   System.out.println("Digite um Numero");
   int PrimeiroNumero= sc.nextInt();
   System.out.println("Digite um Numero");
   int SegundoNumero= sc.nextInt();
   System.out.println("Digite um Numero");
   int TerceiroNumero= sc.nextInt();
   int menor, medio, maior;
   
   
   if (PrimeiroNumero<SegundoNumero && PrimeiroNumero < TerceiroNumero){
      menor= PrimeiroNumero;
   }
   if (SegundoNumero<TerceiroNumero){
      medio= SegundoNumero;
      maior= TerceiroNumero;
   }
   

   
   


    
 }














 public void exercicio6() {
    
 }













 public void exercicio7() {
    
 }


}

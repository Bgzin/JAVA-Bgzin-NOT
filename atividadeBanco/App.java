package atividadeBanco;

import java.util.Scanner;
import atividadeBanco.Pessoas.Pessoas;
import atividadeBanco.Pessoas.pessoaFisica;
import atividadeBanco.Pessoas.pessoaJuridica;

public class App {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Pessoas pessoa01 = new Pessoas();
    pessoaFisica fisica01    =  new pessoaFisica();
    pessoaJuridica juridica01 = new pessoaJuridica();

    
    System.out.println("Primeiro vamos criar sua conta");
    System.out.println("Voce é pessoa Juridica(1) ou Fisica(2)?");
    int pergunta=sc.nextInt();
    if(pergunta==1){
    System.out.println("Seja muito bem vindo ao nosso Registro digite seus dados abaixo");
    }
    
    
    }
}

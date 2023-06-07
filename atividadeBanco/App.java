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
    System.out.println("Voce é pessoa Juridica ou Fisica?");
    String pergunta=sc.nextLine();
        
 
    System.out.println("------------------------------");
    pessoa01.setNomeConta("Rogerin Bg");
    pessoa01.setNumeroConta("001389");
    pessoa01.setSaldoConta("R$ 370,00");
    
    }
}

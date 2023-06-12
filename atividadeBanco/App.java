package atividadeBanco;

import java.util.Scanner;

import javax.swing.JOptionPane;

import POOExercicio2.agenda;
import atividadeBanco.Pessoas.Pessoas;
import atividadeBanco.Pessoas.pessoaFisica;
import atividadeBanco.Pessoas.pessoaJuridica;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Pessoas pessoa01 = new Pessoas();
    pessoaFisica fisica01    =  new pessoaFisica();
    pessoaJuridica juridica01 = new pessoaJuridica();
    System.out.println("Seja bem-vindo ao nosso Register!");
    System.out.println("Voce é pessoa Juridica(1) ou Fisica(2)?");
    int pergunta=sc.nextInt();
    if(pergunta==1){
        pessoaJuridica RegistrosJuridico[] = new pessoaJuridica [2];
     for (int i = 0; i < RegistrosJuridico.length; i++) {
        //
        RegistrosJuridico[i]= new pessoaJuridica();
        //preencher os dados do cliente
        RegistrosJuridico[i].setNomeConta(JOptionPane.showInputDialog("Nome: "));
        RegistrosJuridico[i].setNumeroConta(JOptionPane.showInputDialog("Numero da Conta: "));
        RegistrosJuridico[i].setCNPJ(JOptionPane.showInputDialog("CPNJ: "));
        RegistrosJuridico[i].setSaldoConta(JOptionPane.showInputDialog("Deposito Inicial R$: "));
     }

    
     


    }
 
    }

    
    
    }


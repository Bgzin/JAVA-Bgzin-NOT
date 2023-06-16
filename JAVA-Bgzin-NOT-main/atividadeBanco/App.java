package atividadeBanco;

import java.util.Scanner;

import javax.swing.JOptionPane;

import POOExercicio2.agenda;
import atividadeBanco.Pessoas.Pessoas;
import atividadeBanco.Pessoas.pessoaFisica;
import atividadeBanco.Pessoas.pessoaJuridica;
import javax.swing.JOptionPane;

//SE APERTAR DIRETO NA OPÇÃO 2 ANTES DE SE REGISTRAR "VOCE NAO PODE CONSULTAR ALGO QUE NAO ESTA REGISTRADO"  FINAL DO CODE
public class App {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Pessoas pessoa01 = new Pessoas();
      pessoaFisica fisica01 = new pessoaFisica();
      pessoaJuridica juridica01 = new pessoaJuridica();
      boolean ligado = true;
      while (ligado) {
         System.out.println("Informe a ação Desejada"
               + "\n1-Registrar-se"
               + "\n2-Consultar conta Juridica"
               + "\n3-Consultar conta Fisica"
               + "\n4-Sair");
         int acao = sc.nextInt();
         switch (acao) {
            case 1:
               Registro(sc.nextInt());
               break;
            case 2:
               ConsultePJ(sc.nextInt());
               break;
            case 3:
               ConsultePF(sc.nextInt()); 
               break;
            case 4:
               ligado = false;
               break;

            default:
               System.out.println("Opção Invalida");
               break;
         }
      }
   }
   

   public void Registro(Scanner sc) {
      System.out.println("Seja bem-vindo ao nosso Register!");
      System.out.println("Voce é pessoa Juridica(1) ou Fisica(2)?");
      int pergunta = sc.nextInt();
      int contaPJ = 0;
      if (pergunta == 1) {
         pessoaJuridica RegistrosJuridico[] = new pessoaJuridica[2];
         RegistrosJuridico[contaPJ] = new pessoaJuridica();
         // preencher os dados do cliente
         RegistrosJuridico[contaPJ].setNomeConta(JOptionPane.showInputDialog("Nome da Empresa: "));
         RegistrosJuridico[contaPJ].setNumeroConta(JOptionPane.showInputDialog("Numero da Conta: "));
         RegistrosJuridico[contaPJ].setCNPJ(JOptionPane.showInputDialog("CNPJ: "));
         RegistrosJuridico[contaPJ].setSaldoConta(0);
         System.out.println("Pessoa Juridica: " + RegistrosJuridico[contaPJ].toString());

      } else if (pergunta == 2) {
         int contaPF = 0;
         pessoaFisica RegistrosFisica[] = new pessoaFisica[2];
         RegistrosFisica[contaPF] = new pessoaFisica();
         // preencher os dados do cliente
         RegistrosFisica[contaPF].setNomeConta(JOptionPane.showInputDialog("Nome: "));
         RegistrosFisica[contaPF].setNumeroConta(JOptionPane.showInputDialog("Numero da Conta: "));
         RegistrosFisica[contaPF].setCPF(JOptionPane.showInputDialog("CPF: "));
         RegistrosFisica[contaPF].setSaldoConta(0);
         System.out.println("Pessoa Juridica: " + RegistrosFisica[contaPF].toString());
      }
      }

      

   public  void ConsultePJ(Scanner sc) {
      System.out.println("Essa aba é especialmente para Consultar pessoas Juridicas, Prossiga com as seguintes opões");
      boolean consultandoPJ = true;
      while (consultandoPJ) {
         System.out.println("Informe a ação Desejada"
               + "\n1-Verificar Saldo"
               + "\n2-Saque"
               + "\n3-Depósito;"
               + "\n4-Empréstimo;"
               + "\n5-Sair");
         int acao = sc.nextInt();
         if (acao == 1) {
            System.out.println("Seu saldo é de R$: " + juridica01.getSaldoConta());
         } else if (acao == 2) {
            RegistrosJuridico[i].saque();
         } else if (acao == 3) {
            RegistroJuridico[i].deposito();
         } else if (acao == 4) {

            System.out.println("Escolha o valor do seu Emprestimo, minimo de R$10,000 maximo de R$120.000,00");

            double valorEmprestimo = sc.nextDouble();

            double emprestimoMin = 10000;

            double emprestimoMax = 1200000;

            double jurosEmprest = 0.04;
            if (valorEmprestimo >= emprestimoMin && valorEmprestimo < emprestimoMax) {
               double valorTotal = jurosEmprest * valorEmprestimo;
               System.out.println("o valor solicitado do seu emprestimo foi aprovado" + valorTotal + pessoa01.saldoConta);
            } else {
               System.out.println("o valor solicitado não foi aprovado");

           
         }
      } else if(acao == 5){
          consultandoPJ=false;
      } else { 
         System.out.println("A ação requerida nao existe!! tente novamente");
      }
      }
   }

   public  void ConsultePF(Scanner sc) {
      System.out.println("Essa aba é especialmente para Consultar pessoas Juridicas, Prossiga com as seguintes opões");
      boolean consultandoPF = true;
      while (consultandoPF) {
         System.out.println("Informe a ação Desejada"
               + "\n1-Verificar Saldo"
               + "\n2-Saque"
               + "\n3-Depósito;"
               + "\n4-Empréstimo;"
               + "\n5-Sair");
         int acao2 = sc.nextInt();
         if (acao2 == 1) {
            System.out.println("Seu saldo é de R$: " +fisica01.getSaldoConta());
         } else if (acao2 == 2) {
            RegistrosJuridico[i].saque();
         } else if (acao2 == 3) {
            RegistroJuridico[i].deposito();
         } else if (acao2 == 4) {

            System.out.println("Escolha o valor do seu Emprestimo, minimo de R$10,000 maximo de R$120.000,00");

            double valorEmprestimoPF = sc.nextDouble();

            double emprestimoMinPF = 1000;

            double emprestimoMaxPF = 24000;

            double jurosEmprest = 0.04;
            if (valorEmprestimoPF >= emprestimoMinPF && valorEmprestimoPF < emprestimoMaxPF) {
               double valorTotalPF = jurosEmprest * valorEmprestimoPF;
               System.out.println("o valor solicitado do seu emprestimo foi aprovado" + valorTotalPF + fisica01.saldoConta);
               
            } else {
               System.out.println("o valor solicitado não foi aprovado");     
         }
      } else if(acao == 5){
          consultandoPF=false;
      } else { 
         System.out.println("A ação requerida nao existe!! tente novamente");
      }
   }

   }
}
    


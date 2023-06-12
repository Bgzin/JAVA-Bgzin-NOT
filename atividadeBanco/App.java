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
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Pessoas pessoa01 = new Pessoas();
      pessoaFisica fisica01 = new pessoaFisica();
      pessoaJuridica juridica01 = new pessoaJuridica();
      boolean ligado = true;
      while (ligado) {
         System.out.println("Informe a ação Desejada"
               + "\n1-Registrar-se"
               + "\n2-Consultar"
               + "\n3-Sair");
         int acao = sc.nextInt();
         switch (acao) {
            case 1:
               Registro(sc);
               break;
            case 2:
               Consulte(sc);
               break;
            case 3:
               ligado = false;
               break;

            default:
               System.out.println("Opção Invalida");
               break;
         }
      }
   }

   public static void Registro(Scanner sc) {
      System.out.println("Seja bem-vindo ao nosso Register!");
      System.out.println("Voce é pessoa Juridica(1) ou Fisica(2)?");
      int pergunta = sc.nextInt();
      if (pergunta == 1) {
         pessoaJuridica RegistrosJuridico[] = new pessoaJuridica[2];
         for (int i = 0; i < RegistrosJuridico.length; i++) {
            //
            RegistrosJuridico[i] = new pessoaJuridica();
            // preencher os dados do cliente
            RegistrosJuridico[i].setNomeConta(JOptionPane.showInputDialog("Nome: "));
            RegistrosJuridico[i].setNumeroConta(JOptionPane.showInputDialog("Numero da Conta: "));
            RegistrosJuridico[i].setCNPJ(JOptionPane.showInputDialog("CNPJ: "));
            RegistrosJuridico[i].setSaldoConta(JOptionPane.showInputDialog("Deposito Inicial R$: "));
            System.out.println("Pessoa Juridica: " + RegistrosJuridico[i].toString());
         }
      } else if (pergunta == 2) {
         pessoaFisica RegistrosFisica[] = new pessoaFisica[2];
         for (int i = 0; i < RegistrosFisica.length; i++) {
            //
            RegistrosFisica[i] = new pessoaFisica();
            // preencher os dados do cliente
            RegistrosFisica[i].setNomeConta(JOptionPane.showInputDialog("Nome: "));
            RegistrosFisica[i].setNumeroConta(JOptionPane.showInputDialog("Numero da Conta: "));
            RegistrosFisica[i].setCPF(JOptionPane.showInputDialog("CPF: "));
            RegistrosFisica[i].setSaldoConta(JOptionPane.showInputDialog("Deposito Inicial R$: "));
            System.out.println("Pessoa Juridica: " + RegistrosFisica[i].toString());
         }
      }
   }

   public static void Consulte(Scanner sc) {
      System.out.println("Essa aba é especialmente para Consultar dados, Prossiga com as seguintes opões");

   }
}

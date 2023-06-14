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
               + "\n2-Consultar conta Juridica"
               + "\n3-Consultar conta Fisica"
               + "\n4-Sair");
         int acao = sc.nextInt();
         switch (acao) {
            case 1:
               Registro(sc);
               break;
            case 2:
               // ConsultePJ(sc);
               break;
            case 3:
               
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

   public static void Registro(Scanner sc) {
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

   public static void ConsultePJ(Scanner sc) {
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
         switch (acao) {
            case 1:
            System.out.println("Seu saldo é de R$: "+pessoaJuridica.getSaldoConta());
               break;
            case 2:
               
               break;
            case 3:
               break;
            case 4:
               break;
            case 5:
              consultandoPJ=false;
               break;
            default:
               System.out.println("Opção Invalida");
               break;
         }
      }

   }
}

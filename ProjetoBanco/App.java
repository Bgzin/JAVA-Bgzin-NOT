package ProjetoBanco;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Projeto.Pessoas.ContaPF;
import Projeto.Pessoas.ContaPJ;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaPJ clienteJuridico[] = new ContaPJ[4];
        ContaPF clienteFisica[] = new ContaPF[4];
        int contaJuri = 0;
        int contaFisi = 0;
        boolean inicio = true;
        while (inicio) {
            int acao5 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1-Acessar Conta PJ"
                    + "\n 2-Acessar Conta PF"));

            if (acao5 == 1) {
                boolean open2 = true;
                while (open2) {

                    int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                            + "\n 1-Abrir Conta PJ"
                            + "\n 2-Acessar Conta PJ"
                            + "\n 3-Sair"));
                    if (acao1 == 1) {

                        clienteJuridico[contaJuri] = new ContaPJ();

                        clienteJuridico[contaJuri]
                                .setNomeConta(JOptionPane.showInputDialog("Informe o nome da empresa:"));
                        clienteJuridico[contaJuri].setCnpj(JOptionPane.showInputDialog("Informe o CNPJ da empresa"));
                        clienteJuridico[contaJuri].setnConta(1000 + contaJuri);
                        clienteJuridico[contaJuri].setSaldo(0);

                        JOptionPane.showMessageDialog(null, "Conta Criada com sucesso");
                        contaJuri++;
                    } else if (acao1 == 2) {

                        int i;
                        int contaBuscada = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada"));
                        for (i = 0; i < clienteJuridico.length; i++) {
                            if (contaBuscada == clienteJuridico[i].getnConta()) {
                                JOptionPane.showMessageDialog(null, "Conta encontrada");
                                break;
                            }
                        }

                        boolean acesso = true;
                        while (acesso) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada:"
                                    + "\n 1-Consultar o saldo"
                                    + "\n 2-Realizar um Saque"
                                    + "\n 3-Realizar um depósito"
                                    + "\n 4-Realizar um empréstimo"
                                    + "\n 5-Sair da Conta"));
                            if (acao2 == 1) {
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clienteJuridico[i].getSaldo());
                            } else if (acao2 == 2) {
                                clienteJuridico[i].saque();
                            } else if (acao2 == 3) {
                                clienteJuridico[i].deposito();
                            } else if (acao2 == 4) {
                                clienteJuridico[i].emprestimoPJ();
                                JOptionPane.showMessageDialog(null,
                                        "Valor Aprovado" + clienteJuridico[i].getEmprestimoPJ());
                                JOptionPane.showMessageDialog(null,
                                        "Valor a ser pago é: " + clienteJuridico[i].getValorPagarPJ());
                            } else if (acao2 == 5) {
                                acesso = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Digite uma operação válida");
                            }
                        }
                    } else {
                        open2 = false;
                    }
                }
            } else if (acao0 == 2) {
                boolean open2 = true;
                while (open2) {

                    int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                            + "\n 1-Abrir Conta PF"
                            + "\n 2-Acessar Conta PF"
                            + "\n 3-Sair"));
                    if (acao == 1) {
                        clienteFisica[contaFisi] = new ContaPF();
                        clienteFisica[contaFisi]
                                .setNomeConta(JOptionPane.showInputDialog("Informe seu nome completo:"));
                        clienteFisica[contaFisi].setCpf(JOptionPane.showInputDialog("Informe seu CPF"));
                        clienteFisica[contaFisi].setnConta(2000 + contaFisi);
                        clienteFisica[contaFisi].setSaldo(0);

                        JOptionPane.showMessageDialog(null, "Conta Criada com sucesso");
                        contaFisi++;
                    } else if (acao == 2) {
                        int i;
                        int contaBuscada = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada"));
                        for (i = 0; i < clienteFisica.length; i++) {
                            if (contaBuscada == clienteFisica[i].getnConta()) {
                                JOptionPane.showMessageDialog(null, "Conta encontrada");
                                break;
                            }
                        }

                        boolean acesso = true;
                        while (acesso) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada:"
                                    + "\n 1-Deseja Consultar seu saldo?"
                                    + "\n 2-Deseja realiazar um Saque?"
                                    + "\n 3-Deseja realizar um Deposíto?"
                                    + "\n 4-Deseja Realizar um Empréstimo?"
                                    + "\n 5-Sair da Conta"));
                            if (acao2 == 1) {
                                JOptionPane.showMessageDialog(null,
                                        "O seu Saldo é de R$ " + clienteFisica[i].getSaldo());
                            } else if (acao2 == 2) {
                                clienteFisica[i].saque();
                            } else if (acao2 == 3) {
                                clienteFisica[i].deposito();
                            } else if (acao2 == 4) {
                                clienteFisica[i].emprestimoPF();
                                JOptionPane.showMessageDialog(null,
                                        "Parabens! o Valor foi Aprovado" + clienteFisica[i].getEmprestimoPF());
                                JOptionPane.showMessageDialog(null,
                                        "O Valor a ser pago é: " + clienteFisica[i].getValorPagar());
                            } else if (acao2 == 5) {
                                acesso = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Digite uma operação válida no nosso sistema");
                            }
                        }
                    } else {
                        open2 = false;
                    }
                }
            } else {
                inicio = false;
            }
        }
    }
}

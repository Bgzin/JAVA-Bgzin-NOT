package ExemploTryCatch;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exeplotry {
    public static void main(String[] args) {
        boolean tente = true;
        while(tente){
        // escolha uma opção
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1 para somar\n2 para subtrair\n3 para multiplicar \n4 para dividir")); 
        if(escolha==1){
            try {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero Inteiro:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero Inteiro: "));
        JOptionPane.showMessageDialog(null, numero1+ " + " + numero2 + " = " + (numero1+numero2));
        tente= false;

        }catch (NumberFormatException erro1) {
            JOptionPane.showMessageDialog(null, "Erro - Valor digitado não é um inteiro"
                                                                +"\nDigite novamente");
        } catch (Exception erro2) {
            JOptionPane.showMessageDialog(null, "Aconteceu um erro"
                                                                +"\nDigite novamente");
        }
        }else if(escolha==2){
              try {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero Inteiro:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero Inteiro: "));
        JOptionPane.showMessageDialog(null, numero1+ " + " + numero2 + " = " + (numero1-numero2));
        tente= false;

        }catch (NumberFormatException erro1) {
            JOptionPane.showMessageDialog(null, "Erro - Valor digitado não é um inteiro"
                                                                +"\nDigite novamente");
        } catch (Exception erro2) {
            JOptionPane.showMessageDialog(null, "Aconteceu um erro"
                                                                +"\nDigite novamente");
        }
        }else if(escolha==3){
              try {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero Inteiro:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero Inteiro: "));
        JOptionPane.showMessageDialog(null, numero1+ " + " + numero2 + " = " + (numero1*numero2));
        tente= false;

        }catch (NumberFormatException erro1) {
            JOptionPane.showMessageDialog(null, "Erro - Valor digitado não é um inteiro"
                                                                +"\nDigite novamente");
        } catch (Exception erro2) {
            JOptionPane.showMessageDialog(null, "Aconteceu um erro"
                                                                +"\nDigite novamente");
        }
        }else{
              try {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero Inteiro:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero Inteiro: "));
        if(numero1>=0 || numero2>0){
          JOptionPane.showMessageDialog(null, numero1+ " + " + numero2 + " = " + (numero1/numero2));
        tente= false;
        }
        }
              catch (NumberFormatException erro1) {
            JOptionPane.showMessageDialog(null, "Erro - Valor digitado não é um inteiro"
                                                                +"\nDigite novamente");
        } catch (ArithmeticException erro2) {
            JOptionPane.showMessageDialog(null, "Não se pode dividir por 0"
                                                                +"\nDigite novamente");
}}}}}


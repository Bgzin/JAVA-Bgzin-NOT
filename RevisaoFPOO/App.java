package RevisaoFPOO;

import java.util.Scanner;

import RevisaoFPOO.Cadastro.Animal;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrasEspecies;
import javax.swing.JOptionPane;



public class App {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     
Animal bixin = new Animal();
Cachorro dog1 = new Cachorro();
Gato cat1 = new Gato();
OutrasEspecies outro1 = new OutrasEspecies();

System.out.println("Olá seja bem-vindo ao nosso PetShop");
//System.out.println("primeiro preencha esse mini formulario");
JOptionPane.showMessageDialog(null, "Seja bem-vindo ao nosso PetShop");
JOptionPane.showMessageDialog(null, "Preencha esse Mini-Formulario por gentileza");
bixin.setNome(JOptionPane.showInputDialog("Nome do animal: "));
bixin.setPeso(JOptionPane.showInputDialog("Peso do animal: "));
bixin.setProprietario(JOptionPane.showInputDialog("Seu nome: "));


int escolha;
escolha = JOptionPane.showInputDialog("Qual a especie do seu pet? 1-Gato , 2-Cachorro, 3-Outra Especie: ");

if(escolha==1){
    cat1.setRaça(JOptionPane.showInputDialog("Raça do animal: "));
    cat1.setQuantasVidas(JOptionPane.showInputDialog("Quantas vidas o gato possui: "));
}else if(escolha==2){
    dog1.setRaçaD(JOptionPane.showInputDialog("Raça do Cachorro: "));}
}
}




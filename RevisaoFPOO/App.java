package RevisaoFPOO;

import java.util.Scanner;


import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrasEspecies;
import RevisaoFPOO.Consulta.Agenda;

import javax.swing.JOptionPane;



public class App {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

     
Agenda cons1[] = new Agenda[5];
Cachorro dog1[] = new Cachorro[10];
Gato cat1[] = new Gato [10];
OutrasEspecies outro1[] = new OutrasEspecies[10];
int contGatos=0, contCachorros=0, contOutros=0, contAgenda=0;

JOptionPane.showMessageDialog(null, "Seja bem-vindo ao nosso PetShop");
boolean aberto = true;
while (aberto){
      int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção\n 1-Registro\n 2-Consulta\n 3-Sair: "));
      if(acao1==1){
        int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a especie do seu pet? 1-Gato , 2-Cachorro, 3-Outra Especie: "));
        if(acao2==1){
        cat1[contGatos] = new Gato();
        cat1[contGatos].setNome(JOptionPane.showInputDialog("Nome do animal: "));
        cat1[contGatos].setPeso(JOptionPane.showInputDialog("Peso: "));
        cat1[contGatos].setProprietario(JOptionPane.showInputDialog("Seu nome: "));
        cat1[contGatos].setRaça(JOptionPane.showInputDialog("Raça do animal: "));
        cat1[contGatos].setQuantasVidas(JOptionPane.showInputDialog("quantas vidas o gato possui: "));
        contGatos++;
         }
         else if(acao2==2){
        dog1[contCachorros] = new Cachorro();
        dog1[contCachorros].setNome(JOptionPane.showInputDialog("Nome do animal: "));
        dog1[contCachorros].setPeso(JOptionPane.showInputDialog("Peso: "));
        dog1[contCachorros].setProprietario(JOptionPane.showInputDialog("Seu nome: "));
        dog1[contCachorros].setRaçaD(JOptionPane.showInputDialog("Raça do animal: "));
        contCachorros++;
         }else{
        outro1[contOutros] = new OutrasEspecies();
        outro1[contOutros].setNome(JOptionPane.showInputDialog("Nome do animal: "));
        outro1[contOutros].setPeso(JOptionPane.showInputDialog("Peso: "));
        outro1[contOutros].setProprietario(JOptionPane.showInputDialog("Seu nome: "));
        outro1[contOutros].setRaça(JOptionPane.showInputDialog("Raça do animal: "));
         }
        
 }else if(acao1==2 ){
    
JOptionPane.showMessageDialog(null, "Vamos marcar uma consulta, preencha os dados e veja se estamos disponiveis");
    double horarioMax= 15.30;
    double horarioMin= 9.30;
     
    cons1[contAgenda] = new Agenda();
    cons1[contAgenda].setNomeC(JOptionPane.showInputDialog("Qual o seu nome ?"));
    cons1[contAgenda].setHorarioP(JOptionPane.showInputDialog("Qual o Horario que voce gostaria de Marcar? escreva no formato de '12.30' "));
    cons1[contAgenda].setDataPref(JOptionPane.showInputDialog("Qual o Dia que voce gostaria de marcar ? utilize o formado de '24.08"));
    int  urgencia = Integer.parseInt(JOptionPane.showInputDialog("Possui Urgencia 1-Sim\n 2-Não?"));
    contAgenda++;
    if(urgencia==1){
        

    }
 }
}

}
}




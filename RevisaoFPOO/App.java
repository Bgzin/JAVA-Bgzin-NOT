package RevisaoFPOO;


import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrasEspecies;
import RevisaoFPOO.Consulta.Agenda;

import javax.swing.JOptionPane;



public class App {

public static void main(String[] args) {

     
Agenda cons1[] = new Agenda[100];
Cachorro dog1[] = new Cachorro[10];
Gato cat1[] = new Gato [10];
OutrasEspecies outro1[] = new OutrasEspecies[10];
int contGatos=0, contCachorros=0, contOutros=0, contAgenda=0;

JOptionPane.showMessageDialog(null, "Seja bem-vindo ao nosso PetShop");
boolean aberto = true;
while (aberto){
      int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção\n1-Registro\n2-Consulta\n3-Sair: "));
      if(acao1==1){
        int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a especie do seu pet?\n  1-Gato \n  2-Cachorro\n  3-Outra Especie: "));
        if(acao2==1){
        cat1[contGatos] = new Gato();
        cat1[contGatos].setNome(JOptionPane.showInputDialog("Nome do animal: "));
        cat1[contGatos].setPeso(JOptionPane.showInputDialog("Peso: "));
        cat1[contGatos].setProprietario(JOptionPane.showInputDialog("Seu nome: "));
        cat1[contGatos].setRaça(JOptionPane.showInputDialog("Raça do animal: "));
        cat1[contGatos].setQuantasVidas(JOptionPane.showInputDialog("quantas vidas o gato possui: "));
        JOptionPane.showMessageDialog(null, "Ficha concluida com sucesso\n"+"Nome do Animal: "+cat1[contGatos].getNome() );
        
       
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
    String nomeAgenda = (JOptionPane.showInputDialog("Qual o nome do seu Pet? "));
    
      boolean cadastroOK= false; 
      for (int i = 0; i < cat1.length; i++) { //buscar no vetor de gatos
        if(cat1[i].getNome().equals(nomeAgenda)){
        JOptionPane.showMessageDialog(null, "pega na minha");
          cadastroOK= true;
          break;
        }
      }
      for (int i = 0; i < dog1.length; i++) { //buscar no vetor de gatos
        if(dog1[i].getNome().equals(nomeAgenda)){
        JOptionPane.showMessageDialog(null, "pega na minha 2");
          
        }
      }
      for (int i = 0; i < outro1.length; i++) { //buscar no vetor de gatos
        if(outro1[i].getNome().equals(nomeAgenda)){
        JOptionPane.showMessageDialog(null, "pega na minha 3");
          
        }
      }
      if(cadastroOK){
        boolean agendar =true;
        while(agendar){
          //informar data e hora
          String dataAgenda = JOptionPane.showInputDialog("Informe a data do Agendamento ");
          String horaAgenda = JOptionPane.showInputDialog("Informe a data do agendamento");
           if(contAgenda==0){
            cons1[contAgenda] = new Agenda();
            cons1[contAgenda].setDataPref(JOptionPane.showInputDialog("Qual a data preferida? "));
            cons1[contAgenda].setHorarioP(JOptionPane.showInputDialog("Qual a hora preferida? "));
            break;
           }else{
            for (int i = 0; i < cons1.length; i++) {
              if(cons1[i].getDataHora().equals(dataAgenda+horaAgenda)){
                break;
              }else{
            cons1[contAgenda] = new Agenda();
            cons1[contAgenda].setDataPref(JOptionPane.showInputDialog("Qual a data preferida? "));
            cons1[contAgenda].setHorarioP(JOptionPane.showInputDialog("Qual a hora preferida? "));
              }
            }
           }
        }
      }
 }
}

}
}




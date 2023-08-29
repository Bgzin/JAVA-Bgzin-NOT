package ExercicioArrayList;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExemploHashMap {
    
    //atributos

    HashMap <String,String> capitalEstados =  new HashMap<>();
    HashMap <String,Integer> pessoasF =  new HashMap<>();
    //método
    public void teste(){
        capitalEstados.put("SP","São Paulo");
        capitalEstados.put("MG","Minas Gerais");
        capitalEstados.put("RJ","Rio de Janeiro");
        capitalEstados.put("ES","Vitoria");
        boolean jogo =true;
        while(jogo){
            String Estado= JOptionPane.showInputDialog("Informe a Sigla do Estado");
            JOptionPane.showMessageDialog(null, capitalEstados.get(Estado));
        }
       
    }

    public void teste2(){
     pessoasF.put("Rogerin", 22);
     pessoasF.put("Roger", 20);
     pessoasF.put("Bgzin", 18);
     pessoasF.put("Ramelis", 22);
     for (String nome : pessoasF.keySet()) {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+ pessoasF.get(nome));
     }
     String BuscQ= JOptionPane.showInputDialog("Digite o nome da pessoa");
     JOptionPane.showMessageDialog(null ,pessoasF.get(BuscQ));
        
     }



    }



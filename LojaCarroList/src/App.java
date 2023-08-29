import java.util.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //criando lista de objeto
        List <Carros> listaCarros = new ArrayList<>();
        boolean aberto = true;
        while (aberto){
            int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar Carro\n2-Listar Carro\n3-Consultar Carro\n4-Excluir carro"));
            if(acao==1){//1- Cadastrar Carro
                String marcaCar = JOptionPane.showInputDialog(null, "Qual a marca do Carro");
                String modeloCar = JOptionPane.showInputDialog(null, "Qual o modelo do carro");
                String anoCar = JOptionPane.showInputDialog(null, "Qual o ano do carro");
                String corCar = JOptionPane.showInputDialog(null, "Qual a cor do carro");
                Carros car = new Carros(marcaCar, modeloCar, anoCar, corCar);
                listaCarros.add(car);
            }else if (acao==2){ //2- Listar os Carro
                String listar = "";
                for (Carros carros : listaCarros){
                     listar+=carros.getMarca()+" "+carros.getModelo()+"/n";
                }
                JOptionPane.showInputDialog(listar);
                }else if(acao==3){
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("1-Consultar Um carro"));
                if(acao2==1){
                String consultar = JOptionPane.showInputDialog(null, "Qual o modelo do carro");
                for (Carros carros : listaCarros) {
                    String lista =" ";
                    if(carros.getModelo().equals(consultar))
                    lista+=carros.getMarca()+" "+carros.getModelo()+"\n"+carros.getCor()+"\n"+carros.getAno();
                 }
                 }
                }else if(acao==4){
                    String apagar = JOptionPane.showInputDialog(null, "Digite o nome do modelo quer quer Apagar");
                    int i=0;
                    int valor=0;
                    for (Carros carros : listaCarros) {
                        if(carros.getModelo().equals(apagar)){
                        valor=i;
                        }
                        i++;
                        JOptionPane.showMessageDialog(null, "Estamos apagando o Modelo: "+apagar );
                        listaCarros.remove(valor);
                    }
                  }
                 }}}
        
        //3- Consultar Carro
        //4- Apagar Carro;
        
    

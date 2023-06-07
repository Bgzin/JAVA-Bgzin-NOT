package POOExercicio2;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random rd= new Random(0);
        Scanner sc= new Scanner(System.in);
        //construir o vetor de objetos
        agenda pessoas[]= new agenda[10];
         //´preencher o meu vetor/array
         for (int i = 0; i < pessoas.length; i++) {
            //usar o construtor de objetos
            pessoas[i]= new agenda();
            //preencher os atributos
            pessoas[i].setNome(JOptionPane.showInputDialog("Nome: "));
            pessoas[i].setAltura(i);
            pessoas[i].setIdade(i+18);
           }
        //buscador
        //enquanto não achar o nome da pessoa
        int cont = 0;
        boolean teste=true;
        String nomeDigitado = sc.next();// scanner ou JOptionPane
        while (!nomeDigitado.equalsIgnoreCase(pessoas[cont].getNome())) //equals é pra comparar string
        {

            cont++;
        }
        System.out.println("Nome: " + pessoas[cont].getNome() + "Idade: " + pessoas[cont].getIdade() + "Altura: "
                + pessoas[cont].getAltura());
}
}


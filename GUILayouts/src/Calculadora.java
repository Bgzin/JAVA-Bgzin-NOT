import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.GridLayout;
import java.awt.LayoutManager;


public class Calculadora {
    public Calculadora() {

        JFrame janelac = new JFrame("Exemplo GridLayout");
        BorderLayoutExemplo border = new BorderLayoutExemplo();
        JPanel painelA = new JPanel();
        JPanel painel2 = new JPanel();//padrão FlowLayout
        GridLayout grid = new GridLayout(2, 2);
        painelA.setLayout((LayoutManager) border);
        //adicionar Jpanel ao Jframe
        janelac.getContentPane().add(painelA, BorderLayoutExemplo.CENTER);
        janelac.getContentPane().add(painel2, BorderLayoutExemplo.NORTH);
        //adicionando componentes
        painelA.add(new JButton("1"));
        painelA.add(new JButton("2"));
        painelA.add(new JButton("3"));
        painelA.add(new JButton("4"));
       //config janelaA
       janelac.setBounds(500, 500, 500, 500);
       janelac.setDefaultCloseOperation(2);
       janelac.setVisible(true);
    }
}


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.GridLayout;
import java.awt.LayoutManager;


public class Calculadora {
    public Calculadora() {

        JFrame janelac = new JFrame("Exemplo GridLayout");
        BorderLayout border = new BorderLayout();
        JPanel painelA = new JPanel();
        JPanel painel2 = new JPanel();//padrão FlowLayout
        GridLayout grid = new GridLayout(2, 2);
        painelA.setLayout((LayoutManager) border);
        //adicionar Jpanel ao Jframe
        janelaA.getContentPane().add(painelA, BorderLayout.CENTER);
        janelaA.getContentPane().add(painel2, BorderLayout.NORTH);
        //adicionando componentes
        painelA.add(new JButton("1"));
        painelA.add(new JButton("2"));
        painelA.add(new JButton("3"));
        painelA.add(new JButton("4"));
       //config janelaA
       janelaA.setBounds(500, 500, 500, 500);
       janelaA.setDefaultCloseOperation(2);
       janelaA.setVisible(true);
    }
}


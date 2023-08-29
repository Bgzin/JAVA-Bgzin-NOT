import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;

public class ExemploFlowLayout {
    int cont;
    public ExemploFlowLayout() {
        //criar uma janela do tipo frame
        JFrame janela1 = new JFrame("Janela FlowLayout");
        //converter do gid pro tipo flow
        FlowLayout flow = new FlowLayout();
        janela1.setLayout(flow);
        //criando botoes
        janela1.add(new JLabel("Numero:"));
        JTextField campo = new JTextField("Insira um valor", 25);
        JButton enviar = new JButton("Enviar");
        janela1.add(enviar);
        //desafio
        enviar.addActionListener(e ->{
         int valor = Integer.parseInt(campo.getText());
         for (int i = 0; i <valor ; i++) {
            janela1.add(new JButton(""+i+1));
         }
         janela1.pack();
        });
        //seta os elementos da Janela
        janela1.setDefaultCloseOperation(0);
        janela1.pack();
        janela1.setVisible(true);
        
    }
}

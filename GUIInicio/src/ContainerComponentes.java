import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContainerComponentes extends JFrame {
    public ContainerComponentes() {
        super("Exemplo Janela");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(200, 200, 400, 400);
        //FlowLayout flow= new Flo\wLayout();
        //this.setLayout(flow);
        JPanel painel = new JPanel();//por padrao é um flow layout
        this.getContentPane().add(painel);
        for (int i = 0; i <= 6; i++) {
            painel.add(new JButton("number "+i));
        }
        this.setVisible(true);
    }
    
}

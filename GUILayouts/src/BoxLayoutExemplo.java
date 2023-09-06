import javax.swing.*;


import java.awt.*;

public class BoxLayoutExemplo extends JFrame {
    public BoxLayoutExemplo() {
        //configurando o Layout
        super("Exemplo Box Layout");
        BorderLayoutExemplo border = new BorderLayoutExemplo();
        this.setLayout((LayoutManager) border);
        //criar dois paineis
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        this.add(painel1,BorderLayoutExemplo.WEST);
        this.add(painel2,BorderLayoutExemplo.SOUTH);
        //layout de paineis
        painel1.setLayout(new BoxLayout(painel1, BoxLayout.Y_AXIS));
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.X_AXIS));
        //Adicionar os Elementos aos Paineis
        for (int i = 0; i < 5; i++) {
            painel1.add(new JButton(""+i+1));
            painel1.add(new JButton(""+i+1));
            
        }
        //set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }

    JTabbedPane
}

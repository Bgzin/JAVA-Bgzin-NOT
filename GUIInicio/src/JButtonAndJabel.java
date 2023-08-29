import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JButtonAndJabel {//não vou usar extends
    //construtor
    int cont;
    public JButtonAndJabel() { 
        //criando um JFrane - Janela Básica para uma aplicação
        JFrame jFrame = new JFrame("Janela Principal"); 
        JPanel painel = new JPanel();//painel(container)
        //adicionar o painel ao frame
        jFrame.getContentPane().add(painel);//boas praticas
        //Painel é um container e o Jframe tambem
        //em seguida vamos criar componentes
        JButton botao = new JButton("Clique Aqui !!!");
        JLabel text = new JLabel("N de Cliques");
        //adicionar os componentes ao painel
        painel.add(botao);
        painel.add(text);
        //configuração da janela
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();//organiza o tamanho da janela
        jFrame.setVisible(true);
        //actionListener(ação para o botao)
        botao.addActionListener(e ->{
        cont++;
        text.setText("N de cliques "+cont);
        jFrame.pack();
        painel.add(new JButton(""+cont));
        });
        
    }
    
}

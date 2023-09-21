import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe que representa a Calculadora2, que é um JPanel (um painel em uma interface gráfica)
public class Calculadora2 extends JPanel {
    // Declaração de variáveis  (componentes gráficos)
    JTextField textFieldHora;
    JTextField textFieldMinuto;
    JTextField textFieldSegundo;
    JLabel labelHoraOriginal;

    // Construtor da classe Calculadora2
    public Calculadora2() {
        // Configuração do layout do painel principal usando GridBagLayout
        super(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os elementos

        // Criação do rótulo (label) do título da calculadora
        JLabel titleLabel = new JLabel("Conversor de Tempo");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36)); // Configuração da fonte
        gbc.gridx = 0; // Posição na grade (coluna)
        gbc.gridy = 0; // Posição na grade (linha)
        gbc.gridwidth = 2; // Largura da célula na grade (ocupa 2 colunas)
        add(titleLabel, gbc); // Adiciona o rótulo ao painel

        // Criação de um painel secundário com layout FlowLayout para os campos de entrada
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Criação dos campos de texto para horas, minutos e segundos
        textFieldHora = new JTextField(10);
        textFieldMinuto = new JTextField(10);
        textFieldSegundo = new JTextField(10);

        // Criação do rótulo "Horas originais" e configuração de seu texto
        labelHoraOriginal = new JLabel("Horas originais:");
        panel.add(labelHoraOriginal); // Adiciona o rótulo ao painel secundário
        panel.add(textFieldHora); // Adiciona o campo de texto de horas ao painel
        panel.add(new JLabel("Minutos:")); // Adiciona um rótulo "Minutos:"
        panel.add(textFieldMinuto); // Adiciona o campo de texto de minutos ao painel
        panel.add(new JLabel("Segundos:")); // Adiciona um rótulo "Segundos:"
        panel.add(textFieldSegundo); // Adiciona o campo de texto de segundos ao painel

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(panel, gbc); // Adiciona o painel secundário com os campos de entrada ao painel principal

        // Criação de um painel secundário com layout FlowLayout para os botões
        JPanel buttonPanel = new JPanel(new FlowLayout());

        // Criação e configuração do botão "Converter"
        JButton converterButton = createButton("Converter", 14, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                converterTempo(); // Chama o método converterTempo() quando o botão é clicado
            }
        });

        // Criação e configuração do botão "Limpar"
        JButton limparButton = createButton("Limpar", 14, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limparCampos(); // Chama o método limparCampos() quando o botão é clicado
            }
        });

        // Adiciona os botões ao painel secundário de botões
        buttonPanel.add(converterButton);
        buttonPanel.add(limparButton);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(buttonPanel, gbc); // Adiciona o painel secundário de botões ao painel principal
    }

    // Método para criar um botão com um tamanho de fonte específico e um ouvinte de ação
    private JButton createButton(String text, int fontSize, ActionListener listener) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, fontSize)); // Configuração da fonte do botão
        button.addActionListener(listener); // Adiciona o ouvinte de ação ao botão
        return button; // Retorna o botão criado
    }

    // Método para realizar a conversão de tempo
    private void converterTempo() {
        // Obtém os valores dos campos de texto para horas, minutos e segundos
        String horaStr = textFieldHora.getText();
        String minutoStr = textFieldMinuto.getText();
        String segundoStr = textFieldSegundo.getText();

        // Verifica se os campos estão vazios e atribui valores padrão se estiverem
        if (horaStr.isEmpty()) horaStr = "0";
        if (minutoStr.isEmpty()) minutoStr = "0";
        if (segundoStr.isEmpty()) segundoStr = "0";

        // Converte os valores de texto em números inteiros
        int horas = Integer.parseInt(horaStr);
        int minutos = Integer.parseInt(minutoStr);
        int segundos = Integer.parseInt(segundoStr);

        // Atualiza o rótulo de "Horas originais" com o valor das horas digitadas
        labelHoraOriginal.setText("Horas originais: " + horaStr);

        // Realiza a conversão de horas e minutos para minutos totais
        int totalMinutos = (horas * 60) + minutos;

        // Realiza a conversão de minutos totais e segundos para segundos totais
        int totalSegundos = (totalMinutos * 60) + segundos;

        // Atualiza os campos de texto de minutos e segundos com os valores convertidos
        textFieldMinuto.setText(String.valueOf(totalMinutos));
        textFieldSegundo.setText(String.valueOf(totalSegundos));

        // Limpa o campo de texto de horas
        textFieldHora.setText("");
    }

    //  limpar os campos de entrada e o rótulo de "Horas originais"
    private void limparCampos() {
        textFieldHora.setText("");
        textFieldMinuto.setText("");
        textFieldSegundo.setText("");
        labelHoraOriginal.setText("Horas originais:");
    }

    //  iniciar a aplicação
       public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculadora2");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Calculadora2());
            frame.pack();
            frame.setSize((int) (frame.getWidth() * 1.4), (int) (frame.getHeight() * 1.4));
            frame.setVisible(true);
        });
    }
}
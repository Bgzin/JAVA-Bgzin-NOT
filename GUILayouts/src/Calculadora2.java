import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora2 extends JPanel {
    JTextField textFieldHora;
    JTextField textFieldMinuto;
    JTextField textFieldSegundo;

    public Calculadora2() {
        super();
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Aumentei o espaçamento

        // Título
        JLabel titleLabel = new JLabel("Conversor de Tempo");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36)); // Aumentei o tamanho da fonte
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        this.add(titleLabel, gbc);

        // Painel para os campos de entrada
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        textFieldHora = new JTextField(10); // Aumentei o tamanho dos campos
        textFieldMinuto = new JTextField(10);
        textFieldSegundo = new JTextField(10);

        // Rótulos e campos de entrada
        panel.add(new JLabel("Horas:"));
        panel.add(textFieldHora);
        panel.add(new JLabel("Minutos:"));
        panel.add(textFieldMinuto);
        panel.add(new JLabel("Segundos:"));
        panel.add(textFieldSegundo);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        this.add(panel, gbc);

        // Painel para botões
        JPanel buttonPanel = new JPanel(new FlowLayout());

        // Botão de conversão
        JButton converterButton = new JButton("Converter");
        converterButton.setFont(new Font("Arial", Font.PLAIN, 18)); // Aumentei o tamanho da fonte
        converterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String horaStr = textFieldHora.getText();
                    String minutoStr = textFieldMinuto.getText();
                    String segundoStr = textFieldSegundo.getText();

                    // Verifica se os campos estão vazios
                    if (horaStr.isEmpty()) horaStr = "0";
                    if (minutoStr.isEmpty()) minutoStr = "0";
                    if (segundoStr.isEmpty()) segundoStr = "0";

                    int horas = Integer.parseInt(horaStr);
                    int minutos = Integer.parseInt(minutoStr);
                    int segundos = Integer.parseInt(segundoStr);
                    //converter horas para minutos 
                    int totalMinutos = (horas * 60) + minutos;

                    // Converter minutos para segundos 
                    int totalSegundos = (totalMinutos * 60) + segundos;

                    textFieldMinuto.setText(String.valueOf(totalMinutos));
                    textFieldSegundo.setText(String.valueOf(totalSegundos));

                    // Limpa o campo de horas
                    textFieldHora.setText("");
                } catch (NumberFormatException ex) {
                    textFieldHora.setText("Erro");
                    textFieldMinuto.setText("Erro");
                    textFieldSegundo.setText("Erro");
                }
            }
        });

        // Botão de limpar
        JButton limparButton = new JButton("Limpar");
        limparButton.setFont(new Font("Arial", Font.PLAIN, 18)); // Aumentei o tamanho da fonte
        limparButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldHora.setText("");
                textFieldMinuto.setText("");
                textFieldSegundo.setText("");
            }
        });

        buttonPanel.add(converterButton);
        buttonPanel.add(limparButton);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        this.add(buttonPanel, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Calculadora2");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Calculadora2());
                frame.pack();
                frame.setSize((int) (frame.getWidth() * 1.4), (int) (frame.getHeight() * 1.4)); // Aumentei o tamanho da janela
                frame.setVisible(true);
            }
        });
    }
}

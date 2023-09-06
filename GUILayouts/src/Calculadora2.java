import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
    public Calculadora2() {
        super();
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel titleLabel = new JLabel("Convert. Hr's");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        this.add(titleLabel, gbc);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JTextField textFieldHora = new JTextField();
        JTextField textFieldMinuto = new JTextField();
        JTextField textFieldSegundo = new JTextField();
        textFieldSegundo.setEditable(false);

        panel.add(new JLabel("aqui estão as Horas:"));
        panel.add(textFieldHora);
        panel.add(new JLabel("aqui os Minutos:"));
        panel.add(textFieldMinuto);
        panel.add(new JLabel("e aqui os Segundos:"));
        panel.add(textFieldSegundo);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        this.add(panel, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton converterButton = new JButton("Resolve");
        converterButton.setFont(new Font("Arial", Font.PLAIN, 12));
        converterButton.setIcon(new ImageIcon("icon_converter.png")); // Substitua "icon_converter.png" pelo caminho do seu ícone
        converterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int horas = Integer.parseInt(textFieldHora.getText());
                    int minutos = 0;
                    if (!textFieldMinuto.getText().isEmpty()) {
                        minutos = Integer.parseInt(textFieldMinuto.getText());
                    }
                    int totalMinutos = horas * 60 + minutos;
                    int segundos = totalMinutos * 60;
                    textFieldMinuto.setText(String.valueOf(totalMinutos));
                    textFieldSegundo.setText(String.valueOf(segundos));
                } catch (NumberFormatException ex) {
                    textFieldMinuto.setText("Erro");
                    textFieldSegundo.setText("Erro");
                }
            }
        });

        JButton limparButton = new JButton("Limpar");
        limparButton.setFont(new Font("Arial", Font.PLAIN, 12));
        limparButton.setIcon(new ImageIcon("icon_limpar.png")); // Substitua "icon_limpar.png" pelo caminho do seu ícone
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
                frame.setVisible(true);
            }
        });
    }
}
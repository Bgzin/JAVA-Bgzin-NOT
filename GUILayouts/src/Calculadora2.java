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

public class Calculadora2 extends JPanel {
    JTextField textFieldHora;
    JTextField textFieldMinuto;
    JTextField textFieldSegundo;
    JLabel labelHoraOriginal;

    public Calculadora2() {
        super(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("Conversor de Tempo");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        textFieldHora = new JTextField(10);
        textFieldMinuto = new JTextField(10);
        textFieldSegundo = new JTextField(10);

        labelHoraOriginal = new JLabel("Horas originais:");
        panel.add(labelHoraOriginal);
        panel.add(textFieldHora);
        panel.add(new JLabel("Minutos:"));
        panel.add(textFieldMinuto);
        panel.add(new JLabel("Segundos:"));
        panel.add(textFieldSegundo);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(panel, gbc);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton converterButton = createButton("Converter", 14, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                converterTempo();
            }
        });

        JButton limparButton = createButton("Limpar", 14, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

    

        buttonPanel.add(converterButton);
        buttonPanel.add(limparButton);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(buttonPanel, gbc);
    }

    private JButton createButton(String text, int fontSize, ActionListener listener) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, fontSize));
        button.addActionListener(listener);
        return button;
    }

    private void converterTempo() {
        String horaStr = textFieldHora.getText();
        String minutoStr = textFieldMinuto.getText();
        String segundoStr = textFieldSegundo.getText();
    
        if (horaStr.isEmpty()) horaStr = "0";
        if (minutoStr.isEmpty()) minutoStr = "0";
        if (segundoStr.isEmpty()) segundoStr = "0";
    
        int horas = Integer.parseInt(horaStr);
        int minutos = Integer.parseInt(minutoStr);
        int segundos = Integer.parseInt(segundoStr);
    
        labelHoraOriginal.setText("Horas originais: " + horaStr);
    
        int totalMinutos = (horas * 60) + minutos;
        int totalSegundos = (totalMinutos * 60) + segundos;
    
        textFieldMinuto.setText(String.valueOf(totalMinutos));
        textFieldSegundo.setText(String.valueOf(totalSegundos));
    
        textFieldHora.setText(String.valueOf(horas + minutos / 60));
    }
    

    private void limparCampos() {
        textFieldHora.setText("");
        textFieldMinuto.setText("");
        textFieldSegundo.setText("");
        labelHoraOriginal.setText("Horas originais:");
    }

    

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

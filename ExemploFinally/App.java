package ExemploFinally;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        //digitação de senha
        String dataNascimento=JOptionPane.showInputDialog("Informe a data de Nascimento em dd/mm/ano");
        String senhaCorreta= "123456";
        String nomeUsuario = JOptionPane.showInputDialog("Informe seu nome de Usuario");
        String senhaDigitada = JOptionPane.showInputDialog("Informe uma Senha de 6 Digitos");
        dataNascimento = dataNascimento.replace("/", "");
        try{
        if(senhaDigitada.length()!=6 ) {
        throw new Exception("as senhas não se correspondem ");
        }
        if(nomeUsuario.equals(senhaDigitada)){
       throw new Exception("o Nome de usuario não pode ser igual a senha");
        }if(dataNascimento.equals(senhaDigitada)){
            throw new Exception("sua data de nascimento não pode ser igual a senha");
        }
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}
        }
    }


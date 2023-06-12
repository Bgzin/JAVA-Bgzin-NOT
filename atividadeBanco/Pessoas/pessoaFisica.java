package atividadeBanco.Pessoas;

public class pessoaFisica  extends Pessoas{
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    @Override
    public String toString() {
       return "PessoaJuridica = {"
           + this.getNomeConta() + "Nome: , "
           + this.getNumeroConta() + "nConta: , "
           + this.getCPF() + "CPF: , "
           + this.getSaldoConta() + "Saldo R$: , "
           + "}";
   }  
}

package atividadeBanco.Pessoas;

public class pessoaJuridica extends Pessoas {
 private String CNPJ;

public String getCNPJ() {
    return CNPJ;
}

public void setCNPJ(String cNPJ) {
    CNPJ = cNPJ;
}
 
 @Override
 public String toString() {
    return "PessoaJuridica = {"
        + this.getNomeConta() + ", "
        + this.getNumeroConta() + ", "
        + this.getCNPJ() + ", "
        + this.getSaldoConta() + ", "
        + "}";
}
}

package atividadeBanco.Pessoas;

public class Pessoas {
//minha super classe para cadastro

String numeroConta;
String nomeConta;
static int saldoConta;

public String getNumeroConta() {
    return numeroConta;
}
public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
}
public String getNomeConta() {
    return nomeConta;
}
public void setNomeConta(String nomeConta) {
    this.nomeConta = nomeConta;
}
public static int  getSaldoConta() {
    return saldoConta;
}
public void setSaldoConta(int  saldoConta) {
    this.saldoConta = saldoConta;
}


}
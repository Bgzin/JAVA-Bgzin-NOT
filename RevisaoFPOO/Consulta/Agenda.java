package RevisaoFPOO.Consulta;

import RevisaoFPOO.Cadastro.Animal;

public class Agenda extends Animal{
    String DataPref;
    String nomeC;
    String horarioP;
    
    public String getDataPref() {
        return DataPref;
    }
    public void setDataPref(String dataPref) {
        DataPref = dataPref;
    }
    public String getNomeC() {
        return nomeC;
    }
    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }
    public String getHorarioP() {
        return horarioP;
    }
    public void setHorarioP(String horarioP) {
        this.horarioP = horarioP;
    }
    
}

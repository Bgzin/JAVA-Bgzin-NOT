package RevisaoFPOO.Consulta;

import RevisaoFPOO.Cadastro.Animal;

public class Agenda extends Animal{
    String DataPref;
    String horarioP;
    String dataHora;
    String servico;


    public String getDataPref() {
        return DataPref;
    }
    public void setDataPref(String dataPref) {
        DataPref = dataPref;
    }
   
    public String getHorarioP() {
        return horarioP;
    }
    public void setHorarioP(String horarioP) {
        this.horarioP = horarioP;
    }
    public String getDataHora() {
        dataHora= DataPref+horarioP;
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    
  
}

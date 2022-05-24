package model;

public class Residente extends Medico {

    public String crm_residente;
    public String instituicao_ensino;
    public int ano_ingresso;

    public String getCrm_residente() {
        return crm_residente;
    }

    public void setCrm_residente(String crm_residente) {
        this.crm_residente = crm_residente;
    }

    public String getInstituicao_ensino() {
        return instituicao_ensino;
    }

    public void setInstituicao_ensino(String instituicao_ensino) {
        this.instituicao_ensino = instituicao_ensino;
    }

    public int getAno_ingresso() {
        return ano_ingresso;
    }

    public void setAno_ingresso(int ano_ingresso) {
        this.ano_ingresso = ano_ingresso;
    }

    @Override
    public String toString() {
        return "Residente{" +
                "crm_residente='" + crm_residente + '\'' +
                ", instituicao_ensino='" + instituicao_ensino + '\'' +
                ", ano_ingresso=" + ano_ingresso +
                '}';
    }
}

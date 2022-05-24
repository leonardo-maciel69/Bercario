package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

public class Medico {

    public String crm_medico;
    public String nome_medico;
    public String telefone_medico;
    public String especialidade_medico;

    public String getCrm_medico() {
        return crm_medico;
    }

    public void setCrm_medico(String crm_medico) {
        this.crm_medico = crm_medico;
    }

    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    public String getTelefone_medico() {
        return telefone_medico;
    }

    public void setTelefone_medico(String telefone_medico) {
        this.telefone_medico = telefone_medico;
    }

    public String getEspecialidade_medico() {
        return especialidade_medico;
    }

    public void setEspecialidade_medico(String especialidade_medico) {
        this.especialidade_medico = especialidade_medico;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm_medico='" + crm_medico + '\'' +
                ", nome_medico='" + nome_medico + '\'' +
                ", telefone_medico='" + telefone_medico + '\'' +
                ", especialidade_medico='" + especialidade_medico + '\'' +
                '}';
    }
}

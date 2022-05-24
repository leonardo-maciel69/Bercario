package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

public class Bebe {

    public int cpf_bebe;
    public String nome_bebe;
    public date data_bebe_nasc;
    public double peso_bebe_nasc;
    public double altura_bebe_nasc;

    public int getCpf_bebe() {
        return cpf_bebe;
    }

    public void setCpf_bebe(int cpf_bebe) {
        this.cpf_bebe = cpf_bebe;
    }

    public String getNome_bebe() {
        return nome_bebe;
    }

    public void setNome_bebe(String nome_bebe) {
        this.nome_bebe = nome_bebe;
    }

    public date getData_bebe_nasc() {
        return data_bebe_nasc;
    }

    public void setData_bebe_nasc(date data_bebe_nasc) {
        this.data_bebe_nasc = data_bebe_nasc;
    }

    public double getPeso_bebe_nasc() {
        return peso_bebe_nasc;
    }

    public void setPeso_bebe_nasc(double peso_bebe_nasc) {
        this.peso_bebe_nasc = peso_bebe_nasc;
    }

    public double getAltura_bebe_nasc() {
        return altura_bebe_nasc;
    }

    public void setAltura_bebe_nasc(double altura_bebe_nasc) {
        this.altura_bebe_nasc = altura_bebe_nasc;
    }

    @Override
    public String toString() {
        return "Bebe{" +
                "cpf_bebe=" + cpf_bebe +
                ", nome_bebe='" + nome_bebe + '\'' +
                ", data_bebe_nasc='" + data_bebe_nasc + '\'' +
                ", peso_bebe_nasc=" + peso_bebe_nasc +
                ", altura_bebe_nasc=" + altura_bebe_nasc +
                '}';
    }
}

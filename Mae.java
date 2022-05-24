package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

public class Mae {

    public int cpf_mae;
    public String nome_mae;
    public String logradouro_endereco;
    public int numero_endereco;
    public String CEP_endereco;
    public String complemento_endereco;
    public String telefone;
    public date data_nasc_mae;

    public int getCpf_mae() {
        return cpf_mae;
    }

    public void setCpf_mae(int cpf_mae) {
        this.cpf_mae = cpf_mae;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getLogradouro_endereco() {
        return logradouro_endereco;
    }

    public void setLogradouro_endereco(String logradouro_endereco) {
        this.logradouro_endereco = logradouro_endereco;
    }

    public int getNumero_endereco() {
        return numero_endereco;
    }

    public void setNumero_endereco(int numero_endereco) {
        this.numero_endereco = numero_endereco;
    }

    public String getCEP_endereco() {
        return CEP_endereco;
    }

    public void setCEP_endereco(String CEP_endereco) {
        this.CEP_endereco = CEP_endereco;
    }

    public String getComplemento_endereco() {
        return complemento_endereco;
    }

    public void setComplemento_endereco(String complemento_endereco) {
        this.complemento_endereco = complemento_endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public date getData_nasc_mae() {
        return data_nasc_mae;
    }

    public void setData_nasc_mae(date data_nasc_mae) {
        this.data_nasc_mae = data_nasc_mae;
    }

    @Override
    public String toString() {
        return "Mae{" +
                "cpf_mae=" + cpf_mae +
                ", nome_mae='" + nome_mae + '\'' +
                ", logradouro_endereco='" + logradouro_endereco + '\'' +
                ", numero_endereco=" + numero_endereco +
                ", CEP_endereco='" + CEP_endereco + '\'' +
                ", complemento_endereco='" + complemento_endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", data_nasc_mae=" + data_nasc_mae +
                '}';
    }
}

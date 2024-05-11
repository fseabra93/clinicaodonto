/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaodonto;

/**
 *
 * @author flaviorgs
 */
public class Pessoa {
    
    private String nome;
    private String sexo;
    private String endereco;
    private String telefone;
    private int DNasc_dia;
    private int DNasc_mes;
    private int DNasc_ano;

    public Pessoa(String nome, String sexo, String endereco, String telefone, int DNasc_dia, int DNasc_mes, int DNasc_ano) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.DNasc_dia = DNasc_dia;
        this.DNasc_mes = DNasc_mes;
        this.DNasc_ano = DNasc_ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getDNasc_dia() {
        return DNasc_dia;
    }

    public void setDNasc_dia(int DNasc_dia) {
        this.DNasc_dia = DNasc_dia;
    }

    public int getDNasc_mes() {
        return DNasc_mes;
    }

    public void setDNasc_mes(int DNasc_mes) {
        this.DNasc_mes = DNasc_mes;
    }

    public int getDNasc_ano() {
        return DNasc_ano;
    }

    public void setDNasc_ano(int DNasc_ano) {
        this.DNasc_ano = DNasc_ano;
    }
    
    
}

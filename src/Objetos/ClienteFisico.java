/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.awt.image.BufferedImage;

/**
 *
 * @author Manoel Henrique
 */
public class ClienteFisico {


    String nome;            //Nome: string (Máximo 70 caracteres)
    String CPF;             //CPF: string (xxx.xxx.xxx-xx)
    String RG;              //RG: string (xxxxxxx-x)
    String dataNascimento;  //Data de nascimento: string (Máximo 10 caracteres)    
    String CEP;             //CEP: string (xxxxx-xxx)
    String CTPS;            //CTPS: string (xxxxxxx)
    String PIS;             //PIS/PASEP: string (xxx.xxxxx.xx-x)
    String serieCtps;       //Série da CTPS: string (xxxx)
    String UF;              //UF: string (XX)
    String UFdaCTPS;        //UFdaCTPS: string (XX)
    String estadoCivil;     //Estado civil: (Botão com as opções: solteiro/casado/divorciado) 
    String certidaoCamento; //*Se for casado também será necessário o Nº da certidão de casamento: string (xxxxxx xx xx xxxx x xxxxx xxx xxxxxxx xx)
    String conjuge;        //*Nome do conjugue: (Máximo 100 caracteres)
    String rua;
    String numero;
    String telefone;
    String cidade;
    byte[] foto;

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }




    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUFdaCTPS() {
        return UFdaCTPS;
    }

    public void setUFdaCTPS(String UFdaCTPS) {
        this.UFdaCTPS = UFdaCTPS;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public String getPIS() {
        return PIS;
    }

    public void setPIS(String PIS) {
        this.PIS = PIS;
    }

    public String getSerieCtps() {
        return serieCtps;
    }

    public void setSerieCtps(String serieCtps) {
        this.serieCtps = serieCtps;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCertidaoCamento() {
        return certidaoCamento;
    }

    public void setCertidaoCamento(String certidaoCamento) {
        this.certidaoCamento = certidaoCamento;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjugue) {
        this.conjuge = conjugue;
    }

    

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Manoel Henrique
 */
public class ProcessoClienteJuridico {
    String Nprocesso;
    String assunto;
    String cidade;
    String advogado;
    String clienteJ;
    String reu;
    String juiz;
    String testemunha;
    String cep;
    String abertura;
    String arquivamento;
    String causa;

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getArquivamento() {
        return arquivamento;
    }

    public void setArquivamento(String arquivamento) {
        this.arquivamento = arquivamento;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNprocesso() {
        return Nprocesso;
    }

    public String getClienteJ() {
        return clienteJ;
    }

    public void setClienteJ(String clienteJ) {
        this.clienteJ = clienteJ;
    }

    public void setNprocesso(String Nprocesso) {
        this.Nprocesso = Nprocesso;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getAdvogado() {
        return advogado;
    }

    public void setAdvogado(String advogado) {
        this.advogado = advogado;
    }


    public String getReu() {
        return reu;
    }

    public void setReu(String reu) {
        this.reu = reu;
    }

    public String getJuiz() {
        return juiz;
    }

    public void setJuiz(String juiz) {
        this.juiz = juiz;
    }

    public String getTestemunha() {
        return testemunha;
    }

    public void setTestemunha(String testemunha) {
        this.testemunha = testemunha;
    }
}

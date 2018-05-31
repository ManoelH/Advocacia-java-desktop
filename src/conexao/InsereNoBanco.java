/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import Objetos.ClienteFisico;
import Objetos.ClienteJuridico;
import Objetos.ProcessoClienteFisico;
import Objetos.ProcessoClienteJuridico;
import Objetos.Usuarios;
import static com.oracle.jrockit.jfr.ContentType.Bytes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manoel Henrique
 */
public class InsereNoBanco {
    
    ConectaBanco conexao = new ConectaBanco();
    Objetos.ClienteFisico clienteFisico = new ClienteFisico();
    Objetos.ClienteJuridico clienteJuridico = new ClienteJuridico();
    Objetos.Usuarios usuario = new Usuarios();
    
    public boolean inserirClienteF(ClienteFisico clienteFisico){
    
        conexao.conecta();
        
        try {
            PreparedStatement pst = conexao.con.prepareStatement
                ("insert into cliente_pessoa_fisica (nome, cpf, estado_civil,\n" +
                        "rg, telefone, ctps, serie, uf_ctps,\n" +
                        "cep, data_nascimento, pis, rua,\n" +
                        "nome_conjugue, certidao_casamento, numero,\n" +
                        "cidade, uf, imagem) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1,clienteFisico.getNome());
            pst.setString(2, clienteFisico.getCPF());
            pst.setString(3, clienteFisico.getEstadoCivil());
            pst.setString(4, clienteFisico.getRG());
            pst.setString(5, clienteFisico.getTelefone());
            pst.setString(6, clienteFisico.getCTPS());
            pst.setString(7, clienteFisico.getSerieCtps());
            pst.setString(8, clienteFisico.getUFdaCTPS());
            pst.setString(9, clienteFisico.getCEP());
            pst.setString(10, clienteFisico.getDataNascimento());
            pst.setString(11, clienteFisico.getPIS());
            pst.setString(12, clienteFisico.getRua());
            pst.setString(13, clienteFisico.getConjuge());
            pst.setString(14, clienteFisico.getCertidaoCamento());
            pst.setString(15, clienteFisico.getNumero());
            pst.setString(16, clienteFisico.getCidade());
            pst.setString(17, clienteFisico.getUF());
            pst.setBytes(18, clienteFisico.getFoto());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
            conexao.desconecta();
            return true;
            
        } catch (SQLException ex) {
            conexao.desconecta();
            return false;
            
        }
                
        
    }
    
    public boolean inserirClienteJ(ClienteJuridico clienteJuridico){
    conexao.conecta();
    
        try {
            PreparedStatement pst = conexao.con.prepareStatement
        ("insert into cliente_pessoa_juridica (nome_fantasia, razao_social, cep, cnpj, area_atuacao, cidade, rua, numero, telefone,uf, imagem)"
                + "values (?,?,?,?,?,?,?,?,?,?,?)");
            
            
            pst.setString(1, clienteJuridico.getNomeFantasia());
            pst.setString(2, clienteJuridico.getRazaoSocial());
            pst.setString(3, clienteJuridico.getCEP());
            pst.setString(4, clienteJuridico.getCNPJ());
            pst.setString(5, clienteJuridico.getAreaAtuacao());
            pst.setString(6, clienteJuridico.getCidade());
            pst.setString(7, clienteJuridico.getRua());
            pst.setString(8, clienteJuridico.getNumero());
            pst.setString(9, clienteJuridico.getTelefone());
            pst.setString(10, clienteJuridico.getUf());
            pst.setBytes(11, clienteJuridico.getFoto());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
            conexao.desconecta();
            return true;
        } catch (SQLException ex) {
            conexao.desconecta();
            return false;
            
        }
        
        
    
    }
    
    
    public boolean inserirUsuario (Usuarios usuario){
    
        conexao.conecta();
    
        try {
            PreparedStatement pst = conexao.con.prepareStatement
        ("insert into usuarios (nome, senha) values (?, ?)");
         pst.setString(1, usuario.getNome());
         pst.setString(2, usuario.getSenha());
         pst.execute();
         JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
         conexao.desconecta();
            return true;
        } catch (Exception e) {
        conexao.desconecta();
        return false;
        }
    
    }
    
    
    public boolean inserirProcessoCF (ProcessoClienteFisico processo){
    
        conexao.conecta();
    
        try {
            PreparedStatement pst = conexao.con.prepareStatement
        ("insert into processos_fisicos (numero, assunto, cep, cidade, cliente_fisico, advogado, juiz, testemunha, reu_pessoa_juridica, abertura, arquivamento, causa) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
         pst.setString(1, processo.getNprocesso());
         pst.setString(2, processo.getAssunto());
         pst.setString(3, processo.getCep());
         pst.setString(4, processo.getCidade());
         pst.setString(5, processo.getClienteF());
         pst.setString(6, processo.getAdvogado());
         pst.setString(7, processo.getJuiz());
         pst.setString(8, processo.getTestemunha());
         pst.setString(9, processo.getReu());
         pst.setString(10, processo.getAbertura());
         pst.setString(11, processo.getArquivamento());
         pst.setString(12, processo.getCausa());
         pst.execute();
            return true;
        } catch (SQLException e) {
        conexao.desconecta();
        return false;
        }
    
    }
    
    
    
        public boolean inserirProcessoCJ (ProcessoClienteJuridico processo){
    
        conexao.conecta();
    
        try {
         PreparedStatement pst = conexao.con.prepareStatement("insert into processos_juridicos (numero, assunto, cep, cidade, cliente_juridico, advogado, juiz, testemunha, reu_pessoa_fisica, abertura, arquivamento, causa) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
         pst.setString(1, processo.getNprocesso());
         pst.setString(2, processo.getAssunto());
         pst.setString(3, processo.getCep());
         pst.setString(4, processo.getCidade());
         pst.setString(5, processo.getClienteJ());
         pst.setString(6, processo.getAdvogado());
         pst.setString(7, processo.getJuiz());
         pst.setString(8, processo.getTestemunha());
         pst.setString(9, processo.getReu());
         pst.setString(10, processo.getAbertura());
         pst.setString(11, processo.getArquivamento());
         pst.setString(12, processo.getCausa());
         pst.execute();
        
            return true;
            
        } catch (SQLException e) {
        conexao.desconecta();
        return false;
        }
    
    }
}

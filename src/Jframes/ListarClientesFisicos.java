/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import Objetos.ModeloTabela;
import conexao.ConectaBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Manoel Henrique
 */
public class ListarClientesFisicos extends javax.swing.JFrame {

    /**
     * Creates new form ListarUsuarios
     */
    conexao.ConectaBanco conexao = new ConectaBanco();
    public ListarClientesFisicos() {
        initComponents();
        preencherTabela("select id, nome, cpf, estado_civil, rg, telefone, ctps, serie, uf_ctps, cep, data_nascimento, pis, rua, nome_conjugue, certidao_casamento, numero, cidade, uf from cliente_pessoa_fisica order by nome;");
    }
    
    public void preencherTabela(String sql){
        ArrayList linhas = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "CPF", "Estado civil", "RG", "Telefone", "CTPS", "Serie", "UF da CTPS", "CEP", "Data de nascimento", "PIS", "Rua", "Nome do conjugue", "Certidão de casamento", "Nº", "Cidade", "UF"};
        conexao.conecta();
        conexao.executaSQL(sql);

        try {
          conexao.rs.first();
          
          do{
          linhas.add(new Object[]{conexao.rs.getInt("id"), conexao.rs.getString("nome"), conexao.rs.getString("cpf"), conexao.rs.getString("estado_civil"), 
          conexao.rs.getString("rg"), conexao.rs.getString("telefone"), conexao.rs.getString("ctps"), conexao.rs.getString("serie"), conexao.rs.getString("uf_ctps"),
          conexao.rs.getString("cep"), conexao.rs.getString("data_nascimento"), conexao.rs.getString("pis"), conexao.rs.getString("rua"), conexao.rs.getString("nome_conjugue"),
          conexao.rs.getString("certidao_casamento"), conexao.rs.getString("numero"), conexao.rs.getString("cidade"), conexao.rs.getString("uf")});
          }while(conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "erro");
        }
        
        Objetos.ModeloTabela modelo = new ModeloTabela(linhas, colunas);
        tabelaUsuario.setModel(modelo);
        tabelaUsuario.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(1).setPreferredWidth(270);
        tabelaUsuario.getColumnModel().getColumn(1).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabelaUsuario.getColumnModel().getColumn(2).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabelaUsuario.getColumnModel().getColumn(3).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabelaUsuario.getColumnModel().getColumn(4).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(5).setPreferredWidth(120);
        tabelaUsuario.getColumnModel().getColumn(5).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(6).setPreferredWidth(80);
        tabelaUsuario.getColumnModel().getColumn(6).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(7).setPreferredWidth(180);
        tabelaUsuario.getColumnModel().getColumn(7).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(8).setPreferredWidth(60);
        tabelaUsuario.getColumnModel().getColumn(8).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(9).setPreferredWidth(100);
        tabelaUsuario.getColumnModel().getColumn(9).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(10).setPreferredWidth(150);
        tabelaUsuario.getColumnModel().getColumn(10).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(11).setPreferredWidth(150);
        tabelaUsuario.getColumnModel().getColumn(11).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(12).setPreferredWidth(270);
        tabelaUsuario.getColumnModel().getColumn(12).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(13).setPreferredWidth(150);
        tabelaUsuario.getColumnModel().getColumn(13).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(14).setPreferredWidth(120);
        tabelaUsuario.getColumnModel().getColumn(14).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(15).setPreferredWidth(60);
        tabelaUsuario.getColumnModel().getColumn(15).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(16).setPreferredWidth(180);
        tabelaUsuario.getColumnModel().getColumn(16).setResizable(false);
        tabelaUsuario.getColumnModel().getColumn(17).setPreferredWidth(45);
        tabelaUsuario.getColumnModel().getColumn(17).setResizable(false);

        
        tabelaUsuario.getTableHeader().setReorderingAllowed(false);
        tabelaUsuario.setAutoResizeMode(tabelaUsuario.AUTO_RESIZE_OFF);
        tabelaUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conexao.desconecta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        fundo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes físicos");
        setResizable(false);

        jScrollPane1.setBorder(null);

        tabelaUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaUsuario.setForeground(new java.awt.Color(255, 204, 0));
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarClientesFisicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarClientesFisicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarClientesFisicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarClientesFisicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarClientesFisicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tabelaUsuario;
    // End of variables declaration//GEN-END:variables
}

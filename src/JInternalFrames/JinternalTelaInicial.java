/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JInternalFrames;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Manoel Henrique
 */
public class JinternalTelaInicial extends javax.swing.JInternalFrame {

    /**
     * Creates new form JinternalTelaInicial
     */
    protected static Image fundo;
    
    public JinternalTelaInicial() {
        super(null, false, false, false);
        initComponents();
        
        try {   //Inserindo a imagem no objeto fundo do tipo Image;
            fundo = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("fundoOpaco.jpg"),"fundoOpaco.jpg"));
        } catch (Exception e) {
        }
        
        
    }

    
    
    public void paint(Graphics Fundo){
        //"pintando" o objeto fundo na classe
        Fundo.drawImage(fundo, 0, 0, getWidth(),getHeight(),this);
            
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

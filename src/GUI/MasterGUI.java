/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import businesLogic.Juegos;
import data.Juego;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class MasterGUI extends javax.swing.JFrame {
Juego[] constructor= new Juego[3]; 
    /**
     * Creates new form JugadorGUI
     */
    public MasterGUI() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        juego1 = new javax.swing.JButton();
        juego2 = new javax.swing.JButton();
        juego3 = new javax.swing.JButton();
        juego4 = new javax.swing.JButton();
        nombreMaster = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Master");

        juego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juego1ActionPerformed(evt);
            }
        });

        juego2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juego2ActionPerformed(evt);
            }
        });

        juego3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juego3ActionPerformed(evt);
            }
        });

        juego4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juego4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(nombreMaster)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(juego1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(juego2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(juego3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(juego4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreMaster))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(juego1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addComponent(juego2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(juego3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(juego4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void juego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juego1ActionPerformed
        
        Juegos cons = new Juegos();
        String user =  nombreMaster.getText();
        
        if(juego1.getText().equals("new")){
            System.out.println("entra al if del boton");
            cons.CrearJuego(0,user,constructor);
        }else{
            cons.entrarEnJuego(0,user,constructor);
        }
        
        
        
    }//GEN-LAST:event_juego1ActionPerformed

    private void juego2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juego2ActionPerformed
        Juegos cons = new Juegos();
        String user =  nombreMaster.getText();
        if(juego2.getText().equals("new")){
            cons.CrearJuego(1,user,constructor);
        }else{
            cons.entrarEnJuego(1,user,constructor);
        }
    }//GEN-LAST:event_juego2ActionPerformed

    private void juego3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juego3ActionPerformed
        Juegos cons = new Juegos();
        String user =  nombreMaster.getText();
        if(juego3.getText().equals("new")){
            cons.CrearJuego(2,user,constructor);
        }else{
            cons.entrarEnJuego(2,user,constructor);
        }
    }//GEN-LAST:event_juego3ActionPerformed

    private void juego4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juego4ActionPerformed
        Juegos cons = new Juegos();
        String user =  nombreMaster.getText();
        if(juego4.getText().equals("new")){
            cons.CrearJuego(3,user,constructor);
        }else{
            cons.entrarEnJuego(3,user,constructor);
        }
    }//GEN-LAST:event_juego4ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterGUI().setVisible(true);
                
            }
        });
    }

    public JButton getJuego1() {
        return juego1;
    }

    public void setJuego1(String text) {
        juego1.setText(text);
    }

    public JButton getJuego2() {
        return juego2;
    }

    public void setJuego2(String text) {
        juego2.setText(text);
    }

    public JButton getJuego3() {
        return juego3;
    }

    public void setJuego3(String text) {
        juego3.setText(text);
    }

    public JButton getJuego4() {
        return juego4;
    }

    public void setJuego4(String text) {
        juego4.setText(text);
    }

    public JLabel getNombreMaster() {
        return nombreMaster;
    }

    

    public void setNombreMaster(String text) {
        nombreMaster.setText(text);
    }

    public Juego[] getConstructor() {
        return constructor;
    }

    public void setConstructor(Juego[] constructor) {
        this.constructor = constructor;
    }

    
    
 

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton juego1;
    private javax.swing.JButton juego2;
    private javax.swing.JButton juego3;
    private javax.swing.JButton juego4;
    private javax.swing.JLabel nombreMaster;
    // End of variables declaration//GEN-END:variables
}

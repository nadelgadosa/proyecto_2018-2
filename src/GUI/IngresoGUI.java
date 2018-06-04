package GUI;
import businesLogic.IngresoYRegistro;
import data.Jugador;
import java.awt.Color;
import javax.swing.JButton;
/**
 *
 * @author beto arias
 */
public class IngresoGUI extends javax.swing.JFrame {
IngresoGUI l;
    /**
     * Creates new form IngresoGUI
     */
    public IngresoGUI() {
        initComponents();
        l=this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContraseña = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        BtnEntrar = new javax.swing.JButton();
        BtnRegistrar = new javax.swing.JButton();
        RBMaster = new javax.swing.JRadioButton();
        RBJugador = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lblContraseña.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");

        LblUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("Usuario");

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/dungeons_and_dragons.jpg"))); // NOI18N

        txtUsuario.setVerifyInputWhenFocusTarget(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        BtnEntrar.setText("ENTRAR");
        BtnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEntrarMouseClicked(evt);
            }
        });
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        BtnRegistrar.setText("REGISTRAR");
        BtnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarMouseClicked(evt);
            }
        });
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        RBMaster.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RBMaster.setForeground(new java.awt.Color(255, 255, 255));
        RBMaster.setText("Master");
        RBMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMasterActionPerformed(evt);
            }
        });

        RBJugador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RBJugador.setForeground(new java.awt.Color(255, 255, 255));
        RBJugador.setText("Jugador");
        RBJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnEntrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblContraseña)
                        .addComponent(LblUsuario)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBMaster)
                            .addComponent(RBJugador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BtnRegistrar)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBMaster))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBJugador))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEntrar)
                    .addComponent(BtnRegistrar))
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void RBMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBMasterActionPerformed

    private void RBJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBJugadorActionPerformed

    private void BtnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEntrarMouseClicked
        IngresoYRegistro cons = new IngresoYRegistro();
        String User, pass;

        User= txtUsuario.getText();
        pass= Password.getText();
        if (RBJugador.isSelected()){
            System.out.println("entra al buton action");
        cons.IngresoJugador(User, pass);
        }
        if(RBMaster.isSelected()){
        cons.IngresoMaster(User,pass);
        }
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEntrarMouseClicked

    private void BtnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistrarMouseClicked

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed

RegistroGUI  r= new RegistroGUI(l);
				r.setVisible(true);
				l.setVisible(false);
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoGUI().setVisible(true);
            }
        });
    }

    public JButton getBtnEntrar() {
        return BtnEntrar;
    }

    public void setBtnEntrar() {
        BtnEntrar.setBackground(Color.red);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPasswordField Password;
    private javax.swing.JRadioButton RBJugador;
    private javax.swing.JRadioButton RBMaster;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

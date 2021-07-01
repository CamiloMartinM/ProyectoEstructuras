/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEstructuras;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class FrameRegistro extends javax.swing.JFrame {

    public FrameRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon bookjpg = new ImageIcon(getClass().getResource("/recursos/book.png"));
        Icon fondo1 = new ImageIcon(bookjpg.getImage().getScaledInstance(jLBook.getWidth(), jLBook.getHeight(), Image.SCALE_DEFAULT));
        jLBook.setIcon(fondo1);
        this.repaint();
        
        ImageIcon loginjpg = new ImageIcon(getClass().getResource("/recursos/login.png"));
        Icon fondo2 = new ImageIcon(loginjpg.getImage().getScaledInstance(jLUser.getWidth(), jLUser.getHeight(), Image.SCALE_DEFAULT));
        jLUser.setIcon(fondo2);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLUser = new javax.swing.JLabel();
        jTextCorreo = new javax.swing.JTextField();
        jTextContraseña = new javax.swing.JTextField();
        jTextUser = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jB_Registro = new javax.swing.JButton();
        jB_Login1 = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jLBook = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1041, 585));
        setPreferredSize(new java.awt.Dimension(1041, 585));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLUser.setText("User");
        getContentPane().add(jLUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 31, 162, 150));

        jTextCorreo.setText("Correo Electrónico");
        getContentPane().add(jTextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 218, 183, 31));

        jTextContraseña.setText("Contraseña");
        getContentPane().add(jTextContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 267, 183, 31));

        jTextUser.setText("Nombre de usuario");
        getContentPane().add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 316, 183, 31));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1041, 545));

        jB_Registro.setBackground(new java.awt.Color(166, 242, 143));
        jB_Registro.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jB_Registro.setText("Registrate");
        jB_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RegistroActionPerformed(evt);
            }
        });

        jB_Login1.setBackground(new java.awt.Color(203, 247, 224));
        jB_Login1.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jB_Login1.setText("Ingresa");
        jB_Login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_Login1MouseClicked(evt);
            }
        });
        jB_Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Login1ActionPerformed(evt);
            }
        });

        jTextBuscar.setText("Buscar un libro");
        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });

        jLBook.setText("Libro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(jB_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(461, 461, 461))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLBook, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBook, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(jB_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("¿Qué es UN-Book?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 170, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jB_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RegistroActionPerformed
      
    }//GEN-LAST:event_jB_RegistroActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jB_Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Login1ActionPerformed
        FrameIngresar login = new FrameIngresar();
        this.setVisible(false);
        login.setVisible(true);
        
    }//GEN-LAST:event_jB_Login1ActionPerformed

    private void jB_Login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_Login1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_Login1MouseClicked

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
            java.util.logging.Logger.getLogger(FrameRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Login1;
    private javax.swing.JButton jB_Registro;
    private javax.swing.JLabel jLBook;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextContraseña;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
}

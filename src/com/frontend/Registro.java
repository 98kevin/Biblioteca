/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frontend;

/**
 *
 * @author luedu
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Prestamos
     */
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BLibro = new javax.swing.JButton();
        BEstudiante = new javax.swing.JButton();
        BBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BLibro.setBackground(new java.awt.Color(102, 255, 0));
        BLibro.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BLibro.setText("Libro");
        BLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLibroActionPerformed(evt);
            }
        });
        getContentPane().add(BLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 230, 50));

        BEstudiante.setBackground(new java.awt.Color(102, 255, 0));
        BEstudiante.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BEstudiante.setText("Estudiante");
        BEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(BEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 230, 50));

        BBack.setBackground(new java.awt.Color(102, 255, 0));
        BBack.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BBack.setText("Back");
        BBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBackActionPerformed(evt);
            }
        });
        getContentPane().add(BBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/5ab10d4485600a3d195f6753.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 850, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLibroActionPerformed
        this.setVisible(false);
        new RegistroLibro().setVisible(true);

        /*
        Registro principa2 = new Registro();
        principa2.show();
        principa2.setVisible(false);

        G_Partidas principal = new G_Partidas();
        principal.show();
        this.setVisible(false);
        */
    }//GEN-LAST:event_BLibroActionPerformed

    private void BEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEstudianteActionPerformed
        this.setVisible(false);
        new RegistroEstudiante().setVisible(true);
    }//GEN-LAST:event_BEstudianteActionPerformed

    private void BBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBackActionPerformed
        this.setVisible(false);
        new Principal().setVisible(true);
    }//GEN-LAST:event_BBackActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBack;
    private javax.swing.JButton BEstudiante;
    private javax.swing.JButton BLibro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
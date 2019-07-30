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
public class RegistroLibro extends javax.swing.JFrame {

    /**
     * Creates new form RegistroEstudiante
     */
    public RegistroLibro() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jlNickname = new javax.swing.JLabel();
        JTF1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTF2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTF3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        JTF5 = new javax.swing.JTextField();
        JTF6 = new javax.swing.JTextField();
        JTF4 = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jButtonRegistro = new javax.swing.JButton();
        M_2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTF7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTF8 = new javax.swing.JTextField();
        jLabelFont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setBackground(new java.awt.Color(102, 255, 102));
        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTitulo.setText("Registro de Libros");
        jLabelTitulo.setAutoscrolls(true);
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jlNickname.setBackground(new java.awt.Color(102, 255, 102));
        jlNickname.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlNickname.setForeground(new java.awt.Color(51, 255, 51));
        jlNickname.setText("Titulo:");
        jlNickname.setAutoscrolls(true);
        getContentPane().add(jlNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        JTF1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        JTF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF1ActionPerformed(evt);
            }
        });
        getContentPane().add(JTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 370, 30));

        jLabel7.setBackground(new java.awt.Color(102, 255, 102));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("Autor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, -1));

        JTF2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        JTF2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF2ActionPerformed(evt);
            }
        });
        getContentPane().add(JTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 370, 30));

        jLabel8.setBackground(new java.awt.Color(102, 255, 102));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("ID Libro:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 220, -1));

        JTF3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        JTF3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF3ActionPerformed(evt);
            }
        });
        getContentPane().add(JTF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 370, 30));

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Fecha de Publicación:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 280, -1));

        jButtonSave.setBackground(new java.awt.Color(102, 255, 102));
        jButtonSave.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(255, 0, 51));
        jButtonSave.setText("Guardar");
        jButtonSave.setActionCommand("Ver Reportes");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));

        JTF5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        JTF5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF5ActionPerformed(evt);
            }
        });
        getContentPane().add(JTF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 50, 30));

        JTF6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        JTF6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF6ActionPerformed(evt);
            }
        });
        getContentPane().add(JTF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 120, 30));

        JTF4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        JTF4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF4ActionPerformed(evt);
            }
        });
        getContentPane().add(JTF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 70, 30));

        Back.setBackground(new java.awt.Color(102, 255, 102));
        Back.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 0, 51));
        Back.setText("Back");
        Back.setActionCommand("Ver Reportes");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 90, -1));

        jButtonRegistro.setBackground(new java.awt.Color(102, 255, 102));
        jButtonRegistro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButtonRegistro.setForeground(new java.awt.Color(255, 0, 0));
        jButtonRegistro.setText("Registro");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 170, -1));

        M_2.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        getContentPane().add(M_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 40, -1));

        jLabel9.setBackground(new java.awt.Color(102, 255, 102));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 0));
        jLabel9.setText("Editorial:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 220, -1));

        JTF7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        JTF7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF7ActionPerformed(evt);
            }
        });
        getContentPane().add(JTF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 370, 30));

        jLabel10.setBackground(new java.awt.Color(102, 255, 102));
        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 0));
        jLabel10.setText("Copias:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 220, -1));

        JTF8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        JTF8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF8ActionPerformed(evt);
            }
        });
        getContentPane().add(JTF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 370, 30));

        jLabelFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/libros (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF1ActionPerformed

    private void JTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF2ActionPerformed

    private void JTF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF3ActionPerformed

    private void JTF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF5ActionPerformed

    private void JTF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF6ActionPerformed

    private void JTF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF4ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        new Registro().setVisible(true);

    }//GEN-LAST:event_BackActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        this.setVisible(false);
       // new Estadisticas().setVisible(true);

        // new Reportes().setVisible(true);
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void JTF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF7ActionPerformed

    private void JTF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF8ActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // cont++;
        this.setVisible(false);

    }//GEN-LAST:event_jButtonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    public static javax.swing.JTextField JTF1;
    public static javax.swing.JTextField JTF2;
    public static javax.swing.JTextField JTF3;
    public static javax.swing.JTextField JTF4;
    public static javax.swing.JTextField JTF5;
    public static javax.swing.JTextField JTF6;
    public static javax.swing.JTextField JTF7;
    public static javax.swing.JTextField JTF8;
    public static javax.swing.JTextField M_2;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFont;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jlNickname;
    // End of variables declaration//GEN-END:variables
}
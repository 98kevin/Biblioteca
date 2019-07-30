/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frontend;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.backend.Estudiante;

/**
 *
 * @author luedu
 */
public class RegistroEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form RegistroEstudiante
     */
    public RegistroEstudiante() {
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

        jlNickname = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cajaCarrera = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaDia = new javax.swing.JTextField();
        cajaMes = new javax.swing.JTextField();
        cajaAnio = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFont = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajaCarnet = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlNickname.setBackground(new java.awt.Color(102, 255, 102));
        jlNickname.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlNickname.setForeground(new java.awt.Color(51, 255, 51));
        jlNickname.setText("Nombre:");
        jlNickname.setAutoscrolls(true);
        getContentPane().add(jlNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));
        
        cajaNombre.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cajaNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaNombre.setName("cajaNombre"); // NOI18N
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF1ActionPerformed(evt);
            }
        });
        getContentPane().add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 400, 30));

        jLabel7.setBackground(new java.awt.Color(102, 255, 102));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("Carnet:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 80, -1));

        jLabel8.setBackground(new java.awt.Color(102, 255, 102));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("ID Carrera:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 220, -1));

        cajaCarrera.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cajaCarrera.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCarrera.setName("cajaCarrera"); // NOI18N
        cajaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF3ActionPerformed(evt);
            }
        });
        getContentPane().add(cajaCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 400, 30));

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 280, -1));

        cajaDia.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cajaDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaDia.setName("cajaDia"); // NOI18N
        cajaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF5ActionPerformed(evt);
            }
        });
        getContentPane().add(cajaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 50, 30));

        cajaMes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cajaMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaMes.setName("cajaMes"); // NOI18N
        cajaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF6ActionPerformed(evt);
            }
        });
        getContentPane().add(cajaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 90, 30));

        cajaAnio.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cajaAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaAnio.setName("cajaAnio"); // NOI18N
        cajaAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF4ActionPerformed(evt);
            }
        });
        getContentPane().add(cajaAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 120, 30));

        Back.setBackground(new java.awt.Color(102, 255, 102));
        Back.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 0, 51));
        Back.setText("Back");
        Back.setActionCommand("Ver Reportes");
        Back.setName("botonRegresar"); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 90, -1));

        botonGuardar.setBackground(new java.awt.Color(102, 255, 102));
        botonGuardar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 0, 51));
        botonGuardar.setText("Guardar");
        botonGuardar.setActionCommand("Ver Reportes");
        botonGuardar.setName("botonGuardar"); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, -1));

        jLabelTitulo.setBackground(new java.awt.Color(102, 255, 102));
        jLabelTitulo.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTitulo.setText("Registro de Estudiantes");
        jLabelTitulo.setAutoscrolls(true);
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabelFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/libros (2).jpg"))); // NOI18N
        getContentPane().add(jLabelFont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        jLabel1.setText("dia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jLabel2.setText("mes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jLabel3.setText("año");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        cajaCarnet = new JTextField();
        cajaCarnet.setBounds(249, 167, 114, 21);
	getContentPane().add(cajaCarnet);
	cajaCarnet.setColumns(10);
    }// </editor-fold>//GEN-END:initComponents

    private void JTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF1ActionPerformed

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

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
       if (tieneCamposLlenos(cajaCarnet, cajaNombre, cajaCarrera)) {
	   Estudiante st = new Estudiante();
	   st.ingresarDatos(cajaCarnet, cajaNombre, cajaCarrera, cajaDia, cajaMes, cajaAnio);
       }else {
	JOptionPane.showMessageDialog(null, "Falta datos por ingresar", "Campos obligatorios faltantes", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private boolean tieneCamposLlenos(JTextField campo1, JTextField campo2, JTextField campo3) {
	return (campo1.getText()!="" & campo2.getText()!="" & campo3.getText()!="");
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    public static javax.swing.JTextField cajaNombre;
    public static javax.swing.JTextField cajaCarrera;
    public static javax.swing.JTextField cajaAnio;
    public static javax.swing.JTextField cajaDia;
    public static javax.swing.JTextField cajaMes;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFont;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField cajaCarnet;
    private javax.swing.JLabel jlNickname;
    // End of variables declaration//GEN-END:variables
}

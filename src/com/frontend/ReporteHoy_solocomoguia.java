/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frontend;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luedu
 */
public class ReporteHoy_solocomoguia extends javax.swing.JFrame implements Serializable {
   
        
  
    private DefaultTableModel modelo;
    int cont = 0;

   /* public static LinkedList contenedor = new LinkedList();    
    /**
     * Creates new form Estadisticas
     */
    public ReporteHoy_solocomoguia() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setSize(1290, 1000);
     //   readBin();
        CargarRegistrar();
      //  Cargardatos();
    }
    
 /**
 * Método para Cargar Datos
 * @param evt 
 */
 
    public void CargarRegistrar(){
    String datos [][]= {};
    String columna[]= {"Nombre","Tipo V1", "V1", "Tipo V2", "V2", "Tipo V3", "V3"};
    String columna1[] = { "V1" };
    
    
        
  
    
    modelo= new DefaultTableModel(datos, columna);
    jTableEstadisticas.setModel(modelo);
    
}

 
 /**
 * Método para Crear archivos Usuarios
 * @param evt 
 */
 
    /*
    public void readBin(){
        contenedor.clear();
        ObjectInputStream binario = null;
        try {
            String nameFile = nickname.getText();
            File file = new File("Persona");
            
            
            
            for (String string : file.list()) {
                
                binario = new ObjectInputStream(new FileInputStream(pathPersona+string));
                Persona p = (Persona) binario.readObject();
                contenedor.add(p);
                
            }
            
            
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
           // Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                binario.close();
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
            public void Cargardatos(){
                Persona a;
                for (int i = 0; i < Registro.list.size(); i++) {
                    a= (Persona)Registro.list.get(i);
                    modelo.insertRow(cont, new Object []{ });
                    modelo.setValueAt(a.getNombre(), cont, 0);
                    modelo.setValueAt(a.getTipo1(), cont, 1);
                    modelo.setValueAt(a.getV1(), cont, 2);
                    modelo.setValueAt(a.getTipo2(), cont, 3);
                    modelo.setValueAt(a.getV2(), cont, 4);
                    modelo.setValueAt(a.getTipo3(), cont, 5);
                    modelo.setValueAt(a.getV3(), cont, 6);
                                                  
                    
                }
            }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButtonBack1 = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonJugar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Import = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstadisticas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstadisticas1 = new javax.swing.JTable();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack1.setBackground(new java.awt.Color(255, 255, 51));
        jButtonBack1.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        jButtonBack1.setText("Back");
        jButtonBack1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonBack1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 770, -1, -1));

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 51));
        jButtonDelete.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonDeleteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 770, -1, -1));

        jButtonJugar.setBackground(new java.awt.Color(255, 255, 51));
        jButtonJugar.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        jButtonJugar.setText("Inicio");
        jButtonJugar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonJugarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 770, 110, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Libros que se Entregan Hoy");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 550, 100));

        Import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/expor.png"))); // NOI18N
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });
        getContentPane().add(Import, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, 40, 40));

        jTableEstadisticas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableEstadisticas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Libro", "Libro", "Carnet Estudiante", "Estudiante", "Dia de Prestamo", "Monto"
            }
        ));
        jScrollPane1.setViewportView(jTableEstadisticas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 950, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/libros.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, -1));

        jTableEstadisticas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableEstadisticas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Vehículo 1", "Vehículo 2", "Vehículo 3"
            }
        ));
        jScrollPane2.setViewportView(jTableEstadisticas1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 950, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBack1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonBack1AncestorAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBack1AncestorAdded

    private void jButtonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack1ActionPerformed
       this.setVisible(false);
       new Reporte().setVisible(true);
        
    }//GEN-LAST:event_jButtonBack1ActionPerformed

    private void jButtonDeleteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonDeleteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteAncestorAdded

 /**
 * Método para Eliminar
 * @param evt 
 */
 
    
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        if(jTableEstadisticas.getSelectedRow()==-1){
            if(jTableEstadisticas.getRowCount()<=0){
            }else{
            }
        }else{
            if(JOptionPane.showConfirmDialog(null,"¿Eliminar Registro?")==0){
                DefaultTableModel model = (DefaultTableModel) jTableEstadisticas.getModel();
                model.removeRow(jTableEstadisticas.getSelectedRow());
            }
        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonJugarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonJugarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonJugarAncestorAdded

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
        this.setVisible(false);
        new Principal().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonJugarActionPerformed

    
 /**
 * Método para Exportar a .Txt
 * @param evt 
 */
 
    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
   /*   
        String filePath = "C:\\Users\\luedu\\Documents\\NetBeansProjects\\P_Final\\file(Users).html";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < jTableEstadisticas.getRowCount(); i++){//rows
                for(int j = 0; j < jTableEstadisticas.getColumnCount(); j++){//columns
                    bw.write(jTableEstadisticas.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(T_Armas.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nombre = "C:\\Users\\luedu\\Documents\\NetBeansProjects\\P_Final\\File(Users).html";
        File file = new File(nombre);
        
        try {
                FileWriter fw = new FileWriter(file); 
                BufferedWriter bw = new BufferedWriter(fw);
                ht.generarEncabezado(nombre);
                ht.generarpestania("nombre", "v1", "v2","v3");
                bw.write(ht.salida);
                bw.newLine();
                
                for(int i = 0; i < jTableEstadisticas.getRowCount(); i++){//rows
                    ht.generarFilaHTML(nombre, nombre, nombre);
                    bw.newLine();
                    for(int j = 0; j < jTableEstadisticas.getColumnCount(); j++){//columns
                        bw.write(jTableEstadisticas.getValueAt(i, j).toString()+" ");
                    }
                    bw.newLine();
                }
                
                bw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Estadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_ImportActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteHoy_solocomoguia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteHoy_solocomoguia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteHoy_solocomoguia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteHoy_solocomoguia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ReporteHoy_solocomoguia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Import;
    private javax.swing.JButton jButtonBack1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEstadisticas;
    private javax.swing.JTable jTableEstadisticas1;
    // End of variables declaration//GEN-END:variables
}
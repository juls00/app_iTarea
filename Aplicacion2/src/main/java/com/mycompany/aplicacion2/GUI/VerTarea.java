/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aplicacion2.GUI;

import com.mycompany.aplicacion2.TareaBL.tareaInfo;
import com.mycompany.aplicacion2.TareasDAL.conexion;
import java.sql.ResultSet;

/**
 *
 * @author Jaque
 */
public class VerTarea extends javax.swing.JFrame {

    /**
     * Creates new form VerTarea
     */
    public VerTarea() {
        
        initComponents();
     mostrarDescripcion();
        this.setLocationRelativeTo(null);
        idTarea.setVisible(false);
        
          
       
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
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        idTarea = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        tituloAct1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 520));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tarea");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        fecha.setEditable(false);
        fecha.setBackground(new java.awt.Color(204, 204, 204));
        fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(51, 51, 51));
        fecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaMouseClicked(evt);
            }
        });
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        homeButton.setText("Home");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        idTarea.setText("jTextField1");
        idTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTareaActionPerformed(evt);
            }
        });

        descripcion.setEditable(false);
        descripcion.setBackground(new java.awt.Color(204, 204, 204));
        descripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripcion.setForeground(new java.awt.Color(51, 51, 51));
        descripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descripcionMouseClicked(evt);
            }
        });
        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });

        tituloAct1.setEditable(false);
        tituloAct1.setBackground(new java.awt.Color(204, 204, 204));
        tituloAct1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloAct1.setForeground(new java.awt.Color(51, 51, 51));
        tituloAct1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tituloAct1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tituloAct1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloAct1MouseClicked(evt);
            }
        });
        tituloAct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloAct1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha)
                            .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(tituloAct1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(homeButton))
                .addGap(50, 50, 50)
                .addComponent(tituloAct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(idTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void mostrarDescripcion(){
        conexion objConexion = new conexion();
         String strSentenciaSelect = String.format("SELECT * from tareas where ID = ('%s')",idTarea.getText());
     
         try {
            ResultSet resultado = objConexion.consultarRegistros(strSentenciaSelect);
            
            
//               System.out.println(resultado.getString("ID"));
//                System.out.println(resultado.getString("fecha"));
//                System.out.println(resultado.getString("actividad"));
//                System.out.println(resultado.getString("descripcion"));
//                
               
                
                descripcion.setText(resultado.getString("descripcion"));
                fecha.setText(resultado.getString("fecha"));
                
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fechaActionPerformed
    

    
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void fechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaMouseClicked
        // TODO add your handling code here:
        Principal principal = new Principal();
      
    }//GEN-LAST:event_fechaMouseClicked

    private void idTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTareaActionPerformed

    private void descripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcionMouseClicked
        // TODO add your handling code here:
        mostrarDescripcion();
    }//GEN-LAST:event_descripcionMouseClicked

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
       mostrarDescripcion();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void tituloAct1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloAct1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloAct1MouseClicked

    private void tituloAct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloAct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloAct1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField descripcion;
    public javax.swing.JTextField fecha;
    private javax.swing.JButton homeButton;
    public javax.swing.JTextField idTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField tituloAct1;
    // End of variables declaration//GEN-END:variables
}
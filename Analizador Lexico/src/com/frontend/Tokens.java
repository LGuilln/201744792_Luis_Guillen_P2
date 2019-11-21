/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frontend;

import static com.frontend.Analizador.jTextArea1;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author danie
 */
public class Tokens extends javax.swing.JFrame {

    /**
     * Creates new form Analizador1
     */
    public Tokens() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    String palabras;
    public String[] cuento;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBHome = new javax.swing.JButton();
        jBExit = new javax.swing.JButton();
        jBAnalizar = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        jBExport = new javax.swing.JButton();
        jBError = new javax.swing.JButton();
        jBClean = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtokens = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Recuento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, 30));

        jName.setBackground(new java.awt.Color(102, 255, 102));
        jName.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jName.setForeground(new java.awt.Color(51, 255, 51));
        jName.setText("\"Tokens\"");
        jName.setAutoscrolls(true);
        getContentPane().add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("Cadena de Informacion   (token)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 340, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("No.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 60, 30));

        jBHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHomeActionPerformed(evt);
            }
        });
        getContentPane().add(jBHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 70, 70));

        jBExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit icon.png"))); // NOI18N
        jBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });
        getContentPane().add(jBExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 70, 70));

        jBAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analizar.png"))); // NOI18N
        jBAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnalizarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 60, 60));

        ButtonSalir.setBackground(new java.awt.Color(102, 255, 0));
        ButtonSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ButtonSalir.setText("Tabla");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 80, 30));

        jBExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/expor.png"))); // NOI18N
        jBExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExportActionPerformed(evt);
            }
        });
        getContentPane().add(jBExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 60, 60));

        jBError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error.png"))); // NOI18N
        jBError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBErrorActionPerformed(evt);
            }
        });
        getContentPane().add(jBError, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 60, 60));

        jBClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clean.jpg"))); // NOI18N
        jBClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCleanActionPerformed(evt);
            }
        });
        getContentPane().add(jBClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 60, 60));

        jtokens.setColumns(20);
        jtokens.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtokens.setRows(5);
        jtokens.setKeymap(null);
        jScrollPane2.setViewportView(jtokens);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 740, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WallpaperIz.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dubai Light", 0, 36)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 690, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHomeActionPerformed
        this.setVisible(false);
        new Analizador().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBHomeActionPerformed

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExitActionPerformed

    private void jBAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnalizarActionPerformed
        String[] palabras = Analizador.jTextArea1.getText().split("\\s");
        String buscar = Analizador.jTextArea1.getText();
        String[] pal = jTextArea1.getText().split(" ");

        String p = "";
        String a;
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            p = i + 1 + " " + "                    " + palabras[i] + " \n ";
            a = palabras[i];
            System.out.println(palabras[i]);

            String t = palabras[i];
            String[] pala = t.split(" ");
            int canti = pala.length;

            jtokens.setText(jtokens.getText() + "" + canti + "                    " + p + "              ");
        }    }//GEN-LAST:event_jBAnalizarActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        this.setVisible(false);
        new Diagrama().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void jBExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExportActionPerformed
        try {
            File path;
            path = new File("C:\\Users\\luedu\\Desktop\\LEGR_P2\\Analizador Lexico\\Analizados\\Tokens.html");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jBExportActionPerformed

    private void jBErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBErrorActionPerformed
        try {
            File path;
            path = new File("C:\\Users\\luedu\\Desktop\\LEGR_P2\\Analizador Lexico\\Analizados\\Error.html");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBErrorActionPerformed

    private void jBCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCleanActionPerformed
    jtokens.setText("");
        
//    jTToken.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCleanActionPerformed

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
            java.util.logging.Logger.getLogger(Tokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tokens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton jBAnalizar;
    private javax.swing.JButton jBClean;
    private javax.swing.JButton jBError;
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBExport;
    private javax.swing.JButton jBHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jtokens;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paquete;

/**
 *
 * @author dam2
 */
public class Frame1 extends javax.swing.JFrame {
    /**
     * Creates new form Frame1
     */
    int udCambio = 0;

    public Frame1() {
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

        grupoBotonesUd = new javax.swing.ButtonGroup();
        etiquetaKg = new javax.swing.JLabel();
        campoKg = new javax.swing.JTextField();
        cambiarUd = new javax.swing.JLabel();
        hg = new javax.swing.JRadioButton();
        dg = new javax.swing.JRadioButton();
        g = new javax.swing.JRadioButton();
        botonConvertir = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        campoResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaKg.setText("Cantidad en kg");

        campoKg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoKgActionPerformed(evt);
            }
        });

        cambiarUd.setText("Cambiar a:");

        grupoBotonesUd.add(hg);
        hg.setText("Hg");
        hg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hgActionPerformed(evt);
            }
        });

        grupoBotonesUd.add(dg);
        dg.setText("Dg");
        dg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgActionPerformed(evt);
            }
        });

        grupoBotonesUd.add(g);
        g.setText("g");
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        botonConvertir.setText("Clear");
        botonConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConvertirMouseClicked(evt);
            }
        });
        botonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConvertirActionPerformed(evt);
            }
        });

        resultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(etiquetaKg)
                        .addGap(18, 18, 18)
                        .addComponent(campoKg, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(cambiarUd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(hg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(dg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(g))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(botonConvertir)
                        .addGap(18, 18, 18)
                        .addComponent(resultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(etiquetaKg))
                    .addComponent(campoKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cambiarUd)
                .addGap(6, 6, 6)
                .addComponent(hg)
                .addGap(6, 6, 6)
                .addComponent(dg)
                .addGap(6, 6, 6)
                .addComponent(g)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonConvertir)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(resultado))
                    .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoKgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoKgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoKgActionPerformed

    private void botonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConvertirActionPerformed
        // TODO add your handling code here:
        //String kg = campoKg.getText();
        //int resultado = Integer.parseInt(kg) * udCambio;
        
        //campoResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_botonConvertirActionPerformed

    private void hgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hgActionPerformed
        // TODO add your handling code here:
        udCambio = 10;
        
        String kg = campoKg.getText();
        int resultado = Integer.parseInt(kg) * udCambio;
        
        campoResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_hgActionPerformed

    private void dgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgActionPerformed
        // TODO add your handling code here:
        udCambio = 100;
        
        String kg = campoKg.getText();
        int resultado = Integer.parseInt(kg) * udCambio;
        
        campoResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_dgActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        // TODO add your handling code here:
        udCambio = 1000;
        
        String kg = campoKg.getText();
        int resultado = Integer.parseInt(kg) * udCambio;
        
        campoResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_gActionPerformed

    private void botonConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConvertirMouseClicked
        // TODO add your handling code here:
        grupoBotonesUd.clearSelection();
        campoResultado.setText("");
    }//GEN-LAST:event_botonConvertirMouseClicked

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConvertir;
    private javax.swing.JLabel cambiarUd;
    private javax.swing.JTextField campoKg;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JRadioButton dg;
    private javax.swing.JLabel etiquetaKg;
    private javax.swing.JRadioButton g;
    private javax.swing.ButtonGroup grupoBotonesUd;
    private javax.swing.JRadioButton hg;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}

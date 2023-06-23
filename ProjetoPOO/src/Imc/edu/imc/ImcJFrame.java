/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imc;
import java.lang.Math;
import static java.lang.Math.pow;
import javax.swing.JOptionPane;
//public double peso = 0;
//public int altura = 0;
//public String resultadoImc = "";

/**
 *
 * @author pc
 */

    

public class ImcJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ImcJFrame
     */
    public ImcJFrame() {
        initComponents();
    }

    public double peso = 0;
    public double altura = 0;
    public double imcResultado = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCampoPeso = new javax.swing.JTextField();
        B_CALC_IMC = new javax.swing.JButton();
        txtCampoAltura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULADORA PROFISSIONAL DE IMC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));
        jPanel1.add(txtCampoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 169, 32));

        B_CALC_IMC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        B_CALC_IMC.setForeground(new java.awt.Color(153, 204, 255));
        B_CALC_IMC.setText("CALCULAR ");
        B_CALC_IMC.setFocusPainted(false);
        B_CALC_IMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CALC_IMCActionPerformed(evt);
            }
        });
        jPanel1.add(B_CALC_IMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 127, 49));

        txtCampoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoAlturaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCampoAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 169, 32));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Altura:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_CALC_IMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CALC_IMCActionPerformed
        
        peso = Double.parseDouble(txtCampoPeso.getText());
        altura = Double.parseDouble(txtCampoAltura.getText());
        
        //  peso/(altura)^2
        
        imcResultado = peso / pow(altura, 2);
        
        System.out.println(imcResultado);
        
        //  TA TIRANDO ROGER?
        
        do{
            if((peso == 0) || (altura == 0)){
                JOptionPane.showMessageDialog(this, "Tá tirando Roger?");
            }else{
                JOptionPane.showMessageDialog(this, "Seu imc é de: " + imcResultado);
            }
            
            break;
            
        }while((peso == 0) || (altura == 0));
        
//        JOptionPane.showMessageDialog(this, "Seu imc é de: " + imcResultado);
    }//GEN-LAST:event_B_CALC_IMCActionPerformed

    private void txtCampoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoAlturaActionPerformed

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
            java.util.logging.Logger.getLogger(ImcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImcJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_CALC_IMC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCampoAltura;
    private javax.swing.JTextField txtCampoPeso;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author gasto
 */
public class InicioInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public InicioInterfaz() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBarraSuperior = new javax.swing.JPanel();
        jPanelBarraLateral = new javax.swing.JPanel();
        jPanelSecurity = new javax.swing.JPanel();
        jRadioButtonStrong = new javax.swing.JRadioButton();
        jRadioButtonMedium = new javax.swing.JRadioButton();
        jRadioButtonWeak = new javax.swing.JRadioButton();
        jLabelTitleSecurity = new javax.swing.JLabel();
        jButtonPassword = new javax.swing.JButton();
        jButtonKeys = new javax.swing.JButton();
        jButtonPayment = new javax.swing.JButton();
        jPanelFondo = new javax.swing.JPanel();
        jButtonAddNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraSuperior.setBackground(new java.awt.Color(239, 159, 159));
        jPanelBarraSuperior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelBarraSuperiorLayout = new javax.swing.GroupLayout(jPanelBarraSuperior);
        jPanelBarraSuperior.setLayout(jPanelBarraSuperiorLayout);
        jPanelBarraSuperiorLayout.setHorizontalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1096, Short.MAX_VALUE)
        );
        jPanelBarraSuperiorLayout.setVerticalGroup(
            jPanelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 90));

        jPanelBarraLateral.setBackground(new java.awt.Color(239, 159, 159));
        jPanelBarraLateral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelSecurity.setBackground(new java.awt.Color(250, 212, 212));

        jRadioButtonStrong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonStrong.setText("Strong");
        jRadioButtonStrong.setEnabled(false);
        jRadioButtonStrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStrongActionPerformed(evt);
            }
        });

        jRadioButtonMedium.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMedium.setText("Medium");
        jRadioButtonMedium.setEnabled(false);
        jRadioButtonMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMediumActionPerformed(evt);
            }
        });

        jRadioButtonWeak.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonWeak.setText("Weak");
        jRadioButtonWeak.setEnabled(false);
        jRadioButtonWeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonWeakActionPerformed(evt);
            }
        });

        jLabelTitleSecurity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitleSecurity.setText("Security");

        javax.swing.GroupLayout jPanelSecurityLayout = new javax.swing.GroupLayout(jPanelSecurity);
        jPanelSecurity.setLayout(jPanelSecurityLayout);
        jPanelSecurityLayout.setHorizontalGroup(
            jPanelSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSecurityLayout.createSequentialGroup()
                .addGroup(jPanelSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSecurityLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonWeak)
                            .addComponent(jRadioButtonMedium)
                            .addComponent(jRadioButtonStrong)))
                    .addGroup(jPanelSecurityLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabelTitleSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelSecurityLayout.setVerticalGroup(
            jPanelSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSecurityLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabelTitleSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonStrong)
                .addGap(26, 26, 26)
                .addComponent(jRadioButtonMedium)
                .addGap(26, 26, 26)
                .addComponent(jRadioButtonWeak)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jButtonPassword.setBackground(new java.awt.Color(250, 212, 212));
        jButtonPassword.setText("Password");
        jButtonPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasswordActionPerformed(evt);
            }
        });

        jButtonKeys.setBackground(new java.awt.Color(250, 212, 212));
        jButtonKeys.setText("Keys(.pub)");
        jButtonKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeysActionPerformed(evt);
            }
        });

        jButtonPayment.setBackground(new java.awt.Color(250, 212, 212));
        jButtonPayment.setText("Payment Information");
        jButtonPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarraLateralLayout = new javax.swing.GroupLayout(jPanelBarraLateral);
        jPanelBarraLateral.setLayout(jPanelBarraLateralLayout);
        jPanelBarraLateralLayout.setHorizontalGroup(
            jPanelBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonKeys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jButtonPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSecurity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBarraLateralLayout.setVerticalGroup(
            jPanelBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraLateralLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jButtonPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonKeys, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jPanelSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanelBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, 660));

        jPanelFondo.setBackground(new java.awt.Color(250, 212, 212));

        jButtonAddNew.setBackground(new java.awt.Color(190, 22, 29));
        jButtonAddNew.setText("Add New");
        jButtonAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jButtonAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasswordActionPerformed
        new AddPasswordInterfaz();
    }//GEN-LAST:event_jButtonPasswordActionPerformed

    private void jButtonKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeysActionPerformed

    }//GEN-LAST:event_jButtonKeysActionPerformed

    private void jButtonPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPaymentActionPerformed

    private void jRadioButtonStrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStrongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonStrongActionPerformed

    private void jRadioButtonMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMediumActionPerformed

    private void jRadioButtonWeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonWeakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonWeakActionPerformed

    private void jButtonAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddNewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(InicioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNew;
    private javax.swing.JButton jButtonKeys;
    private javax.swing.JButton jButtonPassword;
    private javax.swing.JButton jButtonPayment;
    private javax.swing.JLabel jLabelTitleSecurity;
    private javax.swing.JPanel jPanelBarraLateral;
    private javax.swing.JPanel jPanelBarraSuperior;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelSecurity;
    private javax.swing.JRadioButton jRadioButtonMedium;
    private javax.swing.JRadioButton jRadioButtonStrong;
    private javax.swing.JRadioButton jRadioButtonWeak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

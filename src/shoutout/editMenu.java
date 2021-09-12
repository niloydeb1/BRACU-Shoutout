/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoutout;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Niloy
 */
public class editMenu extends javax.swing.JFrame {

    /**
     * Creates new form editProfile
     */
    public String user;
    public editMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public editMenu(String u)
    {
        
            user=u;
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

        jPanel1 = new javax.swing.JPanel();
        editLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lunchLabel = new javax.swing.JLabel();
        priceLabel1 = new javax.swing.JLabel();
        breakLabel = new javax.swing.JLabel();
        dinnerLabel = new javax.swing.JLabel();
        priceLabel2 = new javax.swing.JLabel();
        priceLabel3 = new javax.swing.JLabel();
        addButton1 = new javax.swing.JButton();
        lunchField = new javax.swing.JTextField();
        breakField = new javax.swing.JTextField();
        snackField = new javax.swing.JTextField();
        priceField1 = new javax.swing.JTextField();
        priceField2 = new javax.swing.JTextField();
        priceField3 = new javax.swing.JTextField();
        noteLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        passLabel1 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        addButton2 = new javax.swing.JButton();
        addButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(107, 185, 240));

        editLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        editLabel.setForeground(new java.awt.Color(0, 0, 0));
        editLabel.setText("EDIT MENU");

        minLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        minLabel.setForeground(new java.awt.Color(0, 0, 0));
        minLabel.setText("_");
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabelMouseClicked(evt);
            }
        });

        closeLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(0, 0, 0));
        closeLabel.setText("X");
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(editLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minLabel)
                .addGap(42, 42, 42)
                .addComponent(closeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editLabel)
                    .addComponent(minLabel))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeLabel)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        lunchLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lunchLabel.setForeground(new java.awt.Color(0, 230, 64));
        lunchLabel.setText("LUNCH:");

        priceLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        priceLabel1.setForeground(new java.awt.Color(0, 230, 64));
        priceLabel1.setText("PRICE:");

        breakLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        breakLabel.setForeground(new java.awt.Color(0, 230, 64));
        breakLabel.setText("BREAKFAST:");

        dinnerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dinnerLabel.setForeground(new java.awt.Color(0, 230, 64));
        dinnerLabel.setText("Snacks:");

        priceLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        priceLabel2.setForeground(new java.awt.Color(0, 230, 64));
        priceLabel2.setText("PRICE:");

        priceLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        priceLabel3.setForeground(new java.awt.Color(0, 230, 64));
        priceLabel3.setText("PRICE:");

        addButton1.setBackground(new java.awt.Color(83, 51, 237));
        addButton1.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        addButton1.setText("ADD");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        lunchField.setBackground(new java.awt.Color(189, 195, 199));
        lunchField.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lunchField.setForeground(new java.awt.Color(0, 0, 0));
        lunchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunchFieldActionPerformed(evt);
            }
        });

        breakField.setBackground(new java.awt.Color(189, 195, 199));
        breakField.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        breakField.setForeground(new java.awt.Color(0, 0, 0));
        breakField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakFieldActionPerformed(evt);
            }
        });

        snackField.setBackground(new java.awt.Color(189, 195, 199));
        snackField.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        snackField.setForeground(new java.awt.Color(0, 0, 0));
        snackField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackFieldActionPerformed(evt);
            }
        });

        priceField1.setBackground(new java.awt.Color(189, 195, 199));
        priceField1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        priceField1.setForeground(new java.awt.Color(0, 0, 0));
        priceField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceField1ActionPerformed(evt);
            }
        });

        priceField2.setBackground(new java.awt.Color(189, 195, 199));
        priceField2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        priceField2.setForeground(new java.awt.Color(0, 0, 0));
        priceField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceField2ActionPerformed(evt);
            }
        });

        priceField3.setBackground(new java.awt.Color(189, 195, 199));
        priceField3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        priceField3.setForeground(new java.awt.Color(0, 0, 0));
        priceField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceField3ActionPerformed(evt);
            }
        });

        noteLabel.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(207, 0, 15));

        backButton.setBackground(new java.awt.Color(219, 10, 91));
        backButton.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        passLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passLabel1.setForeground(new java.awt.Color(255, 51, 51));

        resetButton.setBackground(new java.awt.Color(83, 51, 237));
        resetButton.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        addButton2.setBackground(new java.awt.Color(83, 51, 237));
        addButton2.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        addButton2.setText("ADD");
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });

        addButton3.setBackground(new java.awt.Color(83, 51, 237));
        addButton3.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        addButton3.setText("ADD");
        addButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(snackField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(priceLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(priceField3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(481, 481, 481)
                                        .addComponent(priceField2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetButton)))
                        .addGap(41, 41, 41)
                        .addComponent(passLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton1)
                            .addComponent(addButton2)
                            .addComponent(addButton3)
                            .addComponent(backButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lunchLabel)
                                .addGap(70, 70, 70)
                                .addComponent(lunchField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(priceLabel1))
                            .addComponent(dinnerLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(breakLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(breakField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(priceLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(priceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lunchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lunchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addComponent(passLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(addButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(breakLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(breakField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dinnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snackField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new stuffHome().setVisible(true);
            
            this.close();

    }//GEN-LAST:event_backButtonActionPerformed

    private void priceField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceField3ActionPerformed

    private void priceField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceField2ActionPerformed

    private void snackFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snackFieldActionPerformed

    private void breakFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breakFieldActionPerformed

    private void lunchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lunchFieldActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        try {
            // TODO add your handling code here:
            new DBConnect().addLunch(lunchField.getText(), priceField1.getText());
        } catch (SQLException ex) {
            Logger.getLogger(editMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButton1ActionPerformed

    private void priceField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceField1ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        new DBConnect().resetMenu();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton2ActionPerformed
        try {
            // TODO add your handling code here:
            new DBConnect().addBreak(breakField.getText(), priceField2.getText());
        } catch (SQLException ex) {
            Logger.getLogger(editMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButton2ActionPerformed

    private void addButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton3ActionPerformed
        try {
            // TODO add your handling code here:
            new DBConnect().addSnacks(snackField.getText(), priceField3.getText());
        } catch (SQLException ex) {
            Logger.getLogger(editMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButton3ActionPerformed
    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
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
            java.util.logging.Logger.getLogger(editMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton1;
    private javax.swing.JButton addButton2;
    private javax.swing.JButton addButton3;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField breakField;
    private javax.swing.JLabel breakLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel dinnerLabel;
    private javax.swing.JLabel editLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lunchField;
    private javax.swing.JLabel lunchLabel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel passLabel1;
    private javax.swing.JTextField priceField1;
    private javax.swing.JTextField priceField2;
    private javax.swing.JTextField priceField3;
    private javax.swing.JLabel priceLabel1;
    private javax.swing.JLabel priceLabel2;
    private javax.swing.JLabel priceLabel3;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField snackField;
    // End of variables declaration//GEN-END:variables
}

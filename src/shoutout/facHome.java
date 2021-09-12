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
public class facHome extends javax.swing.JFrame {

    /**
     * Creates new form facHome
     */
    String user;
    public facHome() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public facHome(String u)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        user=u;
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
        homeLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        courseButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        shoutButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        noteLabel = new javax.swing.JLabel();
        newsButton = new javax.swing.JButton();
        cafeButton = new javax.swing.JButton();
        inboxButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(140, 20, 252));

        homeLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(0, 0, 0));
        homeLabel.setText("HOME");

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
                .addComponent(homeLabel)
                .addGap(786, 786, 786)
                .addComponent(minLabel)
                .addGap(36, 36, 36)
                .addComponent(closeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(homeLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(minLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(closeLabel))
        );

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        logoutButton.setBackground(new java.awt.Color(219, 10, 91));
        logoutButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        courseButton.setBackground(new java.awt.Color(41, 241, 195));
        courseButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        courseButton.setText("COURSE PANEL");
        courseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseButtonActionPerformed(evt);
            }
        });

        profileButton.setBackground(new java.awt.Color(0, 230, 64));
        profileButton.setText("View Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        shoutButton.setBackground(new java.awt.Color(191, 85, 236));
        shoutButton.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        shoutButton.setText("SHOUTBOX");
        shoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoutButtonActionPerformed(evt);
            }
        });

        searchField.setBackground(new java.awt.Color(189, 195, 199));
        searchField.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        searchField.setForeground(new java.awt.Color(0, 0, 0));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(230, 126, 34));
        searchButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        searchButton.setText("SEARCH PROFILE");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        noteLabel.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(207, 0, 15));

        newsButton.setBackground(new java.awt.Color(41, 241, 195));
        newsButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        newsButton.setText("News & Announcements");
        newsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsButtonActionPerformed(evt);
            }
        });

        cafeButton.setBackground(new java.awt.Color(210, 77, 87));
        cafeButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        cafeButton.setText("CAFETERIA");
        cafeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeButtonActionPerformed(evt);
            }
        });

        inboxButton.setBackground(new java.awt.Color(210, 77, 87));
        inboxButton.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        inboxButton.setText("INBOX");
        inboxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inboxButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addGap(340, 340, 340)
                        .addComponent(profileButton)
                        .addGap(18, 18, 18)
                        .addComponent(logoutButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(shoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inboxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseButton)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cafeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newsButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(16, 16, 16)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(profileButton))
                    .addComponent(logoutButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addComponent(inboxButton)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(courseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(cafeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(shoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(newsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        login a=new login();
        a.setVisible(true);
        a.noteSetter("Logged out successfully!");
        this.close();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        // TODO add your handling code here:
        facProfile a = new facProfile(user, user);
        a.setVisible(true);
        this.close();
    }//GEN-LAST:event_profileButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        try 
        {
            if(new DBConnect().checkUser(searchField.getText()).equals("student"))
            {
                new stdProfile(searchField.getText(), user).setVisible(true);
                this.close();
            }
            else if(new DBConnect().checkUser(searchField.getText()).equals("faculty"))
            {
                new facProfile(searchField.getText(), user).setVisible(true);
                this.close();
            }
            else
            {
                noteLabel.setText("Profile Not Found!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(stdHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void shoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoutButtonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            new shout(user, user).setVisible(true);
            this.close();
        } catch (SQLException ex) {
            Logger.getLogger(stdHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_shoutButtonActionPerformed

    private void courseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseButtonActionPerformed
        try {
            // TODO add your handling code here:
            new course(user,user).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(facHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.close();
    }//GEN-LAST:event_courseButtonActionPerformed

    private void newsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsButtonActionPerformed
        new News(user,user).setVisible(true);
        this.close();
    }//GEN-LAST:event_newsButtonActionPerformed

    private void cafeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeButtonActionPerformed
        // TODO add your handling code here:
        new Cafeteria(user,user).setVisible(true);
        this.close();
    }//GEN-LAST:event_cafeButtonActionPerformed

    private void inboxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inboxButtonActionPerformed
        try {
            // TODO add your handling code here:
            new Inbox(user,user).setVisible(true);
            this.close();
        } catch (SQLException ex) {
            Logger.getLogger(facHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inboxButtonActionPerformed
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
            java.util.logging.Logger.getLogger(facHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cafeButton;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton courseButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JButton inboxButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel minLabel;
    private javax.swing.JButton newsButton;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton shoutButton;
    // End of variables declaration//GEN-END:variables
}

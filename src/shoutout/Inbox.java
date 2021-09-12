package shoutout;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;  
import java.util.Date;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class Inbox extends javax.swing.JFrame {

    /**
     * Creates new form shout
     */
    String user,backUser;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public Inbox() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Inbox(String u, String u2) throws SQLException
    {
        initComponents();
        this.setLocationRelativeTo(null);
        user=u;
        backUser=u2;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/shoutout";  
            Properties info = new Properties();
            info.put("user", "Niloy");
            info.put("password", "0246810");
            con = DriverManager.getConnection(url, info);
            st=con.createStatement();
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error: "+ex);
        }
        String q = "select sender from inbox WHERE "
                + "user1='"+u+"' and seen1='No';";
        rs= st.executeQuery(q);
        String send="";
        int disC=0;
        while(rs.next())
        {
            send=rs.getString("sender");
            if(send.equals(""))
            {
                
            }
            else
            {
                shoutArea.append("You have new message(s) from "+send+"\n");
                disC++;
            }
        }
        q = "select sender from inbox WHERE "
                + "user2='"+u+"' and seen2='No';";
        rs= st.executeQuery(q);
        send="";
        while(rs.next())
        {
            send=rs.getString("sender");
            if(send.equals(""))
            {
                
            }
            else
            {
                shoutArea.append("You have new message(s) from "+send+"\n");
                disC++;
            }
        }
        if(disC==0)
        {
            shoutArea.append("You have 0 new message.");
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
        messageLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shoutArea = new javax.swing.JTextArea();
        shoutField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        postLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(30, 139, 195));

        messageLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(0, 0, 0));
        messageLabel.setText("Inbox");

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
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(724, 724, 724)
                .addComponent(minLabel)
                .addGap(42, 42, 42)
                .addComponent(closeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(messageLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(minLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(closeLabel))
        );

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        shoutArea.setColumns(20);
        shoutArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        shoutArea.setRows(5);
        jScrollPane1.setViewportView(shoutArea);

        shoutField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        shoutField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoutFieldActionPerformed(evt);
            }
        });

        sendButton.setBackground(new java.awt.Color(25, 181, 254));
        sendButton.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        sendButton.setText("SEND");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(219, 10, 91));
        backButton.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        postLabel.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        postLabel.setForeground(new java.awt.Color(0, 230, 64));
        postLabel.setText("POST (not  exceeding 300 characters):");

        noteLabel.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(207, 0, 15));

        searchField.setBackground(new java.awt.Color(189, 195, 199));
        searchField.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        searchField.setForeground(new java.awt.Color(0, 0, 0));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(230, 126, 34));
        searchButton.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(postLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(314, 314, 314)
                            .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(backButton))
                        .addComponent(shoutField, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(postLabel)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(shoutField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sendButton)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(109, 109, 109)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLabelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minLabelMouseClicked
    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
            if(new DBConnect().checkUser(backUser).equals("student"))
            {
                new stdHome(backUser).setVisible(true);
            }
            else
            {
                new facHome(backUser).setVisible(true);
            }
            this.close();
        } catch (SQLException ex) {
            Logger.getLogger(Inbox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        if(!"".equals(searchField.getText()))
        {
            try {
            // TODO add your handling code here:
            if(shoutField.getText().length()>300 || shoutField.getText().length()==0)
            {
                noteLabel.setText("Invalid Message to Send!");
            }
            else
            {
                String user1="", user2="", search=searchField.getText();
                String query="select count(*) from inbox where user1='"+search+"' and user2='"+backUser+"';";
                rs= st.executeQuery(query);
                String message="";
                while(rs.next())
                {
                    message=rs.getString("count(*)");
                    if("0".equals(message))
                    {
                        user1=backUser;
                        user2=search;
                    }
                    else
                    {
                        user2=backUser;
                        user1=search;
                    }
                }
                if(user1==backUser)
                {
                    query = "insert into inbox values ('"+user1+"', '"+user2+"', '"+shoutField.getText()+"', "
                        + "'"+user+"', '"+java.time.LocalDateTime.now()+"', 'Yes', 'No');";
                }
                else
                {
                    query = "insert into inbox values ('"+user1+"', '"+user2+"', '"+shoutField.getText()+"', "
                        + "'"+user+"', '"+java.time.LocalDateTime.now()+"', 'No', 'Yes');";
                }
                st.executeUpdate(query);
                Inbox q = new Inbox(backUser,backUser);
                q.searchField.setText(searchField.getText());
                q.setVisible(true);
                q.noteLabel.setText("Message Sent Successfully!");
                this.close();
            }
            } catch (SQLException ex) {
                Logger.getLogger(Inbox.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void shoutFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoutFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoutFieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        try { 
            String user1="", user2="", search=searchField.getText();
            String query="select count(*) from inbox where user1='"+search+"' and user2='"+backUser+"';";
            rs= st.executeQuery(query);
            String message="";
            while(rs.next())
            {
                message=rs.getString("count(*)");
                if("0".equals(message))
                {
                    user1=backUser;
                    user2=search;
                }
                else
                {
                    user2=backUser;
                    user1=search;
                }
            }
            String q = "select message, date, sender from inbox WHERE "
                    + "user1='"+user1+"' and user2='"+user2+"';";
            rs= st.executeQuery(q);
            String send="", date="";
            shoutArea.setText("");
            while(rs.next())
            {
                message=rs.getString("message");
                date=rs.getString("date");
                send=rs.getString("sender");
                shoutArea.append(date+" --> "+send+": --> "+message+"\n");
            }
            if(user1==backUser)
            {
                 query="update inbox set seen1='Yes' where user1='"+user1+"' and user2='"+user2+"';";
            }
            else
            {
               query="update inbox set seen2='Yes' where user1='"+user1+"' and user2='"+user2+"';";
            }
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Inbox.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Inbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel postLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextArea shoutArea;
    private javax.swing.JTextField shoutField;
    // End of variables declaration//GEN-END:variables
}
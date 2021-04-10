package ATM;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    String phone_no;
    int balance, atmpin;
    
    Connection con = null;
    PreparedStatement psmnt = null;
    PreparedStatement pst = null;
    Statement smnt;
    ResultSet set;

    public Menu() {
        initComponents();
    }

    public void setPhone(String phone) {
        this.phone_no = phone;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        pinButton = new javax.swing.JButton();
        balanceButton = new javax.swing.JButton();
        accButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel1.setText("ATM Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        depositButton.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        depositButton.setText("Cash Deposit");
        depositButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                depositButtonMouseMoved(evt);
            }
        });
        depositButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                depositButtonMousePressed(evt);
            }
        });
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        withdrawButton.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        withdrawButton.setText("Cash Withdraw");
        withdrawButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                withdrawButtonMouseMoved(evt);
            }
        });
        withdrawButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                withdrawButtonMousePressed(evt);
            }
        });
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        pinButton.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        pinButton.setText("Change PIN");
        pinButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pinButtonMouseMoved(evt);
            }
        });
        pinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pinButtonMousePressed(evt);
            }
        });
        pinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinButtonActionPerformed(evt);
            }
        });

        balanceButton.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        balanceButton.setText("Balance Inquiry");
        balanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceButtonActionPerformed(evt);
            }
        });

        accButton.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        accButton.setText("View Account");
        accButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(accButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(withdrawButton)
                            .addComponent(balanceButton))))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositButtonActionPerformed

    private void pinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinButtonActionPerformed

    private void accButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accButtonActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ATM", "root", "root");
            String q = "SELECT account.*, bank.* from account inner join bank on account.phoneno = bank.phoneno";

            smnt = con.createStatement();
            set = smnt.executeQuery(q);

            smnt = con.createStatement();
            set = smnt.executeQuery(q);

            while (set.next()) {
                String phoneno = set.getString(3);
                if (phone_no.equals(phoneno)) {
                    String firstname = set.getString(1).toUpperCase();
                    String lastname = set.getString(2).toUpperCase();
                    String phone = set.getString(3).toUpperCase();
                    String bal = String.valueOf(set.getString(5));
                    String bankname = set.getString(7).toUpperCase();
                    String bankaccno = set.getString(8).toUpperCase();
                    String bankcity = set.getString(9).toUpperCase();
                    String acctype = set.getString(10).toUpperCase();

                    String msg = "<html>Acc. Holder Name : " + firstname + " " + lastname + "<br>"
                            + "Phone No : " + phone + "<br>"
                            + "Balance : " + bal + "<br>"
                            + "Bank Name : " + bankname + "<br>"
                            + "Account No : " + bankaccno + "<br>"
                            + "City : " + bankcity + "<br>"
                            + "Account Type : " + acctype + "</html>";
                    
                    JOptionPane optionpane = new JOptionPane();
                    optionpane.setMessage(msg);
                    optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = optionpane.createDialog(null, "Account Info.");
                    dialog.setVisible(true);
                    
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_accButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        this.setVisible(false);
        lg.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void depositButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositButtonMousePressed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ATM", "root", "root");
            String q = "SELECT * FROM account";

            smnt = con.createStatement();
            set = smnt.executeQuery(q);
            
            while (set.next()) {
                String phoneno = set.getString(3);
                if (phone_no.equals(phoneno)) {
                    balance = set.getInt(5);
                    Deposit dp = new Deposit();
                    dp.setPhone(phone_no);
                    dp.setAmount(balance);
                    this.setVisible(false);
                    dp.setVisible(true);
                }
            }

            set.close();
            smnt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_depositButtonMousePressed

    private void depositButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositButtonMouseMoved
        // TODO add your handling code here:
        depositButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_depositButtonMouseMoved

    private void balanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceButtonActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ATM", "root", "root");
            String q = "SELECT * FROM account";

            smnt = con.createStatement();
            set = smnt.executeQuery(q);

            while (set.next()) {
                String phoneno = set.getString(3);
                if (phone_no.equals(phoneno)) {
                    balance = set.getInt(5);
                    String msg = "<html>Amount : " + balance + "</html>";
                    JOptionPane optionpane = new JOptionPane();
                    optionpane.setMessage(msg);
                    optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = optionpane.createDialog(null, "Account Info.");
                    dialog.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_balanceButtonActionPerformed

    private void withdrawButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawButtonMouseMoved
        // TODO add your handling code here:
        withdrawButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_withdrawButtonMouseMoved

    private void withdrawButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawButtonMousePressed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ATM", "root", "root");
            String q = "SELECT * FROM account";

            smnt = con.createStatement();
            set = smnt.executeQuery(q);
            
            while (set.next()) {
                String phoneno = set.getString(3);
                if (phone_no.equals(phoneno)) {
                    balance = set.getInt(5);
                    Withdraw wd = new Withdraw();
                    wd.setPhone(phone_no);
                    wd.setAmount(balance);
                    this.setVisible(false);
                    wd.setVisible(true);
                }
            }

            set.close();
            smnt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_withdrawButtonMousePressed

    private void pinButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinButtonMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pinButtonMouseMoved

    private void pinButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinButtonMousePressed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ATM", "root", "root");
            String q = "SELECT * FROM account";

            smnt = con.createStatement();
            set = smnt.executeQuery(q);

            while (set.next()) {
                String phoneno = set.getString(3);
                if (phone_no.equals(phoneno)) {
                    atmpin = set.getInt(4);
                    PINUpdate pu = new PINUpdate();
                    pu.setPhone(phone_no);
                    pu.setPIN(atmpin);
                    this.setVisible(false);
                    pu.setVisible(true);
                }
            }
            
            set.close();
            smnt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_pinButtonMousePressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accButton;
    private javax.swing.JButton balanceButton;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton pinButton;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables
}

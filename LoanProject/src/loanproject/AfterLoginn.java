
package loanproject;
import java.sql.*;
import javax.swing.JOptionPane;

public class AfterLoginn extends javax.swing.JFrame {
    private static final String username ="root";
    private static final String pass ="55665566";
    private static final String url ="jdbc:mysql://localhost:3306/mysql?characterEncoding=latin1";
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AfterLoginn() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLoanID = new javax.swing.JTextField();
        txtInterest = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMonths = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalAmountLab = new javax.swing.JLabel();
        perMonthLab = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        txtDeleteId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        ClearButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        AddRecordButton = new javax.swing.JButton();
        CalculateButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 300, 390));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 300, 390));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 300, 390));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Loan ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtLoanID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoanIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtLoanID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 420, -1));

        txtInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInterestActionPerformed(evt);
            }
        });
        jPanel2.add(txtInterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 420, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Rate Interest %");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtMonths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthsActionPerformed(evt);
            }
        });
        jPanel2.add(txtMonths, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 420, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setText("Enter Months");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setText("Total Amount");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setText("Per Month price");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        totalAmountLab.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        totalAmountLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 3));
        jPanel2.add(totalAmountLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 420, 30));

        perMonthLab.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        perMonthLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 3));
        jPanel2.add(perMonthLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 420, 30));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setText("Enter Amount");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 420, -1));

        DeleteButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 90, 30));

        txtDeleteId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(95, 150, 150), 2, true));
        txtDeleteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtDeleteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 160, 30));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setText("Enter ID to dellete Record");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 220, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 680, 450));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 300, 390));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 150, 150), 10));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 300, 390));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 300, 390));

        ClearButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, -1));

        UpdateButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel6.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 140, -1));

        AddRecordButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        AddRecordButton.setText("Add Record");
        AddRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordButtonActionPerformed(evt);
            }
        });
        jPanel6.add(AddRecordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, -1));

        CalculateButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        CalculateButton.setText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });
        jPanel6.add(CalculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, -1));

        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 310, 450));

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 50)); // NOI18N
        jLabel1.setText("My Home Page");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 940, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoanIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoanIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoanIDActionPerformed

    private void txtInterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInterestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInterestActionPerformed

    private void txtMonthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthsActionPerformed

    private void AddRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordButtonActionPerformed
        if (txtLoanID.getText().length()!=0 && txtAmount.getText().length()!=0 && txtInterest.getText().length()!=0 && txtMonths.getText().length()!=0 && perMonthLab.getText().length()!=0 && totalAmountLab.getText().length()!=0){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url,username,pass);
                pst = con.prepareStatement("INSERT INTO loanrecord (ID,amount,interest,month,monthlyamount,totalamount) VALUES (?, ?, ?, ?, ?, ?)");
                pst.setString(1, txtLoanID.getText());
                pst.setString(2, txtAmount.getText());
                pst.setString(3, txtInterest.getText());
                pst.setString(4, txtMonths.getText());
                pst.setString(5, perMonthLab.getText());
                pst.setString(6, totalAmountLab.getText());
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Added");
                con.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Something Error");
        }
    }//GEN-LAST:event_AddRecordButtonActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        if (txtLoanID.getText().length()!=0 && txtAmount.getText().length()!=0 && txtInterest.getText().length()!=0 && txtMonths.getText().length()!=0){
        double rate = Double.parseDouble(txtInterest.getText());
        double amount = Double.parseDouble(txtAmount.getText());
        double month = Double.parseDouble(txtMonths.getText());
        
        double TotalAmount = amount + (amount/100)*rate;
        double MonthlyAmount = TotalAmount/month;
        perMonthLab.setText(String.valueOf(MonthlyAmount));
        totalAmountLab.setText(String.valueOf(TotalAmount));
        
        
        }
        else{
        JOptionPane.showMessageDialog(this, "please fill the form carefully");
        }
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        txtLoanID.setText("");
        txtAmount.setText("");
        txtInterest.setText("");
        txtMonths.setText("");
        perMonthLab.setText("");
        totalAmountLab.setText("");
        
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if (txtDeleteId.getText().length()!=0){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url,username,pass);
                pst = con.prepareStatement("DELETE from loanrecord WHERE ID=?");
                pst.setString(1, txtDeleteId.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Deleted");
                con.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
        }
        else{
        JOptionPane.showMessageDialog(this, "Please enter ID to delete Record");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
                if (txtLoanID.getText().length()!=0 && txtAmount.getText().length()!=0 && txtInterest.getText().length()!=0 && txtMonths.getText().length()!=0 && perMonthLab.getText().length()!=0 && totalAmountLab.getText().length()!=0){
        try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url,username,pass);
                pst = con.prepareStatement("UPDATE loanrecord set amount=?,interest=?,month=?,monthlyamount=?,totalamount=? WHERE ID=?");
                pst.setString(1, txtAmount.getText());
                pst.setString(2, txtInterest.getText());
                pst.setString(3, txtMonths.getText());
                pst.setString(4, perMonthLab.getText());
                pst.setString(5, totalAmountLab.getText());
                pst.setString(6, txtLoanID.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Updated");
                con.close();
        }
        catch(Exception e){
        System.out.println(e);
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Something Error");
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDeleteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteIdActionPerformed

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
            java.util.logging.Logger.getLogger(AfterLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfterLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfterLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfterLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new AfterLoginn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecordButton;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel perMonthLab;
    private javax.swing.JLabel totalAmountLab;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDeleteId;
    private javax.swing.JTextField txtInterest;
    private javax.swing.JTextField txtLoanID;
    private javax.swing.JTextField txtMonths;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Database.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Pocoyo
 */
public class PaymentForm extends javax.swing.JFrame {
    private String userName;
    private int lotId;
    private double price;
    
    Connection con = Connect.connectdb();
    /**
     * Creates new form PaymentForm
     */
    public PaymentForm(String userName, int lotId, double price, String lot, String block, String lotSize, String sqm) {
        this.userName = userName;
        this.lotId = lotId;
        this.price = price;
        initComponents();
        lotIDField.setText(String.valueOf(lotId));
        lotField.setText(lot);
        blockField.setText(block);
        lotTypeField.setText(lotSize);
        sqmField.setText(sqm);
        calculatedPriceField.setText(String.valueOf(price));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fnameLabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        paymentLabel = new javax.swing.JLabel();
        paymentComboBox = new javax.swing.JComboBox<>();
        yearsLabel = new javax.swing.JLabel();
        yearsField = new javax.swing.JComboBox<>();
        calculatedPriceLabel = new javax.swing.JLabel();
        calculatedPriceField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        lotLabel = new javax.swing.JLabel();
        blockLabel = new javax.swing.JLabel();
        lotTypeLabel = new javax.swing.JLabel();
        sqmLabel = new javax.swing.JLabel();
        lotIDLabel = new javax.swing.JLabel();
        lotIDField = new javax.swing.JTextField();
        lotField = new javax.swing.JTextField();
        blockField = new javax.swing.JTextField();
        lotTypeField = new javax.swing.JTextField();
        sqmField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("PAYMENT FORMS");

        fnameLabel.setText("First Name:");

        fnameField.setText("...");

        lnameLabel.setText("Last Name:");

        lnameField.setText("...");

        paymentLabel.setText("Payment Method:");

        paymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", "Bank Transfer", "Inhouse Financing" }));
        paymentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentComboBoxActionPerformed(evt);
            }
        });

        yearsLabel.setText("Years to Pay:");

        yearsField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FULL", "1 YEAR", "3 YEARS", "5 YEARS", "10 YEARS" }));
        yearsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsFieldActionPerformed(evt);
            }
        });

        calculatedPriceLabel.setText("Calculated Price:");

        calculatedPriceField.setEditable(false);
        calculatedPriceField.setText("...");
        calculatedPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatedPriceFieldActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        lotLabel.setText("Lot");

        blockLabel.setText("Block");

        lotTypeLabel.setText("LotSize");

        sqmLabel.setText("SQM");

        lotIDLabel.setText("Lot ID");

        lotIDField.setEditable(false);
        lotIDField.setText("...");
        lotIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotIDFieldActionPerformed(evt);
            }
        });

        lotField.setEditable(false);
        lotField.setText("...");
        lotField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotFieldActionPerformed(evt);
            }
        });

        blockField.setEditable(false);
        blockField.setText("...");
        blockField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockFieldActionPerformed(evt);
            }
        });

        lotTypeField.setEditable(false);
        lotTypeField.setText("...");

        sqmField.setEditable(false);
        sqmField.setText("...");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fnameLabel)
                                    .addComponent(fnameField)
                                    .addComponent(lnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lnameField)
                                    .addComponent(paymentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paymentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yearsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yearsField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculatedPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculatedPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lotLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lotIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(blockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lotTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sqmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lotIDField)
                                    .addComponent(lotField)
                                    .addComponent(blockField)
                                    .addComponent(lotTypeField)
                                    .addComponent(sqmField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnameLabel)
                    .addComponent(lotIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lotIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnameLabel)
                    .addComponent(lotLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lotField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentLabel)
                    .addComponent(blockLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearsLabel)
                    .addComponent(lotTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lotTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculatedPriceLabel)
                    .addComponent(sqmLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculatedPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(resetBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paymentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentComboBoxActionPerformed

    private void lotIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotIDFieldActionPerformed

    private void lotFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotFieldActionPerformed

    private void blockFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockFieldActionPerformed

    // HAAAAAAAAAAAAAATERRRRRRSSSSS
    private String getAccountId(String userName) {
        String accountId = null;
        String query = "SELECT id FROM accounts WHERE fname = ?"; // Adjust the table and column names as per your database schema

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userName);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    accountId = rs.getString("id");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error fetching account ID: " + ex.getMessage());
                ex.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error preparing statement: " + e.getMessage());
            e.printStackTrace();
        }

        return accountId;
    }
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
        new Buy(userName).setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String firstName = fnameField.getText();
        String lastName = lnameField.getText();
        String paymentMethod = paymentComboBox.getSelectedItem().toString();
        String yearsToPay = yearsField.getSelectedItem().toString();
        double calculatedPrice = Double.parseDouble(calculatedPriceField.getText());
        String sqm = sqmField.getText();
        String lot = lotField.getText();
        String block = blockField.getText();
        String lotSize = lotTypeField.getText();
        String accountId = getAccountId(userName); // Implement this method to get the account ID of the user

        if (firstName.isEmpty() || lastName.isEmpty() || calculatedPriceField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
            return;
        }

        String updateLot = "UPDATE lots SET status = 'Sold', Owner = ? WHERE ID = ?";
        String insertTransaction = "INSERT INTO record (id, sqm, block_id, lot_id, lot_type, account_id, price, transaction_type, bought_at, payment_method, years_to_pay) VALUES (?, ?, ?, ?, ?, ?, ?, 'Buying', ?, ?, ?)";

        PreparedStatement psUpdate = null;
        PreparedStatement psInsert = null;

        try {
            psUpdate = con.prepareStatement(updateLot);
            psUpdate.setString(1, userName);
            psUpdate.setInt(2, lotId);

            int affectedRows = psUpdate.executeUpdate();
            if (affectedRows > 0) {
                psInsert = con.prepareStatement(insertTransaction);
                psInsert.setInt(1, lotId); // Assuming id is the same as lotId
                psInsert.setString(2, sqm);
                psInsert.setString(3, block);
                psInsert.setInt(4, lotId);
                psInsert.setString(5, lotSize);
                psInsert.setString(6, accountId);
                psInsert.setDouble(7, calculatedPrice);
                psInsert.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
                psInsert.setString(9, paymentMethod);
                psInsert.setString(10, yearsToPay);

                psInsert.executeUpdate();

                JOptionPane.showMessageDialog(null, "The lot has been bought successfully!");
                Reserve.cancelReservationTimer(lotId); // Discard the timer from the reserve JFrame
                dispose();
                new Buy(userName).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to buy the lot.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error buying lot: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (psUpdate != null) psUpdate.close();
                if (psInsert != null) psInsert.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        fnameField.setText("");
        lnameField.setText("");
        paymentComboBox.setSelectedIndex(0);
        yearsField.setSelectedIndex(0);
        calculatedPriceField.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void yearsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsFieldActionPerformed
        // TODO add your handling code here:
        String selectedTerm = yearsField.getSelectedItem().toString();
        double calculatedPrice = price;

        switch (selectedTerm) {
            case "1 YEAR":
                calculatedPrice = price * 1.03; // 3% interest
                break;
            case "3 YEARS":
                calculatedPrice = price * 1.06; // 6% interest
                break;
            case "5 YEARS":
                calculatedPrice = price * 1.09; // 9% interest
                break;
            case "10 YEARS":
                calculatedPrice = price * 1.12; // 12% interest
                break;
            default:
                calculatedPrice = price; // FULL PAYMENT
                break;
        }

        calculatedPriceField.setText(String.valueOf(calculatedPrice));
    }//GEN-LAST:event_yearsFieldActionPerformed

    private void calculatedPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatedPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculatedPriceFieldActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentForm("User Name", 1, 100000, "Lot 1", "Block A", "Lot Size", "100").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blockField;
    private javax.swing.JLabel blockLabel;
    private javax.swing.JTextField calculatedPriceField;
    private javax.swing.JLabel calculatedPriceLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField fnameField;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lnameField;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField lotField;
    private javax.swing.JTextField lotIDField;
    private javax.swing.JLabel lotIDLabel;
    private javax.swing.JLabel lotLabel;
    private javax.swing.JTextField lotTypeField;
    private javax.swing.JLabel lotTypeLabel;
    private javax.swing.JComboBox<String> paymentComboBox;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField sqmField;
    private javax.swing.JLabel sqmLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox<String> yearsField;
    private javax.swing.JLabel yearsLabel;
    // End of variables declaration//GEN-END:variables
}

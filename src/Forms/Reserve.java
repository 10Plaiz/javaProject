package Forms;

import Database.Connect;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.Component;
import java.awt.Color;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author zeldr
 */

 class CustomCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (value != null && value.toString().equals("Available")) {
            cell.setBackground(new Color(144, 238, 144)); // Light green
        } else if (value != null && value.toString().equals("Reserved")) {
            cell.setBackground(new Color(255, 255, 153)); // Light yellow
        } else if (value != null && value.toString().equals("Sold")) {
            cell.setBackground(new Color(255, 102, 102)); // Light red
        } else {
            cell.setBackground(Color.WHITE); // Default background color
        }

        return cell;
    }
}

 public class Reserve extends javax.swing.JFrame {
    
    Connection con= Connect.connectdb();
    
    private String userName;
    private static HashMap<Integer, Timer> reservationTimers = new HashMap<>();
    /**
     * Creates new form Reserve
     */
    public Reserve(String userName) {
        this.userName = userName;
        initComponents();
        displayLots();
        displayLotSize();
        displayBlock();
        jTable1.getColumnModel().getColumn(6).setCellRenderer(new CustomCellRenderer());
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
        sizeBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        blockBox = new javax.swing.JComboBox<>();
        reserveLotBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50", "100" }));

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
        jScrollPane1.setViewportView(jTable1);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        reserveLotBtn.setText("Reserve Lot");
        reserveLotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveLotBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Size");

        jLabel2.setText("Block");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reserveLotBtn)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchButton)
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(blockBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeBtn))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homeBtn)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(reserveLotBtn)
                        .addGap(231, 231, 231))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void displayLots() {
        // SQL Statements
        String data = "SELECT ID, SQM, Block, Lot, LotSize, Price, " +
        "CASE WHEN status = 'Sold' THEN 'Sold' " +
        "WHEN Owner IS NOT NULL AND Owner != '' THEN 'Reserved' " +
        "ELSE 'Available' END AS Owner " +
        "FROM lots";

        try {
            PreparedStatement pStatement = con.prepareStatement(data);
            ResultSet result = pStatement.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
            
            // Set custom cell renderer for the Owner column
            jTable1.getColumnModel().getColumn(6).setCellRenderer(new CustomCellRenderer());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace(); // Good practice to print the stack trace for debugging
        }
    }
    
    public void displayLotSize() {
        String lotsize = "SELECT DISTINCT LotSize FROM Lots";

        try {
            PreparedStatement pStatement = con.prepareStatement(lotsize);
            ResultSet result = pStatement.executeQuery();

            javax.swing.DefaultComboBoxModel<String> model = new javax.swing.DefaultComboBoxModel<>();
            model.addElement("Any");

            while (result.next()) {
                model.addElement(result.getString("lotsize"));
            }

            sizeBox.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace(); //Good practice to print the stack trace for debugging
        }
    }
    
    public void displayBlock() {
        String block = "SELECT DISTINCT Block FROM Lots";
        
        try {
            PreparedStatement pStatement = con.prepareStatement(block);
            ResultSet result = pStatement.executeQuery();

            javax.swing.DefaultComboBoxModel<String> model = new javax.swing.DefaultComboBoxModel<>();
            model.addElement("Any");

            while (result.next()) {
                model.addElement(result.getString("Block"));
            }

            blockBox.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace(); //Good practice to print the stack trace for debugging
        }
    }
    
    // This method is used for the Search Button
    public void Search() {
        String baseQuery = "SELECT ID, SQM, Block, Lot, LotSize, Price, " +
        "CASE WHEN status = 'Sold' THEN 'Sold' " +
        "WHEN Owner IS NOT NULL AND Owner != '' THEN 'Reserved' " +
        "ELSE 'Available' END AS Owner " +
        "FROM lots";
        String lotsize = sizeBox.getSelectedItem().toString();
        String block = blockBox.getSelectedItem().toString();
        boolean hasCondition = false;
    
        if (!"Any".equals(lotsize)) {
            baseQuery += " WHERE LotSize = ?";
            hasCondition = true;
        }
    
        if (!"Any".equals(block)) {
            if (hasCondition) {
                baseQuery += " AND Block = ?";
            } else {
                baseQuery += " WHERE Block = ?";
            }
        }
    
        try {
            PreparedStatement pStatement = con.prepareStatement(baseQuery);
    
            int paramIndex = 1;
            if (!"Any".equals(lotsize)) {
                pStatement.setString(paramIndex++, lotsize);
            }
            if (!"Any".equals(block)) {
                pStatement.setString(paramIndex, block);
            }
            try (ResultSet result = pStatement.executeQuery()) {
                // Display all the rows in the jTable
                jTable1.setModel(DbUtils.resultSetToTableModel(result));
                
                // Set custom cell renderer for the Owner column
                jTable1.getColumnModel().getColumn(6).setCellRenderer(new CustomCellRenderer());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void reserveLot() {
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Please select a lot to reserve.");
            return;
        }

        int idAcc = Integer.parseInt(model.getValueAt(row, 0).toString());

        String checkOwner = "SELECT Owner, status FROM Lots WHERE ID = ?";
        String reserveLot = "UPDATE lots SET Owner = ?, status = 'Reserved' WHERE ID = ?";
        String insertReservation = "INSERT INTO record (SQM, block_id, lot_id, lot_type, account_id, reserved_at, expires_at) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement psCheck = con.prepareStatement(checkOwner);
            psCheck.setInt(1, idAcc);

            try (ResultSet rs = psCheck.executeQuery()) {
                if (rs.next()) {
                    String owner = rs.getString("Owner");
                    String status = rs.getString("status");

                    if ("Sold".equals(status)) {
                        JOptionPane.showMessageDialog(null, "This lot is already sold. Please choose another one.");
                        return; // Important: Exit the method if already sold
                    }

                    if (owner != null && !owner.isEmpty() && !owner.equals("None")) {
                        JOptionPane.showMessageDialog(null, "This lot has already been reserved. Please choose another one.");
                        return; // Important: Exit the method if already reserved
                    } else {
                        // Lot is available, ask for reservation fee
                        int response = JOptionPane.showConfirmDialog(null, "Do you want to pay the reservation fee?", "Confirm Reservation", JOptionPane.YES_NO_OPTION);
                        if (response == JOptionPane.YES_OPTION) {
                            // User chose to pay the reservation fee, proceed with reservation
                            try (PreparedStatement updateStatement = con.prepareStatement(reserveLot);
                                 PreparedStatement insertStatement = con.prepareStatement(insertReservation)) {
                                updateStatement.setString(1, userName);
                                updateStatement.setInt(2, idAcc);

                                int affectedRows = updateStatement.executeUpdate();

                                if (affectedRows > 0) {
                                    // Insert reservation details into the Reservation table
                                    String sqm = model.getValueAt(row, 1).toString();
                                    String block = model.getValueAt(row, 2).toString();
                                    String lot = model.getValueAt(row, 3).toString();
                                    String lotSize = model.getValueAt(row, 4).toString();
                                    String accountId = getAccountId(userName); // Implement this method to get the account ID of the user

                                    Timestamp reservedAt = new Timestamp(System.currentTimeMillis());
                                    Timestamp expiresAt = new Timestamp(System.currentTimeMillis() + 2 * 60 * 1000); // 2 minutes later

                                    insertStatement.setString(1, sqm);
                                    insertStatement.setString(2, block);
                                    insertStatement.setString(3, lot);
                                    insertStatement.setString(4, lotSize);
                                    insertStatement.setString(5, accountId);
                                    insertStatement.setTimestamp(6, reservedAt);
                                    insertStatement.setTimestamp(7, expiresAt);

                                    insertStatement.executeUpdate();

                                    JOptionPane.showMessageDialog(null, "The lot has been reserved!");
                                    displayLots(); // Refresh the table

                                    // Schedule a task to check if the lot was bought within 2 minutes
                                    Timer timer = new Timer();
                                    timer.schedule(new TimerTask() {
                                        @Override
                                        public void run() {
                                            checkReservationExpiration(idAcc);
                                        }
                                    }, 2 * 60 * 1000);

                                    // Add the timer to the reservationTimers map
                                    addReservationTimer(idAcc, timer);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Failed to reserve the lot.");
                                }
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Error reserving lot: " + ex.getMessage());
                                ex.printStackTrace();
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Lot not found.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error checking owner: " + ex.getMessage());
                ex.printStackTrace();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error preparing statement: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void checkReservationExpiration(int lotId) {
        String checkReservation = "SELECT Owner FROM Lots WHERE ID = ?";
        String updateLot = "UPDATE Lots SET Owner = NULL, status = NULL WHERE ID = ?";

        try {
            PreparedStatement psCheck = con.prepareStatement(checkReservation);
            psCheck.setInt(1, lotId);

            try (ResultSet rs = psCheck.executeQuery()) {
                if (rs.next()) {
                    String owner = rs.getString("Owner");

                    if (owner != null && owner.equals(userName)) {
                        // Reservation expired, update the lot status
                        try (PreparedStatement updateStatement = con.prepareStatement(updateLot)) {
                            updateStatement.setInt(1, lotId);
                            updateStatement.executeUpdate();
                            displayLots(); // Refresh the table
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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
    
    public static void addReservationTimer(int lotId, Timer timer) {
        reservationTimers.put(lotId, timer);
    }
    
        public static void cancelReservationTimer(int lotId) {
        Timer timer = reservationTimers.get(lotId);
        if (timer != null) {
            timer.cancel();
            reservationTimers.remove(lotId);
        }
    }
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        dispose();
        new Menu(userName).setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void reserveLotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveLotBtnActionPerformed
        reserveLot();
    }//GEN-LAST:event_reserveLotBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserve("User Name").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> blockBox;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reserveLotBtn;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> sizeBox;
    // End of variables declaration//GEN-END:variables
}

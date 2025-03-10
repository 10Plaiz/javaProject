package Forms;

import Database.Connect;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.text.SimpleDateFormat;
import java.awt.Component;
import java.awt.Color;

import java.util.HashMap;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Reserve extends javax.swing.JFrame {
    Connection con= Connect.connectdb();
    private int userID;
    private String userName;
    private static HashMap<Integer, Timer> reservationTimers = new HashMap<>();
    /**
     * Creates new form Reserve
     */
    public Reserve(int userID) {
        this.userID = userID;
        this.userName = getUserNameById(userID);
        initComponents();
        welcomeUserName.setText("Welcome, " + this.userName + "!");
        displayLots();
        displayBlock();
        jTable1.getColumnModel().getColumn(6).setCellRenderer(new CustomCellRenderer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        blockBox = new javax.swing.JComboBox<>();
        reserveLotBtn = new javax.swing.JButton();
        sizeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        resetBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JButton();
        welcomeUserName = new javax.swing.JLabel();
        reserveBtn = new javax.swing.JButton();
        sellBtn = new javax.swing.JButton();
        buyBtn1 = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        reserveLotBtn.setText("Reserve Lot");
        reserveLotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveLotBtnActionPerformed(evt);
            }
        });

        sizeLabel.setText("Size: 100");

        jLabel2.setText("Block");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Reserve");

        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSlider1.setMajorTickSpacing(25);
        jSlider1.setMaximum(200);
        jSlider1.setMinimum(100);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reserveLotBtn)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(sizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blockBox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sizeLabel)
                            .addComponent(blockBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reserveLotBtn)
                        .addGap(276, 276, 276))))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        welcomeUserName.setText("Welcome, User!");

        reserveBtn.setText("Reserve");
        reserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveBtnActionPerformed(evt);
            }
        });

        sellBtn.setText("Sell");
        sellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellBtnActionPerformed(evt);
            }
        });

        buyBtn1.setText("Buy");
        buyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBtn1ActionPerformed(evt);
            }
        });

        historyBtn.setText("History");
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeUserName)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(reserveBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buyBtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(historyBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sellBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(welcomeUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reserveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sellBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buyBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Changes the background cell of the jtable based on the value of the cell
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
    
    public String getUserNameById(int userID) {
        String query = "SELECT fname FROM accounts WHERE id = ?";
        String userName = null;

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, userID);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    userName = rs.getString("fname");
                } else {
                    throw new Exception("No user found for ID: " + userID);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error fetching username: " + ex.getMessage());
                ex.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error preparing statement: " + e.getMessage());
            e.printStackTrace();
        }

        return userName;
    }

    public void displayLots() {
        // SQL Statements
        String data = "SELECT ID, SQM, Block, Lot, LotSize, Price, " +
        "CASE WHEN status = 'Sold' THEN 'Sold' " +
        "WHEN reserved_by IS NOT NULL AND reserved_by != '' THEN 'Reserved' " +
        "ELSE 'Available' END AS status " +
        "FROM lots";
    
        try {
            PreparedStatement pStatement = con.prepareStatement(data);
            ResultSet result = pStatement.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
            
            // Set custom cell renderer for the status column
            jTable1.getColumnModel().getColumn(6).setCellRenderer(new CustomCellRenderer());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace(); // Good practice to print the stack trace for debugging
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
                           "WHEN reserved_by IS NOT NULL AND reserved_by != '' THEN 'Reserved' " +
                           "ELSE 'Available' END AS status " +
                           "FROM lots";
        int lotsizeValue = jSlider1.getValue();
        String lotsize = String.valueOf(lotsizeValue);
        String block = blockBox.getSelectedItem().toString();
        boolean hasCondition = false;
        System.out.println(lotsize);
        baseQuery += " WHERE SQM = ?";
        hasCondition = true;
    
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
    
                // Set custom cell renderer for the status column
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
    
        int lotId = Integer.parseInt(model.getValueAt(row, 0).toString());
    
        String checkOwner = "SELECT reserved_by, status FROM Lots WHERE ID = ?";
        String reserveLot = "UPDATE lots SET reserved_by = ?, status = 'Reserved' WHERE ID = ?";
        String insertReservation = "INSERT INTO record (account_id, transaction_type, lot_id, block_id, lot_number, lot_type, SQM, price, reserved_at, expires_at) VALUES (?, 'Reservation', ?, ?, ?, ?, ?, ?, ?, ?)";
    
        try (PreparedStatement psCheck = con.prepareStatement(checkOwner)) {
            psCheck.setInt(1, lotId);
    
            try (ResultSet rs = psCheck.executeQuery()) {
                if (rs.next()) {
                    String reservedBy = rs.getString("reserved_by");
                    String status = rs.getString("status");
    
                    if ("Sold".equals(status)) {
                        JOptionPane.showMessageDialog(null, "This lot is already sold. Please choose another one.");
                        return;
                    }
    
                    if (reservedBy != null && !reservedBy.isEmpty() && !reservedBy.equals("None")) {
                        JOptionPane.showMessageDialog(null, "This lot has already been reserved. Please choose another one.");
                        return;
                    }
    
                    int response = JOptionPane.showConfirmDialog(null, 
                        "Do you want to pay the reservation fee?", 
                        "Confirm Reservation", 
                        JOptionPane.YES_NO_OPTION);
                    
                    if (response == JOptionPane.YES_OPTION) {
                        try (PreparedStatement updateStatement = con.prepareStatement(reserveLot);
                             PreparedStatement insertStatement = con.prepareStatement(insertReservation)) {
                            
                            // Update lot reservation
                            updateStatement.setInt(1, userID);
                            updateStatement.setInt(2, lotId);
                            int affectedRows = updateStatement.executeUpdate();
    
                            if (affectedRows > 0) {
                                // Insert reservation record
                                String sqm = model.getValueAt(row, 1).toString();
                                String block = model.getValueAt(row, 2).toString();
                                String lotNumber = model.getValueAt(row, 3).toString();
                                String lotType = model.getValueAt(row, 4).toString();
                                double price = Double.parseDouble(model.getValueAt(row, 5).toString());
    
                                Timestamp reservedAt = new Timestamp(System.currentTimeMillis());
                                Timestamp expiresAt = new Timestamp(System.currentTimeMillis() + 2 * 60 * 1000);
    
                                // Format the timestamps into standard date format
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                String reservedAtStr = sdf.format(reservedAt);
                                String expiresAtStr = sdf.format(expiresAt);
    
                                // Debugging: Print formatted timestamps
                                System.out.println("Reserved At: " + reservedAtStr);
                                System.out.println("Expires At: " + expiresAtStr);
    
                                insertStatement.setInt(1, userID);
                                insertStatement.setInt(2, lotId);
                                insertStatement.setString(3, block);
                                insertStatement.setString(4, lotNumber);
                                insertStatement.setString(5, lotType);
                                insertStatement.setString(6, sqm);
                                insertStatement.setDouble(7, price);
                                insertStatement.setString(8, reservedAtStr);
                                insertStatement.setString(9, expiresAtStr);
                                insertStatement.executeUpdate();
    
                                JOptionPane.showMessageDialog(null, "The lot has been reserved!");
                                displayLots();
    
                                // Schedule expiration check using Swing Timer
                                int delay = 2 * 60 * 1000; // 2 minutes
                                Timer swingTimer = new Timer(delay, new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        checkReservationExpiration(lotId);
                                    }
                                });
                                swingTimer.setRepeats(false); // Only run once
                                swingTimer.start();
                                addReservationTimer(lotId, swingTimer);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to reserve the lot.");
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Lot not found.");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    private void checkReservationExpiration(int lotId) {
        System.out.println("Checking expiration for Lot ID: " + lotId);
    
        String checkReservation = "SELECT reserved_by FROM Lots WHERE ID = ?";
        String updateLot = "UPDATE Lots SET reserved_by = NULL, status = 'Available' WHERE ID = ?";
    
        try (PreparedStatement psCheck = con.prepareStatement(checkReservation)) {
            psCheck.setInt(1, lotId);
    
            try (ResultSet rs = psCheck.executeQuery()) {
                if (rs.next()) {
                    String reservedBy = rs.getString("reserved_by");
                    System.out.println("Lot reserved by: " + reservedBy);
    
                    // Compare user ID properly
                    if (reservedBy != null && reservedBy.equals(String.valueOf(userID))) {
                        System.out.println("Reservation expired. Updating lot...");
    
                        try (PreparedStatement updateStatement = con.prepareStatement(updateLot)) {
                            updateStatement.setInt(1, lotId);
                            int rowsAffected = updateStatement.executeUpdate();
    
                            if (rowsAffected > 0) {
                                System.out.println("Lot reservation cleared successfully.");
                                displayLots(); // Refresh table
                            } else {
                                System.out.println("Failed to update lot status.");
                            }
                        }
                    } else {
                        System.out.println("Reservation is held by another user, not updating.");
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }    
    
    public static void addReservationTimer(int lotId, Timer timer) {
        if (reservationTimers == null) {
            reservationTimers = new HashMap<>();
        }
        reservationTimers.put(lotId, timer);
    }
    
    public static void cancelReservationTimer(int lotId) {
        Timer timer = reservationTimers.get(lotId);
        if (timer != null) {
            timer.stop();
            reservationTimers.remove(lotId);
        }
    }
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Search();
    }    
    
    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        dispose();
        FormFactory.createForm("Menu", userID).setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void reserveLotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveLotBtnActionPerformed
        reserveLot();
    }//GEN-LAST:event_reserveLotBtnActionPerformed

    private void reserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveBtnActionPerformed
        dispose();
        FormFactory.createForm("Reserve", userID).setVisible(true);
    }//GEN-LAST:event_reserveBtnActionPerformed

    private void sellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellBtnActionPerformed
        dispose();
        FormFactory.createForm("Sell", userID).setVisible(true);
    }//GEN-LAST:event_sellBtnActionPerformed

    private void buyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBtn1ActionPerformed
        dispose();
        FormFactory.createForm("Buy", userID).setVisible(true);
    }//GEN-LAST:event_buyBtn1ActionPerformed

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        dispose();
        FormFactory.createForm("History", userID).setVisible(true);
    }//GEN-LAST:event_historyBtnActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Logged out successfully!");
        this.dispose();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        sizeLabel.setText("Size: " +jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        displayLots();
    }//GEN-LAST:event_resetBtnActionPerformed

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
                new Reserve(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> blockBox;
    private javax.swing.JButton buyBtn1;
    private javax.swing.JButton historyBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton reserveBtn;
    private javax.swing.JButton reserveLotBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton sellBtn;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JLabel welcomeUserName;
    // End of variables declaration//GEN-END:variables
}

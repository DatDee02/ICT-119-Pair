package aggregates_parallel;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class NewJFrame extends javax.swing.JFrame {

    private Connection con;
    private DefaultTableModel table;

    public NewJFrame() {
    initComponents();
    this.setLocationRelativeTo(null);
    Connection();
    this.table = (DefaultTableModel) tblRecord.getModel();
    showData(); // Call showData here to populate the table
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
        jLabel1 = new javax.swing.JLabel();
        txtLocationCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDatePosted = new javax.swing.JTextField();
        cboxAggregate = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRecord = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select function:");

        txtLocationCode.setBackground(new java.awt.Color(204, 204, 255));
        txtLocationCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationCodeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Location Code:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date Posted:");

        txtDatePosted.setBackground(new java.awt.Color(204, 204, 255));
        txtDatePosted.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDatePostedKeyReleased(evt);
            }
        });

        cboxAggregate.setBackground(new java.awt.Color(204, 204, 255));
        cboxAggregate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIN", "MAX", "COUNT", "SUM", "AVG" }));
        cboxAggregate.setAlignmentX(0.0F);
        cboxAggregate.setAlignmentY(0.0F);
        cboxAggregate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAggregateActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(204, 204, 255));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tblRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LocationCode", "DatePosted", "Total Amount"
            }
        ));
        jScrollPane2.setViewportView(tblRecord);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDatePosted, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLocationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(128, 128, 128)
                                    .addComponent(cboxAggregate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatePosted, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxAggregate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationCodeKeyReleased
        filterData();
    }//GEN-LAST:event_txtLocationCodeKeyReleased

    private void txtDatePostedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatePostedKeyReleased
        filterData();
    }//GEN-LAST:event_txtDatePostedKeyReleased

    private void cboxAggregateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAggregateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxAggregateActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        performAggregate();
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cboxAggregate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRecord;
    private javax.swing.JTextField txtDatePosted;
    private javax.swing.JTextField txtLocationCode;
    // End of variables declaration//GEN-END:variables
    private void Connection() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbentries", "root", "");
        System.out.println("Connected to the database");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "SQL Error (Connection): " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // Print the stack trace for debugging purposes
    }
}

    private void showData() {
    try {
        String query = "SELECT LocationCode, DatePosted, Amount AS TotalAmount FROM tblentry";
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        // Clear existing data in the table model
        table.setRowCount(0);

        while (rs.next()) {
            String locationCode = rs.getString("LocationCode");
            String datePosted = rs.getString("DatePosted");
            double totalAmount = rs.getDouble("TotalAmount");

            Object[] data = {locationCode, datePosted, totalAmount};
            table.addRow(data);
        }

        rs.close();
        pst.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}


    private void filterData() {
    if (table != null) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(table);
        tblRecord.setRowSorter(sorter);

        RowFilter<DefaultTableModel, Object> locationFilter = RowFilter.regexFilter(txtLocationCode.getText(), 0);
        RowFilter<DefaultTableModel, Object> dateFilter = RowFilter.regexFilter(txtDatePosted.getText(), 1);

        List<RowFilter<DefaultTableModel, Object>> filters = new ArrayList<>();
        filters.add(locationFilter);
        filters.add(dateFilter);

        RowFilter<DefaultTableModel, Object> compoundRowFilter = RowFilter.andFilter(filters);

        sorter.setRowFilter(compoundRowFilter);
    }
}

    public void performAggregate() {
        String aggregateName = (String) cboxAggregate.getSelectedItem();

        if (aggregateName != null) {
            String locationCode = txtLocationCode.getText();
            String datePosted = txtDatePosted.getText();

            switch (aggregateName) {
                case "MIN" -> getMin(locationCode, datePosted);
                case "MAX" -> getMax(locationCode, datePosted);
                case "COUNT" -> getCount(locationCode, datePosted);
                case "SUM" -> getSum(locationCode, datePosted);
                case "AVG" -> getAvg(locationCode, datePosted);
                default -> JOptionPane.showMessageDialog(null, "Invalid aggregate function selected");
            }
        }
    }

    public void getMin(String LocationCode, String DatePosted){
        double amount;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT MIN(Amount) AS amount FROM dbentries.tblentry WHERE LocationCode = '" + LocationCode +"' AND DatePosted = '" +DatePosted+"'");
            
            if(result.next()){
                 amount = result.getDouble("amount");
                 JOptionPane.showMessageDialog(null, "Minimum: " + amount, "MIN Function", JOptionPane.INFORMATION_MESSAGE);
            }
            
            result.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getMax(String LocationCode, String DatePosted){
        double amount;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT MAX(Amount) AS amount FROM dbentries.tblentry WHERE LocationCode = '" + LocationCode +"' AND DatePosted = '" +DatePosted+"'");
            
            if(result.next()){
                 amount = result.getDouble("amount");
                 JOptionPane.showMessageDialog(null, "Maximum: " + amount, "MAX Function", JOptionPane.INFORMATION_MESSAGE);
            }
            result.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getCount(String LocationCode, String DatePosted){
        double amount;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT COUNT(Amount) AS amount FROM dbentries.tblentry WHERE LocationCode = '" + LocationCode +"' AND DatePosted = '" +DatePosted+"'");
            
            if(result.next()){
                 amount = result.getDouble("amount");
                 JOptionPane.showMessageDialog(null, "Count: " + amount, "COUNT Function", JOptionPane.INFORMATION_MESSAGE);
            }
            result.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getSum(String LocationCode, String DatePosted){
        double amount;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT SUM(Amount) AS amount FROM dbentries.tblentry WHERE LocationCode = '" + LocationCode +"' AND DatePosted = '" +DatePosted+"'");
            
            if(result.next()){
                 amount = result.getDouble("amount");
                 JOptionPane.showMessageDialog(null, "Total amount: " + amount, "SUM Function", JOptionPane.INFORMATION_MESSAGE);
            }
            result.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getAvg(String LocationCode, String DatePosted){
        double amount;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT AVG(Amount) AS amount FROM dbentries.tblentry WHERE LocationCode = '" + LocationCode +"' AND DatePosted = '" +DatePosted+"'");
            
            if(result.next()){
                 amount = result.getDouble("amount");
                 JOptionPane.showMessageDialog(null, "Average: " + amount, "AVG Function", JOptionPane.INFORMATION_MESSAGE);
            }
            result.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


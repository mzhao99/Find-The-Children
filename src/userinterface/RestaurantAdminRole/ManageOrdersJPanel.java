/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mzhao
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem; 
    private Menu menuDirectory;
    private UserAccount userAccount;
    private OrderDirectory orderDirectory;
    private RestaurantDirectory restaurantDirectory;
    /**
     * Creates new form ManageOrdersJPanel
     */
    public ManageOrdersJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.orderDirectory = ecoSystem.getOrderDirectory();
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        populateTable();
        populateComboBox();
    }

    public void populateTable(){
//        DefaultTableModel model = (DefaultTableModel)tableOrders.getModel();
//        model.setRowCount(0);
//        
//        for(Order order : orderDirectory.getOrderDirectory()){
//            if(order.getRestaurant().getUsername().equals(userAccount.getUsername())) {
//                Object [] row = new Object[5];
//                row[0] = order;
//                row[1] = order.getCustomer().getName();
//                
//                String items = "";
//                for (Item key : order.getItems().keySet()){
//                    items += key.getName();
//                    items += ",";
//                }
//                row[2] = items.substring(0, items.length() - 1);
//                row[3] = order.getPrice();
//                row[4] = order.getStatus();
//                
//                model.addRow(row);
//            }
//        }
    }
    
    public void populateComboBox() {
//        comboBoxDeliveryMan.removeAllItems();
//        comboBoxDeliveryMan.addItem("-Select One-");
//        for(DeliveryMan d : ecoSystem.getDeliveryManDirectory().getDeliveryManDirectory()) {
//            comboBoxDeliveryMan.addItem(d.getName());
//        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrders = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        btnAssignDeliveryMan = new javax.swing.JButton();
        btnFinished = new javax.swing.JButton();
        comboBoxDeliveryMan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Manage Orders");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer", "Items", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableOrders);
        if (tableOrders.getColumnModel().getColumnCount() > 0) {
            tableOrders.getColumnModel().getColumn(0).setResizable(false);
            tableOrders.getColumnModel().getColumn(1).setResizable(false);
            tableOrders.getColumnModel().getColumn(2).setResizable(false);
            tableOrders.getColumnModel().getColumn(3).setResizable(false);
            tableOrders.getColumnModel().getColumn(4).setResizable(false);
        }

        btnAccept.setText("Accept Order");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnDecline.setText("Decline Order");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        btnAssignDeliveryMan.setText("Assign Delivery Man");
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });

        btnFinished.setText("Order Finished Cooking");
        btnFinished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishedActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Choose delivery man:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnBack)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAccept)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDecline)
                                        .addGap(14, 14, 14)
                                        .addComponent(btnFinished))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBoxDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAssignDeliveryMan)))
                                .addGap(0, 165, Short.MAX_VALUE)))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnDecline)
                    .addComponent(btnFinished))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssignDeliveryMan)
                    .addComponent(jLabel2))
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       userProcessContainer.remove(this);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        int selectedRow = tableOrders.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please select an order first.");
            return;
        }
        
        Order order = (Order) tableOrders.getValueAt(selectedRow, 0);
        order.setStatus("Order Accepted");
        populateTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        int selectedRow = tableOrders.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please select an order first.");
            return;
        }
        
        Order order = (Order) tableOrders.getValueAt(selectedRow, 0);
        order.setStatus("Order Declined");
        populateTable();
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void btnFinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishedActionPerformed
        int selectedRow = tableOrders.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please select an order first.");
            return;
        }
        
        Order order = (Order) tableOrders.getValueAt(selectedRow, 0);
        if (!order.getStatus().equals("Order Accepted")){
            JOptionPane.showMessageDialog(this, "Invalid choice of order.");
            return;
        }
        order.setStatus("Order Finished Cooking");
        populateTable();
    }//GEN-LAST:event_btnFinishedActionPerformed

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
//        DefaultTableModel modelOrders = (DefaultTableModel) tableOrders.getModel();
//        int selectedRowIndex = tableOrders.getSelectedRow();
//        Order order = (Order) tableOrders.getValueAt(selectedRowIndex, 0);
//        String deliveryMan = comboBoxDeliveryMan.getSelectedItem().toString();
//        
//        if (selectedRowIndex < 0){
//            JOptionPane.showMessageDialog(this, "Please select an order first.");
//            return;
//        }
//        if (!order.getStatus().equals("Order Finished Cooking")){
//            JOptionPane.showMessageDialog(this, "Invalid Selection.");
//            return;
//        }
//        if (!deliveryMan.equals("-Select One-")){
//            DeliveryMan man = ecoSystem.getDeliveryManDirectory().getDeliveryMan(deliveryMan);
//            order.setDeliveryMan(man);
//            order.setStatus("Awaiting for pick up");
//            JOptionPane.showMessageDialog(this, "Assign Successful!");
//            populateTable();
//        }else{
//            JOptionPane.showMessageDialog(this, "Select a delivery man.");
//            return;
//        }
    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnFinished;
    private javax.swing.JComboBox<String> comboBoxDeliveryMan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableOrders;
    // End of variables declaration//GEN-END:variables
}

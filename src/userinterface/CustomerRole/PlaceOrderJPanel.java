/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;
import Business.Customer.Customer;
import java.util.*;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.RestaurantAdminRole.ManageMenuJPanel;

/**
 *
 * @author mzhao
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer; 
    EcoSystem ecoSystem; 
    OrderDirectory orderDirectory;
    UserAccount account;
    ArrayList<Item> cart;
    
    /**
     * Creates new form PlaceOrderJPanel
     */
    public PlaceOrderJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, OrderDirectory orderDirectory, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.orderDirectory = orderDirectory;
        this.account = account;
        cart = new ArrayList<>();
        populateComboBox();
    }

    public void populateComboBox() {
        comboBoxSearch.removeAllItems();
        comboBoxSearch.addItem("-Select One-");
        for(Restaurant r : ecoSystem.getRestaurantDirectory().getRestaurantDirectory()) {
            comboBoxSearch.addItem(r.getName());
        }
    }
    
    public void populateMenuTable(){
        DefaultTableModel model = (DefaultTableModel) tableMenu.getModel();
        model.setRowCount(0);
        String restaurantName = comboBoxSearch.getSelectedItem().toString();
        
        for(Item item : ecoSystem.getMenuDirectory().getMenuDirectory()){
            if(restaurantName.equals(item.getRestaurant())) {
                Object [] row = new Object[2];
                row[0] = item;
                row[1] = item.getPrice();
                model.addRow(row);
            }
        }
    }
    
    public void populateCartTable(){
        DefaultTableModel modelCart = (DefaultTableModel) tableCart.getModel();
        DefaultTableModel modelMenu = (DefaultTableModel) tableMenu.getModel();
//        modelCart.setRowCount(0);
        int selectedRowIndex = tableMenu.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select an item to add to cart.");
            return;
        }
        
        Item selectedItem = (Item)modelMenu.getValueAt(selectedRowIndex, 0);
        Object [] row = new Object[2];
        row[0] = selectedItem;
        row[1] = selectedItem.getPrice();
        modelCart.addRow(row);
        cart.add(selectedItem);
    }
    
    public void populateCartTableUpdate() {
        DefaultTableModel model = (DefaultTableModel)tableCart.getModel();
        model.setRowCount(0);
        
        for(Item item : cart){
            Object [] row = new Object[2];
            row[0] = item;
            row[1] = item.getPrice();
                
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboBoxSearch = new javax.swing.JComboBox<>();
        labelSearchBy = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCart = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMenu);
        if (tableMenu.getColumnModel().getColumnCount() > 0) {
            tableMenu.getColumnModel().getColumn(0).setResizable(false);
            tableMenu.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Place New Order");

        comboBoxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSearchActionPerformed(evt);
            }
        });

        labelSearchBy.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        labelSearchBy.setText("Search By Restaurant:");

        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit Order");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCart.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tableCartComponentHidden(evt);
            }
        });
        jScrollPane2.setViewportView(tableCart);
        if (tableCart.getColumnModel().getColumnCount() > 0) {
            tableCart.getColumnModel().getColumn(0).setResizable(false);
            tableCart.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Cart:");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Item");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(labelSearchBy)
                            .addGap(18, 18, 18)
                            .addComponent(comboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(btnBack)
                            .addGap(125, 125, 125)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubmit))
                            .addComponent(btnAddToCart)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearchBy)
                    .addComponent(comboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddToCart)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnDelete))
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSearchActionPerformed
        populateMenuTable();
    }//GEN-LAST:event_comboBoxSearchActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        populateCartTable();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void tableCartComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableCartComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tableCartComponentHidden

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        DefaultTableModel model = (DefaultTableModel)tableCart.getModel();
        Map<Item, Integer> items = new HashMap<>();
        
        // Get restaurant
        String restaurantName = comboBoxSearch.getSelectedItem().toString();
        Restaurant restaurant = ecoSystem.getRestaurantDirectory().getRestaurantByName(restaurantName);
        // Get customer
        String customerName = account.getUsername();
        Customer customer = ecoSystem.getCustomerDirectory().getCustomerByUsername(customerName);
        // Get orders
        for (int count = 0; count < model.getRowCount(); count++){
            Item selectedItem = (Item)model.getValueAt(count, 0);
            if (!items.keySet().contains(selectedItem)){
                items.put(selectedItem, 1);
            }else if (items.keySet().contains(selectedItem)){
                items.put(selectedItem, items.get(selectedItem) + 1);
            }
        }
        // Get order id
        int min = 10000;
        int max = 99999;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
//        int counter = 0;
//        for (Order o : orderDirectory.getOrderDirectory()){
//            if (o.getCustomer().getUsername().equals(customerName))    counter ++;
//        }

        // Get price
        double price = 0;
        for (int count = 0; count < model.getRowCount(); count++){
            Item selectedItem = (Item)model.getValueAt(count, 0);
            price += selectedItem.getPrice();
        }
        
        Order order = orderDirectory.createOrder();
        order.setOrderId(String.valueOf(random_int));
        order.setStatus("Order Received");
        order.setPrice(String.valueOf(price));
        order.setRestaurant(restaurant);
        order.setCustomer(customer);
        order.setDeliveryMan(null);
        order.setItems(items);
        
        JOptionPane.showMessageDialog(this, "Order placed successfully!");
        cart = new ArrayList<>();
        populateCartTableUpdate();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tableCart.getSelectedRow();
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an item to delete");
            return;
        }
        
        Item item = (Item)tableCart.getValueAt(selectedRowIndex, 0);
        cart.remove(item);
        populateCartTableUpdate();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel panel = (CustomerAreaJPanel) component;
        panel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);  
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboBoxSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelSearchBy;
    private javax.swing.JTable tableCart;
    private javax.swing.JTable tableMenu;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Police;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Reporting.CommonReporting.Children;
import Reporting.CommonReporting.ChildrenDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mzhao
 */
public class PoliceAdminJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem; 
    private UserAccount userAccount;
    private ChildrenDirectory childrenDirectory;

    /**
     * Creates new form ManageOrdersJPanel
     */
    public PoliceAdminJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.childrenDirectory = ecoSystem.getChildrenDirectory();
        
        populateTable();
//        populateComboBox();
//        
//        tableChildren.getTableHeader().setOpaque(false);
//        tableChildren.getTableHeader().setBackground(Color.ORANGE);
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tableChildren.getModel();
        model.setRowCount(0);
        
        for(Children c : childrenDirectory.getChildrenDirectory()){
            Object [] row = new Object[6];
            row[0] = c.getId();
            row[1] = c;
            row[2] = c.getApproxAge();
            row[3] = c.getSex();
            row[4] = c.getRace();
            row[5] = c.getStatus();
            model.addRow(row);
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tableChildren = new javax.swing.JTable();
        btnTesting = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnViewReporting = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Police Admin Missing Children Database");
        add(jLabel1);
        jLabel1.setBounds(190, 50, 480, 40);

        tableChildren.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Sex", "Race", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableChildren);
        if (tableChildren.getColumnModel().getColumnCount() > 0) {
            tableChildren.getColumnModel().getColumn(0).setResizable(false);
            tableChildren.getColumnModel().getColumn(1).setResizable(false);
            tableChildren.getColumnModel().getColumn(2).setResizable(false);
            tableChildren.getColumnModel().getColumn(3).setResizable(false);
            tableChildren.getColumnModel().getColumn(4).setResizable(false);
            tableChildren.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane2);
        jScrollPane2.setBounds(70, 160, 714, 229);

        btnTesting.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnTesting.setText("Send Pickup Request to Testing Center");
        btnTesting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestingActionPerformed(evt);
            }
        });
        add(btnTesting);
        btnTesting.setBounds(300, 410, 309, 29);

        btnViewDetails.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails);
        btnViewDetails.setBounds(630, 410, 126, 29);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Search By Name:");
        add(jLabel2);
        jLabel2.setBounds(270, 110, 112, 17);
        add(jTextField1);
        jTextField1.setBounds(400, 110, 176, 26);

        btnViewReporting.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnViewReporting.setText("View Pending Reportings");
        btnViewReporting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportingActionPerformed(evt);
            }
        });
        add(btnViewReporting);
        btnViewReporting.setBounds(70, 410, 210, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestingActionPerformed
int selectedRow = tableChildren.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please select a children first.");
            return;
        }
        
        Children child = (Children) tableChildren.getValueAt(selectedRow, 0);
        child.setStatus("Waiting for testing center to respond");
        populateTable();
    }//GEN-LAST:event_btnTestingActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        int selectedRow = tableChildren.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please select a children first.");
            return;
        }
        
        Children child = (Children) tableChildren.getValueAt(selectedRow, 0);
        PoliceViewDetailsJPanel pvdp = new PoliceViewDetailsJPanel(userProcessContainer, ecoSystem, child);
        userProcessContainer.add("ViewDetailsJPanel", pvdp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnViewReportingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportingActionPerformed
        PoliceViewReportingJPanel view = new PoliceViewReportingJPanel(userProcessContainer, ecoSystem);
        userProcessContainer.add("ViewReportingsJPanel", view);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewReportingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTesting;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton btnViewReporting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableChildren;
    // End of variables declaration//GEN-END:variables
}

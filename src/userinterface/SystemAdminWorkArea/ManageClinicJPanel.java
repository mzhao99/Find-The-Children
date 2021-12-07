/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Clinic.Admin.Clinic;
import Reporting.CommonReporting.Children;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gyt
 */
public class ManageClinicJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageClinicJPanel
     */
    JPanel userProcessContainer; 
    EcoSystem ecoSystem;
    public ManageClinicJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClinic = new javax.swing.JTable();
        btnAddCustomer = new javax.swing.JButton();
        btnModifyCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblTitle.setText("Clinic Management");

        tableClinic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Username", "ID", "Name", "Address", "Phone Number", "Zipcode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableClinic);

        btnAddCustomer.setText("Add Clinic");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnModifyCustomer.setText("Modify Clinic");
        btnModifyCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setText("Delete Clinic");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(164, 164, 164)
                                .addComponent(lblTitle)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifyCustomer)
                        .addGap(148, 148, 148)
                        .addComponent(btnDeleteCustomer)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomer)
                    .addComponent(btnModifyCustomer)
                    .addComponent(btnDeleteCustomer))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableClinic.getModel();
        model.setRowCount(0);
        
        for(Clinic clinic:ecoSystem.getClinicDirectory().getClinicList()){
            
                Object[] row = new Object[6];
                row[0] = clinic.getUa().getUsername();
                row[1] = clinic;
                row[2] = clinic.getName();
                row[3] = clinic.getAddress();
                row[4] = clinic.getPhoneNum();
                row[5] = clinic.getZipcode();
            
               model.addRow(row);
            
       }
    }
    
    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        AddClinicJPanel addClinicJPanel = new AddClinicJPanel(userProcessContainer, ecoSystem);
        userProcessContainer.add("CreateClinicJPanel", addClinicJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btnModifyCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCustomerActionPerformed

        AddClinicJPanel addClinicJPanel = new AddClinicJPanel(userProcessContainer, ecoSystem);
        userProcessContainer.add("CreateClinicJPanel", addClinicJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyCustomerActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed

       int selectRowIndex = tableClinic.getSelectedRow();
       if(selectRowIndex<0){
           JOptionPane.showMessageDialog(this, "Please select a row to delete.");
           return;
       }
        DefaultTableModel model = (DefaultTableModel) tableClinic.getModel();
        Clinic clinic = (Clinic)model.getValueAt(selectRowIndex, 1);
        ecoSystem.getClinicDirectory().removeClinic(clinic);
        
        
        JOptionPane.showMessageDialog(this, "Clinic deleted.");
        populateTable();
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnModifyCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableClinic;
    // End of variables declaration//GEN-END:variables
}

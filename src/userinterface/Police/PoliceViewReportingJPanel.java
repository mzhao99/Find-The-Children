/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Police;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Reporting.CommonReporting.Children;
import Reporting.CommonReporting.ChildrenDirectory;
import Reporting.CommonReporting.ReportedChildDirectory;
import Reporting.Parent.ParentDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mzhao
 */
public class PoliceViewReportingJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem; 
    private UserAccount userAccount;
    private ChildrenDirectory childrenDirectory;
    private ReportedChildDirectory reportedChildDirectory;
    private ParentDirectory parentDirectory;
    
    /**
     * Creates new form PoliceViewReportingJPanel
     */
    public PoliceViewReportingJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.childrenDirectory = ecoSystem.getChildrenDirectory();
        this.reportedChildDirectory = ecoSystem.getReportedChildDirectory();
        this.parentDirectory = ecoSystem.getParentDirectory();
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tableChildren.getModel();
        model.setRowCount(0);
        
        for(Children c : reportedChildDirectory.getReportedChildDirectory()){
            Object [] row = new Object[5];
            row[0] = c;
            row[1] = c.getApproxAge();
            row[2] = c.getSex();
            row[3] = c.getRace();
            row[4] = c.getReporterType();
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

        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableChildren = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Reportings");

        btnAdd.setText("Add to Missing Child Database");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnConfirm.setText("Match Child Information to Database");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tableChildren.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Sex", "Race", "Reporter Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
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
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(22, 22, 22)
                        .addComponent(btnConfirm))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnConfirm))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int selectedRowIndex = tableChildren.getSelectedRow();
        
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a reporting first.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel)tableChildren.getModel();
        Children selectedChild = (Children)model.getValueAt(selectedRowIndex, 0);
        selectedChild.setStatus("Missing");
        childrenDirectory.getChildrenDirectory().add(selectedChild);
        reportedChildDirectory.deleteChildren(selectedChild);
        JOptionPane.showMessageDialog(this, "Added Successfully!");
        populateTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PoliceAdminJPanel pajp = (PoliceAdminJPanel) component;
        pajp.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tableChildren.getSelectedRow();
        
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a reporting first.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel)tableChildren.getModel();
        Children selectedChild = (Children)model.getValueAt(selectedRowIndex, 0);
        
        // See if the child matches any missing child in the database, if yes then set the missing child status
        // to "Found", otherwise create a new missing child
        boolean match = false;
        
        // match function
        String foundChildID = "";
        String email = "";
        Children existing = new Children();
        for (Children c : childrenDirectory.getChildrenDirectory()){
            if (c.getName().equals(selectedChild.getName()) && c.getSex().equals(selectedChild.getSex()) && c.getRace().equals(selectedChild.getRace()) && c.getEyeColor().equals(selectedChild.getEyeColor())){
                match = true;
                foundChildID = c.getId();
                existing = c;
                email =c.getParent().getEmail();
            }
        }
        
        if (match == true){
            childrenDirectory.getChildrenByID(foundChildID).setStatus("Matched");
            JOptionPane.showMessageDialog(this, "Missing children match found. Status for the child updated to 'Matched'. " + "Child ID - " + foundChildID + " An email will be sent to the relating parent.");
            sendEmail(email);
        }else{
            selectedChild.setStatus("Found");
            selectedChild.setParent(parentDirectory.createParent("unknown", "unknown", 0, "unknown", "unknown"));
            childrenDirectory.getChildrenDirectory().add(selectedChild);
            JOptionPane.showMessageDialog(this, "Found child does not match any current missing children info. New missing child info added to the database automatically.");
        }
        reportedChildDirectory.deleteChildren(selectedChild);
        populateTable();
    }//GEN-LAST:event_btnConfirmActionPerformed

    public void sendEmail(String ToEmail){
//        String ToEmail = c.getParent().getEmail();
        //String ToEmail = "jennyzhao0711@gmail.com";
        String FromEmail = "5100finalproject@gmail.com";
        String FromEmailPassword = "5100FinalProject!";
        String Subjects = "Missing Child Update";
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("5100finalproject@gmail.com", "5100FinalProject!");
            }
        });
        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subjects);
            message.setText("Your lost child may have been found! Please come to the testing center for DNA testing.");
            Transport.send(message);
        }catch(Exception ex){
            System.out.println(""+ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableChildren;
    // End of variables declaration//GEN-END:variables
}

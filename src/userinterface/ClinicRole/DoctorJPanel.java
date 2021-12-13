/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClinicRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Reporting.CommonReporting.Children;
import Reporting.CommonReporting.ChildrenDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gyt
 */
public class DoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem; 
    private UserAccount userAccount;
    private ChildrenDirectory childrenDirectory;
    
    public DoctorJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        this.childrenDirectory = childrenDirectory;
        btnDetails.setBackground(new java.awt.Color(255, 255, 255, 0));
        btnDetails.setBorder(new LineBorder(Color.ORANGE, 2));
        btnSearch.setBackground(new java.awt.Color(255, 255, 255, 0));
        btnSearch.setBorder(new LineBorder(Color.ORANGE, 2));
       
        
        populateTable();
        populateComboCom1();
       
    }
    
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for(Children children:ecoSystem.getChildrenDirectory().getChildrenDirectory()){
            if(children.getStatus().equals("Found")||children.getStatus().equals("Treated")){
                Object[] row = new Object[5];
                row[0] = children.getId();
                row[1] = children.getName();
                row[2] = children.getApproxAge();
                row[3] = children.getStatus();
                row[4] = children.getMedicalAdvice();
            
                model.addRow(row);
            }
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
        jTable1 = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        cmbboxregion = new javax.swing.JComboBox<>();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 153));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        jTable1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Child ID", "Child Name", "Approx Age", "Child Status", "Medical Advice"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 204, 102));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 30, 790, 190);

        btnDetails.setBackground(new java.awt.Color(0, 0, 0));
        btnDetails.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(255, 204, 51));
        btnDetails.setText("view details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails);
        btnDetails.setBounds(690, 270, 139, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/catoon doctor.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(-50, 260, 220, 210);
        add(txtSearch);
        txtSearch.setBounds(290, 270, 140, 20);

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 204, 51));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(450, 270, 100, 31);

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 204, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Status", " " }));
        add(jComboBox1);
        jComboBox1.setBounds(190, 270, 86, 28);

        cmbboxregion.setBackground(new java.awt.Color(0, 0, 0));
        cmbboxregion.setEditable(true);
        cmbboxregion.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        cmbboxregion.setForeground(new java.awt.Color(255, 204, 51));
        cmbboxregion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbboxregion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbboxregionActionPerformed(evt);
            }
        });
        add(cmbboxregion);
        cmbboxregion.setBounds(310, 320, 110, 30);

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 204, 51));
        btnReset.setText("Reset Filter");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset);
        btnReset.setBounds(460, 320, 140, 31);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
       int selectRowIndex = jTable1.getSelectedRow();
       if(selectRowIndex<0){
           JOptionPane.showMessageDialog(this, "Please select a row to view details.");
           return;
       }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String id = (String)model.getValueAt(selectRowIndex, 0);
        Children children =ecoSystem.getChildrenDirectory().getChildren(id);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        DetailsJPanel panel = new DetailsJPanel(userProcessContainer, userAccount, ecoSystem, children);
        userProcessContainer.add(panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String item = (String)jComboBox1.getSelectedItem();
        ArrayList<Children> selectedc = new ArrayList<Children>();
        if(item.equals("ID")){
            int id =Integer.parseInt(txtSearch.getText());
            for(Children c : ecoSystem.getChildrenDirectory().getChildrenDirectory()){
                if(c.getId().equals(txtSearch.getText())){
                selectedc.add(c);
                }
            }
        }
        if(item.equals("Name")){
            String Name =txtSearch.getText();
            for(Children c : ecoSystem.getChildrenDirectory().getChildrenDirectory()){
                if(c.getName().equals(Name)){
                selectedc.add(c);
                }
            }
        }
        if(item.equals("Status")){
            String Status =txtSearch.getText();
            for(Children c : ecoSystem.getChildrenDirectory().getChildrenDirectory()){
                if(c.getStatus().equals(Status)){
                selectedc.add(c);
                }
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for(Children children:selectedc){
            
            Object[] row = new Object[5];
            row[0] = children.getId();
            row[1] = children.getName();
            row[2] = children.getApproxAge();
            row[3] = children.getStatus();
            row[4] = children.getMedicalAdvice();
            
            model.addRow(row);
        
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbboxregionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbboxregionActionPerformed
        // TODO add your handling code here:
        populateTable();
        String com = (String)cmbboxregion.getSelectedItem();
        if(com!=null)  populateTable2(com);
    }//GEN-LAST:event_cmbboxregionActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnResetActionPerformed

    private void populateComboCom1() {
          
        
          cmbboxregion.removeAllItems();
          Set<String> COMm1 = new HashSet<String>();
          
          for (Children vs : ecoSystem.getChildrenDirectory().getChildrenDirectory()){
                 
                 if((vs.getStatus().equals("Found"))){
                 COMm1.add(vs.getRegion());
                     }}
          for(String strComm1 : COMm1) {
              cmbboxregion.addItem(strComm1);
          }
          
          String COMMU1 = (String) cmbboxregion.getSelectedItem();
          populateTable();
         
          
      }
    
         private void populateTable2(String COMMU1){
   
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
           
     
            for (Children vs : ecoSystem.getChildrenDirectory().getChildrenDirectory()){
                //int size = vs.getRegion().size();
                
                //Set<String> COMm1 = new HashSet<String>();
                //String abp = vs.getRegion();
        
                if((vs.getStatus().equals("Found"))){
                    
                        if(vs.getRegion().equals(COMMU1)){
             
                            Object[] row = new Object[5];
                            row[0] = vs.getId();
                            row[1] = vs.getName();
                            row[2] = vs.getApproxAge();
                            row[3] = vs.getStatus();
                            row[4] = vs.getMedicalAdvice();
 
         
                              model.addRow(row);
                        }
                       
                }
            }
            
     
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbboxregion;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

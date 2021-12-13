/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClinicRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import Clinic.Admin.Clinic;
import Clinic.Treating.TreatmentDoctors;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gyt
 */
public class ModifyDoctorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ModifyDoctorsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem; 
    private UserAccount userAccount;
    private Clinic clinic;
    private TreatmentDoctors doctors;
    
    public ModifyDoctorsJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem ecoSystem,TreatmentDoctors doctors) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        this.doctors = doctors;
        for(Clinic c:ecoSystem.getClinicDirectory().getClinicList()){
            if(c.getUsername().equals(account.getUsername())) clinic=c;
        }
        
        txtAge.setText(String.valueOf(doctors.getAge()));
        txtName.setText(doctors.getName());
        txtPassword.setText(doctors.getUa().getPassword());
        txtPhoneNum.setText(doctors.getPhoneNum());
        txtUsername.setText(doctors.getUa().getUsername());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/catoon doctor.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("age:");

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 204, 51));
        btnUpdate.setText("modify");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 204, 51));
        btnBack.setText("<<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("phone number:");

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Modify doctors");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("password:");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("username:");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoneNum)
                            .addComponent(txtPassword))
                        .addContainerGap(208, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnBack))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String phone = txtPhoneNum.getText();
        String age = txtAge.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String errorMsg = "";

        // Data validation
        if (name.isEmpty())    errorMsg += "Doctor name is required.\n";
        if (phone.isEmpty())    errorMsg += "Phone number is required.\n";
        else if (!phone.isEmpty()){
            boolean isNum = true;
            for (int i = 0; i < phone.length(); i++) {
                char c = phone.charAt(i);
                if (c < '0' || c > '9') {
                    isNum = false;
                    break;
                }
            }
            if (isNum == false)    errorMsg += "Phone number must contain only numbers.\n";
            if (phone.length() != 10)    errorMsg += "Phone number must be 10 digits.\n";
        }
        if (age.isEmpty())    errorMsg += "Age is required.\n";
        if (username.isEmpty())    errorMsg += "Username is required.\n";
        if (password.isEmpty())    errorMsg += "Password is required.\n";

        if (ecoSystem.checkIfUserIsUnique(username) == true)    errorMsg += "Username already exists.\n";

        // Add new doctor to system
        if (errorMsg.isEmpty()){
            int agei = Integer.valueOf(age);
            int id = doctors.getId();
            UserAccount ua =ecoSystem.getUserAccountDirectory().updateUserAccount(username, password);
            ecoSystem.getTreatDorDirectory().updateTreatDr(id, name, agei, phone, clinic, ua);
            JOptionPane.showMessageDialog(this, "Information updated successfully");

            txtAge.setText("");
            txtName.setText("");
            txtPassword.setText("");
            txtPhoneNum.setText("");
            txtUsername.setText("");
            txtPassword.setText("");

        }else{
            JOptionPane.showMessageDialog(this, errorMsg);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageDoctorsJPanel panel = new ManageDoctorsJPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

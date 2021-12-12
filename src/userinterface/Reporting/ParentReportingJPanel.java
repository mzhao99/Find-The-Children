/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Reporting;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.ParentRole;
import Business.UserAccount.UserAccount;
import Reporting.CommonReporting.Children;
import Reporting.CommonReporting.ChildrenDirectory;
import Reporting.CommonReporting.ReportedChildDirectory;
import Reporting.Parent.Parent;
import Reporting.Parent.ParentDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mzhao
 */
public class ParentReportingJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private ChildrenDirectory childrenDirectory;
    private ParentDirectory parentDirectory;
    private ReportedChildDirectory reportedChildDirectory;
    private Children children = new Children();
    
    /**
     * Creates new form ParentReportingJPanel
     */
    public ParentReportingJPanel(EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.childrenDirectory = ecoSystem.getChildrenDirectory();
        this.parentDirectory = ecoSystem.getParentDirectory();
        this.reportedChildDirectory = ecoSystem.getReportedChildDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRace = new javax.swing.JTextField();
        txtHairColor = new javax.swing.JTextField();
        MissingFrom = new javax.swing.JLabel();
        txtMissingPlace = new javax.swing.JTextField();
        txtEyeColor = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        Header = new javax.swing.JLabel();
        EyeColor = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        MissingSince = new javax.swing.JLabel();
        doB = new javax.swing.JLabel();
        ageNow = new javax.swing.JLabel();
        Sex = new javax.swing.JLabel();
        race = new javax.swing.JLabel();
        HairColor = new javax.swing.JLabel();
        txtMissingSince = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        Height = new javax.swing.JLabel();
        Weight = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        Name1 = new javax.swing.JLabel();
        txtParentName = new javax.swing.JTextField();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        Name5 = new javax.swing.JLabel();
        txtParentPhone = new javax.swing.JTextField();
        txtParentEmail = new javax.swing.JTextField();
        txtParentUsername = new javax.swing.JTextField();
        Name6 = new javax.swing.JLabel();
        txtParentPassword = new javax.swing.JTextField();
        btnbrowseImage = new javax.swing.JButton();
        childImage = new javax.swing.JLabel();

        MissingFrom.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MissingFrom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MissingFrom.setText("Missing Place:");

        Header.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Report a Missing Child");

        EyeColor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EyeColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EyeColor.setText("Eye Color:");

        Name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name.setText("Name:");

        MissingSince.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MissingSince.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MissingSince.setText("Missing Since:");

        doB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        doB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        doB.setText("Date of Birth:");

        ageNow.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ageNow.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageNow.setText("Age:");

        Sex.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Sex.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sex.setText("Sex:");

        race.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        race.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        race.setText("Race:");

        HairColor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        HairColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HairColor.setText("Hair color:");

        txtMissingSince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMissingSinceActionPerformed(evt);
            }
        });

        Height.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Height.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Height.setText("Height:");

        Weight.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Weight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Weight.setText("Weight:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Child Info");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Your Info");

        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        Name1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name1.setText("Name:");

        Name2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name2.setText("Phone:");

        Name3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name3.setText("Email:");

        Name5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name5.setText("Username:");

        Name6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name6.setText("Password:");

        btnbrowseImage.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnbrowseImage.setText("Upload Image");
        btnbrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name)
                    .addComponent(MissingSince)
                    .addComponent(MissingFrom)
                    .addComponent(doB)
                    .addComponent(ageNow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sex)
                    .addComponent(race)
                    .addComponent(HairColor)
                    .addComponent(EyeColor)
                    .addComponent(Height)
                    .addComponent(Weight))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHeight)
                            .addComponent(txtEyeColor)
                            .addComponent(txtHairColor)
                            .addComponent(txtRace)
                            .addComponent(txtSex)
                            .addComponent(txtAge)
                            .addComponent(txtDOB)
                            .addComponent(txtMissingPlace)
                            .addComponent(txtMissingSince, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Name2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtParentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Name1)
                            .addGap(96, 96, 96)
                            .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Name3)
                            .addGap(96, 96, 96)
                            .addComponent(txtParentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Name5)
                                .addComponent(Name6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtParentUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtParentPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnbrowseImage)
                        .addGap(35, 35, 35)
                        .addComponent(childImage, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MissingSince, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MissingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ageNow, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(race, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(HairColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EyeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Height, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMissingSince, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMissingPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnbrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(childImage, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHairColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEyeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String name = txtName.getText();
        String missingDate = txtMissingSince.getText();
        String missingPlace = txtMissingPlace.getText();
        String dob = txtDOB.getText();
        String age = txtAge.getText();
        String sex = txtSex.getText();
        String race = txtRace.getText();
        String hairColor = txtHairColor.getText();
        String eyeColor = txtEyeColor.getText();
        String height = txtHeight.getText();
        String weight = txtWeight.getText();
        
        String parentName = txtParentName.getText();
        String parentPhone = txtParentPhone.getText();
        String parentEmail = txtParentEmail.getText();
        String parentUsername = txtParentUsername.getText();
        String parentPassword = txtParentPassword.getText();
        Image image = children.getChildImage();
        String region = "";
        String errorMsg = "";
        
        try{
            int foundPlace = Integer.parseInt(txtMissingPlace.getText());
            if (foundPlace > 10000 && foundPlace <= 19999) {

                        region = "Boston";

                        } else if (foundPlace > 20000 && foundPlace <= 29999) {

                            region = "Washington";

                        } else if (foundPlace > 30000 && foundPlace <= 39999) {
                            region = "Texas";

                        } else {

                            region = "Alabama";

                        }
        }catch(NumberFormatException e){
            errorMsg += "Missing place should be a number.";
        }
        
        // Data Validation Needed
        if (name.isEmpty() || missingPlace.isEmpty() ||dob.isEmpty() || age.isEmpty() || sex.isEmpty() || race.isEmpty() || hairColor.isEmpty()
                || eyeColor.isEmpty() || height.isEmpty() || weight.isEmpty() || txtMissingPlace.getText().isEmpty()
                || parentName.isEmpty() || parentPhone.isEmpty() || parentEmail.isEmpty() || parentUsername.isEmpty() || parentPassword.isEmpty())    
            errorMsg += "All fields are required.";

        if (!age.isEmpty()){
            boolean isNum = true;
            for (int i = 0; i < age.length(); i++) {
                char c = age.charAt(i);
                if (c < '0' || c > '9') {
                    isNum = false;
                    break;
                }
            }
            if (isNum == false)    errorMsg += "Age must be a number.\n";
        }
        
        
        // If error in data format
        if (!errorMsg.isEmpty()){
            JOptionPane.showMessageDialog(this, errorMsg);
            return;
        }else{    // else add missing child data and parent info
            // Generate random 5 digit id
            Random rand = new Random();
            int num = rand.nextInt(100000);
            String id = String.format("%05d", num); 
            
            // Add Child Data
            Children c = reportedChildDirectory.createChildren(name, missingDate, Integer.valueOf(missingPlace), region, Integer.valueOf(age), sex, race, hairColor, eyeColor, height, weight, dob, id, image);
            c.setReporter(parentName);
            c.setReporterType("Parent");
            
            // Add Parent Data
            // If user account is not created yet, then create one; otherwise just link the child data with the parent
            if (!parentDirectory.containsParent(parentUsername)){
                Parent new_parent = parentDirectory.createParent(parentName, parentEmail, Long.parseLong(parentPhone), parentUsername, parentPassword);
                Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(parentName);
                ecoSystem.getUserAccountDirectory().createUserAccount(parentUsername, parentPassword, employee, new ParentRole());
                c.setParent(new_parent);
            }else{
                // Link Parent to Child
                c.setParent(parentDirectory.getParent(parentUsername));
                // Also Link Child to Parent
                parentDirectory.getParent(parentUsername).getChildrenList().add(id);
            }

            
            JOptionPane.showMessageDialog(this, "Request submitted successfully, an police officer will contact you shortly.");
            
            // Clear the fields
            txtName.setText("");
            txtMissingSince.setText("");
            txtMissingPlace.setText("");
            txtDOB.setText("");
            txtAge.setText("");
            txtSex.setText("");
            txtRace.setText("");
            txtHairColor.setText("");
            txtEyeColor.setText("");
            txtHeight.setText("");
            txtWeight.setText(""); 
            txtParentName.setText(""); 
            txtParentPhone.setText(""); 
            txtParentEmail.setText(""); 
            txtParentUsername.setText("");  
            txtParentPassword.setText(""); 
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnbrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseImageActionPerformed

        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter img_ext = new FileNameExtensionFilter("IMAGES", "png", "jpeg", "jpg");
        browseImageFile.addChoosableFileFilter(img_ext);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);

            ImageIcon img_icon = new ImageIcon(selectedImagePath);

            Image image = img_icon.getImage().getScaledInstance(childImage.getWidth(), childImage.getHeight(), Image.SCALE_SMOOTH);

            //  childrenDirectory.setChildImage(image);
            //childImage.setIcon(new ImageIcon(image));

            children.setChildImage(image);

            childImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnbrowseImageActionPerformed

    private void txtMissingSinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMissingSinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMissingSinceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EyeColor;
    private javax.swing.JLabel HairColor;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel Height;
    private javax.swing.JLabel MissingFrom;
    private javax.swing.JLabel MissingSince;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name5;
    private javax.swing.JLabel Name6;
    private javax.swing.JLabel Sex;
    private javax.swing.JLabel Weight;
    private javax.swing.JLabel ageNow;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnbrowseImage;
    private javax.swing.JLabel childImage;
    private javax.swing.JLabel doB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel race;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEyeColor;
    private javax.swing.JTextField txtHairColor;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtMissingPlace;
    private javax.swing.JTextField txtMissingSince;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtParentEmail;
    private javax.swing.JTextField txtParentName;
    private javax.swing.JTextField txtParentPassword;
    private javax.swing.JTextField txtParentPhone;
    private javax.swing.JTextField txtParentUsername;
    private javax.swing.JTextField txtRace;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}

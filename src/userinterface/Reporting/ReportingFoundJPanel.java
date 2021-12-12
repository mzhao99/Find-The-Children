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
public class ReportingFoundJPanel extends javax.swing.JPanel {
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
    public ReportingFoundJPanel(EcoSystem ecoSystem) {
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
        btnSubmit = new javax.swing.JButton();
        btnbrowseImage = new javax.swing.JButton();
        childImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkYes = new javax.swing.JCheckBox();
        chkNo = new javax.swing.JCheckBox();

        MissingFrom.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MissingFrom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MissingFrom.setText("Found at Place:");

        Header.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Report a Found Child");

        EyeColor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EyeColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EyeColor.setText("Eye Color:");

        Name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name.setText("Name:");

        MissingSince.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MissingSince.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MissingSince.setText("Found Date:");

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

        Height.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Height.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Height.setText("Height:");

        Weight.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Weight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Weight.setText("Weight:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Child Info");

        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnbrowseImage.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnbrowseImage.setText("Upload Image");
        btnbrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseImageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Are you a volunteer?");

        chkYes.setText("Yes");

        chkNo.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkYes)
                                .addGap(18, 18, 18)
                                .addComponent(chkNo))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(childImage, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnbrowseImage)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHairColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEyeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(childImage, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkYes)
                            .addComponent(chkNo))))
                .addGap(28, 28, 28)
                .addComponent(btnbrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String name = txtName.getText();
        String foundDate = txtMissingSince.getText();
        String dob = txtDOB.getText();
        String age = txtAge.getText();
        String sex = txtSex.getText();
        String race = txtRace.getText();
        String hairColor = txtHairColor.getText();
        String eyeColor = txtEyeColor.getText();
        String height = txtHeight.getText();
        String weight = txtWeight.getText();
        String region = "";
        Image image = children.getChildImage();
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
        }catch(Exception e){
            errorMsg += "Missing place should be a number.";
        }

        
        // Data Validation Needed
        if (name.isEmpty() || foundDate.isEmpty() ||dob.isEmpty() || age.isEmpty() || sex.isEmpty() || race.isEmpty() || hairColor.isEmpty()
                || eyeColor.isEmpty() || height.isEmpty() || weight.isEmpty() || txtMissingPlace.getText().isEmpty() || (!chkYes.isSelected() && !chkNo.isSelected()))    
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
        if (chkYes.isSelected() && chkNo.isSelected())    errorMsg += "Volunteer selection error.\n";
        
        
        // If error in data format
        if (!errorMsg.isEmpty()){
            JOptionPane.showMessageDialog(this, errorMsg);
        }else{    // else add missing child data and parent info
            // Generate random 5 digit id
            Random rand = new Random();
            int num = rand.nextInt(100000);
            String id = String.format("%05d", num); 
            
            // Add Child Data
            Children c = reportedChildDirectory.createChildren(name, foundDate, Integer.parseInt(txtMissingPlace.getText()), region, Integer.valueOf(age), sex, race, hairColor, eyeColor, height, weight, dob, id, image);
            if (chkYes.isSelected()){
                c.setReporterType("Volunteer");
            }else if (chkNo.isSelected()){
                c.setReporterType("Passer-by");
            }
 
            JOptionPane.showMessageDialog(this, "Request submitted successfully, thank you for reporting, an official will contact you shortly.");
            
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
            chkYes.setSelected(false);
            chkNo.setSelected(false);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EyeColor;
    private javax.swing.JLabel HairColor;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel Height;
    private javax.swing.JLabel MissingFrom;
    private javax.swing.JLabel MissingSince;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Sex;
    private javax.swing.JLabel Weight;
    private javax.swing.JLabel ageNow;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnbrowseImage;
    private javax.swing.JLabel childImage;
    private javax.swing.JCheckBox chkNo;
    private javax.swing.JCheckBox chkYes;
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
    private javax.swing.JTextField txtRace;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author vishu tyagi
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }
    
    String ImgPath = null;

     public java.sql.Connection getConnection()
    {
    java.sql.Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/staff_management","root","");
           // JOptionPane.showMessageDialog(null,"connected");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null,"not connected");
            return null;
        }
    }
     
     
       public ImageIcon ResizeImage(String imagePath, byte[] pic)
    {
        ImageIcon myImage  = null;
        
        if(imagePath != null)
        {
        myImage  = new ImageIcon(imagePath);
        } else {
        myImage = new ImageIcon(pic);
        }
        
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(ibl_image.getWidth(),ibl_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmb_Department = new javax.swing.JComboBox();
        date = new com.toedter.calendar.JDateChooser();
        txt_FatherName = new javax.swing.JTextField();
        cmb_Gender = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Address = new javax.swing.JTextArea();
        txt_salary = new javax.swing.JTextField();
        txt_Contact = new javax.swing.JTextField();
        ibl_image = new javax.swing.JLabel();
        btn_Submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_ImageChooser = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration For New Staff");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(93, 95, 144));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Mincho", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration For Staff");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(167, 13, 566, 82);

        txt_Name.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel1.add(txt_Name);
        txt_Name.setBounds(199, 162, 256, 28);

        txt_ID.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ID);
        txt_ID.setBounds(199, 123, 256, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(105, 123, 35, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(75, 165, 65, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(19, 201, 121, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Joining Date :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(19, 249, 125, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Father Name :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(12, 285, 129, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(63, 324, 78, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(63, 391, 83, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salary :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(78, 445, 68, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(64, 491, 82, 22);

        cmb_Department.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmb_Department.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department", "Accounts Department", "Engineering Department", "MBA Department " }));
        jPanel1.add(cmb_Department);
        cmb_Department.setBounds(199, 201, 256, 30);

        date.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(date);
        date.setBounds(199, 249, 256, 22);

        txt_FatherName.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel1.add(txt_FatherName);
        txt_FatherName.setBounds(199, 282, 256, 28);

        cmb_Gender.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cmb_Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
        jPanel1.add(cmb_Gender);
        cmb_Gender.setBounds(199, 321, 256, 28);

        txt_Address.setColumns(20);
        txt_Address.setFont(new java.awt.Font("Monospaced", 2, 13)); // NOI18N
        txt_Address.setRows(5);
        jScrollPane1.setViewportView(txt_Address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 360, 319, 75);

        txt_salary.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel1.add(txt_salary);
        txt_salary.setBounds(199, 442, 182, 28);

        txt_Contact.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txt_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContactActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Contact);
        txt_Contact.setBounds(199, 488, 182, 28);

        ibl_image.setBackground(new java.awt.Color(255, 204, 204));
        ibl_image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ibl_image.setOpaque(true);
        jPanel1.add(ibl_image);
        ibl_image.setBounds(683, 123, 165, 163);

        btn_Submit.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btn_Submit.setText("Submit");
        btn_Submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Submit);
        btn_Submit.setBounds(79, 555, 67, 27);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(199, 555, 39, 27);

        btn_ImageChooser.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btn_ImageChooser.setText("Choose Image");
        btn_ImageChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ImageChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImageChooserActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ImageChooser);
        btn_ImageChooser.setBounds(713, 309, 135, 27);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(599, 349, 104, 22);

        txtUsername.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername);
        txtUsername.setBounds(713, 349, 157, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("password :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(597, 427, 98, 22);

        txtPassword.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel1.add(txtPassword);
        txtPassword.setBounds(713, 420, 157, 36);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/backbutton.jpg"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 42, 99, 31);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/technology-background-2012.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 900, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void txt_ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContactActionPerformed

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
            try {
            java.sql.Statement stmt = null;
            String id= txt_ID.getText();
            String name= txt_Name.getText();
            String username= txtUsername.getText();
            String department= (String)cmb_Department.getSelectedItem();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
             String joining_date = dateFormat.format(date.getDate());
             
             String father_name= txt_FatherName.getText();
             String gender= (String)cmb_Gender.getSelectedItem();
            String address= txt_Address.getText();
            String annual_salary= txt_salary.getText();
            String password= txtPassword.getText();
            String contact= txt_Contact.getText();
           
            InputStream img = new FileInputStream(new File(ImgPath));
            
            java.sql.Connection con = getConnection();
            stmt = con.createStatement();
            
                String query1 ="INSERT INTO staff values('"+id+"','"+name+"' ,'"+username+"','"+department+"','"+joining_date+"','"+father_name+"','"+gender+"','"+address+"','"+annual_salary+"' ,'"+password+"','"+contact+"','"+img+"')";
                stmt.executeUpdate(query1);
                JOptionPane.showMessageDialog(null,"data sucessfully inserted");
                ControlPanel l= new ControlPanel();
                l.setVisible(true);
                this.setVisible(false);
                
             
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
            
    }//GEN-LAST:event_btn_SubmitActionPerformed

    private void btn_ImageChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImageChooserActionPerformed
          JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image","jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION)
        {
        File selectedFile = file.getSelectedFile();
        String path  = selectedFile.getAbsolutePath();
        ibl_image.setIcon(ResizeImage(path,null));
        ImgPath = path;
        }
        else
        {
        System.out.println(" NO FILE Selected");
        }
    }//GEN-LAST:event_btn_ImageChooserActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        ControlPanel cp =new ControlPanel();
        cp.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel13MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ImageChooser;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JComboBox cmb_Department;
    private javax.swing.JComboBox cmb_Gender;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel ibl_image;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextArea txt_Address;
    private javax.swing.JTextField txt_Contact;
    private javax.swing.JTextField txt_FatherName;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_salary;
    // End of variables declaration//GEN-END:variables
}

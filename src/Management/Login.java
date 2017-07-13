/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vishu tyagi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
   
    public Login() {
        initComponents();
        
    }

      public java.sql.Connection getConnection()
    {
    java.sql.Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/staff_management","root","");
             //JOptionPane.showMessageDialog(null,"connected");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null,"not connected");
            return null;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_UserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        jcmbChoose = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Staff Login");
        setBackground(new java.awt.Color(18, 18, 142));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(46, 34, 162));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(40, 450, 67, 27);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Please enter your username and password");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 280, 250, 14);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("username :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 320, 110, 22);

        txt_UserName.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txt_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserNameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_UserName);
        txt_UserName.setBounds(140, 320, 180, 28);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 360, 99, 22);

        txt_Password.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Password);
        txt_Password.setBounds(140, 360, 180, 28);

        jcmbChoose.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jcmbChoose.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Admin", "Staff" }));
        jcmbChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbChooseActionPerformed(evt);
            }
        });
        jPanel2.add(jcmbChoose);
        jcmbChoose.setBounds(140, 400, 180, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Clean");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(190, 450, 55, 27);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\vishu tyagi\\Downloads\\preferences_system_login.png")); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 60, 136, 164);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/bk3.jpg"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 810, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txt_UserName.setText(null);
        txt_Password.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           String name= txt_UserName.getText();
         String password= txt_Password.getText();
           java.sql.Statement stmt = null;
           java.sql.Connection con = getConnection();
            String id="null";
      
         
      
         
         try {
           
            stmt = con.createStatement();
            
            
                   String str= "SELECT * FROM staff where username ='" +name +
                            "' and password ='" + password + "'";
                    stmt.executeQuery(str);
            
            str= "SELECT id FROM staff where username = '" + name + "'";
          ResultSet RS =  stmt.executeQuery(str);
             
              // str= "SELECT timein FROM logintable where staffid = '" + id + "'";
            // ResultSet RS = stmt.executeQuery(str);
             
              if(name.equals("admin") && password.equals("12345"))
         {
           if(jcmbChoose.getSelectedItem().equals("Admin"))
           {
           ControlPanel cp = new ControlPanel();
           cp.setVisible(true);
            this.setVisible(false);
           }
         }
           
            
            if(RS.next())
            {
            //System.out.println("you r inside");
                
               // if(jcmbChoose.getSelectedItem().equals("Admin")) 
                // {
                    //ControlPanel cp = new ControlPanel();
                   // cp.setVisible(true);
                   // this.setVisible(false);     
                  //}
                
                 if(jcmbChoose.getSelectedItem().equals("Staff")) 
                 {
                    StaffPanel sp = new StaffPanel();
                       id  = RS.getString("id");
                      //String timein = RS.getString("timein");
                    System.out.println(id);
                  // sp.txtTimeIn.setText(timein);
                    sp.txtId.setText(id);
                    sp.jLbSett.setText("WELCOME"+ " " + name);
                    sp.setVisible(true);
                  
                    this.setVisible(false);     
                  }
                
            }
            //else {
            //JOptionPane.showMessageDialog(null,"please register first");
            //}
         }
         catch(Exception e)
         {
         System.out.println(e);
         }
         finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            con.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(con!=null)
            con.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
         
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcmbChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbChooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbChooseActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox jcmbChoose;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}

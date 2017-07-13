/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import static Management.AttendenceList.timein;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author vishu tyagi
 */
public class StaffSalary extends javax.swing.JFrame {

    /**
     * Creates new form StaffSalary
     */
    public StaffSalary() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
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

      
      
      
      
       public ArrayList<Detail3> getSalaryList() throws SQLException
    {
    ArrayList<Detail3> salaryList  = new ArrayList<Detail3>();
    Connection con = getConnection();
    String query = " SELECT * FROM salary";
    
    Statement st;
    ResultSet rs;
    
    try {
    st=con.createStatement();
    rs = st.executeQuery(query);
    Detail3 salary;
    
    while(rs.next())
        
    {
         
       salary = new Detail3(rs.getString("staff_id"),  rs.getString("Username") ,rs.getString("Salary")); 
       
    //product = new Details(rs.getString("id"),rs.getString("name"),Float.parseFloat(rs.getString("price")),rs.getString("add_date"),rs.getBytes("image"));
    salaryList.add(salary);
    }
    } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
    
        return salaryList;
        
    }    
    
    // 2- populate the JTable
     
     public void Show_Products_In_JTable()
     {
        try {
            ArrayList<Detail3> list = getSalaryList();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            //clear jtable content
            model.setRowCount(0);
            Object[] row = new Object[3];
            for(int i = 0; i < list.size(); i++)
            {
                row[0] = list.get(i).getStaffid();
                row[1] = list.get(i).getUsername();
                row[2] = list.get(i).getSalary();
               
                
                
                
                
                model.addRow(row);   
            }  } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
     }
    
     
       public ArrayList<Detail5> getMoreList() throws SQLException
    {
    ArrayList<Detail5> salaryList  = new ArrayList<Detail5>();
    Connection con = getConnection();
    String query = " SELECT * FROM staff";
    
    Statement st;
    ResultSet rs;
    
    try {
    st=con.createStatement();
    rs = st.executeQuery(query);
    Detail5 salary;
    
    while(rs.next())
        
    {
         
       salary = new Detail5(rs.getString("id"),  rs.getString("name") ,rs.getString("department")); 
       
    //product = new Details(rs.getString("id"),rs.getString("name"),Float.parseFloat(rs.getString("price")),rs.getString("add_date"),rs.getBytes("image"));
    salaryList.add(salary);
    }
    } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
    
        return salaryList;
        
    }    
    
    // 2- populate the JTable
     
     public void Show_More_In_JTable()
     {
        try {
            ArrayList<Detail5> list = getMoreList();
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            //clear jtable content
            model.setRowCount(0);
            Object[] row = new Object[3];
            for(int i = 0; i < list.size(); i++)
            {
                row[0] = list.get(i).getStaffid();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getDepartment();
               
                
                
                
                
                model.addRow(row);   
            }  } catch (SQLException ex) {
                System.out.println(ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        seach = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        staffid = new javax.swing.JTextField();
        staffname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        staffdepart = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        from = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        upto = new com.toedter.calendar.JDateChooser();
        staffSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        genertateSalary = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Staff id :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 100, 70, 22);

        seach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachActionPerformed(evt);
            }
        });
        seach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                seachKeyPressed(evt);
            }
        });
        jPanel1.add(seach);
        seach.setBounds(140, 100, 610, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("Search id");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(790, 100, 100, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/backbutton.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 20, 116, 49);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Staff Salary");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 10, 310, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Staff id :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 170, 69, 22);

        staffid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffidActionPerformed(evt);
            }
        });
        jPanel1.add(staffid);
        staffid.setBounds(140, 170, 100, 30);

        staffname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffnameActionPerformed(evt);
            }
        });
        jPanel1.add(staffname);
        staffname.setBounds(140, 210, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 220, 60, 22);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "department"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(880, 303, 294, 230);

        staffdepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffdepartActionPerformed(evt);
            }
        });
        jPanel1.add(staffdepart);
        staffdepart.setBounds(140, 260, 210, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 260, 110, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "staffid", "name", "salary"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(430, 310, 430, 220);

        from.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(from);
        from.setBounds(140, 310, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date from :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 310, 100, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date Upto :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 360, 100, 20);

        upto.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(upto);
        upto.setBounds(140, 350, 130, 30);

        staffSalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        staffSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(staffSalary);
        staffSalary.setBounds(140, 390, 130, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salary :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 390, 59, 22);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 450, 73, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Calculate Salary");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 450, 141, 30);

        genertateSalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        genertateSalary.setText("Generate salary sllip");
        genertateSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genertateSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(genertateSalary);
        genertateSalary.setBounds(50, 500, 210, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/technology-background-2012.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1190, 560);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffnameActionPerformed

    private void staffidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffidActionPerformed

    private void seachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seachKeyPressed
         
    }//GEN-LAST:event_seachKeyPressed

    private void seachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seachActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          String id= seach.getText();
         
           java.sql.Statement stmt = null;
           java.sql.Connection con = getConnection();    
           
           
                
         try {
           
            stmt = con.createStatement();
     
           String str= "SELECT * FROM staff where id = '" + id + "'";
          ResultSet RS =  stmt.executeQuery(str);
          
              
            if(RS.next())
            {
           
        
                    
                      String id1  = RS.getString("id");
                      //System.out.println(id1);
                      staffid.setText(id1);
                      String name  = RS.getString("name");
                      //System.out.println(name);
                      staffname.setText(name);
                      String department  = RS.getString("department");
                      //System.out.println(department);
                      staffdepart.setText(department);
                      
                        
                  
                
            }
            
         }
         catch(Exception ex)
         {
         JOptionPane.showMessageDialog(null,ex.getMessage());
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
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String id= staffid.getText();
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
      
        String fro = dateFormat.format(from.getDate());
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        String up = dateFormat1.format(upto.getDate());
        java.sql.Statement stmt = null;
           java.sql.Connection con = getConnection(); 
           //Date date_1 = from.getDate();
           //Date date_2 = upto.getDate();
           
             try {
           
            stmt = con.createStatement();
     
               String sql= "SELECT SUM(totalmin) AS TotalItemsOrdered FROM logintable where staffid = '"+id+"'  AND date between '"+fro+"' and '"+up+"'"  ;
            // String sql= "SELECT SUM(totalsec) FROM logintable where staffid = '"+id+"'  AND date between '"+fro+"' and '"+up+"'"  ;
          ResultSet RS =   stmt.executeQuery(sql);
             
         
          
           while(RS.next())
            {
                String valveinmin = RS.getString("TotalItemsOrdered");
                double a = 10 * Double.parseDouble(valveinmin);
                String b = Double.toString(a);
                staffSalary.setText(b);
                
             
            }
             }
              catch(Exception ex)
         {
         JOptionPane.showMessageDialog(null,ex.getMessage());
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void staffdepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffdepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffdepartActionPerformed

    private void staffSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffSalaryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          
          
          
          try {
            java.sql.Statement stmt = null;
            String satff_id = staffid.getText();  
          String Username = staffname.getText();
          String Salary = staffSalary.getText();
          
            
            java.sql.Connection con = getConnection();
            stmt = con.createStatement();
            
                String query1 ="INSERT INTO salary values('"+satff_id+"','"+Username+"' ,'"+Salary+"')";
                stmt.executeUpdate(query1);
                Show_Products_In_JTable();
                JOptionPane.showMessageDialog(null,"data sucessfully inserted");
               
                
             
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void genertateSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genertateSalaryActionPerformed
         String value = staffid.getText();
            String value0 = staffname.getText();
            String value1 = staffdepart.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String value2 = dateFormat.format(from.getDate());
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
           String value3 = dateFormat1.format(upto.getDate());
            String value4 = staffSalary.getText();
          
            
            
            
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File(value +" "+ value0+"-Salary Slip"+".pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION)
            {
             try {
                 String filePath = dialog.getSelectedFile().getPath();
                 
                 
                 
                 
                 
                 
                 Document myDocument = new Document();
                 PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                 myDocument.open();
                 
                 myDocument.add(new Paragraph("PAY SLIP",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                 myDocument.add(new Paragraph(new Date().toString()));
                 myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                 myDocument.add((new Paragraph("STAFF DETAILS",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD))));
                 myDocument.add((new Paragraph("Name of STAFF: " + value0  ,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                 myDocument.add((new Paragraph("ID of STAFF: " + value  ,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                 
                 myDocument.add((new Paragraph("Department: "+value1,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                 myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                 myDocument.add(new Paragraph("SALARY ",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                 myDocument.add(new Paragraph(" Salary from date: "+value2,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                 myDocument.add(new Paragraph("Salary from date: "+value3,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                 
                 myDocument.add(new Paragraph("TOTAL PAYMENT : $" +value4,FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
                 
                 
                 myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                 
                 
                 myDocument.newPage();
                 myDocument.close();
                 JOptionPane.showMessageDialog(null,"Report was successfully generated");
             } catch (DocumentException ex) {
                  JOptionPane.showMessageDialog(null,ex.getMessage());
             } catch (FileNotFoundException ex) {
                  JOptionPane.showMessageDialog(null,ex.getMessage());
             }
           
         
            
    
      }
    }//GEN-LAST:event_genertateSalaryActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        ControlPanel c=new ControlPanel();
        c.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(StaffSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser from;
    private javax.swing.JButton genertateSalary;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField seach;
    private javax.swing.JTextField staffSalary;
    private javax.swing.JTextField staffdepart;
    private javax.swing.JTextField staffid;
    private javax.swing.JTextField staffname;
    private com.toedter.calendar.JDateChooser upto;
    // End of variables declaration//GEN-END:variables
}

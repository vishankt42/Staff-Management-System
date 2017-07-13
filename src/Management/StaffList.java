/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishu tyagi
 */
public class StaffList extends javax.swing.JFrame {

    /**
     * Creates new form StaffList
     */
    public StaffList() {
        initComponents();
        
    }
    
        public Connection getConnection()
        {
           Connection con = null;
    
           try {
              con = DriverManager.getConnection("jdbc:mysql://localhost/staff_management","root","");
            
              return con;
             } catch (SQLException ex) {
               Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
           
              return null;
        }
    
    }
    
   

    
    //Display Data In JTable:
    // 1 - fill arraylist with the data
    
     public ArrayList<Details> getProductList() throws SQLException
    {
    ArrayList<Details> productList  = new ArrayList<Details>();
    Connection con = getConnection();
    String query = " SELECT * FROM staff";
    
    Statement st;
    ResultSet rs;
    
    try {
    st=con.createStatement();
    rs = st.executeQuery(query);
    Details product;
    
    while(rs.next())
        
    {
       product = new Details(rs.getString("id"),rs.getString("name"),rs.getString("department"),rs.getString("joining_date"),rs.getString("father_name"),rs.getString("gender"),rs.getString("address"),Double.parseDouble(rs.getString("annual_salary")),rs.getString("contact"),rs.getBytes("img")); 
    //product = new Details(rs.getString("id"),rs.getString("name"),Float.parseFloat(rs.getString("price")),rs.getString("add_date"),rs.getBytes("image"));
    productList.add(product);
    }
    } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
    
        return productList;
        
    }    
    
    // 2- populate the JTable
     
     public void Show_Products_In_JTable()
     {
        try {
            ArrayList<Details> list = getProductList();
            DefaultTableModel model = (DefaultTableModel)JTable_Products.getModel();
            //clear jtable content
            model.setRowCount(0);
            Object[] row = new Object[9];
            for(int i = 0; i < list.size(); i++)
            {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getDepartment();
                row[3] = list.get(i).getJoining_date();
                row[4] = list.get(i).getFather_name();
                row[5] = list.get(i).getGender();
                row[6] = list.get(i).getAddress();
                row[7] = list.get(i).getAnnual_salary();
                row[8] = list.get(i).getContact();
                
                
                
                model.addRow(row);   
            }  } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
     }
     
     
     
    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable_Products = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 153, 153));
        setBounds(new java.awt.Rectangle(0, 0, 1000, 500));
        setMaximizedBounds(new java.awt.Rectangle(960, 640, 640, 640));
        setMaximumSize(new java.awt.Dimension(960, 640));
        setMinimumSize(new java.awt.Dimension(960, 640));
        setPreferredSize(new java.awt.Dimension(960, 640));
        setSize(new java.awt.Dimension(960, 640));

        jPanel2.setLayout(null);

        JTable_Products.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "department", "joining_date", "father_name", "gender", "address", "annual_salary", "contact"
            }
        ));
        jScrollPane2.setViewportView(JTable_Products);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(120, 160, 770, 375);

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      Staff List");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(330, 20, 410, 82);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/backbutton.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 60, 116, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/technology-background-2012.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 1110, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ControlPanel cp =new ControlPanel();
        cp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(StaffList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_Products;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

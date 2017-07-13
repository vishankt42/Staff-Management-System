/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


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
public class ApplicationNotify extends javax.swing.JFrame {

    /**
     * Creates new form ApplicationNotify
     */
    public ApplicationNotify() {
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
    
    
    
       public ArrayList<Detail4> getApplicationList() throws SQLException
    {
    ArrayList<Detail4> ApplicationList  = new ArrayList<Detail4>();
    Connection con = getConnection();
    String query = " SELECT * FROM chutti";
    
    Statement st;
    ResultSet rs;
    
    try {
    st=con.createStatement();
    rs = st.executeQuery(query);
    Detail4 Application;
    
    while(rs.next())
        
    {
    Application = new Detail4(rs.getString("id"),rs.getString("name"),rs.getString("subject"),rs.getString("message"),rs.getString("date"));
   // Float.parseFloat(rs.getString("price"))
    ApplicationList.add(Application);
    }
    } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,ex.getMessage());
           }
    
        return ApplicationList;
        
    }    
    
    // 2- populate the JTable
     
    public void Show_Application_In_JTable()
     {
        try {
            ArrayList<Detail4> list = getApplicationList();
            DefaultTableModel mode = (DefaultTableModel)JTable_Application.getModel();
            //clear jtable content
            mode.setRowCount(0);
            Object[] row = new Object[5];
            for(int i = 0; i < list.size(); i++)
            {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getSubject();
                row[3] = list.get(i).getMessage();
                row[4] = list.get(i).getDate();
                
                
                
                
                mode.addRow(row);   
            }  } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
     }
     
     
     
     public void ShowItem(int index) throws SQLException
     {
     jTextField1.setText(getApplicationList().get(index).getName());
     jTextField2.setText(getApplicationList().get(index).getSubject());
     jTextArea1.setText(getApplicationList().get(index).getMessage());
     }
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JTable_Products = new javax.swing.JScrollPane();
        JTable_Application = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        JTable_Application.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "subject", "date"
            }
        ));
        JTable_Application.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_ApplicationMouseClicked(evt);
            }
        });
        JTable_Products.setViewportView(JTable_Application);

        jPanel2.add(JTable_Products);
        JTable_Products.setBounds(610, 120, 485, 410);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(150, 150, 170, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 150, 57, 14);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField2);
        jTextField2.setBounds(150, 210, 170, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 220, 70, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Message :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 270, 128, 29);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 310, 290, 137);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Application Notification");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(350, 20, 510, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/backbutton.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 30, 106, 41);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Management/technology-background-2012.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(-6, 0, 1170, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTable_ApplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_ApplicationMouseClicked
        // TODO add your handling code here:
        try {
            int index = JTable_Application.getSelectedRow();
            ShowItem(index);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_JTable_ApplicationMouseClicked

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        ControlPanel s=new ControlPanel();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseReleased

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
            java.util.logging.Logger.getLogger(ApplicationNotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationNotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationNotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationNotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationNotify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_Application;
    private javax.swing.JScrollPane JTable_Products;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

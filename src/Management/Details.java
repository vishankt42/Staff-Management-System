/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

/**
 *
 * @author vishu tyagi
 */
public class Details {
     private String id;
    private String name;
    private String department;
    private  String joining_date;
    private String father_name;
    private String gender;
    private String address;
    private double annual_salary;
    private String contact;
    private byte[] img;
    
    public Details(String pid, String pname,String pdepartment,String pjoining_date,String pfather_name,
            String pgender,String paddress,double pannual_salary ,String pcontact, byte[] pimg)
    {
    this.id=pid;
    this.name=pname;
    this.department = pdepartment;
    this.joining_date = pjoining_date;
    this.father_name = pfather_name;
    this.gender = pgender;
    this.address = paddress;
    this.annual_salary = pannual_salary;
    this.contact = pcontact;
    this.img = pimg;
    }
    
    public String getId()
    {
    return id;
    }
    
    public String getName()
    {
    return name;
    }
    
    public String getDepartment()
    {
    return department;
    }
    
    public String getJoining_date()
    {
    return joining_date;
    }
    
     public String getFather_name()
    {
    return father_name;
    }
     
      public String getGender()
    {
    return gender;
    }
      
       public String getAddress()
    {
    return address;
    }
       
      public double getAnnual_salary()
    {
    return annual_salary;
    }
          
      public String getContact()
    {
    return contact;
    }
      
    
    public byte[] getImg()
    {
    return img;
    }
}

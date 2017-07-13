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
public class Detail5 {
    
    private String staff_id;
    private String name;
    private String department;
   
    
     public Detail5(String pstaff_id, String pName ,String pDepartment)
    {
    this.staff_id=pstaff_id;
    this.name=pName;
    this.department = pDepartment;
    
    
    }
    
    public String getStaffid()
    {
    return staff_id;
    }
    
    public String getName()
    {
    return name;
    }
    
    public String getDepartment()
    {
    return department;
    }
    
}



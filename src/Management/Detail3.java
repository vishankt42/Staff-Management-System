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
public class Detail3 {
    private String staff_id;
    private String Username;
    private String Salary;
   
    
     public Detail3(String pstaff_id, String pUsername ,String pSalary)
    {
    this.staff_id=pstaff_id;
    this.Username=pUsername;
    this.Salary = pSalary;
    
    
    }
    
    public String getStaffid()
    {
    return staff_id;
    }
    
    public String getUsername()
    {
    return Username;
    }
    
    public String getSalary()
    {
    return Salary;
    }
    
}

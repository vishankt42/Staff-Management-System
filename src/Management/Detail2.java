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
public class Detail2 {
      private String staffid;
    private String timein;
    private String timeout;
    private  String date;
    
    
     public Detail2(String pstaffid, String ptimein ,String ptimeout,String pdate)
    {
    this.staffid=pstaffid;
    this.timein=ptimein;
    this.timeout = ptimeout;
    this.date = pdate;
    
    }
    
    public String getStaffid()
    {
    return staffid;
    }
    
    public String getTimein()
    {
    return timein;
    }
    
    public String getTimeout()
    {
    return timeout;
    }
    
    public String getDate()
    {
    return date;
    }
    
    
  
}

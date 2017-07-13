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
public class Detail4 {
      private String id;
    private String name;
    private String subject;
     private String message;
    private String date;
    
    
      public Detail4(String pid, String pname ,String psubject ,String pmessage ,String pdate)
    {
    this.id=pid;
    this.name=pname;
    this.subject = psubject;
    this.message=pmessage;
    this.date = pdate;
    
    
    }
    
    public String getId()
    {
    return id;
    }
    
    public String getName()
    {
    return name;
    }
    
    public String getSubject()
    {
    return subject;
    }
    
     public String getMessage()
    {
    return message ;
    }
     
      public String getDate()
    {
    return date;
    }
}

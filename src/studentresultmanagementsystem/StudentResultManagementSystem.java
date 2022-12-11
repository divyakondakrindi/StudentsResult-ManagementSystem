
package studentresultmanagementsystem;

import java.io.IOException;


public class StudentResultManagementSystem {


  public void func() throws ClassNotFoundException{
      Class.forName("com.mysql.jdbc.Drver");
      
  }  
  
  public static void main(String args[]) throws ClassNotFoundException{  
      StudentResultManagementSystem obj = new StudentResultManagementSystem();
      try{
          obj.func();
      }
      catch(Exception e){
          System.out.print("Error Occured");
      }
  }
}

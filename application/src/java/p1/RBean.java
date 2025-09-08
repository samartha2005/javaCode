/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javax.ejb.Stateless;
import java.sql.*;
import java.io.*;

@Stateless
public class RBean {
    String msg="";
    public String markssubmit(String m1,String m2,String m3)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/markdb","root","root");
            Statement st=con.createStatement();
            int i=st.executeUpdate("insert into marks value('"+m1+"','"+m2+"','"+m3+"')");
            if(i>0)
            {
                msg="marks submitted successfully";
            }
            else
            {
                msg="not submitted";
            }
            
            
            
        }
        catch(Exception e)
        {
            msg=""+e;
        }
        return msg;
        
        
    }
    
    
}

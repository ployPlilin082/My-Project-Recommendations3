
package friedeggs;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnection {
   public static Connection connect(){
      Connection conn = null;
       
      try{
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimecode=false&serverTimezone=UTC", "root", ""); 
          System.out.println("Connected");
      } catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.getMessage());
      } 
      return conn;
   }
}

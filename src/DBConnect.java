
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnect {
    
    
    Connection con=null;
   
        public static Connection ConnectDB(){
             try{
           
          Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/passenger","root","");
          return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "No Database Connection", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
    }      
}
    
}

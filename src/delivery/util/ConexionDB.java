package delivery.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
 
    public static Connection obtenerConexion() throws SQLException        
    {
        Connection con=null;
        try{
             Class.forName("comm.mysql.jdbc");
             con=DriverManager.getConnection("jdbc:mysql://localhost/deliverydb","root","");
            }catch(ClassNotFoundException e)
            {
                e.printStackTrace();//para que pinte el error
            }
        return con;
    }
    
}

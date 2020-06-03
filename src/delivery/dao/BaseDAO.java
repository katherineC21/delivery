package delivery.dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDAO {
    protected void cerrarConexion(Connection con) 
        throws RuntimeException {
        try {
            if (con !=null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error: Cerrar conexion " + ex);
        }
        
    }
    protected void cerrarResultSet(ResultSet rs) 
        throws RuntimeException {
        
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error: Cerrar ResultSet " + ex);
        }
    }
    protected void cerrarStatement(PreparedStatement stmt) 
        throws RuntimeException {
        
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error: Cerrar Statement " + ex);
        }
        
    }
    protected void cerrarCallable(CallableStatement callstmt) 
        throws RuntimeException {
        
        try {
            if (callstmt != null) {
                callstmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error: Cerrar Callable " + ex);
        }
        
    }
}

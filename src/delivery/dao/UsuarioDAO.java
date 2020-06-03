package delivery.dao;

import delivery.modelo.Usuario;
import delivery.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

public class UsuarioDAO extends BaseDAO{
  
    public ArrayList<Usuario>listar()
    {
       String query="select * from usuarios";
       ArrayList<Usuario> c=new ArrayList<Usuario>();//este objeto recibira la lista
       Connection con=null;
       
        PreparedStatement stmt=null;
        ResultSet rs=null;
        try{
            con=ConexionDB.obtenerConexion();
            stmt=con.prepareStatement(query);
            rs=stmt.executeQuery();
            while(rs.next())
              {
                  Usuario vo=new Usuario();
                  vo.setId(rs.getInt("id"));
                  vo.setLogin(rs.getString("login"));
                  vo.setClave(rs.getString("clave"));
                  vo.setTipo(rs.getString("tipo"));
                  vo.setEstado(rs.getString("estado"));
                  c.add(vo);//cargo el array
              }
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }finally{//cuando se cuelgue o sale de la memoria se ejecuta
                   this.cerrarResultSet(rs);
                   this.cerrarStatement(stmt);
                   this.cerrarConexion(con);
                }
        return c;//devuelvo el ARRAY
    }
    public Usuario insertar(Usuario vo){
    String query="insert into usuario(login,clave,tipo,estado) values(?,?,?,?)";
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    try{
        con=ConexionDB.obtenerConexion();
        stmt=con.prepareStatement(query);
        
        stmt.setString(1,vo.getLogin());
        stmt.setString(2,vo.getClave());
        stmt.setString(3,vo.getTipo());
        stmt.setString(4,vo.getEstado());
        
        int res=stmt.executeUpdate();
        if(res!=1)
        {
            throw new SQLException("No se pudo ejecutar");
        }
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }finally{//cuando se cuelgue o sale de la memoria se ejecuta
                   this.cerrarResultSet(rs);
                   this.cerrarStatement(stmt);
                   this.cerrarConexion(con);
                }
            return vo;
}
}
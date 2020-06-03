
package delivery;

import delivery.dao.UsuarioDAO;
import delivery.modelo.Categoria;
import delivery.modelo.Usuario;

public class Delivery {
    
    public static void main(String[] args) {
      /*  
        System.out.println("Hola Delivery");
        Categoria c1=new Categoria();
        c1.setIdCategoria(10);
        c1.setNombre("LCD");
        c1.setDescripcion("LED LG");
        //sin toString-->
        System.out.println(c1.getIdCategoria()+"  "+c1.getNombre()+" "+c1.getDescripcion());
    
    //con TOSTRING imprime todo las variables
        System.out.println(c1);
      */
      Delivery app=new Delivery();
      app.insertarUsuario();//llamo al metodo insertarUsuario
      
    }
   public void insertarUsuario()
   {
       Usuario user=new Usuario();
       UsuarioDAO dao=new UsuarioDAO();
       
       user.setLogin("user01");
       user.setClave("123");
       user.setTipo("A");
       user.setEstado("A");
       
       dao.insertar(user);
   }
      
}

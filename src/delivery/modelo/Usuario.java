
package delivery.modelo;

public class Usuario {
   private int id;
   private String login;
   private String clave;
   private String tipo;
   private String estado;

   public Usuario (){
        this.id = 0;
        this.login = "";
        this.clave = "";
        this.tipo = "";
        this.estado = "";
    }
    public Usuario(int id, String login, String clave, String tipo, String estado) {
        this.id = id;
        this.login = login;
        this.clave = clave;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", clave=" + clave + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
   
   
}

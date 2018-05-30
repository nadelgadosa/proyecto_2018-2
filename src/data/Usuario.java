package data;
public class Usuario {
    private String nombreUsuario, clave;

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "nombre de usuario:\t"+getNombreUsuario(); 
    }
  
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsusario) {
        this.nombreUsuario = nombreUsusario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
    public static void main(String[] args) {
    }
   
}

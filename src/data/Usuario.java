package data;

import GUI.JugadorGUI;
import java.io.Serializable;

public class Usuario implements Serializable{
    private static final long serialVersionUID = 10L;
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
    
    
    
    
    
   
}

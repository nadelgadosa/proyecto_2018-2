package proyectorol;
public class Usuario {
    private String nombreUsusario, clave;

    public Usuario(String nombreUsusario, String clave) {
        this.nombreUsusario = nombreUsusario;
        this.clave = clave;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    public String getNombreUsusario() {
        return nombreUsusario;
    }
    public void setNombreUsusario(String nombreUsusario) {
        this.nombreUsusario = nombreUsusario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public static void main(String[] args) {
    }
    // public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
}

package proyectorol;

public class Master extends Usuario {
  private int juegos, permisos;

    @Override
    public String toString() {
        Master cons = new Master();
        return "nombre de usuario: "+ cons.getNombreUsusario()+"\n numero de juegos: " + cons.getJuegos();
    }

    public Master() {
        super(null, null);
    }
  
       public Master(int juegos, int permisos, String nombreUsusario, String clave) {
        super(nombreUsusario, clave);
        this.juegos = juegos;
        this.permisos = permisos;
    }

    public int getJuegos() {
        return juegos;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    public int getPermisos() {
        return permisos;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }
   
}

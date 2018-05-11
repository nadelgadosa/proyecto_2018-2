package proyectorol;

public class Master extends Usuario {
  private int juegos, permisos;
  private Juego[] juego = new Juego[3];

    @Override
    public String toString() {
        if (juegos==1){
                return "nombre de usuario:\t"+ getNombreUsuario()+"\n numero de juegos(max4):\t" + getJuegos()+"juego #1: "+juego[0].getNombre() ;
        }else{
            if (juegos==2){
                return "nombre de usuario:\t"+ getNombreUsuario()+"\n numero de juegos(max4):\t" + getJuegos()+"juego #1: "+juego[0].getNombre()+"juego #2: "+juego[1].getNombre();
            }else{
                if (juegos==3){
                    return "nombre de usuario:\t"+ getNombreUsuario()+"\n numero de juegos(max4):\t" + getJuegos()+"juego #1: "+juego[0].getNombre()+"juego #2: "+juego[1].getNombre()+"juego #3: "+juego[2].getNombre();
                }else{
                    return "nombre de usuario:\t"+ getNombreUsuario()+"\n numero de juegos(max4):\t" + getJuegos()+"juego #1: "+juego[0].getNombre()+"juego #2: "+juego[1].getNombre()+"juego #3: "+juego[2].getNombre()+"juego #4: "+juego[3].getNombre();
                }   
            }
        }
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
    public Juego getJuego( int numeroDeJuego) {
        return juego[numeroDeJuego];
    }
    public void setJuego(Juego juego, int numeroDeJuego) {
        this.juego[numeroDeJuego] = juego;
    }
  }

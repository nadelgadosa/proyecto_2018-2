package proyectorol;
public class Jugador extends Usuario {
   private int personajes;
   private personaje personaje ;

    public Jugador(int personajes, String nombreUsuario, String clave) {
        super(nombreUsuario, clave);
        this.personajes = personajes;
    }

    public Jugador() {
        super(null, null);
    }
    
    public void crearPersonaje(String nombre, String clase, String raza, String trasfondo, String personalidad, int nivel, int xpPoints, int heallPoints, int iniciativa, int fuerza, int inteligencia, int carisma, int destreza, int sabiduria, int velocidad, int armadura, items[] equipo, items[] objetos, Habilidad[] habilidades){
    personaje = new personaje(nombre, clase, raza, trasfondo, personalidad, nivel, xpPoints, heallPoints, iniciativa, fuerza, inteligencia, carisma, destreza, sabiduria, velocidad, armadura,  equipo,  objetos,  habilidades);  
    }

    @Override
    public String toString() {
        Jugador cons = new Jugador ();
        return "nombre de usuario: " + cons.getNombreUsusario() + "\n numero de personajes: " + cons.getPersonajes();
    }
    
    public int getPersonajes() {
        return personajes;
    }
    public void setPersonajes(int personajes) {
        this.personajes = personajes;
    }
    public personaje getPersonaje() {
        return personaje;
    }
    public void setPersonaje(personaje personaje) {
        this.personaje = personaje;
    }
}

package proyectorol;
public class Jugador extends Usuario {
    
   private int personajes;
   private Personaje[] personaje = new Personaje[3] ;
   
   public Jugador(int personajes, String nombreUsuario, String clave) {
        super(nombreUsuario, clave);
        this.personajes = personajes;
    }
   
    @Override
    public String toString() {
        return " nombre de usuario: " + getNombreUsuario() + "\n numero de personajes(max 4): " + getPersonajes()+"\n\tpersonaje #1:"+personaje[0].getNombre()+"\n\tpersonaje #2"+personaje[1].getNombre()+"\n\tpersonaje #3:"+personaje[2].getNombre()+"\n\tpersonaje #4:"+personaje[3].getNombre();                                            
    }
    
    
    public void crearPersonaje(int numeroDePersonaje, String nombre, String juego, String clase, String raza, String trasfondo, String personalidad, int nivel, int xpPoints, int heallPoints, int iniciativa, int fuerza, int inteligencia, int carisma, int destreza, int sabiduria, int velocidad, int armadura, Items[] equipo, Items[] objetos, Habilidad[] habilidades, Habilidad [] habilidadesEspeciales){
    personaje[numeroDePersonaje] = new Personaje(nombre, juego, clase, raza, trasfondo, personalidad, nivel, xpPoints, heallPoints, iniciativa, fuerza, inteligencia, carisma, destreza, sabiduria, velocidad, armadura,  equipo,  objetos,  habilidades, habilidadesEspeciales);  
    }
    
    
    
    public Jugador() {
        super(null, null);
    }
    public int getPersonajes() {
        return personajes;
    }
    public void setPersonajes(int personajes) {
        this.personajes = personajes;
    }
    
    public Personaje getPersonaje(int numeroDePersonaje) {
        return personaje[numeroDePersonaje];
    }
    public void setPersonaje(Personaje personaje, int numeroDePersonaje) {
        this.personaje[numeroDePersonaje] = personaje;
    }
   
}

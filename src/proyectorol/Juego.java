package proyectorol;
public class Juego {
   private Monstruo[] monstruos ;
   private String historia, nombre;
   private int numeroDeJugadores ;
   private Jugador[] jugadores = new Jugador[5];
   private Items [] itemsAUsar = new Items [7] ;
   private Vitacora[] vitacora ; 
   private Personaje [] NPCs =  new Personaje [3] ;
   private Maps[] mapas ;

    public Juego(Monstruo[] monstruos, String historia, int numeroDeJugadores, Jugador[] jugadores, Items[] itemsAUsar, Personaje[] NPCs, Vitacora[] vitacora, Maps[] mapas, String nombre) {
        this.monstruos = monstruos;
        this.nombre = nombre;
        this.historia = historia;
        this.numeroDeJugadores = numeroDeJugadores;
        this.jugadores = jugadores;
        this.itemsAUsar = itemsAUsar;
        this.NPCs = NPCs;
        this.vitacora = vitacora;
        this.mapas = mapas;
    }

    @Override
    public String toString() {
        return "nombre: "+getNombre()+"\nnumero de jugadores: "+getNumeroDeJugadores()+"\nultima sesion: #"+(vitacora.length+1)+" "+vitacora[vitacora.length].getFecha()+"\n\t"+vitacora[vitacora.length].getProgreso();
    }
    
    public void crearVitacora(int numeroDeVitacora,Vitacora vitacora){
        this.vitacora[numeroDeVitacora-1]= vitacora;
    
}

    public Juego() {
    }
    public Vitacora[] getVitacora() {
        return vitacora;
    }
    public void setVitacora(Vitacora[] vitacora) {
        this.vitacora = vitacora;
    }
    public Maps[] getMapas() {
        return mapas;
    }
    public void setMapas(Maps[] mapas) {
        this.mapas = mapas;
    }
    public Monstruo[] getMonstruos() {
        return monstruos;
    }
    public void setMonstruos(Monstruo[] monstruos) {
        this.monstruos = monstruos;
    }
    public String getHistoria() {
        return historia;
    }
    public void setHistoria(String historia) {
        this.historia = historia;
    }
    public int getNumeroDeJugadores() {
        return numeroDeJugadores;
    }
    public void setNumeroDeJugadores(int numeroDeJugadores) {
        this.numeroDeJugadores = numeroDeJugadores;
    }
    public Jugador[] getJugadores() {
        return jugadores;
    }
    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    public Items[] getItemsAUsar() {
        return itemsAUsar;
    }
    public void setItemsAUsar(Items[] itemsAUsar) {
        this.itemsAUsar = itemsAUsar;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Personaje[] getNPCs() {
        return NPCs;
    }
    public void setNPCs(Personaje[] NPCs) {
        this.NPCs = NPCs;
    }
    
}

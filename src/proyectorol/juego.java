package proyectorol;
public class juego {
    monstruo monstruos[];
    String histori;
    int numeroDeJugadores ;
    Jugador jugadores [];
    items itemsAUsar [];
    
    personaje NPCs [];

    public juego(monstruo[] monstruos, String histori, int numeroDeJugadores, Jugador[] jugadores, items[] itemsAUsar, personaje[] NPCs) {
        this.monstruos = monstruos;
        this.histori = histori;
        this.numeroDeJugadores = numeroDeJugadores;
        this.jugadores = jugadores;
        this.itemsAUsar = itemsAUsar;
        this.NPCs = NPCs;
    }

    @Override
    public String toString() {
        return "";
    }

    public monstruo[] getMonstruos() {
        return monstruos;
    }
    public void setMonstruos(monstruo[] monstruos) {
        this.monstruos = monstruos;
    }
    public String getHistori() {
        return histori;
    }
    public void setHistori(String histori) {
        this.histori = histori;
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
    public items[] getItemsAUsar() {
        return itemsAUsar;
    }
    public void setItemsAUsar(items[] itemsAUsar) {
        this.itemsAUsar = itemsAUsar;
    }
    public personaje[] getNPCs() {
        return NPCs;
    }
    public void setNPCs(personaje[] NPCs) {
        this.NPCs = NPCs;
    }
}

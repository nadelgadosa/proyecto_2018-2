package data;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class Juego implements Serializable{
   private Monstruo[] monstruos ;
   private String historia, nombre;
   private int numeroDeJugadores ;
   private String[] jugadores = new String[5];
   private Items [] itemsAUsar = new Items [7] ;
   private Vitacora[] vitacora ; 
   private String [] NPCs =  new String [3] ;
   private Maps[] mapas ;

    public Juego(Monstruo[] monstruos, String historia, int numeroDeJugadores, String[] jugadores, Items[] itemsAUsar, String[] NPCs, Vitacora[] vitacora, Maps[] mapas, String nombre) {
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
    
    public boolean saveJuego(Juego juego){
        boolean bool = false ;
        System.out.println("entra al metodo salvar juego");
        final Path archivoSer = new File("data\\Master\\"+juego.getNombre()+".ser").toPath();
        System.out.println("crea el final path con "+juego.getNombre());
        try {
            System.out.println("entra al try catch");
            final ObjectOutputStream guardarJuego = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            System.out.println("crea el outputStream ");
            guardarJuego.writeObject(juego);
            guardarJuego.close();
            bool= true;
            System.out.println("crea el objeto y asigan el valor 'true' a la variable a retornar");        
        } catch (Exception ex) {
            System.out.println("se sale del try catch de saveJuego-Juego por:"+ex); 
        }
        
        return bool;
    }
     public Juego leerObjetoJuego(String nombreObjeto){
        Juego objeto = new Juego();
      try{
            
            final Path archivoSer = new File("data\\NPCs\\"+nombreObjeto+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objeto  = (Juego)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
                System.out.println(e);   
        }  
      return objeto;
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
    public String[] getJugadores() {
        return jugadores;
    }
    public void setJugadores(String[] jugadores) {
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
    public String[] getNPCs() {
        return NPCs;
    }
    public void setNPCs(String[] NPCs) {
        this.NPCs = NPCs;
    }
    
}

package proyectorol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
    
    
    
    
    
    public Jugador BuscarUsuario(String user){
        
        Jugador jugador = new Jugador();
        try{
            
            final Path archivoSer = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyectoRol\\data\\Jugador\\"+user+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            jugador = (Jugador)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
            
        }
        return jugador;
    }
    
    public boolean verificarIngreso(Jugador jugador, String clave){
        boolean aux;
        if(jugador.getClave()== clave){
            aux = true;
        }else{
            aux = false;
        }
        
        
        return aux;
    }
    
    public String [] listaDePersonajes(String user){
        String [] personajes = null;
        int i=0;
         try {
            File inFile = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyectoRol\\data\\Jugador\\"+user+".txt");
            FileReader fR = new FileReader(inFile);
            Scanner in = new Scanner(inFile);      
            while(in.hasNext()){
                 
                 personajes [i] = in.next();
                 i++;
                 
            }
            in.close();           
        } catch (FileNotFoundException ex) {
             System.out.println(ex);
        } 
        return personajes;
    }
    
    public Personaje[] listaDeObjetosPersonaje (String [] nombresDeArchivos){
        int i = nombresDeArchivos.length;
        Personaje[] objetos = new Personaje[i];
        for (int j = 0; j <= i ; j++) {
            try{
            
            final Path archivoSer = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyectoRol\\data\\Jugador\\"+nombresDeArchivos[j]+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objetos [j] = (Personaje)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
                System.out.println(e);   
        }
        }
        return objetos ;
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

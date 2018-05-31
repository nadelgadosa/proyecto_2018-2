package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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
        System.out.println("entra al metodo buscar usuario en data");
        Jugador jugador = new Jugador();
        final Path archivoSer = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyectoRol\\data\\Jugador\\"+user+".ser").toPath();
        try{
            
           
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            jugador = (Jugador)leerUsuario.readObject();
            leerUsuario.close();
            
            
        }catch(Exception e){
            System.out.println("no entra al try chatch de buscar usuario");
        }
        return jugador;
    }
    
    public boolean verificarIngreso(Jugador jugador, String clave){
        System.out.println("entra al metodo verificar ingreso");
        boolean aux;
        System.out.println(jugador.getClave());
        if(jugador.getClave()== clave){
            System.out.println("clave correcta");
            aux = true;
        }else{
            System.out.println("clave incorrecta");
            aux = false;
        }
        
        
        return aux;
    }
    
    public String [] listaDePersonajes(String user){
        System.out.println("ingresa al metodo lista de personajes de data");
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
             System.out.println("lee la lista de los personajes (metodo de data)");
        } catch (FileNotFoundException ex) {
             System.out.println(ex);
        } 
        return personajes;
    }
    
    public Personaje[] listaDeObjetosPersonaje (String [] nombresDeArchivos){
        System.out.println("entra al metodo para leer los objetos personaje de la data, metodo de data");
        int i = nombresDeArchivos.length;
        Personaje[] objetos = new Personaje[3];
        for (int j = 0; j <= i ; j++) {
            try{
            
            final Path archivoSer = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyectoRol\\data\\Jugador\\"+nombresDeArchivos[j]+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objetos [j] = (Personaje)leerUsuario.readObject();
            leerUsuario.close();
                System.out.println("lee objetos personaje(los .ser)");
        }catch(Exception e){
                System.out.println("no lee los .ser");
                System.out.println(e);   
        }
        }
        return objetos ;
    }
    
    public String descripcionDePersonaje(Personaje [] personaje, int i){
        if(personaje[i]==null){
          return "new";  
        }else{
       return personaje[i].toString(); 
    }
        
        
        
    }
    
    public void crearObjetoJugador(String usuario, String contraseña, String ruta){
                     
        try {
            File outFile = new File (ruta+".txt");
            PrintWriter pW = new PrintWriter(outFile);
            pW.close();
            System.out.println("se creo el .txt");
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
         
        Jugador cons = new Jugador();
        cons.setNombreUsuario(usuario);
        cons.setClave(contraseña);
        cons.setPersonajes(0);
        cons.setPersonaje( null , cons.getPersonajes());
        final Path archivoSer = new File(ruta+".ser").toPath();
        try {
            final ObjectOutputStream guardarJugador = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarJugador.writeObject(cons);// no se ejecuta desde esta linea, y se salta el resto del try catch, la linea de arriva crea un archivo .ser que no se puede usar
            System.out.println("se creo el .ser");
            guardarJugador.close();
        } catch (Exception ex) {
            
        }
        
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

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
     
    
    
    public Master BuscarUsuario(String user){
        
        Master master = new Master();
        try{
            
            final Path archivoSer = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyectoRol\\data\\Master\\"+user+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            master = (Master)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
            
        }
        return master;
    }
    
    public boolean verificarIngreso(Master master, String clave){
        boolean aux;
        if(master.getClave()== clave){
            aux = true;
        }else{
            aux = false;
        }
        
        
        return aux;
    }
    
    public String [] listaDeJuegos(String user){
        String [] juegos = null;
        int i=0;
         try {
            File inFile = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyectoRol\\data\\Master\\"+user+".txt");
            FileReader fR = new FileReader(inFile);
            Scanner in = new Scanner(inFile);      
            while(in.hasNext()){
                 
                 juegos [i] = in.next();
                 i++;
                 
            }
            in.close();           
        } catch (FileNotFoundException ex) {
             System.out.println(ex);
        } 
        return juegos;
    }
    
    public Juego[] listaDeObjetosJuegos (String [] nombresDeArchivos){
        int i = nombresDeArchivos.length;
        Juego[] objetos = new Juego[i];
        for (int j = 0; j <= i ; j++) {
            try{
            
            final Path archivoSer = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyectoRol\\data\\Master\\"+nombresDeArchivos[j]+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objetos [j] = (Juego)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
                System.out.println(e);   
        }
        }
        return objetos ;
    }
    
    public String Juego(Juego [] juego, int i){
        if(juego[i]==null){
          return "new";  
        }else{
       return juego[i].toString(); 
    }    
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

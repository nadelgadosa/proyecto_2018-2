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
         System.out.println("entra al metodo buscar usuario de data");
        Master master = new Master();
        try{
            System.out.println("entra al try catch");
            final Path archivoSer = new File("data\\Master\\"+user+".ser").toPath();
            System.out.println("crea el final path");
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            System.out.println("crea el inputStream");
            master = (Master)leerUsuario.readObject();
            leerUsuario.close();
            System.out.println("lee el usuario   "+ master.getClave());
            
            
        }catch(Exception e){
            System.out.println("no entra al try catch"); 
        }
        return master;
    }
    
    public boolean verificarIngreso(Master master, String clave){
        System.out.println("entra a meto verificar ingreso");
        boolean aux;
        String a=master.getClave();
        System.out.println(master.getClave()+"-"+clave);
        if(clave.equals(a)){
            System.out.println("clave correcta");
            aux = true;
        }else{
            System.out.println("clave incorrecta");
            aux = false;
        }
        
        System.out.println("retorna el booleano");
        return aux;
    }
    
    public String [] listaDeJuegos(String user){
        String [] juegos = null;
        int i=0;
         try {
            File inFile = new File("data\\Master\\"+user+".txt");
            FileReader fR = new FileReader(inFile);
            Scanner in = new Scanner(inFile);  
            
            
            if(in.hasNext()){
                while(in.hasNext()){
                 
                    juegos [i] = in.next();
                    i++;
                 
                }    
             }
            
            
            in.close();           
        } catch (FileNotFoundException ex) {
             System.out.println(ex);
        } 
        return juegos;
    }
    
    public Juego[] listaDeObjetosJuegos (String [] nombresDeArchivos){
        System.out.println("entra al metodo lista de objetos juegos ");
        
        
        Juego[] objetos = new Juego[3];
        objetos = null;
        for (int j = 0; j <= 3 ; j++) {
            System.out.println("entra al for del metodo");
            try{
            
            final Path archivoSer = new File("data\\Master\\"+nombresDeArchivos[j]+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objetos [j] = (Juego)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
            System.out.println("no lee los .ser, por que no existen");
                System.out.println(e);   
        }
        }
        System.out.println("retorna el arreglo de objetos, asi este vacio");
        return objetos ;
    }
    
    
    
    public String descripcionDeJuego(Juego [] juego, int i){
       System.out.println("entra al metodo descripcion de Juego");
        try{  
            return juego[i].toString(); 
        }catch(Exception e){
            
            System.out.println(e);
            return "new";
        }
        
        
        
    }
    
    public void crearObjetoMaster(String usuario, String contraseña, String ruta){
        File outFile = new File (ruta+".txt");
        try {
            
            PrintWriter pW = new PrintWriter(outFile);
            pW.close();
            System.out.println("se creo el .txt");
        } catch (IOException ex) {
            Logger.getLogger(Master.class.getName()).log(Level.SEVERE, null, ex);
        }
        Master cons = new Master();
        cons.setNombreUsuario(usuario);
        cons.setClave(contraseña);
        cons.setJuegos(0);
        cons.setJuego(null, cons.getJuegos());
        cons.setPermisos(0);
        try{
            final Path archivoSer = new File(ruta+".ser").toPath();
            final ObjectOutputStream guardarMaster = new  ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarMaster.writeObject(cons);
            System.out.println("se creo el .ser");
            guardarMaster.close();
        }catch(Exception e){
            
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

    public void setJuego(Juego[] juego) {
        this.juego = juego;
    }
  
}

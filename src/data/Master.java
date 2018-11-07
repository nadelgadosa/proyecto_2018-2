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
import java.util.ArrayList;
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
            System.out.println("se sale del try catch por: "+e); 
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
        System.out.println("entra al metodo lista de juegos");
        String aux;
        String [] arregloDeNombresDeJuegos = new String[3];
        
        ;
        
        
        System.out.println("crea las instancias para trabajar objetos");
         try {
             System.out.println("entra al try catch");
            File inFile = new File("data\\Master\\"+user+".txt");
             System.out.println("crea el file");
            FileReader fR = new FileReader(inFile);
             System.out.println("crea el file reader");
            Scanner in = new Scanner(inFile);  
             System.out.println("crea el scanner");
             if(in.hasNext()){//
                  aux = in.next();
                    arregloDeNombresDeJuegos[0] = aux;
                    System.out.println("asigna valores al arreglo de Strings donde estan los nombres de los juegos "+ arregloDeNombresDeJuegos[0]+"    "+aux);  
                    if(in.hasNext()){
                        aux= in.next();
                        arregloDeNombresDeJuegos[1] = aux;
                        System.out.println("asigna valores al arreglo de Strings donde estan los nombres de los juegos "+ arregloDeNombresDeJuegos[1]+"    "+aux);
                        if(in.hasNext()){
                            aux= in.next();
                            arregloDeNombresDeJuegos[2] = aux;
                            System.out.println("asigna valores al arreglo de Strings donde estan los nombres de los juegos "+ arregloDeNombresDeJuegos[2]+"    "+aux);
                            if(in.hasNext()){
                                aux= in.next();
                                arregloDeNombresDeJuegos[3] = aux;
                                System.out.println("asigna valores al arreglo de Strings donde estan los nombres de los juegos "+ arregloDeNombresDeJuegos[3]+"    "+aux);
                            }
                        }
                    }
             }//
                    
                    
            
            
            in.close();           
        } catch (FileNotFoundException ex) {
             System.out.println(ex);
        } 
         System.out.println("debuelbe el arreglo de Strings");
        return arregloDeNombresDeJuegos;
    }
    
    public Juego[] listaDeObjetosJuegos (String [] nombresDeArchivos){
        System.out.println("entra al metodo lista de objetos juegos ");
        
        
        Juego[] objetos = new Juego[3];
        Juego aux=null;
        
        String [] arreglo = new String[3];
        arreglo = nombresDeArchivos;
        
        
            System.out.println("entra al for del metodo");
            
            try{
                System.out.println("entra al inicio del try cathc");
            
                if(arreglo[0]!= null){
                    final Path archivoSer = new File("data\\Master\\"+arreglo[0]+".ser").toPath();
                    System.out.println("crea el path de :"+arreglo[0]);
                    final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
                    System.out.println("crea el inputStream");
                    aux = (Juego)leerUsuario.readObject();
                    System.out.println("asigno el objeto");
                    objetos[0]=aux;      
                    System.out.println("asigna el objeto al array de objetos");
                    leerUsuario.close();
                    if(arreglo[1]!= null){
                        final Path archivoSer2 = new File("data\\Master\\"+arreglo[1]+".ser").toPath();
                        System.out.println("crea el path de :"+arreglo[0]);
                        final ObjectInputStream leerUsuario2 = new ObjectInputStream(Files.newInputStream(archivoSer2));
                        System.out.println("crea el inputStream");
                        aux = (Juego)leerUsuario2.readObject();
                        System.out.println("asigno el objeto");
                        objetos[1]=aux;      
                        System.out.println("asigna el objeto al array de objetos2");
                        leerUsuario.close();
                        if(arreglo[2]!= null){
                            final Path archivoSer3 = new File("data\\Master\\"+arreglo[2]+".ser").toPath();
                            System.out.println("crea el path de :"+arreglo[0]);
                            final ObjectInputStream leerUsuario3 = new ObjectInputStream(Files.newInputStream(archivoSer3));
                            System.out.println("crea el inputStream");
                            aux = (Juego)leerUsuario3.readObject();
                            System.out.println("asigno el objeto");
                            objetos[2]=aux;      
                            System.out.println("asigna el objeto al array de objetos3");
                            leerUsuario.close();
                            if(arreglo[3]!= null){
                                final Path archivoSer4 = new File("data\\Master\\"+arreglo[3]+".ser").toPath();
                                System.out.println("crea el path de :"+arreglo[0]);
                                final ObjectInputStream leerUsuario4 = new ObjectInputStream(Files.newInputStream(archivoSer4));
                                System.out.println("crea el inputStream");
                                aux = (Juego)leerUsuario4.readObject();
                                System.out.println("asigno el objeto");
                                objetos[3]=aux;      
                                System.out.println("asigna el objeto al array de objetos4");
                                leerUsuario.close();
                            }
                        }
                    }
                }
            
            
        }catch(Exception e){
            System.out.println("no lee los .ser, por que no existen");
                System.out.println(e);   
        }
        
        System.out.println("retorna el arreglo de objetos, asi este vacio");
        return objetos ;
    }
    
    public String descripcionDeJuego(String  juego){
       System.out.println("entra al metodo descripcion de Juego");
      
          if (juego!= null){
              return juego;
          }else{
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
       
    public void actualizarLista (String usuario, String ruta, String nombre){
             ArrayList lista = new ArrayList();
        try {
            Scanner sc = new Scanner(new File(ruta+".txt"));
            while(sc.hasNext()){
                lista.add(sc.nextLine());
            }
            
            lista.add(nombre);
            File outFile = new File(ruta+".txt");
            PrintWriter pw = new PrintWriter(outFile);
            for (int i = 0; i < lista.size(); i++) {
                
                pw.println(lista.get(i));
            }
            pw.close();
        } catch (Exception e) {
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
        System.out.println("asignacion exitosa");
    }
  
}

package data;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Habilidad implements Serializable{
    
    
private String descripcion, nombre;
private int modificador, usos;


    public Habilidad(String descripcion, String nombre, int modificador, int usos) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.modificador = modificador;
        this.usos = usos;
    }
    @Override
    public String toString() {
        return "nombre: "+getNombre()+"\ndescripcion: "+getDescripcion()+"\nmodificador: "+getModificador()+"\nusos: "+getUsos(); 
    }
    
    
    
    
    
     public void saveHabilidad(Habilidad habilidad){
        
        
        final Path archivoSer = new File("data\\Habilidades\\"+habilidad.getNombre()+".ser").toPath();
        try {
            final ObjectOutputStream guardarHabilidad = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarHabilidad.writeObject(habilidad);
            guardarHabilidad.close();
        } catch (Exception ex) {
            
        }
        
        
    }
     
     public Habilidad leerObjetoHabilidad(String nombreObjeto){
        Habilidad objeto = new Habilidad();
        try{
            
            final Path archivoSer = new File("data\\Habilidades\\"+nombreObjeto+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objeto  = (Habilidad)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
                System.out.println(e);   
        } 
        
        
        return objeto;
    }
     
      public void actualizarLista(String nombre) {
       ArrayList lista = new ArrayList();
        try {
            Scanner sc = new Scanner(new File("data\\Habilidades\\Habilidades.txt"));
            while(sc.hasNext()){
                lista.add(sc.nextLine());
            }
            
            lista.add(nombre);
            File outFile = new File("data\\Habilidades\\Habilidades.txt");
            PrintWriter pw = new PrintWriter(outFile);
            for (int i = 0; i < lista.size(); i++) {
                
                pw.println(lista.get(i));
            }
            pw.close();
        } catch (Exception e) {
        }
       
    }
     
      public ArrayList<String> leerListaHabilidades() {
        ArrayList<String> listaNombres = new ArrayList();
        try {
            Scanner sc = new Scanner(new File("data\\Habilidades\\Habilidades.txt"));
             while(sc.hasNext()){
                listaNombres.add(sc.nextLine());
             }
                
            }catch(Exception e){
                System.out.println(e);
            }
        return listaNombres;
        
    }
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    public Habilidad() {
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getModificador() {
        return modificador;
    }
    public void setModificador(int modificador) {
        this.modificador = modificador;
    }
    public int getUsos() {
        return usos;
    }
    public void setUsos(int usos) {
        this.usos = usos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    
    
    
    
}

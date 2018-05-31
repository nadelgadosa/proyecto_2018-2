package data;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Items {
    String nombre, descripcion;
    int modificador, nivel;

    public Items() {
    }
    public Items(String nombre, String descripcion, int modificador, int nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.modificador = modificador;
        this.nivel = nivel;
    }
    @Override
    public String toString() {
        Items cons =  new Items();
        return "Nombre del objeto:\t" +getNombre()+ "\ndescripcion:\t"+ getDescripcion()+ "\n\tnivel: "+ getNivel()+"\n\tmodificador: "+getModificador();
    }
    
    
    
    
    
    public void saveItem(Items item){
        
        
        final Path archivoSer = new File(item.getNombre()).toPath();
        try {
            final ObjectOutputStream guardarItem = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarItem.writeObject(item);
            guardarItem.close();
        } catch (Exception ex) {
            
        }
        
        
    }
    public Items leerObjetoItem(String nombreObjeto){
        Items objeto = new Items();
        try{
            
            final Path archivoSer = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyecto_rol\\data\\Items\\"+nombreObjeto+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objeto  = (Items)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
                System.out.println(e);   
        } 
        
        
        return objeto;
    }
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

package proyectorol;

import java.io.File;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Maps {
    
    
 private String nombre, descripcion, link;  
//jpg 
    public Maps(String nombre, String descripcion, String link) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.link = link;
    }
    @Override
    public String toString() {
        return "nombre: "+getNombre()+"\ndescripcion: "+getDescripcion()+"\nlink: "+getLink(); 
    }
    
    
    
    
    
    public void saveMaps(Maps maps){
        
        
        final Path archivoSer = new File(maps.getNombre()).toPath();
        try {
            final ObjectOutputStream guardarMapa = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarMapa.writeObject(maps);
            guardarMapa.close();
        } catch (Exception ex) {
            
        }
        
        
    }
     
    
    
    
    
    
    public Maps() {
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
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
}

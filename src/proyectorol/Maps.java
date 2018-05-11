package proyectorol;
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
        return ""; 
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

package proyectorol;
public class Habilidad {
    
    
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

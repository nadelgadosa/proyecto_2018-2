package proyectorol;
public class items {
    String nombre, descripcion;
    int modificador, nivel;

    public items() {
    }

    public items(String nombre, String descripcion, int modificador, int nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.modificador = modificador;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        items cons =  new items();
        return "Nombre del objeto: " +cons.getNombre()+ "\ndescripcion: "+ cons.getDescripcion()+ "\nnivel: "+ cons.getNivel()+"\nmodificador: "+ cons.getModificador();
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

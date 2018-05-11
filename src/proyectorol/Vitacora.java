package proyectorol;
public class Vitacora {
  private int numeroDeVitacora ; 
  private String fecha, progreso;
  private String [][] items;

    public Vitacora(int numeroDeVitacora, String fecha, String progreso, String[][] items) {
        this.numeroDeVitacora = numeroDeVitacora;
        this.fecha = fecha;
        this.progreso = progreso;
        this.items = items;
    }
 
    @Override
    public String toString() {
        return "numero de vitacora: "+getNumeroDeVitacora()+"\nfecha: "+getFecha()+"\nprogreso: "+getProgreso()+"\nitems: "+getItems(); 
    }
    
    public Vitacora() {
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getProgreso() {
        return progreso;
    }
    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }
    public String[][] getItems() {
        return items;
    }
    public void setItems(String[][] items) {
        this.items = items;
    }
    public int getNumeroDeVitacora() {
        return numeroDeVitacora;
    }
    public void setNumeroDeVitacora(int numeroDeVitacora) {
        this.numeroDeVitacora = numeroDeVitacora;
    }
    
}

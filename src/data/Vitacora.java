 package data;

import java.io.File;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Vitacora {
  private int numeroDeVitacora ; 
  private String fecha, progreso;
  

    public Vitacora(int numeroDeVitacora, String fecha, String progreso, String[][] items) {
        this.numeroDeVitacora = numeroDeVitacora;
        this.fecha = fecha;
        this.progreso = progreso;
        
    }
    @Override
    public String toString() {
        return "numero de vitacora: "+getNumeroDeVitacora()+"\nfecha: "+getFecha()+"\nprogreso: "+getProgreso(); 
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
    public int getNumeroDeVitacora() {
        return numeroDeVitacora;
    }
    public void setNumeroDeVitacora(int numeroDeVitacora) {
        this.numeroDeVitacora = numeroDeVitacora;
    }
    
}

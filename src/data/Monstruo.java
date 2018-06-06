package data;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class Monstruo implements Serializable{
 private String nombre;
 private int nivel, xpPoints, heallPoints, iniciativa, fuerza, inteligencia, carisma, destreza, sabiduria;
 private Habilidad[] habilidades = new Habilidad[2];
 private Items[] items = new Items[2];

    public Monstruo(String nombre, int nivel, int xpPoints, int heallPoints, int iniciativa, int fuerza, int inteligencia, int carisma, int destreza, int sabiduria, Habilidad [] habilidades, Items[] items) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.xpPoints = xpPoints;
        this.heallPoints = heallPoints;
        this.iniciativa = iniciativa;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.destreza = destreza;
        this.sabiduria = sabiduria;
        this.habilidades = habilidades;
        this.items = items;
 
    }
    @Override
    public String toString() {
        return "nombre:\t"+getNombre()+"\nnivel:"+getNivel()+"\n\tpuntos de experiencia: "+getXpPoints()+"\n\tvida: "+getHeallPoints()+"\n\tiniciativa: "+ getIniciativa()+"\n\tfuerza: "+getFuerza()+"\n\tinteligencia: "+getInteligencia()+"\n\tcarisma: "+getCarisma()+"\n\tdestreza: "+getDestreza()+"\n\tsabiduria: "+getSabiduria()+"\n\thabilidad #1: "+habilidades[0].getNombre()+"\n\thabilidad #2: "+habilidades[1].getNombre()+"\n\thabilidad #3: "+habilidades[2].getNombre()+"\n\titem #1: "+items[0].getNombre()+"\n\titem #2: "+items[1].getNombre()+"\n\titem #3: "+items[2].getNombre();                                                                                                                      
        
        }

    public Monstruo() {
    }
    
    
    
    
    public void saveMonstruo(Monstruo monstruo){
        
        
        final Path archivoSer = new File(monstruo.getNombre()).toPath();
        try {
            final ObjectOutputStream guardarMonstruo = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarMonstruo.writeObject(monstruo);
            guardarMonstruo.close();
        } catch (Exception ex) {
            
        }
        
        
    }
    public Monstruo leerObjetoMonstruo(String nombreObjeto){
        Monstruo objeto = new Monstruo();
        try{
            
            final Path archivoSer = new File("data\\Monstruos\\"+nombreObjeto+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objeto  = (Monstruo)leerUsuario.readObject();
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
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getXpPoints() {
        return xpPoints;
    }
    public void setXpPoints(int xpPoints) {
        this.xpPoints = xpPoints;
    }
    public int getHeallPoints() {
        return heallPoints;
    }
    public void setHeallPoints(int heallPoints) {
        this.heallPoints = heallPoints;
    }
    public int getIniciativa() {
        return iniciativa;
    }
    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getCarisma() {
        return carisma;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    public int getSabiduria() {
        return sabiduria;
    }
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public Habilidad[] gethabilidades() {
        return habilidades;
    }
    public void setHabilidades(Habilidad[] habilidades) {
        this.habilidades = habilidades;
    }
    public Items[] getItems() {
        return items;
    }
    public void setItems(Items[] items) {
        this.items = items;
    }
    
    
   
   
  
}

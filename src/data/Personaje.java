package data;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Personaje {
   private String nombre, clase, raza, trasfondo, personalidad, juego;
   private int nivel, xpPoints, heallPoints, iniciativa, fuerza, inteligencia, carisma, destreza, sabiduria, velocidad, armadura;
   private Items equipo [], objetos [];
   private Habilidad[] habilidades= new Habilidad[2] ;
  
   private Habilidad[] habilidadesEspeciales = new Habilidad[2];
    public Personaje(String nombre, String juego, String clase, String raza, String trasfondo, String personalidad, int nivel, int xpPoints, int heallPoints, int iniciativa, int fuerza, int inteligencia, int carisma, int destreza, int sabiduria, int velocidad, int armadura, Items[] equipo, Items[] objetos, Habilidad[] habilidades, Habilidad[] habilidadesEspeciales) {
        this.nombre = nombre;
        this.clase = clase;
        this.raza = raza;
        this.trasfondo = trasfondo;
        this.personalidad = personalidad;
        this.nivel = nivel;
        this.xpPoints = xpPoints;
        this.heallPoints = heallPoints;
        this.iniciativa = iniciativa;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.destreza = destreza;
        this.sabiduria = sabiduria;
        this.velocidad = velocidad;
        this.armadura = armadura;
        this.equipo = equipo;
        this.objetos = objetos;
        this.habilidades = habilidades;
        this.habilidadesEspeciales = habilidadesEspeciales;
        this.juego = juego;
    }
    @Override
    public String toString() {
        return "nombre: "+getNombre()+"\nraza: "+ getRaza()+"\nclase: "+getClase()+"\njuego: "+ getJuego(); 
    }
    public Personaje() {
    }
    
    
    
    
    
    
    public void savePersonaje(Personaje personaje){
        
        
        final Path archivoSer = new File("data\\NPCs\\"+personaje.getNombre()+".ser").toPath();
        try {
            final ObjectOutputStream guardarPersonaje = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarPersonaje.writeObject(personaje);
            guardarPersonaje.close();
        } catch (Exception ex) {
            
        }
        
        
    }
    
    public Personaje leerObjetoPersonaje(String nombreObjeto){
        Personaje objeto = new Personaje();
      try{
            
            final Path archivoSer = new File("data\\NPCs\\"+nombreObjeto+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objeto  = (Personaje)leerUsuario.readObject();
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
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getTrasfondo() {
        return trasfondo;
    }
    public void setTrasfondo(String trasfondo) {
        this.trasfondo = trasfondo;
    }
    public String getPersonalidad() {
        return personalidad;
    }
    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
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
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getArmadura() {
        return armadura;
    }
    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    public Items[] getEquipo() {
        return equipo;
    }
    public void setEquipo(Items[] equipo) {
        this.equipo = equipo;
    }
    public Items[] getObjetos() {
        return objetos;
    }
    public void setObjetos(Items[] objetos) {
        this.objetos = objetos;
    }

    public String getJuego() {
        return juego;
    }
    public void setJuego(String juego) {
        this.juego = juego;
    }
    
    
    public Habilidad[] getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(Habilidad[] habilidades) {
        this.habilidades = habilidades;
    }
    public Habilidad[] getHabilidadesEspeciales() {
        return habilidadesEspeciales;
    }
    public void setHabilidadesEspeciales(Habilidad[] habilidadesEspeciales) {
        this.habilidadesEspeciales = habilidadesEspeciales;
    }

    
    public Habilidad getHabilidades(int numeroDeHabilidad) {
        return habilidades[numeroDeHabilidad];
    }
    public void setHabilidades(Habilidad habilidades, int numeroDeHabilidad) {
        this.habilidades[numeroDeHabilidad] = habilidades;
    }
    public Habilidad getHabilidadesEspeciales(int numeroDeHabilidad) {
        return habilidadesEspeciales [numeroDeHabilidad];
    }
    public void setHabilidadesEspeciales(Habilidad habilidadesEspeciales, int numeroDeHabilidad) {
        this.habilidadesEspeciales [numeroDeHabilidad] = habilidadesEspeciales;
    }
}

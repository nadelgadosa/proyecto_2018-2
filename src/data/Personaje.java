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
import javax.swing.JOptionPane;

public class Personaje implements Serializable{
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
        return "nombre: "+getNombre()+"\nraza: "+ getRaza()+"\nclase: "+getClase(); 
    }
    public Personaje() {
    }
    
    public boolean savePersonajeNPC(Personaje personaje){
        final Path archivoSer = new File("data\\NPCs\\"+personaje.getNombre()+".ser").toPath();
        try {
            final ObjectOutputStream guardarPersonaje = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarPersonaje.writeObject(personaje);
            guardarPersonaje.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
        
        
    }
    public boolean savePersonaje(Personaje personaje){
        final Path archivoSer = new File("data\\NPCs\\"+personaje.getNombre()+".ser").toPath();
        try {
            final ObjectOutputStream guardarPersonaje = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarPersonaje.writeObject(personaje);
            guardarPersonaje.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
        
        
    }
    public boolean savePersonajeMonstruo(Personaje personaje){
        final Path archivoSer = new File("data\\Monstruos\\"+personaje.getNombre()+".ser").toPath();
        try {
            final ObjectOutputStream guardarPersonaje = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            guardarPersonaje.writeObject(personaje);
            guardarPersonaje.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
        
        
    }
    public Personaje leerObjetoPersonajeMonstruo(String nombreObjeto){
        Personaje objeto = new Personaje();
      try{
            
            final Path archivoSer = new File("data\\Monstruos\\"+nombreObjeto+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objeto  = (Personaje)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
                System.out.println(e);   
        }  
      return objeto;
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
    public ArrayList<String> leerListaNPCs() {
        ArrayList<String> listaNombres = new ArrayList();
        try {
            Scanner sc = new Scanner(new File("data\\NPCs\\NPCs.txt"));
             while(sc.hasNext()){
                listaNombres.add(sc.nextLine());
             }
                
            }catch(Exception e){
                System.out.println(e);
            }
        return listaNombres;
        
    }
    public ArrayList<String> leerListaMonstruos() {
        ArrayList<String> listaNombres = new ArrayList();
        try {
            Scanner sc = new Scanner(new File("data\\Monstruos\\Monstruos.txt"));
             while(sc.hasNext()){
                listaNombres.add(sc.nextLine());
             }
                
            }catch(Exception e){
                System.out.println(e);
            }
        return listaNombres;
        
    }
     
    public void actualizarListaNPCs(String nombre) {
       ArrayList lista = new ArrayList();
       String aux;
       try {
            Scanner sc = new Scanner(new File("data\\NPCs\\NPCs.txt"));
           while(sc.hasNext()){                                                
                aux=sc.nextLine();
                if(aux.equals(nombre)){
                }else
                lista.add(aux);
            }
            lista.add(nombre);
            File outFile = new File("data\\NPCs\\NPCs.txt");
            PrintWriter pw = new PrintWriter(outFile);
            for (int i = 0; i < lista.size(); i++) {
                
                pw.println(lista.get(i));
            }
            pw.close();
        } catch (Exception e) {
        }
       
    }
    public void actualizarListaMonstruos(String nombre) {
       ArrayList lista = new ArrayList();
       String aux;
       try {
            Scanner sc = new Scanner(new File("data\\Monstruos\\Monstruos.txt"));
           while(sc.hasNext()){                                                
                aux=sc.nextLine();
                if(aux.equals(nombre)){
                }else
                lista.add(aux);
            }
            lista.add(nombre);
            File outFile = new File("data\\Monstruos\\Monstruos.txt");
            PrintWriter pw = new PrintWriter(outFile);
            for (int i = 0; i < lista.size(); i++) {
                
                pw.println(lista.get(i));
            }
            pw.close();
        } catch (Exception e) {
        }
       
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

    public void NPC(String name, String classs, String race, int level, int xpPoints, int life, int iniciative, int strong, int inteligence, int charm, int dexterity, int wisdom, int speed, int armor, Items[] objetos, Habilidad[] habilidades) {
        this.nombre = name;
        this.clase = classs;
        this.raza = race;
        this.nivel = level;
        this.xpPoints = xpPoints;
        this.heallPoints = life;
        this.iniciativa = iniciative;
        this.fuerza = strong;
        this.inteligencia = inteligence;
        this.carisma = charm;
        this.destreza = dexterity;
        this.sabiduria = wisdom;
        this.velocidad = speed;
        this.armadura = armor;
        this.objetos = objetos;
        this.habilidades = habilidades;
    }
    public void Monstruo(String name, String classs, String race, int level, int xpPoints, int life, int iniciative, int strong, int inteligence, int charm, int dexterity, int wisdom, int speed, int armor, Items[] objetos, Habilidad[] habilidades) {
        System.out.println("metodo data");
        this.nombre = name;
        this.clase = classs;
        this.raza = race;
        this.nivel = level;
        this.xpPoints = xpPoints;
        this.heallPoints = life;
        this.iniciativa = iniciative;
        this.fuerza = strong;
        this.inteligencia = inteligence;
        this.carisma = charm;
        this.destreza = dexterity;
        this.sabiduria = wisdom;
        this.velocidad = speed;
        this.armadura = armor;
        this.objetos = objetos;
        this.habilidades = habilidades;
        System.out.println(this.nombre+this.clase+this.raza+this.nivel+this.xpPoints+this.heallPoints+this.iniciativa+this.fuerza+this.inteligencia+this.carisma+this.destreza+this.sabiduria+this.velocidad+this.armadura+this.objetos+this.habilidades );
    }

}

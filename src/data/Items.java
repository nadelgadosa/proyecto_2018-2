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

public class Items implements Serializable{
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
        return "\nNombre del objeto:\t" +getNombre()+ "\ndescripcion:\t"+ getDescripcion()+ "\n\tnivel: "+ getNivel() +"\n\tmodificador: "+getModificador();
    }
    
    
    
    
    
    public void saveItem(Items item){
        
      
        
        try {
            
            final Path archivoSer = new File("data\\Items\\"+item.getNombre()+".ser").toPath();
            final ObjectOutputStream guardarItem = new ObjectOutputStream(Files.newOutputStream(archivoSer));
            
            guardarItem.writeObject(item);
            guardarItem.close();
            
        } catch (Exception ex) {
            
        }
        
        
    }
    public Items leerObjetoItem(String nombreObjeto){
        Items objeto = new Items();
        try{
            
            final Path archivoSer = new File("data\\Items\\"+nombreObjeto+".ser").toPath();
            final ObjectInputStream leerUsuario = new ObjectInputStream(Files.newInputStream(archivoSer));
            objeto  = (Items)leerUsuario.readObject();
            leerUsuario.close();
            
        }catch(Exception e){
                System.out.println(e);   
        } 
        
        
        return objeto;
    }
    public void actualizarLista(String nombre) {
       ArrayList lista = new ArrayList();
        try {
            Scanner sc = new Scanner(new File("data\\Items\\Items.txt"));
            while(sc.hasNext()){
                lista.add(sc.nextLine());
            }
            
            lista.add(nombre);
            File outFile = new File("data\\Items\\Items.txt");
            PrintWriter pw = new PrintWriter(outFile);
            for (int i = 0; i < lista.size(); i++) {
                
                pw.println(lista.get(i));
            }
            pw.close();
        } catch (Exception e) {
        }
       
    }
    
    public ArrayList<String> leerListaItems() {
        ArrayList<String> listaNombres = new ArrayList();
        try {
            Scanner sc = new Scanner(new File("data\\Items\\Items.txt"));
             while(sc.hasNext()){
                listaNombres.add(sc.nextLine());
             }
                
            }catch(Exception e){
                System.out.println(e);
            }
        return listaNombres;
        
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

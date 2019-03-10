/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesLogic;

import GUI.CrearMonstruo;
import GUI.CrearNPC;
import GUI.MostrarMonstruos;
import GUI.mostrarHabilidades;
import GUI.mostrarItems;
import GUI.mostrarNPCs;
import data.Habilidad;
import data.Items;
import data.Personaje;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CreacionDeObjetos {

    public void mostarItems() {
        mostrarItems cons = new mostrarItems();
        Items constructor = new Items();
        cons.setItemsDeLista(constructor.leerListaItems());
        cons.setVisible(true);
    }

    private ArrayList<Items> leerObjetosItem() {
        ArrayList<String> listaDeNombres = new ArrayList();
        ArrayList<Items> listaObjetos = new ArrayList();
        Items cons = new Items();
        listaDeNombres = cons.leerListaItems();
        for (int i = 0; i < listaDeNombres.size(); i++) {
            listaObjetos.add(cons.leerObjetoItem(listaDeNombres.get(i))) ;
        }
        return listaObjetos;
        
    }

    public void mostarHabilidades() {
        mostrarHabilidades cons = new mostrarHabilidades();
        Habilidad constructor = new Habilidad();
        cons.setItemsDeLista(constructor.leerListaHabilidades());
        cons.setVisible(true);
    }

   public boolean crearObjetosNPC (String name, String classs, String race, int level, int xpPoints, int life, int iniciative, int strong, int inteligence, int charm, int dexterity, int wisdom, int speed, int armor, Items[] objetos, Habilidad[] habilidades){
       System.out.println("entra al metodo de bussines");
       Personaje constructor = new Personaje();
       constructor.NPC(name,classs,race,level,xpPoints,life,iniciative,strong,inteligence,charm,dexterity,wisdom,speed,armor,objetos,habilidades);
       System.out.println("construccion del objeto tipo personage realizada");
       if(constructor.savePersonajeNPC(constructor)){
           constructor.actualizarListaNPCs(name);
           return true;
    }else{
           return false;
        }
   }

    public void llenarListasNPC() {
        CrearNPC cons = new CrearNPC();
        Items constructorItems = new Items();
        cons.setItemsDeListaNPCs(constructorItems.leerListaItems());
        Habilidad constructorHabilidad = new Habilidad();
        cons.setHabilidadesDeListaNPCs(constructorHabilidad.leerListaHabilidades());
        cons.setVisible(true);
    }
    public void llenarListasMonstruos() {
        CrearMonstruo cons = new CrearMonstruo();
        Items constructorItems = new Items();
        cons.setItemsDeListaMonstruos(constructorItems.leerListaItems());
        Habilidad constructorHabilidad = new Habilidad();
        cons.setHabilidadesDeListaMonstruos(constructorHabilidad.leerListaHabilidades());
        cons.setVisible(true);
    }
    public boolean crearObjetoMonstruo (String name, String classs, String race, int level, int xpPoints, int life, int iniciative, int strong, int inteligence, int charm, int dexterity, int wisdom, int speed, int armor, Items[] objetos, Habilidad[] habilidades){
       System.out.println("entra al metodo de bussines");
       Personaje constructor = new Personaje();
       constructor.Monstruo(name,classs,race,level,xpPoints,life,iniciative,strong,inteligence,charm,dexterity,wisdom,speed,armor,objetos,habilidades);
       System.out.println("construccion del objeto tipo personage realizada");
       if(constructor.savePersonajeMonstruo(constructor)){
           constructor.actualizarListaMonstruos(name);
           return true;
    }else{
           return false;
        }
   }
    public void NPCs() {
        mostrarNPCs cons = new mostrarNPCs();
        Personaje constructor = new Personaje();
        cons.setItemsDeLista(constructor.leerListaNPCs());
        cons.setVisible(true);
        
    }

    public void monstruos() {
        MostrarMonstruos cons = new MostrarMonstruos();
        Personaje constructor = new Personaje();
        cons.setItemsDeLista(constructor.leerListaMonstruos());
        cons.setVisible(true);
        
    }

    

    
    
}

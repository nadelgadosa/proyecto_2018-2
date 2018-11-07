/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesLogic;

import GUI.CrearNPC;
import GUI.mostrarHabilidades;
import GUI.mostrarItems;
import data.Habilidad;
import data.Items;
import data.Personaje;
import java.util.ArrayList;

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

   

    public void llenarListas() {
        CrearNPC cons = new CrearNPC();
        Items constructorItems = new Items();
        cons.setItemsDeListaNPCs(constructorItems.leerListaItems());
        Habilidad constructorHabilidad = new Habilidad();
        cons.setHabilidadesDeLista(constructorHabilidad.leerListaHabilidades());
        cons.setVisible(true);
    }

    

    
    
}

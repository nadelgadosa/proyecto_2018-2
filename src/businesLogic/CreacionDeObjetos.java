/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesLogic;

import GUI.mostrarItems;
import data.Items;
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

    
    
}

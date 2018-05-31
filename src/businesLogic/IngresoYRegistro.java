/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesLogic;

import GUI.IngresoGUI;
import GUI.JugadorGUI;
import data.Jugador;
import data.Master;
import data.Personaje;


public class IngresoYRegistro {
    public static void main(String[] args) {
        
        JugadorGUI cons = new JugadorGUI();
        cons.setVisible(true);
        
    }
    public void IngresoMaster(){
    IngresoGUI cons = new IngresoGUI();
    
   

}
    public void IngresoJugador(String usuario, String contraseña){
        boolean ingresar;
        String [] personajes;
        Personaje[] objetos = new Personaje[3];
    IngresoGUI cons = new IngresoGUI();
    Jugador jugadorActual = new Jugador();
    JugadorGUI jugador = new JugadorGUI();
    jugadorActual = jugadorActual.BuscarUsuario(usuario);
    ingresar = jugadorActual.verificarIngreso(jugadorActual, contraseña);
    if(ingresar){
        personajes = jugadorActual.listaDePersonajes(usuario);
        for (int i = 0; i < personajes.length; i++) {
            objetos = jugadorActual.listaDeObjetosPersonaje(personajes);
            jugadorActual.setPersonaje(objetos[i], i);
        }
        jugador.setVisible(true);
        jugador.setNombreJugador(jugadorActual.getNombreUsuario());
        jugador.setPersonaje1(jugadorActual.descripcionDePersonaje(objetos, 0));
        jugador.setPersonaje2(jugadorActual.descripcionDePersonaje(objetos, 1));
        jugador.setPersonaje3(jugadorActual.descripcionDePersonaje(objetos, 2));
        jugador.setPersonaje4(jugadorActual.descripcionDePersonaje(objetos, 3));
        
    }else{
        
    }
    
}

    public void crearObjetoJugador(String usuario, String contraseña){
        Jugador jugadorACrear = new Jugador();
        jugadorACrear.crearObjetoJugador(usuario, contraseña);
    }
    
    public void crearObjetoMaster(String usuario, String contraseña){
        Master MasterACrear = new Master();
        MasterACrear.crearObjetoMaster(usuario, contraseña);
    }
}
 
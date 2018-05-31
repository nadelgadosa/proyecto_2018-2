/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesLogic;

import GUI.IngresoGUI;
import GUI.JugadorGUI;
import GUI.MasterGUI;
import data.Juego;
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
        System.out.println("entra al metodo ingresoJugador en busines");
        boolean ingresar;
        String [] personajes= new String[3];
        Personaje[] objetos = new Personaje[3];
        IngresoGUI cons = new IngresoGUI();
        Jugador jugadorActual = new Jugador();
        JugadorGUI jugador = new JugadorGUI();
        
    jugadorActual = jugadorActual.BuscarUsuario(usuario);
    ingresar = jugadorActual.verificarIngreso(jugadorActual, contraseña);
    if(ingresar){
        personajes = jugadorActual.listaDePersonajes(usuario);
        for (int i = 0; i < personajes.length; i++) {
            System.out.println("entra al for de busines");
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
     cons.setBtnEntrar();
    }
    
}
    
    public void IngresoMaster(String usuario, String contraseña){
        System.out.println("entra al metodo ingresoMaster en busines");
        boolean ingresar;
        String [] Juegos = new String[3];       
        Juego[] objetos = new Juego[3];
        IngresoGUI cons = new IngresoGUI();
        Master MasterActual = new Master();
        MasterGUI Master = new MasterGUI();
        
    MasterActual = MasterActual.BuscarUsuario(usuario);
    ingresar = MasterActual.verificarIngreso(MasterActual, contraseña);
    if(ingresar){
        Juegos = MasterActual.listaDeJuegos(usuario);
        for (int i = 0; i < Juegos.length; i++) {
            System.out.println("entra al for de busines");
            objetos = MasterActual.listaDeObjetosJuegos(Juegos);
            MasterActual.setJuego(objetos[i], i);
        }
        Master.setVisible(true);
        Master.setNombreMaster(MasterActual.getNombreUsuario());
        Master.setJuego1(MasterActual.descripcionDeJuego(objetos, 0));
        Master.setJuego2(MasterActual.descripcionDeJuego(objetos, 1));
        Master.setJuego3(MasterActual.descripcionDeJuego(objetos, 2));
        Master.setJuego4(MasterActual.descripcionDeJuego(objetos, 3));
        
    }else{
     cons.setBtnEntrar();
    }
    
}

    public void crearObjetoJugador(String usuario, String contraseña){
        Jugador jugadorACrear = new Jugador();
        jugadorACrear.crearObjetoJugador(usuario, contraseña,"C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyecto_rol\\data\\Jugador\\"+usuario);
    }
    
    public void crearObjetoMaster(String usuario, String contraseña){
        Master MasterACrear = new Master();
        MasterACrear.crearObjetoMaster(usuario, contraseña,"C:\\Users\\Usuario\\Documents\\NetBeansProjects\\proyecto_rol\\data\\Master\\"+usuario);
    }
}
 
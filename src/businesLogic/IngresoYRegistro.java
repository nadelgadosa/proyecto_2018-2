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
        System.out.println("sigue corriendo");
        objetos = jugadorActual.listaDeObjetosPersonaje(personajes);
        
        jugadorActual.setPersonaje(objetos);
        
        jugador.setVisible(true);
        jugador.setNombreDeJugador(usuario);
        
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
        System.out.println("completa el paso 2 ");
    if(ingresar){
        System.out.println("entra al if de IngresoMaster-IngresoYRegistro-businesLogic ");
        Juegos = MasterActual.listaDeJuegos(usuario);
        System.out.println("sigue corriendo");
        
            objetos = MasterActual.listaDeObjetosJuegos(Juegos);
            System.out.println("lee la los .ser de los objetos juego");
            MasterActual.setJuego(objetos);
            System.out.println("asigna los objetos tipo juego a master");
        Master.setVisible(true);
        Master.setNombreMaster(MasterActual.getNombreUsuario());
        Master.setJuego1(MasterActual.descripcionDeJuego(objetos, 0));
        Master.setJuego2(MasterActual.descripcionDeJuego(objetos, 1));
        Master.setJuego3(MasterActual.descripcionDeJuego(objetos, 2));
        Master.setJuego4(MasterActual.descripcionDeJuego(objetos, 3));
        Master.setConstructor(objetos);
    }else{
     cons.setBtnEntrar();
    }
    
}

    public void crearObjetoJugador(String usuario, String contraseña){
        Jugador jugadorACrear = new Jugador();
        jugadorACrear.crearObjetoJugador(usuario, contraseña,"data\\Jugador\\"+usuario);
    }
    
    public void crearObjetoMaster(String usuario, String contraseña){
        Master MasterACrear = new Master();
        MasterACrear.crearObjetoMaster(usuario, contraseña,"data\\Master\\"+usuario);
    }
}
 
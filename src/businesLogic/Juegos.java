
package businesLogic;

import GUI.Game;
import GUI.MasterGUI;
import GUI.NewGameFrame;

import data.Items;
import data.Juego;
import data.Jugador;
import data.Master;
import data.Monstruo;
import data.Personaje;


public class Juegos {
    
    
    
    
    
    
    
    public void entrarEnJuego(int numeroDeJuego, String user, Juego[] juego){
        
        Game cons= new Game();
        cons.setConstructor(juego[numeroDeJuego]);
        String numeroDeJugadores1 = Integer.toString(juego[numeroDeJuego].getNumeroDeJugadores() + 1 );
        Items [] itemsObjeto ;
        Monstruo [] MonstruoList ;
        String[] NPCs = new String [3];
        String [] personajes = new String[5];
        Personaje [] objetosPersonaje = new Personaje[5];
        String [] itemsTexto =null;
        String [] monstruosTexto = null ;
        String [] NPCsTexto =null;
        Jugador jug = new Jugador();
        cons.setVisible(true);
        try{
            
            //cons.setNombreJuego(user);
            cons.setNombreJuego(juego[numeroDeJuego].getNombre());  
            cons.setNumeroJugadores(numeroDeJugadores1);
            cons.setTxtA_Historia(juego[numeroDeJuego].getHistoria());
            cons.setTxtA_Vitacora(juego[numeroDeJuego].getVitacora().toString());
            MonstruoList = juego[numeroDeJuego].getMonstruos();
            for (int i = 0; i < MonstruoList.length; i++) {
                monstruosTexto[i] = MonstruoList[i].toString();
            }
            cons.setMonstruosList(monstruosTexto);
            itemsObjeto = juego[numeroDeJuego].getItemsAUsar();
            for (int i = 0; i < juego[numeroDeJuego].getItemsAUsar().length ; i++) {
                itemsTexto [i] = itemsObjeto[i].toString();
            }
            cons.setItemsList(itemsTexto);
            personajes = juego[numeroDeJuego].getJugadores();
            objetosPersonaje= jug.listaDeObjetosPersonaje(personajes);
            cons.setJugador1(objetosPersonaje[0].toString() );
            cons.setJugador2(objetosPersonaje[1].toString());
            cons.setJugador3(objetosPersonaje[2].toString());
            cons.setJugador4(objetosPersonaje[3].toString());
            cons.setJugador5(objetosPersonaje[4].toString());
            cons.setJugador6(objetosPersonaje[5].toString());
            
            NPCs = juego[numeroDeJuego].getNPCs();
            for (int i = 0; i < juego[numeroDeJuego].getItemsAUsar().length ; i++) {
                NPCsTexto [i] = NPCs[i].toString();
            }
            cons.setNPC1(NPCsTexto [0]);
            cons.setNPC2(NPCsTexto [1]);
            cons.setNPC3(NPCsTexto [2]);
            cons.setNPC4(NPCsTexto [3]);
            
        }catch(Exception e){
            System.out.println("se sale del catch por: "+e);
        }
        
        
        
    }
    public void CrearJuego(int numeroDeJuego, String user, Juego[] juego){
        System.out.println("entra al metodo");
        
        
        try{
        
            NewGameFrame cons = new NewGameFrame();
            System.out.println("crea el constructor de NewGameGUI");
            cons.setVisible(true);
            cons.setUsuario(user);
            cons.setConstructor(user);
            
            
            
            
            
        
        }catch(Exception e){
            System.out.println("el problema es "+e);
        }
        
        
    }
    public void salvarJuego(Juego juego, String user){
       
        Master cons = new Master();
        
        cons.actualizarLista(user, "data\\Master\\"+user, juego.getNombre());
    }
    
    
}


package businesLogic;

import GUI.Game;
import GUI.MasterGUI;
import GUI.NewGame;

import data.Items;
import data.Juego;
import data.Jugador;
import data.Monstruo;
import data.Personaje;


public class Juegos {
    
    
    
    
    
    
    
    public void entrarEnJuego(int numeroDeJuego, String user, Juego[] juego){
        
        Game cons= new Game();
        cons.setConstructor(juego[numeroDeJuego]);
        String numeroDeJugadores1 = Integer.toString(juego[numeroDeJuego].getNumeroDeJugadores());
        Items [] itemsObjeto ;
        Monstruo [] MonstruoList ;
        Personaje[] NPCs = new Personaje [3];
        Jugador [] personajes = new Jugador[5];
        String [] itemsTexto =null;
        String [] monstruosTexto = null ;
        String [] NPCsTexto =null;
        
        cons.setVisible(true);
        try{
            
            cons.setNombreJuego(user);
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
            cons.setJugador1(personajes[0].getNombreUsuario());
            cons.setJugador1(personajes[1].getNombreUsuario());
            cons.setJugador1(personajes[2].getNombreUsuario());
            cons.setJugador1(personajes[3].getNombreUsuario());
            cons.setJugador1(personajes[4].getNombreUsuario());
            cons.setJugador1(personajes[5].getNombreUsuario());
            
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
        
        System.out.println("crea el constructor de NewGameGUI");
        try{
        
        
        }catch(Exception e){
            System.out.println("el problema es "+e);
        }
        
        
    }
    
    
    
}

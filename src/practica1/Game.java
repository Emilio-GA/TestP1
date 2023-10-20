/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;
import java.util.ArrayList;


/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA A LOS MONSTRUOS DEL JUEGO
public class Game {
    
    
    // VARIABLE MAX_ROUNDS
    private static int MAX_ROUNDS = 10;
    
    
    // VARIABLE CURRENTPLAYERINDEX
    private int currentPlayerIndex;
    
    
    // VARIABLE CURRENTPLAYER
    private Player currentPlayer;
    
    
    // VARIABLE ARRRAYLIST PLAYERS
    private ArrayList<Player> players;
    
    
    // VARIABLE ARRAYLIST MONSTERS
    private ArrayList<Monster> monsters;
    
    
    // VARIABLE ARRAYLIST LABYRINTH
    private Labyrinth labyrinth;
    
    
    // VARIABLE LOG
    private String log = " ";
    
    
    // VARIABLES AUXILIARES
    private int nRows = 5;
    private int nCols = 5;
    
    
    // CONSTRUCTOR
    public Game(int nplayers) {
        
       .....
        
        
    }
    
    
    // METODO FINISHED
    public boolean finished() {
        
        return labyrinth.haveAWinner();
    }
    
    
    // METODO NEXTSTEP
    //public boolean nextStep(Directions preferredDirection) {
        
        
    //}
    
    
    // METODO GETGAMESTATE
    
    // Añadir metodos auxiliares
    private String stringLabyrinth() {
        
        String lr = "";
        
        for (int i = 0; i < nRows; i++) {
            
            for (int j = 0; j < nCols; j++) {
                
                lr += labyrinth.toString();
            }
        }
        
        return lr;
    }
    
    
    private String stringPlayer() {
        
        String pl = "";
        
        for (int i = 0; i < nRows; i++) {
            
            for (int j = 0; j < nCols; j++) {
                
                pl += players.toString();
            }
        }
        
        return pl;
    }
    
    
    private String stringMonster() {
        
        String mo = "";
        
        for (int i = 0; i < nRows; i++) {
            
            for (int j = 0; j < nCols; j++) {
                
                mo += monsters.toString();
            }
        }
        
        return mo;
    }
    
    public GameState getGameState() {
        
        GameState GS = new GameState(stringLabyrinth(), stringPlayer(), stringMonster(), currentPlayerIndex, this.finished(), log);
        return GS;
    }
    
    
    // METODO CONFIGURELABYRINTH
    private void configureLabyrinth() {
        
       .....
    }
    
    
    // METODO NEXTPLAYER
    private void nextPlayer() {
        
        this.currentPlayerIndex = (currentPlayerIndex + 1 % players.size());
        this.currentPlayer = players.get(currentPlayerIndex);
    }
    
    
    // METODO ACTUALDIRECTIONS
    //private Directions actualDirection(Directions preferredDirection) {
        
        
    //}
    
    
    // METODO COMBAT
    //private GameCharacter combat(Monster monster) {
        
    //}
    
    
    // METODO MANAGEREWARD
    //private void manageReward(GameCharacter winner) {
        
        
    //}
    
    
    // METODO MANAGERESURRECTION
    //private void manageResurrection() {
        
        
        
    //}
    
    
    // METODO LOGPLAYERWON
    private void logPlayerWon() {
        
        log += "Jugador ha ganado el combate.\n";
    }
    
    
    // METODO LOGMONSTERWON
    private void logMonsterWon() {
        
        log += "Jugador ha ganado el combate.\n";
    }
    
    
    // METODO LOGRESURRECTED
    private void logResurrected() {
        
        log += "Monstruo ha ganado el combate.\n";
    }
    
    
    // METODO LOGPLAYERSKIPTURN
    private void logPlayerSkipTurn() {
        
        log += "Jugador ha perdido el turno por estar muerto.\n";
    }
    
    
    // METODO LOGPLAYERNOORDERS
    private void logPlayerNoOrders() {
        
        log += "Jugador no ha seguido las instrucciones del jugador humano (nofue posible).\n";
    }
    
    
    // METODO LOGNOMOSTER
    private void logNoMonster() {
        
        log += "Jugador se ha movido a una celda vacia o no ha sido posible moverse.\n";
    }
    
    
    // METODO LOGROUNDS
    private void logRounds(int rounds, int max) {
        
        log += "Se han producido" + Integer.toString(rounds) + "de " + Integer.toString(max)  + "rondas de combate.\n"; 
    }
}
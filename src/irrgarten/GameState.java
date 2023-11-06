/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA EL ESTADO DEL JUEGO
public class GameState {
    
    
    // VARIABLE QUE REPRESENTA LABERINTO
    private String labyrinth;
    
    
    // VARIABLE QUE REPRESENTA JUGADORES
    private String players;
    
    
    // VARIABLE QUE REPRESENTA MONSTRUOS
    private String monsters;
    
    
    // VARIABLE QUE REPRESENTA AL JUGADOR ACTUAL
    private int currentPlayer;
    
    
    // VARIABLE BOOLEANA DEL GANADOR
    private Boolean winner;
    
    
    // VARIABLE QUE REPRESENTA REGISTRO
    private String log;
    
    
    // CONSTRUCTOR 
    public GameState (String inilab,  String inipla, String inimon, int inicur, Boolean iniwi, String inilo){
        
        labyrinth = inilab;
        players = inipla;
        monsters = inimon;
        currentPlayer = inicur;
        winner = iniwi;
        log = inilo;
    }
    
    
    // METODO CONSULTOR DE LA VARIABLE LABERINTO
    public String getLabyrinthv() {
    
        return labyrinth;
    
    }
    
    
    // METODO CONSULTOR DE LA VARIABLE JUGADORES
    public String getPlayers() {
    
        return players;
    
    }
    
    
    // METODO CONSULTOR DE LA VARIABLE MONSTRUOS
    public String getMonsters() {
    
        return monsters;
    }
    
    
    // METODO CONSULTOR DE LA VARIABLE REGISTRO
    public String getLog() {
    
        return log;
    }   
    
    
    // METODO CONSULTOR DE LA VARIABLE JUGADOR ACTUAL
    public int getCurrentPlayer() {
    
        return currentPlayer;
    }  
    
    
    // METODO CONSULTOR DE LA VARIABLE BOOLEANA DEL GANADOR
    public Boolean getWinner() {
    
        return winner;
    }    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA EL ESTADO DEL JUEGO
public class GameState {
    
    
    // VARIABLE QUE REPRESENTA LABERINTO
    private static String labyrinthv;
    
    
    // VARIABLE QUE REPRESENTA JUGADORES
    private static String players;
    
    
    // VARIABLE QUE REPRESENTA MONSTRUOS
    private static String monsters;
    
    
    // VARIABLE QUE REPRESENTA AL JUGADOR ACTUAL
    private static int currentPlayer;
    
    
    // VARIABLE BOOLEANA DEL GANADOR
    private static Boolean winner;
    
    
    // VARIABLE QUE REPRESENTA REGISTRO
    private static String log;
    
    
    // CONSTRUCTOR 
    public GameState (String inilab,  String inipla, String inimon, int inicur, Boolean iniwi, String inilo){
        
        labyrinthv = inilab;
        players = inipla;
        monsters = inimon;
        currentPlayer = inicur;
        winner = iniwi;
        log = inilo;
    }
    
    
    // METODO CONSULTOR DE LA VARIABLE LABERINTO
    public static String getLabyrinthv() {
    
        return labyrinthv;
    
    }
    
    
    // METODO CONSULTOR DE LA VARIABLE JUGADORES
    public static String getPlayers() {
    
        return players;
    
    }
    
    
    // METODO CONSULTOR DE LA VARIABLE MONSTRUOS
    public static String getMonsters() {
    
        return monsters;
    }
    
    
    // METODO CONSULTOR DE LA VARIABLE REGISTRO
    public static String getLog() {
    
        return log;
    }   
    
    
    // METODO CONSULTOR DE LA VARIABLE JUGADOR ACTUAL
    public static int getCurrentPlayer() {
    
        return currentPlayer;
    }  
    
    
    // METODO CONSULTOR DE LA VARIABLE BOOLEANA DEL GANADOR
    public static Boolean getWinner() {
    
        return winner;
    }    
}
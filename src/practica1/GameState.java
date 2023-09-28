/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;


/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */
public class GameState {
    
    private static String labyrinthv;
    private static String players;
    private static String monsters;
    private static int currentPlayer;
    private static Boolean winner;
    private static String log;
    
    public GameState (String inilab,  String inipla, String inimon, int inicur, Boolean iniwi, String inilo){
        
        labyrinthv = inilab;
        players = inipla;
        monsters = inimon;
        currentPlayer = inicur;
        winner = iniwi;
        log = inilo;
    }
    
    
    // METODOS
    public String getLabyrinthv() {
    
        return labyrinthv;
    
    }
    
    
    public String getPlayers() {
    
        return players;
    
    }
    
    
    public String getMonsters() {
    
        return monsters;
    }
    
    
    public String getLog() {
    
        return log;
    }   
    
    
    public int getCurrentPlayer() {
    
        return currentPlayer;
    }  
    
    
    public Boolean getWinner() {
    
        return winner;
    }    
    
}
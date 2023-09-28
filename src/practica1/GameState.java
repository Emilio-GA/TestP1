/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author egalv
 */
public class GameState {
    private String labyrinthv;
    private String players;
    private String monsters;
    private int currentPlayer;
    private Boolean winner;
    private String log;
    
    public GameState (String inilab,  String inipla, String inimon, int inicur, Boolean iniwi, String inilo){
     labyrinthv = inilab;
     players = inipla;
     monsters = inimon;
     currentPlayer = inicur;
     winner = iniwi;
     log = inilo;
    }
    
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import java.util.ArrayList;

/**
 *
 * @author egalv
 */
public class Team {
    private static int MAX_CAPACITY = 10;
    private String name;
    private int numWins;
    private ArrayList<Player> players;
    
    public Team(String name, Player leader){
        numWins = 0;
        this.name = name;
        players = new ArrayList <>();
        players.add(leader);
      
    }           
    
        
    public void addNewPlayer(Player player){
        
    
      players.add(player);
      
   }
    
    
}
//Debido a la inclusion de una nueva clase he tenido que crear un nuevo fichero 
//java en el que he escrito la clase,y meterla dentro del mismo paquete para 
//poder hacer un array de Player, ya que es otra clase de este paquete

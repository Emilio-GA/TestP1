
package irrgarten.UI;

import irrgarten.Directions;
//import irrgarten.GameState;
import irrgarten.*;
import java.util.Scanner;


public class TextUI implements UI{
    
    private static final Scanner in = new Scanner(System.in);
    
    private char readChar() {
        String s = in.nextLine();     
        return s.charAt(0);
    }
    

    public Directions nextMove() {
        System.out.print("Where? ");
        
        Directions direction = Directions.DOWN;
        boolean gotInput = false;
        
        while (!gotInput) {
            char c = readChar();
            switch(c) {
                case 'w' -> {
                    System.out.print(" UP\n");
                    direction = Directions.UP;
                    gotInput = true;
                }
                case 's' -> {
                    System.out.print(" DOWN\n");
                    direction = Directions.DOWN;
                    gotInput = true;
                }
                case 'd' -> {
                    System.out.print("RIGHT\n");
                    direction = Directions.RIGHT;
                    gotInput = true;
                }
                case 'a' -> {
                    System.out.print(" LEFT\n");
                    direction = Directions.LEFT;
                    gotInput = true;
                }
            }
        }    
        return direction;
    }
    
    public void showGame(GameState gameState) { 
        System.out.println("Estado del laberinto");
        
        System.out.println(gameState.getLabyrinthv());
        System.out.println("Jugadores");
    
        System.out.println(gameState.getPlayers() );
  
        System.out.println(" Monstruos ");
  
        System.out.println(gameState.getMonsters() );
  
        System.out.println("Log ");
  
        System.out.println(gameState.getLog() );
 
        System.out.println("Turno del jugador ");
 
 
        System.out.println(Integer.toString(gameState.getCurrentPlayer()) );
 
        System.out.println("Hay ganador ");
 
        System.out.println( gameState.getWinner() );
    }
}
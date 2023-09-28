/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica1;

/**
 *
 * @author egalv
 */
public class TestP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // clases enum
        System.out.println(Directions.DOWN);
        System.out.println(Directions.LEFT);
        System.out.println(Directions.RIGHT);
        System.out.println(Directions.UP);
        
        System.out.println(GameCharacter.MONSTER);
        System.out.println(GameCharacter.PLAYER);

        
        // Clase weapon
        
       
       // Clase shield
       Shield sh = new Shield(5, 4);
       System.out.println(sh.protect());
       System.out.println(sh.toString());
       
       
       // Clase Dice
       
    }
    
}

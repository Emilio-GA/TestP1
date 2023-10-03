/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica1;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE MAIN
public class TestP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Clases enum
        System.out.println(Directions.DOWN);
        System.out.println(Directions.LEFT);
        System.out.println(Directions.RIGHT);
        System.out.println(Directions.UP);
        
        System.out.println(GameCharacter.MONSTER);
        System.out.println(GameCharacter.PLAYER);
        
        System.out.println(Orientation.HORIZONTAL);
        System.out.println(Orientation.VERTICAL);
    
        
        // Clase Weapon
        Weapon hacha= new Weapon (5 ,4)  ;
        System.out.println(hacha.attack());
        System.out.println(hacha.toString());
        hacha.attack();
        hacha.attack();
        while (hacha.discard()){};
       
        
        // Clase Shield
        Shield sh = new Shield(5, 4);
        System.out.println(sh.protect());
        System.out.println(sh.toString());
        sh.protect();
        sh.protect();
        while (sh.discard()){};
               
       
        // Clase Dice
        System.out.println("numeros ramdon del 0 al 100");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.randomPos(100));           
        }


        System.out.println("jugador empieza");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.whoStarts(2));           
        }


        System.out.println("inteligencia y fuerza");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.randomIntelligence());
           System.out.println(Dice.randomStrength()); 
        }
        
        
        System.out.println("Revive");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.resurrectPlayer());
        }
        
        
        System.out.println("Premios");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.weaponsReward());
           System.out.println(Dice.shieldsReward());
           System.out.println(Dice.healthReward());
        }  
        
        
        System.out.println("Poder");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.weaponPower());
           System.out.println(Dice.shieldPower());

        }
        
        
        System.out.println("Usos");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.usesLeft());

        }
        
        
        System.out.println("Intensidad");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.usesLeft());

        }
        
        
        System.out.println("DESCARTES");
        for (int i = 1; i <= 100; i ++) {
           System.out.println(Dice.discardElement(4));

        }
        
        // Clase GameState
        GameState gs = new GameState("Laberinto", "EA", "Monster", 5, false, "log");
        System.out.println(GameState.getLabyrinthv());
        System.out.println(GameState.getPlayers());
        System.out.println(GameState.getMonsters());
        System.out.println(GameState.getLog());
        System.out.println(GameState.getCurrentPlayer());
        
        
        System.out.println("Rezemos para que esto te salga nene");
        
        
    }
}
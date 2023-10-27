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
        
        
        // Clase Enum Direction
        System.out.println("Enum Direction");
        System.out.println(Directions.DOWN);
        System.out.println(Directions.LEFT);
        System.out.println(Directions.RIGHT);
        System.out.println(Directions.UP);
        
        System.out.println("\n");
        
        // Clase Enum GameCharacter
        System.out.println("Enum GameCharacter");
        System.out.println(GameCharacter.MONSTER);
        System.out.println(GameCharacter.PLAYER);
        
        System.out.println("\n");
        
        // Clase Enum Orientation
        System.out.println("Enum Orientation");
        System.out.println(Orientation.HORIZONTAL);
        System.out.println(Orientation.VERTICAL);
    
        System.out.println("\n");
        
        // Clase Weapon
        System.out.println("Clase Weapon");
        Weapon hacha= new Weapon (5 ,4)  ;
        System.out.println(hacha.attack());
        System.out.println(hacha.toString());
        hacha.attack();
        hacha.attack();
        while (hacha.discard()){};
       
        System.out.println("\n");
        
        // Clase Shield
        System.out.println("Clase Shield");
        Shield sh = new Shield(5, 4);
        System.out.println(sh.protect());
        System.out.println(sh.toString());
        sh.protect();
        sh.protect();
        while (sh.discard()){};
               
       System.out.println("\n");
        
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
        
        System.out.println("\n");
        
        // Clase GameState
        System.out.println("Clase GameState");
        GameState gs= new GameState("Laberinto", "EA", "Monster", 5, false, "log");
        System.out.println(gs.getLabyrinthv());
        System.out.println(gs.getPlayers());
        System.out.println(gs.getMonsters());
        System.out.println(gs.getLog());
        System.out.println(gs.getCurrentPlayer());
                
        System.out.println("\n");
        
        // Clase Monster
        System.out.println("Clase Monstruo");
        Monster dragon = new Monster ("Smaug", 3 , 4)  ;
        System.out.println(dragon.attack());
        System.out.println(dragon.toString());
        dragon.gotWounded();
        dragon.gotWounded();
        dragon.gotWounded();
        dragon.gotWounded();
        dragon.gotWounded();
        System.out.println(dragon.dead());
        dragon.setPos(0, 0);
        
        System.out.println("\n");
        
        //Clase Player
        System.out.println("Clase Jugador");
        Player Emilio = new Player ('0', 5 , 5);
        Emilio.setPos(1, 1);
        System.out.println(Emilio.getCol());
        System.out.println(Emilio.getRow());
        System.out.println(Emilio.getNumber());
        Weapon espada = Emilio.newWeapon();
        Shield casco = Emilio.newShield();
        System.out.println(Emilio.dead());
        Emilio.resurrect();
        System.out.println(Emilio.defensiveEnergy());
        System.out.println( Emilio.attack());
        System.out.println(Emilio.toString());
        
        System.out.println("\n");
        
        // Clase labyrinth
        System.out.println("Clase Laberinto");
        Labyrinth laberinto = new Labyrinth(10, 10, 2, 3);
        System.out.println(laberinto.toString());
        laberinto.addMonster(2, 4, dragon);
        
        System.out.println("\n");
        
        // Clase Game
        System.out.println("Clase Game");
        Game juego = new Game(10);
        juego.finished();
        System.out.println(juego.getGameState().getLabyrinthv().toString());   
       
 
    }
}
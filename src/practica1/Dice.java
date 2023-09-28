/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_pdoo;
import java.util.Random;


/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */
public class Dice {
    
    private static int MAX_USES;
    private static float MAX_INTELLIGENCE;
    private static float MAX_STRENGTH;
    private static float RESURRECT_PROB;
    private static int WEAPONS_REWARD;
    private static int SHIELDS_REWARD;
    private static int HEALTH_REWARD;
    private static int MAX_ATTACK;
    private static int MAX_SHIELD;
    private static Random generator = new Random();
    
    
    // METODOS
    public static int randomPos(int max) {
        
        return generator.nextInt(max);
    }
    
    
    public static int whoStarts(int nplayers) {
        
        return generator.nextInt(nplayers);
    }
    
    
    public static float randomIntelligence() {
        
        return generator.nextFloat(MAX_INTELLIGENCE);
    }
    
    
    public static float randomStrength() {
        
        return generator.nextFloat(MAX_STRENGTH);
    }
    
    
    public static boolean resurrectPlayer() {
        
        boolean resurrected;
        
        if (generator.nextFloat() < RESURRECT_PROB) {
            
            resurrected = true;
        
        } else {
            
            resurrected = false;
        }
        
        return resurrected;
    }
    
    
    public static int weaponsReward() {
        
        return generator.nextInt(0, WEAPONS_REWARD);
    }
    
    
    public static int shieldsReward() {
        
        return generator.nextInt(0, SHIELDS_REWARD);
    }
    
    
    public static int healthReward() {
        
        return generator.nextInt(0, SHIELDS_REWARD);
    }
    
    
    public static float weaponPower() {
        
        return generator.nextFloat(0, MAX_ATTACK);
    }
    
    
    public static float shieldPower() {
        
        return generator.nextFloat(0, MAX_SHIELD);
    }
    
    
    public static int usesLeft() {
        
        return generator.nextInt(0, MAX_USES);
    }
    
    
    public static float intensity(float competence) {
        
        return generator.nextFloat(0, competence);
    }
    
    
    public static boolean discardElement(int usesLeft) {
        
        boolean discard;
        
        if (generator.nextFloat() < 1.0 * (MAX_USES - usesLeft()) / MAX_USES) {
            
            discard = true;
        
        } else {
            
            discard = false;
        }
        
        return discard;     
    }
}

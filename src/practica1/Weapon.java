/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_pdoo;


/**
 * @author Alberto Rodríguez Fernańdez
 * @author Emilio Guillén Alvarez 
 */
public class Weapon {
    
    private static float power;
    private static int uses;
    
    
    // Constructor
    Weapon (float p, int u) {
        
        power = p;
        uses = u;
    }
    
    
    // Metodos
    public static float attack() {
        
        float sol;
        
        if (uses > 0) {
            
            uses--;
            sol = power;
        
        } else {
            
            sol = 0;
        }
        
        return sol;
    }
    
    
    public String toString() {
        
        return "W[" + String.valueOf(power) + ", " + Integer.toString(uses) + "]";
    }
    
    
    public static boolean discard() {
        
        return Dice.discardElement(uses);
    }
}

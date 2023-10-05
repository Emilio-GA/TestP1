/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;



/**
 * @author Alberto Rodríguez Fernańdez
 * @author Emilio Guillén Alvarez 
 */

// CLASE QUE REPRESENTA LAS ARMAS QUE USA EL JUGADOR EN LOS ATAQUES DURANTE LOS COMBATES
public class Weapon {
    
    
    // PODER DEL JUGADOR
    private float power;
    
    
    // USOS DE UN JUGADOR PARA LAS ARMAS
    private int uses;
    
    
    // CONSTRUCTOR
    public Weapon (float p, int u) {
        
        power = p;
        uses = u;
    }
        
    
    /* MÉTODO QUE REPRESENTAN LA INTENSIDAD DEL ATAQUE DEL JUGADOR. SI EL ARMA
       TIENE USOS DISPONIBLES (USES > 0), SE DECREMENTA EL VALOR DE USOS Y SE
       DEVUELVE EL VALOR DE POWER. SI NO TIENE USOS LA ARMA SE DEVUELVE 0 */
    public float attack() {
        
        float sol;
        
        if (uses > 0) {
            
            uses--;
            sol = power;
        
        } else {
            
            sol = 0;
        }
        
        return sol;
    }
    
    
    // MÉTODO QUE DA EL PODER Y LOS USOS QUE TENDRÁ UN ARMA EN FORMATO TEXTO
    public String toString() {
        
        return "W[" + String.valueOf(power) + ", " + Integer.toString(uses) + "]";
    }
    
    
    // MÉTODO QUE DECIDE SI UN ARMA DEBE SER DESCARTADA
    public boolean discard() {
        
        return Dice.discardElement(uses);
    }
}
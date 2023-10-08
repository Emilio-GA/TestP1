/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA A LOS MONSTRUOS DEL JUEGO
public class Monster {
    
    
    // VARIABLE SALUD INITIAL    
    private static int INITIAL_HEALTH = 5;
    
    
    // VARIABLE NOMBRE
    private String name;
    
    
    // VARIABLE INTELIGENCIA
    private  float intelligence;
    
    
    // VARIABLE FUERZA
    private float strength;
    
    
    // VARIABLE SALUD
    private float health;
    
    
    // VARIABLE FILA
    private int row;
    
    
    // VARIABLE COLUMNA
    private int col;
    
    
    // CONSTRUCTOR
    public Monster (String name, float intelligence, float strength){
        
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
    }
    
    
    // METODO DEAD
    boolean dead() {
        
        
    }
    
    
    // METODO ATTACK
    float attack() {
        
        
    }
    
    
    // METODO DEFEND
    boolean defend(float receivedAttack) {
        
        
    }
    
    
    // METODO SETPOS
    void setPos(int row, int col) {
        
        
    }
    
    
    // METODO TOSTRING
    String toString() {
        
        
    }
    
    
    // METODO GOTWOUNDED
    void gotWounded() {
        
        
    }
}
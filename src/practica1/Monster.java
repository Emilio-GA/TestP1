/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;

import java.util.ArrayList;



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
    
    
    //Lista de monstruos;
    private static ArrayList <Monster> monsters; 
    

    
     
    
    
    
    // CONSTRUCTOR
    public Monster (String name, float intelligence, float strength){
        
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
    }
    
    
    // METODO DEAD comprueba si esta muerto
    boolean dead() {
        
        if (health == 0){
           return true;
        }else{
           return false;
        }
       
    }
    
    
    // METODO ATTACK utiliza el dado 
    float attack() {
        
        return Dice.intensity(strength);
    }
    
    
    // METODO DEFEND
   // boolean defend(float receivedAttack) {
        
        
 //   }
    
    
    // METODO SETPOS 
    void setPos(int row, int col){
        
        this.row = row;
        this.col = col;
    }
   
    
    
    // METODO TOSTRING
    public String toString() {
        return "M[ "+ name + ",  Intelligence: " + String.valueOf(intelligence) + 
        ", Strength: " + String.valueOf(strength) + ", Health: " + String.valueOf(health) +
        ", Row and Col" + Integer.toString(row) + ", " + Integer.toString(col)  + " ]";
    }
          
    
    
    // METODO GOTWOUNDED
    void gotWounded() {
        health--;
        
    }
}
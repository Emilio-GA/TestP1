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

// CLASE QUE REPRESENTA A LOS JUGADORES DEL JUEGO
public class Player {
    
    
    // Maximo de armas
    private static int MAX_WEAPONS = 2;
    
    
    // Maximo escudos
    private static int MAX_SHIELD = 3;
    
    
    // SALUD INICIAL
    private static int INITIAL_HEALTH = 10;
    
    
    // GOLPES ANTES DE PERDER
    private static int HITS2LOSE = 3;
    
    
    //NOMBRE
    private String name;
    
    
    //numero
    private char number;
    
    
    //intelligence
    private float intelligence;
    
    
    //fuerza
    private float strength;
    
    
    //salud
    private float health;
    
    
    //fila
    private int row;
    
    
    //columna
    private int col;
    
    
    //golpes consecutivos
    private int consecutiveHits;
    
    
    //Lista de armas
    private static ArrayList <Weapon> weapons; 
    
    
    //Lista de escudos
    private static ArrayList <Shield> shields; 
    
    
    //constructor
    public Player (char number, float intelligence, float strength){
        this.name = "Player " + number;
        this.number = number;
        this.intelligence = intelligence;
        this.strength = strength;
        
        
    }
    
    
    //resucitar
    void resurrect(){
    this.resetHits();
    health = INITIAL_HEALTH;
    // NO SE PONER A CERO LAS LISTAS DE ARMAS Y ESCUDOS
    }
        
    
    
    
    int getRow(){
        return row;
    }
    
    
    int getCol(){
        return col;
    }
    
    
    char getNumber(){
        return number;    
    }
    
    
    void setPos(int row, int col){
        this.row = row;
        this.col = col;
        
    }
    
    
    boolean dead(){
        if (health == 0){
           return true;
        }else{
           return false;
        }
    }
    
    
    Directions move(Directions direction, Directions[] validMoves){}
    
    float attack(){
        return strength+this.sumWeapons();
    }
    
    
    
    boolean defend(float receivedAttack){
    return this.manageHit(receivedAttack);
    }
    
    
    
    void receiveReward(){}
    
    
    
    public String toString() {
        return "Player[ "+ name +" , Number: "+ number + ",  Intelligence: " + String.valueOf(intelligence) + 
        ", Strength: " + String.valueOf(strength) + ", Health: " + String.valueOf(health) +
        ", Row and Col" + Integer.toString(row) + ", " + Integer.toString(col)  + 
        ", ConsecutiveHits: "+ Integer.toString(consecutiveHits) +  " ]";
    }
    
    
    void receiveWeapon(Weapon w){}
    
    
    void receiveShield (Shield s){}
    
    
    Weapon newWeapon(){
        Weapon hacha = new Weapon(Dice.weaponPower(), Dice.usesLeft());
        
        return hacha;
        
    }
    
    Shield newShield() {
        
        Shield escudo = new Shield(Dice.shieldPower(), Dice.usesLeft());
        
        return escudo;
    }
    
    float sumWeapons(){
        
        
    }
    
    
    float sumShields(){
    
    
    }
    
    float defensiveEnergy(){
     return intelligence+this.sumShields();
    }
    
    boolean manageHit(float receivedAttack){}
    
    void resetHits(){
        consecutiveHits = 0;
    }
    
    void gotWounded(){
        this.health--;
    }
    
    void incConsecutiveHits(){
        consecutiveHits++;
    }
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
}

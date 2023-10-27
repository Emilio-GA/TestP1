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
        
        shields = new ArrayList <Shield>();
        
        weapons = new ArrayList <Weapon>();
        
        Shield sh = new Shield(5, 4);
        Weapon hacha= new Weapon (5 ,4)  ;
        weapons.add(hacha);
        shields.add(sh);
        
        health = INITIAL_HEALTH;
        row = -1;
        col = -1;
        consecutiveHits = 0;
    
    }
    
    
    //resucitar
    public void resurrect(){
    this.resetHits();
    health = INITIAL_HEALTH;
   
    weapons.clear();
    shields.clear();
    
    }   
    
    
    // devolver fila
    public int getRow(){
        return row;
    }
   
    
    // devolver columna
    public int getCol(){
        return col;
    }
    
    
    // devolver numero del jugador
    public char getNumber(){
        return number;    
    }
    
    
    // Establecer una posición
    public void setPos(int row, int col){
        this.row = row;
        this.col = col;
        
    }
    
    
    // comprovar si esta muerto
    public boolean dead(){
        if (health <= 0){
           return true;
        }else{
           return false;
        }
    }
    
    
    //Directions move(Directions direction, Directions[] validMoves){}
    
    
    // Devuelve fuerza del ataque
    public float attack(){
        return strength+this.sumWeapons();
    }
        
    
    //public boolean defend(float receivedAttack){
        
    //  return this.manageHit(receivedAttack);
    
    // }
    
  
    // recibir premio
    // public void receiveReward(){}
    
    
    // METODO TOSTRING
    public String toString() {
        return "Player[ "+ name +" , Number: "+ number + ",  Intelligence: " + String.valueOf(intelligence) + 
        ", Strength: " + String.valueOf(strength) + ", Health: " + String.valueOf(health) +
        ", Row and Col " + Integer.toString(row) + ", " + Integer.toString(col)  + 
        ", ConsecutiveHits: "+ Integer.toString(consecutiveHits) +  " ]";
    }
    
    
    // recibir arma
    // private void receiveWeapon(Weapon w){}
    
    
    // recibir escudo
    // private void receiveShield (Shield s){}
    
    
    // GENERA UN ARMA 
    private Weapon newWeapon(){
        Weapon hacha = new Weapon(Dice.weaponPower(), Dice.usesLeft());
        
        return hacha;
        
    }
    
    
    // GENERA UN ESCUDO
    private Shield newShield() {
        
        Shield escudo = new Shield(Dice.shieldPower(), Dice.usesLeft());
        
        return escudo;
    }
    
    
    // SUMA LA FUERZA DE TODAS LAS ARMAS
    private float sumWeapons(){
        float suma=0;
        for (int i= 0 ; i < weapons.size(); i++){
            suma += weapons.get(i).attack();
        }
        return suma;
    }
    
    
    // SUMA LA PROTECCIÓN DE TODOS LOS ESCUDOS
    private float sumShields(){
        float suma=0;
        for (int i= 0 ; i < shields.size(); i++){
            suma += shields.get(i).protect();
        }
        return suma;    
    
    }
    
    
    //DEVUELVE LA SUMA DE PROTECCIÓN DE LOS ESCUDOS MAS LA INTELIGENCIA
    private float defensiveEnergy(){
     return intelligence+this.sumShields();
    }
    
    
    //boolean manageHit(float receivedAttack){}
    
    
    // RESETEA LOS HITS
    private void resetHits(){
        consecutiveHits = 0;
    }
    
    
    // QUITA SALUD
    private void gotWounded(){
        this.health--;
    }
    
    
    //AÑADE GOLPES CONSECUTIVOS
    private void incConsecutiveHits(){
        consecutiveHits++;
    }
}

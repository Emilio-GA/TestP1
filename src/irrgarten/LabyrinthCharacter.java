/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE LABYRINTHCHARACTER
public abstract class LabyrinthCharacter {
    
    private String name;
    private float intelligence;
    private float strength;
    private float health;
    private int row;
    private int col;
    
    // CONSTRUCTORES
    public LabyrinthCharacter(String _name, float _intelligence, float _strength, float _health) {
        
        name = _name;
        intelligence = _intelligence;
        strength = _strength;
        health = _health;
        row = 0;
        col = 0;        
    }
    
    public LabyrinthCharacter(LabyrinthCharacter other) {
        
        this(other.name, other.intelligence, other.strength, other.health);
        row = 0; // TO- DO: a que valor inicializar
        col = 0; // TO- DO: a que valor inicializar        
    }
    
    // METODOS
    public boolean dead() {
        
        return (health <= 0);
    }
    
    public int getRow() {
        
        return row;
    }
    
    public int getCol() {
        
        return col;
    }
    
    protected float getIntelligence() {
        
        return intelligence;
    }
    
    protected float getStrength() {
        
        return strength;
    }
    
    protected float getHealth() {
        
        return health;
    }
    
    protected void setHealth(float _health) {
        
        health = _health;        
    }
    
    public void setPos(int _row, int _col) {
        
        row = _row;
        col = _col;
    }
    
    public String toString() {
        
        return "Player[ "+ name +", Intelligence: " + String.valueOf(intelligence) + 
        ", Strength: " + String.valueOf(strength) + ", Health: " + String.valueOf(health) +
        ", Row and Col " + Integer.toString(row) + ", " + Integer.toString(col) + " ]";
        
    }
    
    protected void gotWounded() {
        
         this.health--;
    }
    
    // METODOS ABSTRACTOS YA IMPLEMENTADOS EN LAS RESPECTIVAS CLASES
    public abstract float attack();
    
    public abstract boolean defend(float receivedAttack); 
}
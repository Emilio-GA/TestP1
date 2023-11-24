/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import java.util.ArrayList;


/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA A LOS JUGADORES DEL JUEGO
public class Player {
    
    
    // Maximo de armas
    private static final int MAX_WEAPONS = 2;
    
    
    // Maximo escudos
    private static final int MAX_SHIELDS = 3;
    
    
    // SALUD INICIAL
    private static final int INITIAL_HEALTH = 10;
    
    
    // GOLPES ANTES DE PERDER
    private static final int HITS2LOSE = 3;
    
    
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
    private final  ArrayList <Weapon> weapons; 
    
    
    //Lista de escudos
    private final  ArrayList <Shield> shields; 
      
    
    //constructor
    public Player (char number, float intelligence, float strength){
        
        this.name = "Player " + number;
        this.number = number;
        this.intelligence = intelligence;
        this.strength = strength;
        
        shields = new ArrayList <>();
        
        weapons = new ArrayList <>();
        

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
    
    
    // Comprueba si esta muerto
    public boolean dead(){
        
        return health <= 0;
    }
    
    
    // Metodo move
    public Directions move(Directions direction, ArrayList<Directions> validMoves) {
       
        int size = validMoves.size();
        
        boolean contained = validMoves.contains(direction);
                
        if ((size > 0 ) && !contained) {
            
            return validMoves.get(0);
        
        } else {
            
            return direction;
        }        
    }
    
    
    // Devuelve fuerza del ataque
    public float attack(){
        
        return strength+this.sumWeapons();
    }
        
    
    // Metodo defend
    public boolean defend(float receivedAttack){
        
        return this.manageHit(receivedAttack);
    }
    
  
    // Recibir premio
     public void receiveReward(){
         
         int wReward = Dice.weaponsReward();
         int sReward = Dice.shieldsReward();
         
         for (int i = 0; i < wReward; i++){
             
            Weapon wnew = newWeapon();
            
            receiveWeapon(wnew);
            
         }
         
         for (int i = 0; i < sReward ; i++){
             
            Shield snew = newShield();
            
            receiveShield(snew);
            
         }
         
         int extraHealth = Dice.healthReward();
         
         health += extraHealth;

     }
    
    
    // METODO TOSTRING
    public String toString() {
        
        return "Player[ "+ name +" , Number: "+ number + ",  Intelligence: " + String.valueOf(intelligence) + 
        ", Strength: " + String.valueOf(strength) + ", Health: " + String.valueOf(health) +
        ", Row and Col " + Integer.toString(row) + ", " + Integer.toString(col)  + 
        ", ConsecutiveHits: "+ Integer.toString(consecutiveHits) + ", Shields: " +stringShields() + 
        ", Weapons: " +stringWeapons() +  " ]";
    }
    
    
    private String stringShields(){
               
        String s = "";
        
        for (int i = 0; i < shields.size(); i++) {
  
            s += shields.get(i).toString() + "   ";
        }
        
        return s;
        
    }
    
        private String stringWeapons(){
               
        String w = "";
        
        for (int i = 0; i < weapons.size(); i++) {
  
            w += weapons.get(i).toString() + "  ";
        }
        
        return w;
        
    }
    
    
    // Recibir arma
    private void receiveWeapon(Weapon w){
        
        for (int i = 0; i < weapons.size(); i++) {
            

            Weapon wi = weapons.get(i);
            System.out.println("Se comprueba");
            System.out.println(wi.toString());
            boolean discard = wi.discard();
            
            if (discard) {
                System.out.println("Se descarta");
                System.out.println(wi.toString());
                weapons.remove(wi);
            }
        }
        
        int size = weapons.size();
        
        if (size < MAX_WEAPONS) {
            
            weapons.add(w);
        }
    }
    
    
    // Recibir escudo
    private void receiveShield (Shield s){
        
        for (int i = 0; i < shields.size(); i++) {
            
            
            Shield si = shields.get(i);
            System.out.println("Se comprueba");
            System.out.println(si.toString());
            
            boolean discard = si.discard();
            
            
            if (discard) {
                System.out.println("Se descarta");
                System.out.println(si.toString());
                shields.remove(si);
            }
        }
        
        int size = shields.size();
        
        if (size < MAX_SHIELDS) {
            
            shields.add(s);
        }
    }
    
    
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
    
    
    // METODO manageHit
    boolean manageHit(float receivedAttack){
    
        boolean lose;
        float defense = this.defensiveEnergy();
        
        if (defense < receivedAttack) {
            
            this.gotWounded();
            this.incConsecutiveHits();
            
        } else {
            
            this.resetHits();
        }
        
        if ((this.consecutiveHits == HITS2LOSE) || this.dead()) {
            
            this.resetHits();
            lose = true;
            
        } else {
            
            lose = false;
        }
        
        return lose;
    }
    
    
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
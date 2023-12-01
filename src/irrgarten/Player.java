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
public class Player extends LabyrinthCharacter {
    
    
    // Maximo de armas
    private static final int MAX_WEAPONS = 2;
    
    
    // Maximo escudos
    private static final int MAX_SHIELDS = 3;
    
    
    // SALUD INICIAL
    private static final int INITIAL_HEALTH = 10;
    
    
    // GOLPES ANTES DE PERDER
    private static final int HITS2LOSE = 3;
    
    
    //numero
    private char number;
    
    
    //golpes consecutivos
    private int consecutiveHits;
    
    
    //Lista de armas
    private ArrayList <Weapon> weapons; 
    
    
    //Lista de escudos
    private ArrayList <Shield> shields; 
    
    
    // WeaponCardDeck
    private WeaponCardDeck weaponCardDeck;
    
    
    //ShieldCardDeck
    private ShieldCardDeck shieldCardDeck;
    
    

    // CONSTRUCTOR


    public Player (char number, float intelligence, float strength){
        

        super("Player#" + number, intelligence, strength, INITIAL_HEALTH);
        
        this.number = number;
        consecutiveHits = 0;
        
        shields = new ArrayList <>();
        weapons = new ArrayList <>();
        
        weaponCardDeck = new WeaponCardDeck();

        shieldCardDeck = new ShieldCardDeck();   
    }
    
    
    // constructor de copia
    public Player(Player other) {
        
        // LLamada a constructor de copia de LabyrinthCharacter
        super(other); 
        
        // Atributos propios
        number = other.number;
        consecutiveHits = other.consecutiveHits;
        shields = other.shields;
        weapons = other.weapons;

        setPos(other.getRow(), other.getCol());
        
        weaponCardDeck = new WeaponCardDeck();
        shieldCardDeck = new ShieldCardDeck();
    }
    
    
    //resucitar
    public void resurrect(){
        
        this.resetHits();
        this.setHealth(INITIAL_HEALTH);
        

        weapons.clear();
        shields.clear();
    }  
    
    
    // devolver numero del jugador
    public char getNumber(){
        
        return number;    
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
    @Override
    public float attack(){
        
        return this.getStrength()+this.sumWeapons();
    }
        
    
    // Metodo defend
    @Override
    public boolean defend(float receivedAttack){
        
        return this.manageHit(receivedAttack);
    }
    
  
    // Recibir premio
    public void receiveReward(){
         

         int wReward = Dice.weaponsReward();
         int sReward = Dice.shieldsReward();
         
         for (int i = 0; i < wReward; i++){
             
            //Weapon wnew = newWeapon();
            
            //receiveWeapon(wnew);
            
             receiveWeapon(weaponCardDeck.nextCard());
         }
         
         for (int i = 0; i < sReward ; i++){
             
            //Shield snew = newShield();
            
            //receiveShield(snew);
            
            receiveShield(shieldCardDeck.nextCard());
         }
         
         int extraHealth = Dice.healthReward();
         
         float health = this.getHealth();
         
         health += extraHealth;
    }
    
    
    // METODO TOSTRING
    public String toString() {
        
        return "Player[ "+  super.toString() + ", ConsecutiveHits: "+ Integer.toString(consecutiveHits) 
        + ", Shields: " +stringShields() + ", Weapons: " +stringWeapons() +  " ]";
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
    protected float sumWeapons(){
        
        float suma=0;
        
        for (int i= 0 ; i < weapons.size(); i++){
            
            suma += weapons.get(i).attack();
        }
        
        return suma;
    }
    
    
    // SUMA LA PROTECCIÓN DE TODOS LOS ESCUDOS
    protected float sumShields(){
        
        float suma=0;
        
        for (int i= 0 ; i < shields.size(); i++){
            
            suma += shields.get(i).protect();
        }
        
        return suma;    
    
    }
    
    
    //DEVUELVE LA SUMA DE PROTECCIÓN DE LOS ESCUDOS MAS LA INTELIGENCIA
    protected float defensiveEnergy(){
        
        return this.getIntelligence()+this.sumShields();
    }
    
    
    // METODO manageHit
    private boolean manageHit(float receivedAttack){
    
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
    
   
    //AÑADE GOLPES CONSECUTIVOS
    private void incConsecutiveHits(){
        
        consecutiveHits++;
    }
}
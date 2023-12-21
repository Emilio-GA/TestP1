/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA A LOS MONSTRUOS DEL JUEGO
public class Monster extends LabyrinthCharacter {
    
    
    // VARIABLE SALUD INITIAL    
    private static final int INITIAL_HEALTH = 5;
    
    
    // CONSTRUCTOR
    public Monster (String name, float intelligence, float strength){
        
        // TO-DO: esa salud es correcta
        super(name, intelligence, strength, INITIAL_HEALTH);
    }
    
  
    // METODO ATTACK utiliza el dado 
    public float attack() {
        
        return Dice.intensity(this.getStrength());
    }
    
    
    // METODO DEFEND
    public boolean defend(float receivedAttack) {
        
        boolean isDead = this.dead();
       
        if (!isDead) {
           
            float defensiveEnergy = Dice.intensity(this.getIntelligence());
       
            if (defensiveEnergy < receivedAttack) {
                
                this.gotWounded();
                isDead = this.dead();
            }
        }
        
        return isDead;   
    }
    
    public String toString() {
        
    return "Monster [" +  super.toString() + "]";
    }
}
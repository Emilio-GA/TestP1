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

// CLASE FUZZYPLAYER
public class FuzzyPlayer extends Player { 
    
    public FuzzyPlayer(Player other){
      super(other);  
    }
    
    public Directions move(Directions direction, ArrayList <Directions> validMoves){
        return Dice.nextStep(direction, validMoves, this.getIntelligence());
    }
    
    public float attack(){
        return sumWeapons()+ Dice.intensity(this.getStrength());
    }
    
    protected float defensiveEnergy(){
        return sumShields() + Dice.intensity(this.getIntelligence());
    }
    
    public String toString(){
        return "Fuzzy" + super.toString();
    }
        
}

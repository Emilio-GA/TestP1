/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE COMBATELEMENT
public abstract class CombatElement {
        
    
    // PROTECCION DEL JUGADOR
    private float effect;
    
    
    // USO DE UN JUGADOR PARA LOS ESCUDOS
    private int uses;
    
    
    // METODOS
    public CombatElement(float effect, int uses){
        
        this.effect= effect;
        this.uses = uses;
    }
    
    protected float produceEffect(){
        
        if (this.uses > 0){
            
            uses--;
            return effect;
        
        } else{
            
            return 0;
        }
        
    }
    
    public boolean discard(){
        
        return Dice.discardElement(uses);
    }
    
    public String toString(){
        
        return "[effect " + String.valueOf(effect) + ", uses " + Integer.toString(uses)+ "]";
        
    }
}
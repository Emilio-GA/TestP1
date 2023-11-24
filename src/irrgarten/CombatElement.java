/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author egalv
 */
abstract public class CombatElement {
        
    // PROTECCION DEL JUGADOR
    private float effect;
    
    
    // USO DE UN JUGADOR PARA LOS ESCUDOS
    private int uses;
    
    public CombatElement(float effect, int uses){
        this.effect= effect;
        this.uses = uses;
    }
    
    float produceEffect(){
        if (this.uses > 0){
            
            uses--;
            return effect;
        
        }else{
            
            return 0;
        }
        
    }
    
    public boolean discard(){
        
        return Dice.discardElement(uses);
    }
    
     public String toString(){
        
        return   String.valueOf(effect) + ", uses " + Integer.toString(uses)+ "]";
        
    }
}

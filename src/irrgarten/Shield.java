/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA LOS ESCUDOS QUE USA EL JUGADOR CUANDO SE DEFIENDE DE UN ATAQUE DE UN MONSTRUO
public class Shield extends CombatElement {
      
    
    // CONSTRUCTOR
    public Shield (float valorpro, int valoru){
        
        super(valorpro, valoru);
    }
    
    
    // METODO QUE REPRESENTA LA INTENSIDAD DE LA DEFENSA DEL JUGADOR
    public float protect (){
        
        return produceEffect(); 
    }
    
    
     // MÉTODO QUE DA LA PROTECCION Y LOS USOS QUE TENDRÁ UN ESCUDO EN FORMATO TEXTO
    public String toString(){        
        
        return "S[ protection " + super.toString();
    }
}
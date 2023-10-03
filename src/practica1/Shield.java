/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA LOS ESCUDOS QUE USA EL JUGADOR CUANDO SE DEFIENDE DE UN ATAQUE DE UN MONSTRUO
public class Shield {
    
    
    // PROTECCION DEL JUGADOR
    private static float protection;
    
    
    // USO DE UN JUGADOR PARA LOS ESCUDOS
    private static int uses;
    
    
    // CONSTRUCTOR
    public Shield (float valorpro, int valoru){
        
        protection = valorpro;
        uses = valoru;
    }
    
    
    // METODO QUE REPRESENTA LA INTENSIDAD DE LA DEFENSA DEL JUGADOR
    public static float protect (){
        
        if (uses > 0){
            
            uses--;
            return protection;
        
        } else{
            
            return 0;
        }
        
    }
    
    
     // MÉTODO QUE DA LA PROTECCION Y LOS USOS QUE TENDRÁ UN ESCUDO EN FORMATO TEXTO
    public String toString(){        
        
        return "S[" + String.valueOf(protection) + "," + String.valueOf(uses)+ "]";
    }
    
    
    // MÉTODO QUE DECIDE SI UN ESCUDO DEBE SER DESCARTADO
    public static boolean discard() {
        
        return Dice.discardElement(uses);
    }
}
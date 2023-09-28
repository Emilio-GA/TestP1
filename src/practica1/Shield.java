/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;


/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */
public class Shield {
    
    private float protection;
    private int uses;
    
    public Shield (float valorpro, int valoru){
        
        protection = valorpro;
        uses = valoru;
    }
    
    
    public float protect (){
        if (uses > 0){
            uses--;
            return protection;
        }else{
            return 0;
        }
        
    }
    
    
    public String toString(){        
        
        return  "S[" + String.valueOf(protection) + "," + String.valueOf(uses)+ "]";
    }
}

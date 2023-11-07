/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import irrgarten.Game;
import irrgarten.UI.TextUI;
import irrgarten.controller.Controller;

/**
 *
 * @author egalv
 */
public class Main {
   public static void main(String[] args) {
       
       
    
        Game juego = new Game(1);
    
    
    
            TextUI text = new TextUI ();
    
                    Controller contolo = new Controller(juego, text);
    
                        contolo.play();
            
    
      }
}

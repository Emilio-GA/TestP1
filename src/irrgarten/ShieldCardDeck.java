/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE SHIELDCARDDECK
public class ShieldCardDeck extends CardDeck<Shield> {
    
    @Override
    protected void addCards() {
       
        super.addCard(new Shield(20, 5));
        super.addCard(new Shield(10, 4));
        super.addCard(new Shield(5, 3));
        super.addCard(new Shield(15, 2));
        super.addCard(new Shield(6, 2));
    }
}
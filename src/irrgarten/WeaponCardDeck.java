/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;



/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE WEAPONCARDDECK
public class WeaponCardDeck extends CardDeck<Weapon> {
    
    @Override
    protected void addCards() {
        
        super.addCard(new Weapon(20, 5));
        super.addCard(new Weapon(10, 4));
        super.addCard(new Weapon(15, 3));
        super.addCard(new Weapon(5, 2));
        super.addCard(new Weapon(4, 2));
    }
}

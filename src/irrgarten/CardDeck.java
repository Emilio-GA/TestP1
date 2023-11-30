/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 * 
 * @param <T>
 */

// CLASE ABSTRACTA CARDDECK
public abstract class CardDeck<T> {
    
    private ArrayList<T> cardDeck;
    
    // CONSTRUCTOR
    public CardDeck() {
        
        cardDeck = new ArrayList<>();
    }
    
    // METODOS
    protected abstract void addCards();
    
    protected void addCard(T card) {
        
        cardDeck.add(card);
    }
    
    public T nextCard() {
        
        
        if (cardDeck.isEmpty()) {
            
            this.addCards();
            Collections.shuffle(cardDeck);
        }
        
        // Selecciona primera carta
        T carta = cardDeck.get(0);
        
        // Elimina de colección
        cardDeck.remove(carta);
        
        // Devolver carta seleccionada
        return carta;
    }
}
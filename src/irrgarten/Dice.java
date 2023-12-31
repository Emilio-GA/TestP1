
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.Random;
import java.util.ArrayList;


/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE TIENE LA RESPONSABILIDAD DE TOMAR LAS DECISIONES QUE DEPENDEN DEL AZAR EN EL JUEGO (DADO).
public class Dice {
    
    
    // VARIABLE QUE REPRESENTA EL NÚMERO MAXIMO DE USOS DE ARMAS Y ESCUDOS
    private static final int MAX_USES = 5;
    
    
    // VARIABLE QUE REPRESENTA EL VALOR MAXIMO PARA LA INTELIGENCIA DE JUGADORES Y MOSNTRUOS
    private static final float MAX_INTELLIGENCE = 10.0f;
    
    
    // VARIABLE QUE REPRESENTA EL VALOR MAXIMO PARA LA FUERZA DE JUGADORES Y MOSNTRUOS
    private static final float MAX_STRENGTH = 10.0f;
    
    
    // VARIABLE QUE REPRESENTA LA PROBABILIDAD DE QUE UN JUGADOR SEA RESUCITADO EN CADA TURNO
    private static final float RESURRECT_PROB = 0.3f;
    
    
    // VARIABLE QUE REPRESENTA EL NUMERO MAXIMO DE ARMAS RECIBIDAS AL GANAR UN COMBATE
    private static final int WEAPONS_REWARD = 2;
    
    
    // VARIABLE QUE REPRESENTA EL NUMERO MAXIMO DE ESCUDOS RECIBIDOS AL GANAR UN COMBATE
    private static final int SHIELDS_REWARD = 3;
    
    
    // VARIABLE QUE REPRESENTA EL NUMERO MAXIMO DE UNIDADES DE SALUD RECIBIDAS AL GANAR UN COMBATE
    private static final int HEALTH_REWARD = 5;
    
    
    // VARIABLE QUE REPRESENTA LA MAXIMA POTENCIA DE LAS ARMAS
    private static final int MAX_ATTACK = 3;
    
    
    // VARIABLE QUE REPRESENTA LA MAXIMA POTENCIA DE LOS ESCUDOS
    private static final int MAX_SHIELD = 2;
    
    
    // VARIABLE QUE GENERA NUMEROS ALEATORIOS
    private static final Random generator = new Random();
    
    
    // METODO QUE DEVUELVE UN NUMERO DE FILA O COLUMNA ALEATORIA SIENDO EL PARAMETRO
    // EL NUMERO DE FILAS O COLUMNAS DEL TABLERO
    public static int randomPos(int max) {
        
        return generator.nextInt(max);
    }
    
    
    // METODO QUE DEVUELVE EL INDICE DEL JUGADOR QUE COMENZARA LA PARTIDA, SIENDO
    // EL PARAMETRO EL NUMERO DE JUGADORES EN LA PARTIDA
    public static int whoStarts(int nplayers) {
        
        return generator.nextInt(nplayers);
    }
    
    
    // METODO QUE DEVUELVE UN VALOR ALEATORIO DE INTELIGENCIA DEL INTERVALO [0, MAX_INTELLIGENCE]
    public static float randomIntelligence() {
        
        return generator.nextFloat(MAX_INTELLIGENCE);
    }
    
    
    // METODO QUE DEVUELVE UN VALOR ALEATORIO DE FUERZA DEL INTERVALO [0, MAX_STRENGTH]
    public static float randomStrength() {
        
        return generator.nextFloat(MAX_STRENGTH);
    }
    
    
    // METODO QUE INDICA SI UN JUGADOR MUERTO DEBE SER RESUCITADO O NO
    public static boolean resurrectPlayer() {
        
        boolean resurrected = generator.nextFloat() < RESURRECT_PROB;
        
        return resurrected;
    }
    
    
    // METODO QUE INDICA LA CANTIDAD DE ARMAS QUE RECIBIRA EL JUGADOR SI GANA EL COMBATE ENTRE [0, WEAPONS_REWARD]
    public static int weaponsReward() {
        
        return generator.nextInt(0, WEAPONS_REWARD);
    }
    
    
    // METODO QUE INDICA LA CANTIDAD DE ESCUDOS QUE RECIBIRA EL JUGADOR SI GANA EL COMBATE ENTRE [0, SHIELDS_REWARD]
    public static int shieldsReward() {
        
        return generator.nextInt(0, SHIELDS_REWARD);
    }
    
    
    // METODO QUE INDICA LA CANTIDAD DE UNIDADES DE SALUD QUE RECIBIRA EL JUGADOR SI GANA EL COMBATE ENTRE [0, HEALTH_REWARD]
    public static int healthReward() {
        
        return generator.nextInt(0, HEALTH_REWARD);
    }
    
    
    // METODO QUE DEVUELVE UN VALOR ALEATORIO ENTRE [0, MAX_ATTACK]
    public static float weaponPower() {
        
        return generator.nextFloat(0, MAX_ATTACK);
    }
    
    
    // METODO QUE DEVUELVE UN VALOR ALEATORIO ENTRE [0, MAX_SHIELD]
    public static float shieldPower() {
        
        return generator.nextFloat(0, MAX_SHIELD);
    }
    
    
    // METODO QUE DEVUELVE EL NUMERO DE USOS QUE SE LE ASIGNARA A UN ARMA O ESCUDO ENTRE [0, MAX_USES]
    public static int usesLeft() {
        
        return generator.nextInt(0, MAX_USES);
    }
    
    
    // METODO QUE DEVUELVE LA CANTIDAD DE COMPETENCIA APLICADA ENTRE [0, competence]
    public static float intensity(float competence) {
        
        return generator.nextFloat(0, competence);
    }
    
    
    // METODO QUE DEVUELVE LA PROBABILIDAD DE QUE UN ARMA O ESCUDO SEA DESCARTADO.
    // LAS ARMAS CON MÁS USOS POSIBLES ES MENOS PROBABLE QUE SEAN DESCARTADOS Y VICEVERSA
    public static boolean discardElement(int usesLeft) {
        
        boolean discard = generator.nextFloat() < 1.0 * (MAX_USES - usesLeft) / MAX_USES;
        
        return discard;     
    }
    
    // METODO NEXTSTEP DE LA PRACTICA 4
    public static Directions nextStep(Directions preference, ArrayList<Directions> validMoves, float intelligence) {
        
        // No queremos una inteligencia que no este entre 0 y 10.
        assert(intelligence >= 0 && intelligence <= 10);
        
        float probabilidad = intelligence / MAX_INTELLIGENCE;
        
        if (generator.nextFloat() < probabilidad) {
            
            return preference;
        }
        
        else {
            
            // Devolver una dirección aleatoria mediante un indice aleatorio del ArrayList
            return validMoves.get(generator.nextInt(validMoves.size()));
        }
    }
}
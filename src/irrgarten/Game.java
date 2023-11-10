/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import java.util.ArrayList;


/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA A LOS MONSTRUOS DEL JUEGO
public class Game {
    
    
    // VARIABLE MAX_ROUNDS
    private static int MAX_ROUNDS = 10;
    
    
    // VARIABLE CURRENTPLAYERINDEX
    private int currentPlayerIndex;
    
    
    // VARIABLE CURRENTPLAYER
    private Player currentPlayer;
    
    
    // VARIABLE ARRRAYLIST PLAYERS
    private ArrayList<Player> players;
    
    
    // VARIABLE ARRAYLIST MONSTERS
    private ArrayList<Monster> monsters;
    
    
    // VARIABLE LABYRINTH
    private Labyrinth labyrinth;
    
    
    // VARIABLE LOG
    private String log;
    
    
    // CONSTRUCTOR
    public Game(int nplayers) {
        
        // Indice jugador actual
        currentPlayerIndex = Dice.whoStarts(nplayers);
        
        // Log
        log = "";
        
        // Jugadores
        players = new ArrayList<Player> ();
        for (int i = 0; i < nplayers; i++) {
            
            players.add(new Player(Integer.toString(i).charAt(0), Dice.randomIntelligence(), Dice.randomStrength()));
        }
        
        //Asignar el jugador que empieza
        currentPlayer = players.get(currentPlayerIndex);
        
        
        // Monstruos
        monsters = new ArrayList<Monster> ();
        
        // Laberinto
        labyrinth = new Labyrinth(5, 6, 3, 3);
        
        this.configureLabyrinth();
        // spreadPlayers(players);
        
    }
    
    
    // METODO FINISHED
    public boolean finished() {
        
        return labyrinth.haveAWinner();
    }
          
    
    // METODO GETGAMESTATE
 
    // METODOS AUXILIARES PARA ELLO
    private String stringPlayer() {
        
        String pl = "";
        
        for (int i = 0; i < players.size(); i++) {
                
            pl += players.get(i).toString() + "\n";
        }
        
        return pl;
    }
    
    
    private String stringMonster() {
        
        String mo = "";
        
        for (int i = 0; i < monsters.size(); i++) {
  
            mo += monsters.get(i).toString() + "\n";
        }
        
        return mo;
    }
    
    public GameState getGameState() {
        
        GameState GS = new GameState(labyrinth.toString(), stringPlayer(), stringMonster(), currentPlayerIndex, this.finished(), log);
        return GS;
    }
    
    
    // METODO CONFIGURELABYRINTH
    private void configureLabyrinth() {
        
       // Monstruos
       Monster m1 = new Monster("m1", 100, 100);
       Monster m2 = new Monster("m2", Dice.randomIntelligence(), Dice.randomStrength());
       Monster m3 = new Monster("m3", Dice.randomIntelligence(), Dice.randomStrength());
       Monster m4 = new Monster("m4", Dice.randomIntelligence(), Dice.randomStrength());
    
       // Guardar monstruos en laberinto 
       labyrinth.addMonster(0, 1, m1);
       labyrinth.addMonster(1, 2, m2);
       labyrinth.addMonster(2, 3, m3);
       labyrinth.addMonster(3, 4, m4);
       
       // Guardar en contenedor
       monsters.add(m1);
       monsters.add(m2);
       monsters.add(m3);
       monsters.add(m4);
       
       // Bloques de obstaculos
       
       labyrinth.addBlock(Orientation.HORIZONTAL, 0, 2, 1);
       labyrinth.addBlock(Orientation.HORIZONTAL, 1, 0, 1);
       labyrinth.addBlock(Orientation.VERTICAL, 2, 1, 1);
       labyrinth.addBlock(Orientation.VERTICAL, 3, 0, 1);
       
       // Spread Players
       labyrinth.spreadPlayers(this.players);
               

    }
    
    
    // METODO NEXTPLAYER
    private void nextPlayer() {
        
        this.currentPlayerIndex = ((currentPlayerIndex + 1) % players.size());
        this.currentPlayer = players.get(currentPlayerIndex);
        
    }
    
    
    // METODO ACTUALDIRECTIONS TERMINAR
    private Directions actualDirection(Directions preferredDirection) {
       
        System.out.println("posición actual");
        int currentRow =this.currentPlayer.getRow();
        System.out.println(currentRow);
        int currentCol =this.currentPlayer.getCol();
        System.out.println(currentCol);
        ArrayList<Directions> validMoves = labyrinth.validMoves(currentRow, currentCol);
        
        return currentPlayer.move(preferredDirection,validMoves);
    } 
    
    
    // METODO COMBAT
    private GameCharacter combat(Monster monster) {
        
        int rounds = 0;
        GameCharacter winner = GameCharacter.PLAYER;
        
        float playerAttack = currentPlayer.attack();
        
        
        boolean lose = monster.defend(playerAttack);
        
        while ((!lose)&& (rounds < MAX_ROUNDS)){
            
            winner = GameCharacter.MONSTER;
            rounds++;
            float monsterAttack = monster.attack();
            lose = currentPlayer.defend(monsterAttack);
            
            if (!lose){
                
                playerAttack= currentPlayer.attack();
                winner = GameCharacter.PLAYER;
                lose = monster.defend(playerAttack);
            }  
        }
        
        logRounds(rounds, MAX_ROUNDS);
        return winner;
    }
    
    
    // METODO MANAGEREWARD
    private void manageReward(GameCharacter winner) {
        
        if (winner == GameCharacter.PLAYER){
            
            currentPlayer.receiveReward();
            logPlayerWon();
        
        } else {
            
            logMonsterWon();
        }
    }
    
    
    // METODO MANAGERESURRECTION
    private void manageResurrection() {
        boolean resurrect= Dice.resurrectPlayer();
        
        if (resurrect){
            
            currentPlayer.resurrect();
            logResurrected();
             
        } else {
            
            logPlayerSkipTurn();
        }
    }
    
    
    //METODO NEXTSTEP
    public boolean nextStep(Directions preferredDirection){
        
        log = "";
        boolean dead = currentPlayer.dead();
        
        if (!dead){
            
            Directions direction = actualDirection(preferredDirection);

            if (direction != preferredDirection){
                
                logPlayerNoOrders();
            }

            Monster monster = labyrinth.putPlayer(direction, currentPlayer);

            if (monster == null){
                
                logNoMonster();
            
            }else{
                
                GameCharacter winner = combat(monster);
                manageReward(winner);
            }

        }else{

            manageResurrection();

        }
         
        boolean endGame = finished();
        
        if (!endGame){
        
            nextPlayer();
        }
         
        return endGame;
    }
    
    // METODO LOGPLAYERWON
    private void logPlayerWon() {
        
        log += "Jugador ha ganado el combate.\n";
    }
    
    
    // METODO LOGMONSTERWON
    private void logMonsterWon() {
        
        log += "Monstruo ha ganado el combate.\n";
    }
    
    
    // METODO LOGRESURRECTED
    private void logResurrected() {
        
        log += "Jugador ha resucitado.\n";
    }
    
    
    // METODO LOGPLAYERSKIPTURN
    private void logPlayerSkipTurn() {
        
        log += "Jugador ha perdido el turno por estar muerto.\n";
    }
    
    
    // METODO LOGPLAYERNOORDERS
    private void logPlayerNoOrders() {
        
        log += "Jugador no ha seguido las instrucciones del jugador humano (nofue posible).\n";
    }
    
    
    // METODO LOGNOMOSTER
    private void logNoMonster() {
        
        log += "Jugador se ha movido a una celda vacia o no ha sido posible moverse.\n";
    }
    
    
    // METODO LOGROUNDS
    private void logRounds(int rounds, int max) {
        
        log += "Se han producido " + Integer.toString(rounds) + " de " + Integer.toString(max)  + " rondas de combate.\n"; 
    }

}
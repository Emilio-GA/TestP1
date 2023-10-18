
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica1;


/**
 * @author Alberto Rodriguez Fernandez
 * @author Emilio Guillen Alvarez
 */

// CLASE QUE REPRESENTA EL LABERINTO DEL JUEGO
public class Labyrinth {
    
    // VARIABLE ESTATICA
    private static char BLOCK_CHAR = 'X';
    
    
    // VARIABLE ESTATICA
    private static char EMPTY_CHAR = '-';
    
    
    // VARIABLE ESTATICA
    private static char MONSTER_CHAR = 'M';
    
    
    // VARIABLE ESTATICA
    private static char COMBAT_CHAR = 'C';
    
    
    // VARIABLE ESTATICA
    private static char EXIT_CHAR = 'E';
    
    
    // VARIABLE ESTATICA
    private static int ROW = 0;
    
    
    // VARIABLE ESTATICA
    private static int COL = 1;
    
    
    // FILAS
    private int nRows;
    
    
    // COLUMNAS
    private int nCols;
    
    
    // EXIT FILA
    private int exitRow;
    
    
    // EXIT COLUMNA
    private int exitCol;
    
    
    // TABLA DE MONSTRUOS
    private Monster[][] MonsterSquare = new Monster[nRows][nCols];
    
    
    // TABLA DE PLAYER
    private Player[][] PlayerSquare = new Player[nRows][nCols];
    
    
    // TABLA DE LABERINTO
    private static char[][] LabyrinthSquare;

    
    // CONSTRUCTOR
    Labyrinth(int nRows, int nCols, int exitRow, int exitCol) {
        
        this.nRows = nRows;
        this.nCols = nCols;
        this.exitRow = exitRow;
        this.exitCol = exitCol;
                
        for (int i = 0; i < nRows; i++) {

            for (int j = 0; j  < nCols; j++) {

                MonsterSquare[i][j] = null;
                PlayerSquare[i][j] = null;
                LabyrinthSquare[i][j] = EMPTY_CHAR;
            }
        }   
    }
    
    
    // METODO SPREADPLAYERS
    void spreadPlayers(Player[] players) {
        
        
    }
    
    
    // METODO HAVEAWINNER
    boolean haveAWinner() {
        

    }  

    
    // METODO STRING
    public String toString() {

        
    }
    
    
    // METODO ADMONSTER
    void addMonster(int row, int col, Monster monster) {
        
        
    }
    
    
    // METODO PUTPLAYER
    Monster putPlayer(Directions direction, Player player) {
        
        
    }
        

    // METODO ADDBLOCK
    void addBlock(Orientation orientation, int startRow, int startCol, int length) {
        
        
    }
    
    
    // METODO VALIDMOVES
    Directions[] validMoves(int row, int col) {
        
        
    }
    
    
    // METODO POSOK
    boolean posOK(int row, int col) {
        
        
    }
    
    
    // METODO EMPTYPOS
    boolean emptyPos(int row, int col) {
        
        
        
    }
    
    
    // METODO MOSTERPOS
    boolean monsterPos(int row, int col) {
        
        
        
    }
    
    
    // METODO EXITPOS
    boolean exitPos(int row, int col) {
        
        
    }
    
    
    // METODO COMBATPOS
    boolean combatPos(int row, int col) {
        
        
    }
    
    
    // METODO CANSTEPON
    boolean canStepOn(int row, int col) {
        
        
    }
    
    
    // METODO UPDATEOLDPOS
    void updateOldPos(int row, int col) {
        
        
    }
    
    
    // METODO DIR2POS
    int[] dir2Pos(int row, int col, Directions direction) {
        
        
    }
    
    
    // METODO RANDOMEMPTYPOS
    int[] randomEmptyPos() {
        
        
    }
    
    
    // METODO MONSTER
    Monster putPlayer2D(int oldRow, int oldCol, int row, int col, Player player) {
        
        
    }
 
 }
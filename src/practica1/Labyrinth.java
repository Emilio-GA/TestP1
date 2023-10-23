
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
    private Monster[][] MonsterSquare; 
    
    
    // TABLA DE PLAYER
    private Player[][] PlayerSquare;
    
    
    // TABLA DE LABERINTO
    private char[][] LabyrinthSquare;

    
    // CONSTRUCTOR
    public Labyrinth(int nRows, int nCols, int exitRow, int exitCol) {
        
        this.nRows = nRows;
        this.nCols = nCols;
        this.exitRow = exitRow;
        this.exitCol = exitCol;
        
        MonsterSquare = new Monster[nRows][nCols];
        PlayerSquare = new Player[nRows][nCols];
        LabyrinthSquare = new char[nRows][nCols];
          
        for (int i = 0; i < nRows; i++) {

            for (int j = 0; j  < nCols; j++) {

                MonsterSquare[i][j] = null;
                PlayerSquare[i][j] = null;
                LabyrinthSquare[i][j] = EMPTY_CHAR;  
            }
        }
        
        LabyrinthSquare[exitRow][exitCol] = EXIT_CHAR;
    }
    
    
    // METODO SPREADPLAYERS
    // public void spreadPlayers(Player[] players) {
        
        
    // }
   
    
    // METODO HAVEAWINNER
    public boolean haveAWinner() {
        
        return PlayerSquare[exitRow][exitCol] != null;
    }  

    
    // METODO STRING
    public String toString() {

        String s = " ";
        
        for (int i = 0; i < nRows; i++) {

            for (int j = 0; j  < nCols; j++) {

                s += LabyrinthSquare[i][j] + " ";
            }
            
            s += "\n";
        } 
        
        return s;
    }
    
    
    // METODO ADMONSTER
    public void addMonster(int row, int col, Monster monster) {
        
        if (row < nRows && col < nCols && LabyrinthSquare[row][col] == EMPTY_CHAR) {
                    
            LabyrinthSquare[row][col] = MONSTER_CHAR;
            MonsterSquare[row][col] = monster;
            MonsterSquare[row][col].setPos(row, col);    
        }
    }
    
    
    // METODO PUTPLAYER
    // public Monster putPlayer(Directions direction, Player player) {
        
        
    // }
        

    // METODO ADDBLOCK
    // public void addBlock(Orientation orientation, int startRow, int startCol, int length) {
        
        
    // }
    
    
    // METODO VALIDMOVES
    // public Directions[] validMoves(int row, int col) {
        
        
    // }
    
    
    // METODO POSOK
    private boolean posOK(int row, int col) {
        
        boolean posok = false;
        
        if (row < nRows && col < nCols) {
            
            posok = true;
        }
        
        return posok;
    }
    
    
    // METODO EMPTYPOS
    private boolean emptyPos(int row, int col) {
        
        return LabyrinthSquare[row][col] == EMPTY_CHAR;
    }
    
    
    // METODO MOSTERPOS
    private boolean monsterPos(int row, int col) {
        
        return LabyrinthSquare[row][col] == MONSTER_CHAR;

    }
    
    
    // METODO EXITPOS
    private boolean exitPos(int row, int col) {
        
        return LabyrinthSquare[row][col] == EXIT_CHAR;
    }
    
    
    // METODO COMBATPOS
    private boolean combatPos(int row, int col) {
        
        return LabyrinthSquare[row][col] == COMBAT_CHAR;
    }
    
    
    // METODO CANSTEPON
    private boolean canStepOn(int row, int col) {
        
        return posOK(row, col) || emptyPos(row, col) || monsterPos(row, col) || exitPos(row, col);
    }
    
    
    // METODO UPDATEOLDPOS
    private void updateOldPos(int row, int col) {
        
        if (posOK(row, col)) {
            
            if (combatPos(row, col)) {
                
                LabyrinthSquare[row][col] = MONSTER_CHAR;
            
            } else {
                
                LabyrinthSquare[row][col] = EMPTY_CHAR;
            }
        }
    }
    
    
    // METODO DIR2POS
    private int[] dir2Pos(int row, int col, Directions direction) {
        
        int[] sol = {row, col};
        
        if (direction == direction.DOWN) {
            
            sol[0]++;
        }
        
        if (direction == direction.UP) {
            
            sol[0]--;
        }
        
        if (direction == direction.LEFT) {
            
            sol[1]--;
        }
        
        if (direction == direction.RIGHT) {
            
            sol[1]++;
        }
        
        return sol;
    }
    
    
    // METODO RANDOMEMPTYPOS
    private int[] randomEmptyPos() {
        
        int[]sol = {0, 0};

        Dice d = new Dice();

        int fila = Dice.randomPos(this.nRows);
        int columna = Dice.randomPos(this.nCols);
        
        while(!this.emptyPos(fila, columna)) {
            
            fila = Dice.randomPos(this.nRows);
            columna = Dice.randomPos(this.nCols);
        } 
        
        return sol;
    }
    
    
    // METODO MONSTER
    // private Monster putPlayer2D(int oldRow, int oldCol, int row, int col, Player player) {
        
        
    // }
 
 }
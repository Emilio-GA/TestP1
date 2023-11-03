
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
    private Monster[][] monsters; 
    
    
    // TABLA DE PLAYER
    private Player[][] players;
    
    
    // TABLA DE LABERINTO
    private char[][] labyrinth;

    
    // CONSTRUCTOR
    public Labyrinth(int nRows, int nCols, int exitRow, int exitCol) {
        
        this.nRows = nRows;
        this.nCols = nCols;
        this.exitRow = exitRow;
        this.exitCol = exitCol;
        
        monsters = new Monster[nRows][nCols];
        players = new Player[nRows][nCols];
        labyrinth = new char[nRows][nCols];
          
        for (int i = 0; i < nRows; i++) {

            for (int j = 0; j  < nCols; j++) {

                monsters[i][j] = null;
                players[i][j] = null;
                labyrinth[i][j] = EMPTY_CHAR;  
            }
        }
        
        labyrinth[exitRow][exitCol] = EXIT_CHAR;
    }
    
    
    // METODO SPREADPLAYERS
    public void spreadPlayers(Player[] players) {
        
        for (int i = 0; i < players.length; i++) {
            
            Player p;
            int[] pos = this.randomEmptyPos();
            this.putPlayer2D(-1, -1, pos[ROW], pos[COL], p);
        }
    }
   
    
    // METODO HAVEAWINNER
    public boolean haveAWinner() {
        
        return players[exitRow][exitCol] != null;
    }  

    
    // METODO STRING
    public String toString() {

        String s = "";
        
        for (int i = 0; i < nRows; i++) {

            for (int j = 0; j  < nCols; j++) {

                s += labyrinth[i][j] + " ";
            }
            
            s += "\n";
        } 
        
        return s;
    }
    
    
    // METODO ADMONSTER
    public void addMonster(int row, int col, Monster monster) {
        
        if (row < nRows && col < nCols && labyrinth[row][col] == EMPTY_CHAR) {
                    
            labyrinth[row][col] = MONSTER_CHAR;
            monsters[row][col] = monster;
            monsters[row][col].setPos(row, col);    
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
        
        return labyrinth[row][col] == EMPTY_CHAR;
    }
    
    
    // METODO MOSTERPOS
    private boolean monsterPos(int row, int col) {
        
        return labyrinth[row][col] == MONSTER_CHAR;

    }
    
    
    // METODO EXITPOS
    private boolean exitPos(int row, int col) {
        
        return labyrinth[row][col] == EXIT_CHAR;
    }
    
    
    // METODO COMBATPOS
    private boolean combatPos(int row, int col) {
        
        return labyrinth[row][col] == COMBAT_CHAR;
    }
    
    
    // METODO CANSTEPON
    private boolean canStepOn(int row, int col) {
        
        return posOK(row, col) || emptyPos(row, col) || monsterPos(row, col) || exitPos(row, col);
    }
    
    
    // METODO UPDATEOLDPOS
    private void updateOldPos(int row, int col) {
        
        if (posOK(row, col)) {
            
            if (combatPos(row, col)) {
                
                labyrinth[row][col] = MONSTER_CHAR;
            
            } else {
                
                labyrinth[row][col] = EMPTY_CHAR;
            }
        }
    }
    
    
    // METODO DIR2POS
    private int[] dir2Pos(int row, int col, Directions direction) {
        
        int[] sol = {row, col};
        
        if (direction == direction.DOWN) {
            
            sol[row]++;
        }
        
        if (direction == direction.UP) {
            
            sol[row]--;
        }
        
        if (direction == direction.LEFT) {
            
            sol[col]--;
        }
        
        if (direction == direction.RIGHT) {
            
            sol[col]++;
        }
        
        return sol;
    }
    
    
    // METODO RANDOMEMPTYPOS
    private int[] randomEmptyPos() {
        
        int[]sol = {ROW, COL};

        Dice d = new Dice();

        sol[ROW] = Dice.randomPos(this.nRows);
        sol[COL] = Dice.randomPos(this.nCols);
        
        while(!this.emptyPos(ROW, COL)) {
            
            sol[ROW] = Dice.randomPos(this.nRows);
            sol[COL] = Dice.randomPos(this.nCols);
        } 
        
        return sol;
    }
    
    
    // METODO MONSTER
    private Monster putPlayer2D(int oldRow, int oldCol, int row, int col, Player player) {
    
        Monster output = null;
                
        if (this.canStepOn(row, col)) {
            
            if (this.posOK(oldRow, oldCol)) {
                
                Player p = players[oldRow][oldCol];
                
                if (p == player) {
                    
                    this.updateOldPos(oldRow, oldCol);
                    
                } else {
                    
                    players[oldRow][oldCol] = null;
                }
            }
            
            boolean mP = this.monsterPos(row, col);
            
            if (mP) {
                
                labyrinth[row][col] = COMBAT_CHAR;
                output = monsters[row][col];
                
            } else {
                
                char number = player.getNumber();
                labyrinth[row][col] = number;
            }
            
            players[row][col] = player;
            player.setPos(row, col);
        }
        
        return output;
    }
 
 }
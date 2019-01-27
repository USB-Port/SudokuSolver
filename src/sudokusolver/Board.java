/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

/**
 *
 * @author usb-port
 */
public class Board {
    final int MAXROWS = 9;
    final int MAXCOLS = 9;
    final int WINTOTAL = 45;
    
    private final int board[][] = new int[9][9];
    
    public boolean isWin(){
        boolean isWin;
        isWin = checkAllRowAndCol();
        if(!isWin){
            isWin = checkAllBoxes();
        }
        return isWin;
    }
    
    //Check to see if all 9 boxes are coorect on the board
    public boolean checkAllBoxes(){
        boolean isWin = true;
        int i = 0, k = 0, total = 0;
        while(i < MAXROWS && isWin){
            while(k < MAXROWS && isWin){
                isWin = checkBox(i,k);
                k+=3;
            }
            i+=3;
        }
        return isWin;
    }
    
    public boolean checkBox(int row, int col){ // call with params 0, 0
        boolean isWin = true;
        int i = 0 + row, k = 0 + col, total = 0;
        while(i < row + 3 && isWin){
            while(k < col + 3 && isWin){
                total = total + this.board[i][k];
                k++;
            }
            if (total != WINTOTAL){
                isWin = false;
            }
            i++;
        }
     return isWin;
    }
    
    //Check to see if all rows and columns have the correct value for a win
    public boolean checkAllRowAndCol(){
        boolean isWin = true;
        int i = 0, k = 0;
        while(i < MAXROWS && isWin){
            int totalCols = 0;
            int totalRows = 0;
            while(k < MAXCOLS && isWin){
                totalCols = totalCols + this.board[i][k];
                totalRows = totalRows + this.board[i][k];
                k++;
            }
            if(totalCols != WINTOTAL || totalRows != WINTOTAL){
                isWin = false; 
            }
            i++; 
        }
        return isWin;   
    }
      
    
}

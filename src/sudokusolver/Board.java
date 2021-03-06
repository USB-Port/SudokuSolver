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
    
    public void printboard(){
        for(int i = 0; i < MAXROWS; i++){
            System.out.print(this.board[i][0] + "|" + this.board[i][1] + "|" + 
                    this.board[i][2]+"|");
            System.out.print(this.board[i][3] + "|" + this.board[i][4] + "|" + 
                    this.board[i][5]+"|");
            System.out.print(this.board[i][6] +"|" + this.board[i][7] + "|"  + 
                    this.board[i][8]+"|");
            System.out.println("Done");    
        }
            
    }
    
    public void setBoard(int numbers[][]){
        if(numbers.length ==9 && numbers[0].length == 9){
            for(int i = 0; i < MAXROWS; i++){
                for(int k = 0; k < MAXCOLS; k++){
                    this.board[i][k] = numbers[i][k];
                }
            }
        }
    }
    
    public boolean isWin(){
        boolean isWin;
        isWin = checkAllRowAndCol();
        if(isWin){
            isWin = checkAllBoxes();
        }
        return isWin;
    }
    
    //Check to see if all 9 boxes are coorect on the board
    public boolean checkAllBoxes(){
        boolean isWin = true;
        int i = 0, k = 0;
        while(i < MAXROWS && isWin){
            while(k < MAXROWS && isWin){
                isWin = checkBox(i,k);
                k+=3;
            }
            i+=3;
        }
        return isWin;
    }
    
    public boolean checkBox(int row, int col){ 
        boolean isWin = true;
        int i = 0 + row, total = 0;
        while(i < row + 3 && isWin){
            int k = 0 + col;
            while(k < col + 3 && isWin){
                total = total + this.board[i][k];
                k++;
            }
            i++;
        }
        if (total != WINTOTAL){
                isWin = false;
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
            k = 0;
            while(k < MAXCOLS && isWin){
                totalCols = totalCols + this.board[k][i];
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
    public int[][] solveRowandColForOneMissing(){
        int num[][] = new int[9][9];
        int i = 0, k = 0;
        while(i < MAXROWS){
            int totalCols = 0;
            int totalRows = 0;
            k = 0;
            while(k < MAXCOLS){
                totalCols = totalCols + this.board[k][i];
                totalRows = totalRows + this.board[i][k];
                k++;
            }
            i++; 
        }
        return num;
    }
      
    
}

/*
 * license: Do whatever you want
 */
package sudokusolver;

/**
 *
 * @author usb-port
 */
public class SudokuSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int num[][] = new int[9][9];
        num = initTestNumbers();
        
        Board board = new Board(); 
        board.setBoard(num);
        
        boolean isWin = board.isWin();
        
        System.out.println("The isWin is: "+isWin);
        board.printboard();
        int x = 9 % 3;
        System.out.println(x);
        
        
    }
    public static int[][] initTestNumbers(){
        int num[][] = new int[9][9];
        
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        num[0][3] = 4;
        num[0][4] = 5;
        num[0][5] = 6;
        num[0][6] = 7;
        num[0][7] = 8;
        num[0][8] = 9;
        
        num[1][0] = 4;
        num[1][1] = 5;
        num[1][2] = 6;
        num[1][3] = 7;
        num[1][4] = 8;
        num[1][5] = 9;
        num[1][6] = 1;
        num[1][7] = 2;
        num[1][8] = 3;
        
        num[2][0] = 7;
        num[2][1] = 8;
        num[2][2] = 9;
        num[2][3] = 1;
        num[2][4] = 2;
        num[2][5] = 3;
        num[2][6] = 4;
        num[2][7] = 5;
        num[2][8] = 6;
        
        num[2][0] = 7;
        num[2][1] = 8;
        num[2][2] = 9;
        num[2][3] = 1;
        num[2][4] = 2;
        num[2][5] = 3;
        num[2][6] = 4;
        num[2][7] = 5;
        num[2][8] = 6;
        
        num[3][0] = 2;
        num[3][1] = 1;
        num[3][2] = 4;
        num[3][3] = 3;
        num[3][4] = 6;
        num[3][5] = 5;
        num[3][6] = 8;
        num[3][7] = 9;
        num[3][8] = 7;
        
        num[4][0] = 3;
        num[4][1] = 6;
        num[4][2] = 5;
        num[4][3] = 8;
        num[4][4] = 9;
        num[4][5] = 7;
        num[4][6] = 2;
        num[4][7] = 1;
        num[4][8] = 4;
        
        num[5][0] = 8;
        num[5][1] = 9;
        num[5][2] = 7;
        num[5][3] = 2;
        num[5][4] = 1;
        num[5][5] = 4;
        num[5][6] = 3;
        num[5][7] = 6;
        num[5][8] = 5;
        
        num[6][0] = 5;
        num[6][1] = 3;
        num[6][2] = 1;
        num[6][3] = 6;
        num[6][4] = 4;
        num[6][5] = 2;
        num[6][6] = 9;
        num[6][7] = 7;
        num[6][8] = 8;
        
        num[7][0] = 6;
        num[7][1] = 4;
        num[7][2] = 2;
        num[7][3] = 9;
        num[7][4] = 7;
        num[7][5] = 8;
        num[7][6] = 5;
        num[7][7] = 3;
        num[7][8] = 1;
        
        num[8][0] = 9;
        num[8][1] = 7;
        num[8][2] = 8;
        num[8][3] = 5;
        num[8][4] = 3;
        num[8][5] = 1;
        num[8][6] = 6;
        num[8][7] = 4;
        num[8][8] = 2;
        
        return num;
    }
    
}

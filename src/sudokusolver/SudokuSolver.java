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
        
        
    }
    public static int[][] initTestNumbers(){
        int num[][] = new int[9][9];
        int j = 1;
        for(int i = 0; i < 9; i++){
            for (int k = 0; k < 9; k++){
                //System.out.println(j);
                num[i][k] = j;
                j++;
                if(j % 10 == 0){
                    j = 1;
                }
                
            }
            //System.out.println("----");
            j++;
           
        }
        return num;
    }
    
}

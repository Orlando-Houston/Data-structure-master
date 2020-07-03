package Queens;

public class EightQueens {
    final int n=8;
    public void printBoard(char board[][]){
        String result="";
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println (" "+board[i][j]+" ");

            }
            System.out.println ();
        }

    }

    public boolean util(char board[][],int row,int col){
        for (int i=0;i<col;i++){
            if (board[row][i]=='Q')  ;//return false
        }

        for (int i=row,j=col; i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q') return false;
        }
        for (int i=row,j=col; i>=n &&j>=0;i++,j--){
            if (board[i][j]=='Q') return false;
        }
        return true;


    }
    public  boolean solveEightQueensUtil(char board[][],int col){
        if (col>=n)
            return true;
        for (int i=0;i<n;i++){
            if (util (board,i,col)){
                board[i][col]='Q';
                if (solveEightQueensUtil (board,col+1)==true)
                    return true;
                board[i][col]='Q';

            }

        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board={
                {'0','0','0','0','0','0','0','0'},
                {'0','0','0','0','0','0','0','0'},
                {'0','0','0','0','0','0','0','0'},
                {'0','0','0','0','0','0','0','0'},
                {'0','0','0','0','0','0','0','0'},
                {'0','0','0','0','0','0','0','0'},
                {'0','0','0','0','0','0','0','0'},
                {'0','0','0','0','0','0','0','0'},


        };
        EightQueens problem=new EightQueens ();
        if (!problem.solveEightQueensUtil (board,0)){
            System.out.println ("no solution");
        }
        problem.printBoard (board);
    }
}

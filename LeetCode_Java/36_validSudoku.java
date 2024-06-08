import java.util.*;

class ValidSudoku{
    public boolean validSudoku(char[][] board){
        HashMap<Integer, HashSet<Character>> rowsMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colsMap = new HashMap<>();
        HashMap<String, HashSet<Character>> squaresMap = new HashMap<>();

        for(int i = 0; i < 9; i++){
            rowsMap.put(i, new HashSet<>());
            colsMap.put(i, new HashSet<>());

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squaresMap.put(i + "," + j, new HashSet<>());
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (
                    rowsMap.get(i).contains(board[i][j]) ||
                    colsMap.get(j).contains(board[i][j]) ||
                    squaresMap.get((i / 3) + "," + (j / 3)).contains(board[i][j])
                ) {
                    return false;
                }

                rowsMap.get(i).add(board[i][j]);
                colsMap.get(j).add(board[i][j]);
                squaresMap.get((i / 3) + "," + (j / 3)).add(board[i][j]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidSudoku solution = new ValidSudoku();
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(solution.validSudoku(board));
    }


}

package leetcode;

import java.util.HashSet;

public class Task_36 {
    public static void main(String[] args) {
        char[][] sudoku = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

//        System.out.println(isValidSudoku(sudoku));
        System.out.println(5/3);
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> subBoxes = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.' && !rows.add(board[i][j])){
                    return false;
                }

                if(board[j][i] != '.' && !columns.add(board[j][i])){
                    return false;
                }

                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                if(board[rowIndex + j / 3][colIndex + j % 3] != '.' &&
                        !subBoxes.add(board[rowIndex + j / 3][colIndex + j % 3])){
                    return false;
                }
            }
            System.out.println("rows = " + rows);
            System.out.println("columns = " + columns);
            System.out.println("subBoxes = " + subBoxes);
        }
        return true;
    }
}

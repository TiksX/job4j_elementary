package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isFalse(char[][] board, int row) {
        return !monoHorizontal(board, row);
    }
}


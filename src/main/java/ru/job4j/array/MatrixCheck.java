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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int vol = 0; vol < board.length; vol++) {
            if (board[vol][column] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        boolean mainDiagonal = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != 'X') {
                mainDiagonal = false;
                break;
            }
        }
        boolean antiDiagonal = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][board.length - 1 - i] != 'X') {
                antiDiagonal = false;
                break;
            }
        }
        return result;
    }
}


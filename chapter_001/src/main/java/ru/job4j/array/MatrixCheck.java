package ru.job4j.array;
/**
 * MatrixCheck
 * @author Mikhail Pushkarev
 * @since 25.02.2020
 * @version 15.0
 */
public class MatrixCheck {
    /**
     * Method monoHorizontal
     * @param board - Принимает двумерный массив символов.
     * @param row - Принимает номер строки.
     * @return - Возвращает результат.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Method monoVertical
     * @param board - Принимает двумерный массив с заполненными символами в столбце.
     * @param column - Принимает номер столбца.
     * @return - Возвращает результат выполнения метода.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][column] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Method extractDiagonal
     * @param board - Принмает массив символов по диагонали.
     * @return - Возвращает Массив с символом 'X'.
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rs1 = new char[board.length];
        for (int index = 0; index < rs1.length; index++) {
            rs1[index] = board[index][index];
        }
        return rs1;
    }

    /**
     * Method isWin - Метод принимает массив символов.
     * @param board - Принимает Массив символов, если символ  'X'  находится в ряд столбца или в ряд
     *              строки, то результат true. Иначе false.
     * @return - Возвращает результат выполнения метода.
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                    break;
                }

        }
        return result;
    }
}

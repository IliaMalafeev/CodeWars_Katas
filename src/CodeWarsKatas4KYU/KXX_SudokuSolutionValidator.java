package CodeWarsKatas4KYU;

import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    <---------------THIS KATA IS MARKED "RETIRED".---------------->\

    Sudoku Background

    Sudoku is a game played on a 9x9 grid.
    The goal of the game is to fill all cells of the grid with digits from 1 to 9,
    so that each column, each row, and each of the nine 3x3 sub-grids
    (also known as blocks) contain all the digits from 1 to 9.

    Write a function that accepts a 2D array representing a Sudoku board,
    and returns true if it is a valid solution, or false otherwise.
    The cells of the sudoku board may also contain 0's, which will represent empty cells.
    Boards containing one or more zeroes are considered to be invalid solutions.

    The board is always 9 cells by 9 cells, and every cell only contains integers from 0 to 9.
---------------------------------------------------> */

public class KXX_SudokuSolutionValidator {
    public static void main(String[] args) {
        int [][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(checkSudoku(sudoku));
    }

    public static boolean checkSudoku(int [][] sudoku) {

        int[][] subSquares = new int[sudoku.length][sudoku.length];
        int [][] rotatedSudoku = new int[sudoku.length][sudoku.length];

        for (int i = 0; i < sudoku.length; i++) {

            if (Arrays.stream(sudoku[i]).filter(x -> (x > 0) && (x < 10)).distinct().count() != 9) return false;

            for (int j = 0; j < sudoku[i].length; j++) {

                if (i < 3) {

                    if (j < 3)      subSquares[0][i * 3 + j]     = sudoku[i][j];
                    else if (j < 6) subSquares[1][i * 3 + j - 3] = sudoku[i][j];
                    else if (j < 9) subSquares[2][i * 3 + j - 6] = sudoku[i][j];

                } else if (i < 6) {

                    if (j < 3)      subSquares[3][(i - 3) * 3 + j]     = sudoku[i][j];
                    else if (j < 6) subSquares[4][(i - 3) * 3 + j - 3] = sudoku[i][j];
                    else if (j < 9) subSquares[5][(i - 3) * 3 + j - 6] = sudoku[i][j];

                } else if (i < 9) {

                    if (j < 3)      subSquares[6][(i - 6) * 3 + j]     = sudoku[i][j];
                    else if (j < 6) subSquares[7][(i - 6) * 3 + j - 3] = sudoku[i][j];
                    else if (j < 9) subSquares[8][(i - 6) * 3 + j - 6] = sudoku[i][j];

                }

                rotatedSudoku[i][j] = sudoku[j][i];
            }
        }

        for (int[] i : subSquares) {
            if (Arrays.stream(i).filter(x -> (x > 0) && (x < 10)).distinct().count() != 9) return false;
        }

        for (int[] i : rotatedSudoku) {
            if (Arrays.stream(i).filter(x -> (x > 0) && (x < 10)).distinct().count() != 9) return false;
        }

        return true;
    }
}

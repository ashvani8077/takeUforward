package Recursion;

import java.util.*;

public class NQueen {
    public static void main(String[] args) {
        int n = 4; // Change n to the size of the board
        List<List<String>> solutions = solution(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static List<List<String>> solution(int n) {
        List<List<String>> results = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(results, board, 0, n);
        return results;
    }

    public static void solve(List<List<String>> results, char[][] board, int row, int n) {
        if (row == n) {
            results.add(constructSolution(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(results, board, row + 1, n);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    public static boolean isValid(char[][] board, int row, int col, int n) {
        // Check column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        int i = row - 1, j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    public static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            solution.add(new String(board[i]));
        }
        return solution;
    }
}

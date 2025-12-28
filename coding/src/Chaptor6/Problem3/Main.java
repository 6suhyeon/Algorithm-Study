package Chaptor6.Problem3;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][move-1] != 0) {
                    int tmp = board[i][move-1];
                    board[i][move-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }
                    else {
                        stack.push(tmp);
                    }
                    break;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main p3 = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(p3.solution(n, board, m, moves));
    }
}

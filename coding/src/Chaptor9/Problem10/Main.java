package Chaptor9.Problem10;

import java.util.Scanner;

public class Main {
    static int[][] board = new int[8][8];
    static int answer = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void solution(int x, int y) {
        if(x==7 && y==7) {
            answer++;
        }
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 1 && nx <= 7 && ny>=1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    solution(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        solution(1, 1);
        System.out.println(answer);
    }
}

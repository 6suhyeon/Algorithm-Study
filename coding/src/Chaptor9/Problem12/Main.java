package Chaptor9.Problem12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int m, n, answer = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] board;

    public static void BFS(Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny] == 0) {
                    board[nx][ny] = board[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];  // 여기서 생성
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) {
                    queue.offer(new int[]{i,j});
                }
            }
        }

        BFS(queue);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                answer = Math.max(answer, board[i][j]);
            }
        }
        System.out.println(answer -1 );
    }
}

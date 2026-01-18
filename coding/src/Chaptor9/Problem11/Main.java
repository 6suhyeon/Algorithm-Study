package Chaptor9.Problem11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    static int[][] board = new int[8][8];
    static int[][] dist = new int[8][8];   // 거리 저장 (방문 체크 겸용)
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int BFS(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        dist[startX][startY] = 0;  // 시작점 거리 0

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 체크 & 통로(0) & 미방문
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7
                        && board[nx][ny] == 0 && dist[nx][ny] == 0) {

                    dist[nx][ny] = dist[x][y] + 1;  // 거리 기록
                    queue.offer(new int[]{nx, ny});

                    // 도착점 도달 시 바로 반환
                    if (nx == 7 && ny == 7) {
                        return dist[nx][ny];
                    }
                }
            }
        }

        return -1;  // 도착 불가능
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 ; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        System.out.println(BFS(1,1));
    }
}

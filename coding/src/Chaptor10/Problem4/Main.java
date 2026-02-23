package Chaptor10.Problem4;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr;

    public static int solution() {
        int answer = 0;

        // D 내림차순 정렬
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int day = arr[0][1]; // 가장 큰 D부터 시작
        int idx = 0;

        while (day >= 1) {
            // 현재 day 이하인 강연들을 큐에 추가
            while (idx < n && arr[idx][1] >= day) {
                queue.offer(arr[idx][0]);
                idx++;
            }

            // 그 날 가장 높은 강연료 선택
            if (!queue.isEmpty()) {
                answer += queue.poll();
            }

            day--;
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(solution());
    }
}

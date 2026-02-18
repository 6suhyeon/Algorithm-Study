package Chaptor10.Problem2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr;

    public static int solution() {
        int answer = 0;

        Arrays.sort(arr, (a,b) -> {
            if(a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });
        int lastEndTime = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            int start = ints[0];
            int end = ints[1];

            if (start >= lastEndTime) {
                answer++;
                lastEndTime = end;
            }
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

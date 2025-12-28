package Chaptor4.Problem3;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 첫 번째 윈도우 합 계산
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int result = sum;

        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i-k];
            result = Math.max(result, sum);

        }

        System.out.println(result);
    }
}

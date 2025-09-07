package Problem9;

import java.util.Scanner;

public class Problem2_9 {
    public int solution(int n, int[][] arr) {
        int result = 0;

        int sum1; int sum2;

        for(int i=0; i<n; i++) {
            sum1=sum2=0;
            for(int j=0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }

        sum1=0; sum2=0;

        for (int i=0; i<n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }

        result = Math.max(result, sum1);
        result = Math.max(result, sum2);

        return result;
    }

    public static void main(String[] args) {
        Problem2_9 p9 = new Problem2_9();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(p9.solution(n, arr));
    }
}

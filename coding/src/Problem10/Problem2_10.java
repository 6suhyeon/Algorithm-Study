package Problem10;

import java.util.Scanner;

public class Problem2_10 {

    public int solution(int n, int[][] arr) {
        int result = 0;

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<n+1; j++) {
                int tmp = arr[i][j];
                if(tmp > arr[i-1][j] && tmp > arr[i][j-1] && tmp > arr[i+1][j] && tmp > arr[i][j+1]) {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Problem2_10 p10 = new Problem2_10();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<n+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(p10.solution(n, arr));
    }
}

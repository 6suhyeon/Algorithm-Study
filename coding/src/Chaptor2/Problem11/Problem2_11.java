package Chaptor2.Problem11;

import java.util.Scanner;

public class Problem2_11 {

    public int solution(int n, int[][] arr) {
        int result = 0;
        int max = Integer.MIN_VALUE;


        for(int i=1; i<=5; i++) {
            int cnt = 0;
            for(int j=1; j<=n; j++) {
                for(int k=1; k<=5; k++) {
                    if(arr[i][k]==arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt > max) {
                max=cnt;
                result=i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Problem2_11 p11 = new Problem2_11();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(p11.solution(n, arr));
    }
}

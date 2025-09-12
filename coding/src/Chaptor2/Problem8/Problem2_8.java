package Chaptor2.Problem8;

import java.util.Scanner;

public class Problem2_8 {
    public int[] solution(int n, int[] arr) {
        int cnt = 1;
        int[] result = new int[n];

        for(int i=0; i<n; i++) {

            for(int j=0; j<n; j++) {
                if(arr[i] < arr[j]) {
                    cnt++;
                }
            }
            result[i] = cnt;
            cnt = 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Problem2_8 p8 = new Problem2_8();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int result : p8.solution(n, arr)) {
            System.out.print(result + " ");
        }
    }
}

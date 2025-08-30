package Problem2;

import java.util.Scanner;

public class Problem2_2 {
    public int solution(int n, int[] arr) {
        int result = 1;
        int tmp = arr[0];

        for(int i =1; i < n; i++) {
            if(arr[i] > tmp) {
                result++;
                tmp = arr[i];
            }
        }


        return result;
    }

    public static void main(String[] args) {
        Problem2_2 p2 = new Problem2_2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(p2.solution(n, arr));
    }
}

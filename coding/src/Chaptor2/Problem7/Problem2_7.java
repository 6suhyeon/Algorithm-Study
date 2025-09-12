package Chaptor2.Problem7;

import java.util.Scanner;

public class Problem2_7 {
    public int solution(int n, int[] arr) {
        int result = 0;
        int target = 0;

        for(int i = 0; i<n; i++) {
            if(arr[i] == 0) {
                target = 0;
                result += target;
            }

            else {
                target++;
                result += target;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Problem2_7 p7 = new Problem2_7();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(p7.solution(n, arr));
    }
}

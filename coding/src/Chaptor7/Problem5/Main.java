package Chaptor7.Problem5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public Character solution(int n, int[] arr) {
        char answer = 'U';
        Arrays.sort(arr);

        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                return 'D';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main p5 = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(p5.solution(n, arr));
    }
}

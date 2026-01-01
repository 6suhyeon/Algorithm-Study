package Chaptor7.Problem6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void solution(int n, int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);

        for (int i = 0; i < n; i++) {
            if(arr[i] != clone[i]) {
                System.out.print(i+1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        Main p5 = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        p5.solution(n, arr);
    }
}

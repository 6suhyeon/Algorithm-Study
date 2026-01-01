package Chaptor7.Problem3;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int target = arr[i];
            int j;
            for (j = i-1; j >= 0; j--) {
                if(arr[j] > target) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = target;
        }
        return arr;
    }

    public static void main(String[] args) {
        Main p3 = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : p3.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

package Chaptor9.Problem5;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] arr;
    static int answer = Integer.MAX_VALUE;
    public static void DFS(int L, int sum, int[] arr) {
        if(L >= answer) return;
        if(sum > m) return;
        if(sum == m) {
            answer = Math.min(answer, L);
        }
        else {
            for (int i = 0; i < n; i++) {
                DFS(L+1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        m = sc.nextInt();

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}

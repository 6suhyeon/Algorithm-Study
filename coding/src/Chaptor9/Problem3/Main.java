package Chaptor9.Problem3;

import java.util.Scanner;

public class Main {
    static int n, m, answer = 0;

    public static void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if(time > m) return;
        if(L == n) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L+1, sum+ps[L], time + pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[] score = new int[n];
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }

        DFS(0, 0, 0, score, time);
        System.out.println(answer);
    }
}


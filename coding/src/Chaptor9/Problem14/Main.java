package Chaptor9.Problem14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<int[]> house = new ArrayList<>();
    static ArrayList<int[]> pizza = new ArrayList<>();
    static int[] selected;

    public static int calcDistance() {
        int total = 0;

        for (int[] h : house) {
            int minDist = Integer.MAX_VALUE;

            for (int i = 0; i < m; i++) {
                int[] p = pizza.get(selected[i]);
                int dist = Math.abs(h[0] - p[0]) + Math.abs(h[1] - p[1]);
                minDist = Math.min(minDist, dist);
            }
            total += minDist;
        }
        return total;
    }

    public static void DFS(int L, int start) {
        if(L == m) {
            answer = Math.min(answer, calcDistance());
            return;
        }

        for (int i = start; i < pizza.size(); i++) {
            selected[L] = i;
            DFS(L+1, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        selected = new int[m];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int val = sc.nextInt();
                if(val == 1) {
                    house.add(new int[]{i,j});
                }
                else if(val == 2) {
                    pizza.add(new int[]{i, j});
                }
            }
        }

        DFS(0, 0);
        System.out.println(answer);
    }
}

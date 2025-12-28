package Chaptor5.Problem5;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public Integer solution(int n, int k, int[] arr) {
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int l = j+1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        if (Tset.size() < k) {
            return -1;
        }

        int cnt = 0;
        for (int num : Tset) {
            cnt++;
            if(cnt == k) {
                return num;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Main p5 = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(p5.solution(n, k, arr));
    }
}

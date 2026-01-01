package Chaptor7.Problem9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int count(int[] arr , int capacity) {
        int cnt = 1;
        int sum = 0;

        for (int song : arr) {
            if(sum + song > capacity) {
                cnt++;
                sum = song;
            }
            else {
                sum += song;
            }
        }

        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main p9 = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(p9.solution(n, m, arr));
    }
}

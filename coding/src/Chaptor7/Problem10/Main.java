package Chaptor7.Problem10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int count(int[] arr, int disatnce) {
        int cnt = 1;
        int lastPos = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - lastPos >= disatnce) {
                cnt++;
                lastPos = arr[i];
            }
        }

        return cnt;
    }

    public int solution(int n, int c, int[] arr) {
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1] - arr[0];
        int answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if(count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            }
            else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main p10 = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(p10.solution(n, c, arr));
    }
}

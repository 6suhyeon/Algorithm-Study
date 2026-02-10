package Chaptor10.Problem1;

import java.util.*;

public class Main {
    static int n;
    static int[][] arr;

    public static int solution() {
        Arrays.sort(arr, (a,b) -> {
            if(a[0] != b[0]) return b[0] - a[0];
            return b[1] - a[1];
        });

        int count = 0;
        int maxWeight = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            int height = ints[0];
            int weight = ints[1];

            if(weight > maxWeight) {
                maxWeight = weight;
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(solution());

    }
}
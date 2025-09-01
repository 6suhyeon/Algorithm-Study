package Problem4;

import java.util.Scanner;

public class Problem2_4 {
    public int[] solution(int n) {
        int[] result = new int[n];
        int target = 0;
        result[0] = 1;
        result[1] = 1;

        for(int i = 2; i < n; i++) {
            result[i] = result[i-2] + result[i-1];
        }

        return  result;
    }

    public static void main(String[] args) {
        Problem2_4 p4 = new Problem2_4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int result : p4.solution(n)) {
            System.out.print(result + " ");
        }
    }
}

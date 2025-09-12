package Chaptor2.Problem5;

import java.util.Scanner;

// 시간 오류
public class Problem2_5 {
    public int solution(int n) {
        int result = 0;

        for(int i = 2; i<=n; i++) {
            int count = 0;
            for(int j = 1; j <= i ; j++) {
                if(i % j == 0) count++;
            }

            if(count == 2) result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Problem2_5 p5 = new Problem2_5();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(p5.solution(n));
    }
}

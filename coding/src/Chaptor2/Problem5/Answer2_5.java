package Chaptor2.Problem5;

import java.util.Scanner;

// 에라토스테네스의 체
public class Answer2_5 {
    public int solution(int n) {
        int result = 0;
        int[] tmp = new int[n+1];

        for(int i = 2; i <= n; i++) {
            if(tmp[i] == 0) {
                result++;
                for(int j = i; j <= n; j+=i) {
                    tmp[j] = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Answer2_5 p5 = new Answer2_5();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(p5.solution(n));
    }
}

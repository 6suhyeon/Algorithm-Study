package Chaptor1.Problem12;

import java.util.Scanner;

public class Problem12 {
    public String solution(int num, String str) {
        String answer = "";

        for(int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int number = Integer.parseInt(tmp, 2);
            answer += (char)number;

            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem12 p12 = new Problem12();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(p12.solution(num, str));
    }
}

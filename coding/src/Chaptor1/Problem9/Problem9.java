package Chaptor1.Problem9;

import java.util.Scanner;

public class Problem9 {

    public Integer solution(String str) {
        String answer = "";
        str = str.replaceAll("[^0-9]", "");

        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) == '0' && i == 0) {
                continue;
            }
            answer += str.charAt(i);
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Problem9 p9 = new Problem9();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(p9.solution(str));
    }
}

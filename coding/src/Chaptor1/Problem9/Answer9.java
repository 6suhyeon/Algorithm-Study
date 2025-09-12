package Chaptor1.Problem9;

import java.util.Scanner;

public class Answer9 {

    public Integer solution(String str) {
        String answer = "";
        str = str.replaceAll("[^0-9]", "");

        for(int i = 0 ; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Answer9 p9 = new Answer9();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(p9.solution(str));
    }
}

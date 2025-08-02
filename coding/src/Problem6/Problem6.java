package Problem6;

import java.util.Scanner;

public class Problem6 {

    public String solution(String str) {
        String answer = "";

        for(int i = 0; i<str.length(); i++) {
            if(i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Problem6 p6 = new Problem6();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(p6.solution(str));
    }
}

package Problem8;

import java.util.Scanner;

public class Answer8 {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer8 p8 = new Answer8();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(p8.solution(str));
    }
}

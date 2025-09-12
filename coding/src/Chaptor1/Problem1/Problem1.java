package Chaptor1.Problem1;

import java.util.Scanner;

public class Problem1 {
    public int solution(String str, char t) {
        int answer=0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem1 p1 = new Problem1();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        System.out.println(p1.solution(str, t));
    }
}

package Problem7;

import java.util.Scanner;

public class Problem7 {

    public String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.reverse();

        if(str.equalsIgnoreCase(stringBuilder.toString())) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Problem7 p7 = new Problem7();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(p7.solution(str));
    }
}

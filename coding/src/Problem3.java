import java.util.Scanner;

public class Problem3 {
    public String solution(String str) {
        String answer = "";

        String[] s = str.split(" ");

        for (String string : s) {
            if (string.length() > answer.length()) {
                answer = string;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem3 p3 = new Problem3();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(p3.solution(str));
    }
}

import java.util.Scanner;

public class Problem2 {
    public StringBuilder solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            }
            else {
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem2 p = new Problem2();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(p.solution(str));
    }
}

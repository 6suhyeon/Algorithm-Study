package Problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer4_1 {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            answer.add(new StringBuilder(x).reverse().toString());
        }
        return answer;
    }

    public static void main(String[] args) {
        Answer4_1 a4 = new Answer4_1();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] str = new String[num];

        for(int i=0; i<num; i++) {
            str[i] = sc.next();
        }

        for(String x : a4.solution(str)) {
            System.out.println(x);
        }
    }
}

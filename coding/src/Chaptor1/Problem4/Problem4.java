package Chaptor1.Problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public StringBuilder solution(String str) {
        StringBuilder answer = new StringBuilder();

        for(int i = str.length()-1; i>=0; i--) {
            answer.append(str.charAt(i));
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem4 p4 = new Problem4();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        List<String> list = new ArrayList<>();

        for(int i=0; i<num; i++) {
            list.add(sc.next());
        }

        for(int i=0; i<num; i++) {
            System.out.println(p4.solution(list.get(i)));
        }
    }
}

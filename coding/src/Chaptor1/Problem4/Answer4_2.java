package Chaptor1.Problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer4_2 {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++; rt --;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Answer4_2 a4 = new Answer4_2();
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

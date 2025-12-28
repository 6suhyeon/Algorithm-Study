package Chaptor6.Problem2;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(') stack.push(c);
            else if (c==')'){
                stack.pop();
            }
            else {
                if(stack.isEmpty()) answer+=c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main p2 = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.print(p2.solution(s));
    }
}

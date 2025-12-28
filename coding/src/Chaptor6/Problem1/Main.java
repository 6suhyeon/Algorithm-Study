package Chaptor6.Problem1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if(x=='(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main p1 = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(p1.solution(s));
    }
}

package Chaptor6.Problem4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(c-48);
            }
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') stack.push(lt + rt);
                else if(c == '-') stack.push(lt - rt);
                else if(c == '*') stack.push(lt * rt);
                else if(c == '/') stack.push(lt / rt);
            }
        }
        return stack.get(0);
    }

    public static void main(String[] args) {
        Main p4 = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(p4.solution(s));
    }
}

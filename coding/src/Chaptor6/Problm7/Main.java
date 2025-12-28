package Chaptor6.Problm7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String s1, String s2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char c : s1.toCharArray()) {
            queue.offer(c);
        }

        for (char c : s2.toCharArray()) {
            if (queue.contains(c)) {
                if(c != queue.poll()) {
                    return "NO";
                }
            }
        }

        if(!queue.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main p7 = new Main();
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(p7.solution(s1, s2));
    }
}

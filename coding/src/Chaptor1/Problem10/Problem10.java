package Chaptor1.Problem10;

import java.util.Scanner;

public class Problem10 {

    public int[] solution(String word, char c) {
        int[] answer = new int[word.length()];
        int target = 1000;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                target = 0;
                answer[i] = target;
            }
            else {
                target ++;
                answer[i] = target;
            }
        }

        target = 1000;
        for (int i = word.length()-1; i >= 0; i--) {
            if(word.charAt(i) == c) {
                target = 0;
                answer[i] = target;
            }
            else {
                target ++;
                answer[i] = Math.min(answer[i], target);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem10 p10 = new Problem10();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int i : p10.solution(str, c)) {
            System.out.print(i+" ");
        }
    }
}

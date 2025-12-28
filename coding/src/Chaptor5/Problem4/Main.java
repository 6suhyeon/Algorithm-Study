package Chaptor5.Problem4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public Integer solution(String s1, String s2) {
        int answer = 0;
        HashMap<Character, Integer> answerMap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s2.toCharArray()) {
            answerMap.put(c, answerMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s2.length() - 1; i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        
        int lt = 0;
        for (int rt = s2.length()-1; rt < s1.length(); rt++) {
            map.put(s1.charAt(rt), map.getOrDefault(s1.charAt(rt), 0) + 1);
            if(map.equals(answerMap)) {
                answer++;
            }

            map.put(s1.charAt(lt), map.get(s1.charAt(lt)) -1);
            if(map.get(s1.charAt(lt)) == 0) {
                map.remove(s1.charAt(lt));
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main p4 = new Main();

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.print(p4.solution(s1, s2));
    }
}

package Chaptor1.Problem8;

import java.util.Scanner;

public class Problem8 {

    public String solution(String str) {
        int lt=0; int rt = str.length() - 1;

        str = str.toLowerCase();

        char[] chars = str.toCharArray();

        while (lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) {
                lt ++;
            }
            else if (!Character.isAlphabetic(chars[rt])) {
                rt --;
            }
            else {
                if(chars[lt] != chars[rt]) {
                    return "NO";
                }
                lt ++; rt--;
            }
        }


        return "YES";
    }

    public static void main(String[] args) {
        Problem8 p8 = new Problem8();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(p8.solution(str));
    }
}

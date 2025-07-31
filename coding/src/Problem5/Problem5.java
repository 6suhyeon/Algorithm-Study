package Problem5;

import java.util.Scanner;

public class Problem5 {

    public String solution(String str) {
        char[] tmp = str.toCharArray();

        int lt = 0; int rt = tmp.length-1;
        while(lt < rt) {
            if(!Character.isAlphabetic(tmp[lt])) {
                lt++;
            }

            else if(!Character.isAlphabetic(tmp[rt])) {
                rt--;
            }
            else {
                char c = tmp[lt];
                tmp[lt] = tmp[rt];
                tmp[rt] = c;

                lt ++; rt--;
            }
        }

        return String.valueOf(tmp);
    }

    public static void main(String[] args) {
        Problem5 p5 = new Problem5();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(p5.solution(str));
    }
}

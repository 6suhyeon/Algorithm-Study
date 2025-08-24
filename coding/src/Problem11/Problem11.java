package Problem11;

import java.util.Scanner;

public class Problem11 {

    public String solution(String str) {
        String result = "";
        str = str+" ";
        int target = 1;
        char c = 0;

        for(int i = 0; i < str.length(); i++) {

            if(c != str.charAt(i)) {
                c = str.charAt(i);
                if(target == 1) {
                    target ++;
                }
                result += c;
            }
            else {
                if (c != str.charAt(i+1)) {
                    result += target;
                    target = 1;
                }
                else {
                    target++;
                }
            }
            System.out.println(result);

        }
        return result;
    }

    public static void main(String[] args) {
        Problem11 p11 = new Problem11();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(p11.solution(str));
    }
}

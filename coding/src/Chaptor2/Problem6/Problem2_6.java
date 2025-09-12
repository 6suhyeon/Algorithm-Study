package Chaptor2.Problem6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2_6 {
    public boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i=2; i<n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> result = new ArrayList<>();


        for(int i=0; i<n; i++) {
            int tmp = arr[i];
            int reverse = 0;
            while(tmp != 0) {
                int digit = tmp % 10;
                reverse = reverse * 10 + digit;
                tmp = tmp / 10;
            }
            if(isPrime(reverse)) result.add(reverse);


        }
        return result;
    }

    public static void main(String[] args) {
        Problem2_6 p6 = new Problem2_6();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : p6.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

package Chaptor2.Problem3;

import java.util.Scanner;

public class Problem2_3 {

    public String solution(int n, int[] arr1, int[] arr2) {
        String result = "";

        for(int i = 0; i < n; i++) {
            if(arr1[i] == arr2[i]) result += "D";
            else if(arr1[i]==2  && arr2[i]==1) result += "A";
            else if(arr1[i]==3  && arr2[i]==2) result += "A";
            else if(arr1[i]==1  && arr2[i]==3) result += "A";
            else result += "B";
        }

        return result;
    }

    public static void main(String[] args) {
        Problem2_3 p3 = new Problem2_3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2= new int[n];

        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for(char c : p3.solution(n, arr1, arr2).toCharArray()) {
            System.out.println(c);
        }
    }
}

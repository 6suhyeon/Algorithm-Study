package Chaptor4.Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        List result = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1<num1 && p2 < num2) {
            if (arr1[p1] < arr2[p2]) {
                result.add(arr1[p1++]);
            } else{
                result.add(arr2[p2++]);
            }
        }

        while(p1<num1) result.add(arr1[p1++]);

        while(p2<num2) result.add(arr2[p2++]);

        for (Object o : result) {
            System.out.print(o + " ");
        }
    }

}


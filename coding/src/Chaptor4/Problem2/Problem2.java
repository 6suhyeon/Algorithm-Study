package Chaptor4.Problem2;

import java.util.*;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> result = new ArrayList<>();

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int p1=0, p2=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while(p1 < n1 && p2 < n2) {

            if(arr1[p1] == arr2[p2]) {
                result.add(arr1[p1]);
                p1++; p2++;
            }
            else if (arr1[p1] < arr2[p2]) p1++;
            else p2++;

        }

        for (Object o : result) {
            System.out.print(o + " ");
        }
    }
}

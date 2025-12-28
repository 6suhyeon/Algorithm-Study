package Chaptor2.Problem12;

import java.util.Scanner;

public class Problem12 {

    public int solution(int n1, int n2, int[][] arr) {


        return 0;
    }

    public static void main(String[] args) {
        Problem12 p12 = new Problem12();
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[][] arr = new int[n2][n1];

        for(int i=0; i<n2; i++) {
            for(int j=0; j<n1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(p12.solution(n1, n2, arr));

    }
}

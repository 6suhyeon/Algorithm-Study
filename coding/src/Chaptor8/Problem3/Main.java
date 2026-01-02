package Chaptor8.Problem3;

public class Main {

    public int DFS(int n) {
        if(n == 0) return 1;
        else {
            return n * DFS(n-1);
        }
    }
    public static void main(String[] args) {
        Main p3 = new Main();
        System.out.print(p3.DFS(5));
    }
}

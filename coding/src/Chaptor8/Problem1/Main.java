package Chaptor8.Problem1;

public class Main {

    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Main p1 = new Main();
        p1.DFS(3);
    }
}

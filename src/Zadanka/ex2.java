package Zadanka;

public class ex2 {
    public static void main(String[] args) {
        alg3(10);
    }


    static void alg3(int n) {
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {

            b += a;
            a = b - a;
        }
        System.out.println(b);
    }
}

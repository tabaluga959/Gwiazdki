package Zadanka;

public class Ex {
    public static void main(String[] args) {
        alg1(10);
        alg2(10);

    }
    static void alg1(int n) {
        for (int i = 1; i < n*2; i+=2) {
            System.out.print(i + ", ");


        }

    }
    static void alg2(int n) {
        for (int i = -1; i<n ;i++) {
            i = i*2+3;
            System.out.println(i);
        }
    }
}

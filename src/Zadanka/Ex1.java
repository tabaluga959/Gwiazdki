package Zadanka;

public class Ex1 {
    public static void main(String[] args) {
        alg2(10);
    }

    static void alg2(int n) {
        int x = -1;
        for (int i = 0; i < n; i++) {
            System.out.print(x + ", ");
            x = x * 2 + 3;


        }


    }


}
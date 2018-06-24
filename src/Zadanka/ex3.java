package Zadanka;

public class ex3 {
    public static void main(String[] args) {
        alg1(10);
    }
    static void alg1(int n){
        boolean direction = true;
        int result = 2;
        for (int i = 1; i < n ; i++) {
            System.out.print(result + " ");
            if (direction) {
                result += 2;
            } else {
                result -= 2;
            }
            if (result == 8 || result == 2) {
                direction = !direction;


            }

        }
    }
}

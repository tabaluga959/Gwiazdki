package Zadanka;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();
        int a = 0;
        int b = 1;
        if (number < 2) {
            System.out.println("zle");
        }
        for (int i = 2; i <= number; i++) {

            b += a;
            a = b - a;
        }
        System.out.println(b);

    }
}



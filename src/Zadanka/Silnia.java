package Zadanka;

import java.util.Scanner;

public class Silnia {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n = scanner.nextInt();
        int c = 1;
        if (n <= 12) {
            while (n > 0) {
                c = c * n;
                n--;
                System.out.println(c);
            }
        }
    }
}


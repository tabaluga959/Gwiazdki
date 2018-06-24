package Zadanka;

import java.util.Scanner;

public class FibonacciRekurencja {
    int a = 0;
    int b = 1;

    public int fibonacci(int i) {
        if (i == 0)
            return 0;
        if (i == 1|| i == 2)
            return 1;
        else
            return fibonacci(i-1) + fibonacci(i-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę:");
        int a = scanner.nextInt();
        FibonacciRekurencja r = new FibonacciRekurencja();
        System.out.println(r.fibonacci(a));
    }

}




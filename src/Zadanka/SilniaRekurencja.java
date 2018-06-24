package Zadanka;

import java.util.Scanner;

public class SilniaRekurencja {
    public  int silnia(int i) {
        if (i ==1)
            return 1;
        else {
            return i*silnia(i-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        SilniaRekurencja s = new SilniaRekurencja();
        System.out.println(s.silnia(a));



    }
}

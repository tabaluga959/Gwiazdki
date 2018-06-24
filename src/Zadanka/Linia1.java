package Zadanka;

import java.util.List;

public class Linia1 {
    static void linia (int n) {
        String gwiazdka = "*";
        String space = " ";

        for (int i = 1; i <n ; i++) {
            if ( i == 1) {
                System.out.println(gwiazdka);
            }
            else {
                System.out.println(space+gwiazdka);
                space += " ";
            }

        }

    }

    public static void main(String[] args) {
        Linia1 linia = new Linia1();
        Linia1.linia(7);
    }


}

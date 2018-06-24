package Zadanka;

public class Ex4 {

    static void trojkat(int n) {
        String gwiazdka = "*";
        for (int i = 1; i < n; i++) {
            for (int m = 1; m < n; m++) {
                System.out.println(gwiazdka);
                gwiazdka += "*";
            }

        }
    }

    public static void main(String[] args) {
       Ex4 trojkat = new Ex4();
       Ex4.trojkat(4);

    }

}

package Zadanka;

public class O {
    static void ooo(int n, int m) {
        String gwiazdka = "*";
        String space = " ";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n) {
                    System.out.print(gwiazdka + " ");
                } else if (j == 1 || j == m) {
                    System.out.print(gwiazdka + " ");
                 }else {
                    System.out.print(space + " ");
                }
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        O zero = new O();
        O.ooo(5,5);
    }
}

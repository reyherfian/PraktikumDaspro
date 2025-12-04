public class rekapPenjualanKafe03 {
    public static void tampilData(int[][] penjualan) {
        System.out.println("Tabel penjualan: ");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void menuTerlaris(int[][] penjualan) {
        int menuMax = 0;
        int totalMax = 0;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > totalMax) {
                totalMax = total;
                menuMax = i;
            }
        }
        System.out.println("\nMenu Terlaris: Menu " + (menuMax + 1));
        System.out.println("Total terjual: " + totalMax);
    }
    public static void rataMenu(int[][] penjualan) {
        System.out.println("\nRata-rata penjualan tiap menu: ");

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            int rata = total / penjualan[i].length;
            System.out.println("Menu " + (i + 1) + ": " + rata);
        }
    }
    public static void main(String[] args) {
        int[][] penjualan = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };

        tampilData(penjualan);
        menuTerlaris(penjualan);
        rataMenu(penjualan);
    }
}

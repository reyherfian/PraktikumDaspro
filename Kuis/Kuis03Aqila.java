// Nama: Aqila Herfian
// NIM: 254107020041
//Absen: 03

public class Kuis03Aqila {
    public static void main(String[] args) {
        //senin, sabtu, minggu
        int kategori03 = 0;
        int hari03 = 0;
        int pendidikan03;
        int toko03 [][] = new int [5][3];
           toko03 [0][0] = 6;
           toko03 [0][1] = 9;
           toko03 [0][2] = 8;
           toko03 [1][0] = 5;
           toko03 [1][1] = 7;
           toko03 [1][2] = 6;
           toko03 [2][0] = 7;
           toko03 [2][1] = 8;
           toko03 [2][2] = 9;
           toko03 [3][0] = 4;
           toko03 [3][1] = 6;
           toko03 [3][2] = 7;
           toko03 [4][0] = 3;
           toko03 [4][1] = 5;
           toko03 [4][2] = 4;
           

        //banyak buku pada masing-masing hari
        System.out.println("\n===== Buku yang Terjual Masing-Masing Hari ====");
            for (int j = 0; j < toko03[0].length; j++) {
                double total03 = 0;
                for (int i = 0; i < toko03.length; i++) {
                    total03 += toko03[i][j];
                }
                System.out.println("Buku yang terjual pada hari ke-" + (j+1) + ": " + total03 + " buku");
            }

        //rata-rata penjualan kategori pendidikan
        System.out.println("\n==== Rata-rata buku yang terjual pada kategori Pendidikan ====");
            System.out.println("Rata-rata buku pendidikan: " + (toko03[2][0] + toko03[2][1] + toko03[2][2])/3);
        

        //total pemasukan toko buku selama 3 hari
        System.out.println("\n==== Total pemasukan toko selama 3 hari ===");
        int jmlSenin03 = (toko03[0][0] + toko03[1][0] + toko03[2][0] + toko03[3][0] + toko03[4][0]);
        int jmlSabtu03 = (toko03[0][1] + toko03[1][1] + toko03[2][1] + toko03[3][1] + toko03[4][1]);
        int jmlMinggu03 = (toko03[0][2] + toko03[1][2] + toko03[2][2] + toko03[3][2] + toko03[4][2]);
        System.out.println("Total buku hari Senin: " + jmlSenin03);
        System.out.println("Total buku hari Sabtu: " + jmlSabtu03);
        System.out.println("Total buku hari Minggu: " + jmlMinggu03);
        
        int totalAll = jmlSenin03 + jmlSabtu03 + jmlMinggu03;
        System.out.println("Total selama 3 hari: " + totalAll);

        //kategori buku dan nama hari dengan jumlah penjualan terendAH/tertinggi
        System.out.println("\n==== Kategori penjualan terendah & tertinggi di hari Senin ====");
        int terendah03 = 0;
        int tertinggi03 =  0;

        //lupa gimana caranya bandingin

        System.out.println("Kategori penjualan terendah: " + terendah03);
        System.out.println("Kategori penjualan tertinggi: " + tertinggi03);
    }
}

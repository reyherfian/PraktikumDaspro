import java.util.Scanner;
public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTiket, tTiket = 0;
        double hTiket = 50000, diskon, tHarga, tPenjualan = 0, tAwal, potongan;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid, coba lagi!");
                continue;
            }
            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.1;
            } else {
                diskon = 0;
            }

            tAwal = jmlTiket*hTiket;
            potongan = tAwal*diskon;
            tHarga = tAwal-potongan;

            System.out.println("Total bayar: Rp." + tHarga);

            tTiket += jmlTiket;
            tPenjualan += tHarga;

        } while (true);

            System.out.println("\nRekapan total tiket terjual: " + tTiket);
            System.out.println("Rekapan total penjualan: Rp " + tPenjualan);
    }
}

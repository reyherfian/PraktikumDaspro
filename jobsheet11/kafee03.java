import java.util.Scanner;

public class kafee03 {
    public static void Menu(String namaPelanggan, boolean isMmember) {
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if (isMmember) {
            System.out.println("Anda adalah member! dapatkan diskon 10% untuk setiap pembelian!");
        }
    }

    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam Rp 15,000");
        System.out.println("2. Cappuccino Rp 20,000");
        System.out.println("3. Latte Rp 22,000");
        System.out.println("4. Teh Tarik Rp 12,000");
        System.out.println("5. Roti Bakar Rp 10,000");
        System.out.println("6. Mie Goreng Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakMenu, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakMenu;

        if ("DISKON50".equals(kodePromo)) {
            System.out.println("kode promo DISKON50 digunakan! anda mendapatkan diskon 50%!");
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("kode promo DISKON30 digunakan! anda mendapatkan diskon 30%!");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else {
            System.out.println("kode promo invalid!");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTotal = 0;
        Menu();

        do {
            System.out.print("\nMasukkan nomer menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakMenu = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.nextLine();

            int subTotal = hitungTotalHarga(pilihanMenu, banyakMenu, kodePromo);
            hargaTotal += subTotal;

            System.out.print("Tambahkan pesanan lagi? (ya/tidak): ");
            String lanjut = sc.nextLine();

            if (lanjut.equalsIgnoreCase("tidak")) {
                break;
            }
        } 
        while (true);
                System.out.print("Total harga untuk pesanan anda: Rp. " + hargaTotal);
    }
}

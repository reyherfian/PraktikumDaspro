import java.util.Scanner; 
public class kafe03 {
    public static void Menu(String namaPelanggan, boolean isMmember, String kodePromo) {
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if (isMmember) {
            System.out.println("Anda adalah member! dapatkan diskon 10% untuk setiap pembelian!");
        }

        if ("DISKON50".equals(kodePromo)) {
            System.out.println("kode promo DISKON50 digunakan! anda mendapatkan diskon 50%!");
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("kode promo DISKON30 digunakan! anda mendapatkan diskon 30%!");
        } else {
            System.out.println("kode promo invalid!");
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


    public static int hitungTotalHarga(int pilihanMenu, int banyakMenu) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakMenu;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu ();
        
        System.out.print("\nMasukkan nomer menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakMenu = sc.nextInt();

        int hargaTotal = hitungTotalHarga(pilihanMenu, banyakMenu);

        System.out.print("Total harga untuk pesanan anda: Rp. " + hargaTotal);
    }
}


import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang = ");
        int cabang = sc.nextInt();

        System.out.println("\n=== INPUT PENJUALAN PER CABANG ===");
        int totTamu = 0;
        int totItem = 0;

        for (int i = 1; i <= cabang; i++) {
            System.out.println("\n--- Cabang " + i + "---");
            System.out.print("Jumlah pelanggan: ");
            int tamu = sc.nextInt();

            int itemCabang = 0;

            for (int j = 1; j <= tamu; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                itemCabang += item;
            }
            System.out.println("Cabang " + i + " :");
            System.out.println("Pelanggan: " + tamu + " orang");
            System.out.println("Item terjual: " + itemCabang);

            totTamu += tamu;
            totItem += itemCabang;
        }
        System.out.println("\nTotal seluruh cabang: ");
        System.out.println("Pelanggan: " + totTamu + " orang");
        System.out.println("Item terjual: " + totItem + " item");
    }
}

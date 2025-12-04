import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jml = sc.nextInt();
        sc.nextLine();

        String[] item = new String[jml];
        int[] hargaItem = new int[jml];
        int totalBiaya = 0;

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nama item ke-" + (i + 1) + ": ");
            item[i] = sc.nextLine();

            System.out.print("Masukkan harga item ke-" + (i + 1) + ": ");
            hargaItem[i] = sc.nextInt();
            sc.nextLine();

            totalBiaya += hargaItem[i];
        }

        System.out.println("\nDaftar Item: ");
        for (int i = 0; i < jml; i++) {
            System.out.println((i + 1) + ". " + item[i] + " - Rp. " + hargaItem[i]);
        }
        
        System.out.println("Total: Rp. " + totalBiaya);
    }
}
import java.util.Scanner;

public class ifCetakKRS03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = (uktLunas) ? "Pembayaran UKT terverifikasi \nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
        //     if (uktLunas) {
    //         System.out.println("Pembayaran UKT terverifikasi");
    //         System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    //     }

    //     else {
    //         System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    //     }
    }
}

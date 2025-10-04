import java.util.Scanner;

public class aksesWifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.print("Masukkan jenis pengguna: ");
        String jenisPengguna = sc.nextLine().trim();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            pesan = "Akses Wi-Fi (dosen) diberikan";

        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang ditempuh: ");
            int SKS = sc.nextInt();
            if (SKS >= 12) {
                pesan = "Akses Wi-Fi mahasiswa aktif diberikan";
            } else {
                pesan = "Akses ditolak, SKS kurang dari 12";
        }

        } else {
            pesan = "Akses Ditolak!";
        }

        System.out.println(pesan);

        }
    }

import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        int [] nilai = new int[jml];
        int total = 0;
        int tertinggi, terendah; 

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } if (nilai[i]< terendah) {
                terendah = nilai[i];
            }
        }
        double rata = (double) total / nilai.length;
        System.out.println();
        System.out.println("Daftar nilai mahasiswa: ");
            for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println();
        System.out.println("Nilai rata-rata: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}

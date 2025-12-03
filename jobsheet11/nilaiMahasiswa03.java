import java.util.Scanner;

public class nilaiMahasiswa03 {
    public static void isiNilai(int[] nilai) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    public static void tampilNilai(int[] nilai) {
        System.out.println("Daftar nilai mahasiswa: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    public static int hitungTotal(int[] nilai) {
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilai = new int[N];

        isiNilai(nilai);
        tampilNilai(nilai);

        int totalNilai = hitungTotal(nilai);

        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
    }
}

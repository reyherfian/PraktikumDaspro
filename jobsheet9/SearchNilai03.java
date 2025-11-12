import java.util.Scanner;

public class SearchNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jml = sc.nextInt();

        int[] arrNilai = new int[jml];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int indeks = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println();
            System.out.print("Nilai " + key + " berhasil ditemukan! Dimiliki oleh mahasiswa ke-" + indeks);
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak dapat ditemukan");
        }
    }
}

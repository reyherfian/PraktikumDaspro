import java.util.Scanner;
public class SIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int mhs = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int matkul = sc.nextInt();

        int nilai [][] = new int [mhs][matkul];

        for (int i = 0; i < mhs; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totPerSis = 0;
            for (int j = 0; j < matkul; j++) {
                System.out.print("Masukkan nilai mata kuliah " + (j+1) +": ");
                nilai [i][j] = sc.nextInt();
                totPerSis += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totPerSis/matkul);
        }
        System.out.println("\n===================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for (int j = 0; j < matkul; j++) {
            double totPerMat = 0;

            for (int i = 0; i < mhs; i++) {
                totPerMat += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totPerMat/mhs);
        }
    }
}

import java.util.Scanner;

public class nilaiKelompok03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, i = 1, tertinggi = 0;
        float totalNilai, rataNilai, tinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
        
            totalNilai = 0;
        
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilaian " + j + ":");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " nilai rata-rata: " + rataNilai);


            i++;
        }

        System.out.print("Rata-rata tertinggi adalah kelompok: " + tertinggi);
        System.out.print("\ndengan rata-rata: " + tinggi);
    }
}

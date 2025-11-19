import java.util.Scanner;
public class SIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai [][] = new int [4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totPerSis = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai mata kuliah " + (j+1) +": ");
                nilai [i][j] = sc.nextInt();
                totPerSis += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totPerSis/3);
        }
        System.out.println("\n===================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for (int j = 0; j < 3; j++) {
            double totPerMat = 0;

            for (int i = 0; i < 4; i++) {
                totPerMat += nilai[i][j];
            }
            
            System.out.println("Mata kuliah " + (j + 1) + ": " + totPerMat/4);
        }
    }
}

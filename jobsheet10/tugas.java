import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = 10;
        int q = 6;
        int survey[][] = new int[r][q];

        for (int i = 0; i < r; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < q; j++) {
                System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nRata-rata per responden: ");
        for (int i = 0; i < r; i++) {
            double total = 0;
            for (int j = 0; j < q; j++) {
                total += survey[i][j];
            }
            System.out.println("Responden " + (i + 1) + ": " + (total/q));
        }

        System.out.println("\nRata-rata per pertanyaan: ");
        for (int j = 0; j < q; j++) {
            double total = 0;
            for (int i = 0; i < r; i++) {
                total += survey[i][j];
            }
            System.out.println("Pertanyaan " + (j+1) + ": " + (total/r));
        }

        double totalAll = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < q; j++) {
                totalAll += survey[i][j];
            }
        }
        System.out.println("\nRata-rata keseluruhan: " + (totalAll/(r*q)));
    }
}
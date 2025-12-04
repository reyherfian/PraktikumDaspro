import java.util.Scanner;

public class CM1_AqilaHerfian_REVISI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT NAMA MAHASISWA =====");
        System.out.print("NAMA  : ");
        String nama = sc.nextLine();
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        sout

        System.out.println("\n --- Mata Kulah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS \t : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS \t : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas \t : ");
        double tugas1 = sc.nextDouble();

        System.out.println("\n --- Mata Kulah 2: Struktur Data ---");
        System.out.print("Nilai UTS \t : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS \t : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas \t : ");
        double tugas2 = sc.nextDouble();

        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        double rata2 = (akhir1 + akhir2) / 2;

        String huruf1, huruf2, status1, status2;

        if (akhir1 < 60) {
            status1 = "TIDAK LULUS";
        } if (akhir1 <= 39 && akhir1 >= 0) {
            huruf1 = "E";
        } else if (akhir1 > 39 && akhir1 <= 50) {
            huruf1 = "D";
        } else if (akhir1 > 50 && akhir1 < 60) {
            huruf1 = "C";
        }

        if (akhir1 >= 60) {
            status1 = "LULUS";
        } if (akhir1 >= 60 && akhir1 < 61) {
            huruf1 = "C";
        } else if (akhir1 >= 61 && akhir1 <= 65) {
            huruf1 = "C+";
        } else if (akhir1 > 65 && akhir1 <= 73) {
            huruf1 = "B";
        } else if (akhir1 > 73 && akhir1 <= 80) {
            huruf1 = "B+";
        } else if (akhir1 > 80 && akhir1 <= 100) {
            huruf1 = "A";
        } else {
            huruf1 = "-";
        }

        if (akhir2 < 60) {
            status2 = "TIDAK LULUS";
        } if (akhir2 <= 39 && akhir2 >= 0) {
            huruf2 = "E";
        } else if (akhir2 > 39 && akhir2 <= 50) {
            huruf2 = "D";
        } else if (akhir2 > 50 && akhir2 < 60) {
            huruf2 = "C";
        }

        if (akhir2 >= 60) {
            status2 = "LULUS";
        } if (akhir2 >= 60 && akhir2 < 61) {
            huruf2 = "C";
        } else if (akhir2 >= 61 && akhir2 <= 65) {
            huruf2 = "C+";
        } else if (akhir2 > 65 && akhir2 <= 73) {
            huruf2 = "B";
        } else if (akhir2 > 73 && akhir2 <= 80) {
            huruf2 = "B+";
        } else if (akhir2 > 80 && akhir2 <= 100) {
            huruf2 = "A";
        } else {
            huruf2 = "-";
        }

        System.out.println("\n ======== Hasil Penilaian Akademik ========");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);

        System.out.println("\n Mata Kuliah \t\t UTS \t UAS \t Tugas \t Nilai Akhir  Nilai Huruf \t Status");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(String.format("Algoritma Pemrograman \t%.2f\t %.2f\t  %.2f\t    %.2f\t   %s\t          %s",
                uts1, uas1, tugas1, akhir1, huruf1, status1));
        System.out.println(String.format("Struktur Data \t\t%.2f\t %.2f\t  %.2f\t    %.2f\t   %s\t          %s", uts2,
                uas2, tugas2, akhir2, huruf2, status2));

        String statusSem = "TIDAK LULUS";

        if (akhir1 >= 60 && akhir2 >= 60) {
            if (rata2 >= 70) {
                statusSem = "LULUS";
            } else {
                statusSem = "TIDAK LULUS (Rata-rata < 70)";
            }
        }
        System.out.println("\nRata-rata Nilai Akhir  :" + rata2);
        System.out.println("Status Semester        :" + statusSem);
    }
}

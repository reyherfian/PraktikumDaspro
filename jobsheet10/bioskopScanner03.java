import java.util.Scanner;

public class bioskopScanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String penonton[][] = new String[4][2];

        int menu = 0;
        while (menu != 3) {
            System.out.println();
            System.out.println("1. Input Data Penonton \n2. Daftar Penonton \n3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    do {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        boolean valid = false;
                        while (!valid) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > penonton.length) {
                                ;
                                System.out.println("Baris di luar jangkauan!");
                            }
                            if (kolom < 1 || kolom > penonton[0].length) {
                                System.out.println("Kolom di luar jangkauan!");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data tersimpan!");
                                valid = true;
                            }
                        }

                        System.out.print("Input nama lainnya? (y/n): ");
                        next = sc.nextLine();
                        System.out.println();

                    } while (next.equalsIgnoreCase("y"));

                    break;

                case 2:
                    System.out.println("Nama\t Baris\t Kolom");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.println("****\t   " + (i + 1) + "\t   " + (j + 1));
                            } else {
                                System.out.println(penonton[i][j] + "\t   " + (i + 1) + "\t   " + (j + 1));
                            }
                        }
                    }
            }

        }
    }
}

import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
                "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate ice" };

        System.out.print("Masukkan makanan/minuman yang diinginkan: ");
        String cari = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("\n" + cari + ", ditemukan Pada Menu ke-" + (i + 1));
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(cari + " tersedia Di Menu");
        } else {
            System.out.println(cari + " tidak Tersedia Di Menu");
        }
    }
}
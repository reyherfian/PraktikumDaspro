import java.util.Scanner;

public class ifElse03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String pesan;

        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            pesan = "Genap";
        } else { 
            pesan = "Ganjil";
        }
        System.out.println(pesan);
    }
}
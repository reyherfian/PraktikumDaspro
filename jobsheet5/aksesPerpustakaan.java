import java.util.Scanner;

public class aksesPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan; 
        
        System.out.print("Apakah anda memiliki KTM? (true/false): ");
        boolean KTM = sc.nextBoolean();

        if (KTM) {
            pesan ="Berhasil Masuk";
            System.out.println(pesan);
        }else {
            System.out.print("Lakukan registrasi online? (true/false): ");
            boolean registrasiOnline = sc.nextBoolean();
            if (registrasiOnline) {
                pesan = "Berhasil Masuk";
            }else {
                pesan = "Gagal Masuk";
        }
        System.out.println(pesan);
        }
    }
}

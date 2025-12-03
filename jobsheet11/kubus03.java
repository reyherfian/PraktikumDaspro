import java.util.Scanner; 
public class kubus03 {
    public static int hitungVolume(int sisi){
        int volume = sisi * sisi;
        return volume;
    }

    public static int hitungLuasPermukaan(int sisi){
        int luas = 6 * sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjng sisi kubus: ");
        int sisi = sc.nextInt();

        int volume = hitungVolume(sisi);
        int luas = hitungLuasPermukaan(sisi);

        System.out.println("\nVolume kubus: " + volume);
        System.out.println("Luas kubus: " + luas);
    }
}

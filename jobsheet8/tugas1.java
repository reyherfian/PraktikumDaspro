import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int jumlah  = 0;
            System.out.print("n = " + i + " jumlah kuadratnya = ");
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j * j);
                if (j < i) System.out.print(" + "); 
                    
            }

                System.out.print(" = " + jumlah);
                System.out.println();
            
        }
    }
}
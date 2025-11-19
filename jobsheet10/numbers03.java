import java.util.Arrays;

public class numbers03 {
    public static void main(String[] args) {
        
        int myNum[][] = new int [3][];
        myNum[0] = new int[5];
        myNum[1] = new int[3];
        myNum[2] = new int[1];
        
        for (int i = 0; i < myNum.length; i++) {
            System.out.println(Arrays.toString(myNum[i]));
        }
        for (int i = 0; i < myNum.length; i++) {
            System.out.println("Panjang baris ke-" +(i+1) + ": " + myNum[i].length);
        }
    }
}

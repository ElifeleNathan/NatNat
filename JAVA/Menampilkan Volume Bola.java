
import java.util.Scanner;

public class Tugas9 {
    public static void main(String[] args) {
      double v,j;
      double phi = 3.14;
      Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari bola = ");
        j = sc.nextDouble();
        v = (4*phi*j*j*j)/3;
        System.out.println("Volume Bola = "+v);
    }
    
}

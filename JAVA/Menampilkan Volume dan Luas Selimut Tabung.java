
import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
      double v,t,l,j;
      double phi = 3.14;
      Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari tabung = ");
        j = sc.nextDouble();
        System.out.print("Masukkan tinggi tabung = ");
        t = sc.nextDouble();
        v = phi*j*j*t;
        l = 2*phi*j*(j+t);
        System.out.println("Volume tabung = "+v);
        System.out.println("Luas selimut tabung = "+l);
    }
    
}

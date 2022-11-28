
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lanjutquis {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        DecimalFormat b = new DecimalFormat("#.##");
        double detik, menit, jam;
        System.out.print("Masukkan Detik = ");
        detik = a.nextDouble();
        jam = detik/3600;
        //sisa dibagi 3600
        System.out.println("Total Jam = " + b.format(jam));
    }
    
}

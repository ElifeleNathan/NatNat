
import java.util.Scanner;
public class Lanjutanquiszz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float a, b, c;
        System.out.print("Masukkan Nilai B = ");
        b = input.nextFloat();
        System.out.print("Masukkan Nilai C = ");
        c = input.nextFloat();
        a = (b-c)*(b+c);
        System.out.println("Nilai A adalah = " + a);
    }
    
}


import java.util.Scanner;

public class Tugas15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Masukkan angka pertama = ");
        a = sc.nextInt();
        System.out.print("Masukkan angka kedua = ");
        b = sc.nextInt();
        if (a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
    
}


import java.util.Scanner;

public class Percobaan {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukkan Angka Pertama = ");
        a = i.nextInt();
        System.out.print("Masukkan Angka Kedua = ");
        b = i.nextInt();
        System.out.print("Masukkan Angka Ketiga = ");
        c = i.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Angka Terbesar = " + a);
        }
        else if(b>c)
        {
            System.out.println("Angka Terbesar = " + b);
        }
        else
        {
            System.out.println("Angka Terbesar = " + c);
        }
    }
    
}

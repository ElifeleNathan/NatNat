
import java.util.Scanner;

public class Tugas11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan Angka = ");
        angka = sc.nextInt();
        if (angka == 0)
        {
            System.out.println("Bilangan Nol");
        }
        else if (angka % 2 == 0)
                {
                    System.out.println("Bilangan Genap");
                }
        else if (angka < 0)
        {
            System.out.println("Error");
        }
        else
        {
            
            System.out.println("Bilangan Ganjil");
        }
    }
   
}

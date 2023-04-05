
import java.util.Scanner;

public class Tugas13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan Angka (1-100) = ");
        angka = sc.nextInt();
        if(angka>=1&&angka<=100){
        boolean prima = true;
        for (int i = 2 ; i < angka ; i++)
        {
            if(angka % i == 0)
                {
                    prima = false;
                    break;
                }
        }
            if (prima)
            {
                System.out.println(angka+" Adalah Bilangan Prima");
            }
            else
            {
                System.out.println(angka+" Bukan Bilangan Prima");
            }
        }
        else
        {
            System.out.println("Angka Eror");
        }
        }
    }



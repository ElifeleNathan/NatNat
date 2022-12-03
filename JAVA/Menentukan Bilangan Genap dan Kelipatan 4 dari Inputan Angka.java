import java.util.Scanner;
public class LatihanDesicionLanjutan2 {
    public static void main(String[] args) {
        //buatlah program yang menentukan bilangan genap dan kelipatan 4!
        Scanner a = new Scanner(System.in);
        //menambahkan variabel
        int x;
        //mencetak perintah
        System.out.print("Masukkan Bilangan X = ");
        x = a.nextInt();
        //proses (jika inputan user modul 2 sama dengan nol dan inputan user modul 4 sama dengan nol
        if (x % 2 == 0 && x % 4 == 0)
        {
            //cetakan jika memenuhi
            System.out.println("Bilangan Genap dan Kelipatan 4");
        }
        else
        {
            //cetakan ketika tidak terpenuhi
            System.out.println("Bukan Bilangan Genap dan Kelipatan 4");
        }
    }
    
}

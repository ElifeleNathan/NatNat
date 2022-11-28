
import java.util.Scanner;
public class LatihanDesicion3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x,y,z,total,disc;
        System.out.print("Masukkan Harga 1 = Rp.");
        x = a.nextInt();
        System.out.print("Masukkan Harga 2 = Rp.");
        y = a.nextInt();
        System.out.print("Masukkan Harga 3 = Rp.");
        z = a.nextInt(); 
        total = x+y+z;
        //jika total harga yang diinput user lebih besar atau sama dengan 250.000
        if (x+y+z>=250000)
        {
            //maka mendapat
            disc = total-total*15/100;
            System.out.println("Mendapat Potongan Harga 15%");
            System.out.println("Harga Total = "+disc);
        }
        else
        {
            System.out.println("Harga Total = "+total);
        }
    }
    
}

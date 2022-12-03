
import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int w,x,y,z,total,disc;
        System.out.print("Masukkan Harga 1 = ");
        w = a.nextInt();
        System.out.print("Masukkan Harga 2 = ");
        x = a.nextInt();
        System.out.print("Masukkan Harga 3 = ");
        y = a.nextInt();
        System.out.print("Masukkan Harga 4 = ");
        z = a.nextInt();
        total = w+x+y+z;
        if (total>=500000)
        {
            disc = total-total*30/100;
            System.out.println("Mendapat Potongan Sebesar 30%");
            System.out.println("Harga Total = "+disc);
        }
        else if (total<500000&&total>=300000)
        {
            disc = total-total*20/100;
            System.out.println("Mendapat Potongan Sebesar 20%");
            System.out.println("Harga Total = "+disc);
        }
        else if (total<300000&&total>=150000)
        {
            disc = total-total*10/100;
            System.out.println("Mendapat Potongan Sebesar 10%");
            System.out.println("Total Harga = "+disc);
        }
        else if (total<150000&&total>=0)
        {
            System.out.println("Tidak Mendapat Potongan");
            System.out.println("Total Harga = "+total);
        }
        else
        {
            System.out.println("Error");
        }
    }
    
}

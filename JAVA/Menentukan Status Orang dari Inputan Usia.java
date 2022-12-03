
import java.util.Scanner;
//jika usia yang diinput = <1 bayi,<=5 balita,<=12 Anak-Anak,<=17 Remaja,dan >17 Dewasa
public class MenentukanStatusOrangDariInputanUsia {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int usia;
        System.out.print("Masukkan Usia = ");
        usia = a.nextInt();
        if (usia<1)
        {
            System.out.println("Bayi");
        }
        else if(usia<=5)
        {
            System.out.println("Balita");
        }
        else if(usia<=12)
        {
            System.out.println("Anak-Anak");
        }
        else if(usia<=17)
        {
            System.out.println("Remaja");
        }
        else
        {
            System.out.println("Dewasa");
        }
    }
    
}

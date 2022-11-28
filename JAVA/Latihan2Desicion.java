
import java.util.Scanner;
public class Latihan2Desicion {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int kondisi;
        System.out.print("Masukkan Kondisi (1 atau 0) = ");
        kondisi = a.nextInt();
        if (kondisi==1)
        {
            System.out.println("On");
        }
        else
        {
            System.out.println("Off");
        }
    }
    
}

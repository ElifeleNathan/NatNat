
import java.util.Scanner;
public class LatihanDesicion {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int suhu;
        System.out.print("Masukkan Suhu : ");
        suhu = a.nextInt();
        if (suhu>=27)
        {
            System.out.println("Panas");
        }
        else
        {
            System.out.println("Normal");
        }
    }
    
}

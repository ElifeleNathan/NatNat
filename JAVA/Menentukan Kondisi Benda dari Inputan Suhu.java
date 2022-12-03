package duadesicion;
import java.util.Scanner;
public class DuaDesicion {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Suhu;
        System.out.print("Masukkan Suhu = ");
        Suhu = a.nextInt();
        if (Suhu<0)
        {
            System.out.println("Beku");
        }
        else if (Suhu>=0&&Suhu<100)
        {
            System.out.println("Cair");
        }
        else
        {
            System.out.println("Gas");
        }
    }
    
}

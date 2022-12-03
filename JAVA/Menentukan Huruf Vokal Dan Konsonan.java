import java.util.Scanner;
public class VokalDanKonsonan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String huruf;
        System.out.print("Masukkan Huruf = ");
        huruf = a.next();
        if ("a".equalsIgnoreCase(huruf)||"i".equalsIgnoreCase(huruf)||"u".equalsIgnoreCase(huruf)||"e".equalsIgnoreCase(huruf)||"o".equalsIgnoreCase(huruf))
        {
            System.out.println("Huruf Vokal");
        }
        else
        {
            System.out.println("Huruf Konsonan");
        }
    }
    
}

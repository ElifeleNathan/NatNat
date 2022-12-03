import java.util.Scanner;
public class CobaanVokalKonsonan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String huruf;
        System.out.print("Masukkan Huruf = ");
        huruf = a.next();
        if ("a".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else if ("i".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else if ("u".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else if ("e".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else if ("o".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else
        {
            System.out.println("Konsonan");
        }
    }
    
}

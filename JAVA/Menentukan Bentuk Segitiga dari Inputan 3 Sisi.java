import java.util.Scanner;
public class Latihande {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int satu,dua,tiga;
        System.out.print("Masukkan sisi 1 = ");
        satu = a.nextInt();
        System.out.print("Masukkan sisi 2 = ");
        dua = a.nextInt();
        System.out.print("Masukkan sisi 3 = ");
        tiga = a.nextInt();
        
        if (satu==dua && dua==tiga)
        {
           System.out.println("Sama sisi");
        }
        else if (satu==dua || dua==tiga || tiga==satu)
        {
           System.out.println("Sama kaki");
        }
        else
        {
           System.out.println("Semua sisi berbeda");
        }
    }
    
}

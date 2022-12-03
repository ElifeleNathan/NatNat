
import java.util.Scanner;
public class CobaCoba {
    public static void main(String[] args) {
        String nama;
        int nilai;
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Nama = ");
        nama = a.nextLine();
        System.out.print("Masukkan Nilai = ");
        nilai = a.nextInt();
        if (nilai>=70)
        {
            System.out.println(nama + " Lulus ");
        }
        else
        {
            System.out.println(nama + " Tidak Lulus ");
        }
    }
    
}

import java.util.Scanner;
public class DesicionPerulangan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int nilai,kehadiran;
        System.out.print("Masukkan Nilai = ");
        nilai = a.nextInt();
        System.out.print("Masukkan Kehadiran = ");
        kehadiran = a.nextInt();
       if (nilai>=50)
       {
           if(kehadiran>=12)
           {
               System.out.println("Lulus");
           }
           else
           {
               System.out.println("Tidak Lulus");
           }
       }
       else 
       {
           System.out.println("Tidak Lulus");
       }
    }
    
}

import java.util.Scanner;
public class Latihan2de {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int umur;
        String nama;
        System.out.print("Masukkan Nama = ");
        nama = a.nextLine();
        System.out.print("Masukkan Umur = ");
        umur = a.nextInt();
        if (umur >= 60)
        {
            System.out.println(" Tuan " + nama + ", apakah Anda sudah pensiun? ");
        }
        else if (umur < 60 && umur >= 25)
        {
            System.out.println(" Saudara " + nama + ", apakah Anda masih aktif bekerja? ");
        }
        else if(umur >= 0 && umur < 25)
        {
            System.out.println(" Adik " + nama + ", apakah Anda masih sekolah? ");
        }
        else
        {
            System.out.println("Error");
        }
    }
    
}

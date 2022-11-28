import java.util.Scanner;
public class Pelajaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int stambuk;
       String nama;
       
       Scanner a = new Scanner(System.in);
       System.out.print("Masukkan Stambuk Anda = ");
       System.out.println("Masukkan Nama Anda = ");
       stambuk = a.nextInt();
       nama = a.nextLine();
       System.out.println("Stambuk Anda = " +stambuk);
       System.out.println("Nama Anda = " + nama);
       

    }
    
}

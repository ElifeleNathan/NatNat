import java.util.Scanner;
public class LatihanDesicion4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int surat,x,hasil,akhir;
        System.out.print("Masukkan Jumlah Surat = ");
        surat = a.nextInt();
        if (surat % 5 == 0)
    {
        hasil = surat / 5;
        System.out.println(hasil);
    }
    else
    {
        hasil = surat / 5;
        akhir = hasil + 1;
        System.out.print(akhir);
    }
  }  
}

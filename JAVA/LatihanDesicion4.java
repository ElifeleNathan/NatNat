import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MSI_2022
 */
public class LatihanDesicion4 {

    /**
     * @param args the command line arguments
     */
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

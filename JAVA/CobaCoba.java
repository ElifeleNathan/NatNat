
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
public class CobaCoba {

    /**
     * @param args the command line arguments
     */
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

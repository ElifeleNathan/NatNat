
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
public class Latihan2de {

    /**
     * @param args the command line arguments
     */
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

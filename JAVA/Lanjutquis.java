
import java.text.DecimalFormat;
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
public class Lanjutquis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        DecimalFormat b = new DecimalFormat("#.##");
        double detik, menit, jam;
        System.out.print("Masukkan Detik = ");
        detik = a.nextDouble();
        jam = detik/3600;
        //sisa dibagi 3600
        System.out.println("Total Jam = " + b.format(jam));
    }
    
}

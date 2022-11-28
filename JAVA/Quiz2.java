package quiz;


import java.util.Scanner;

/**
 *
 * @author MSI_2022
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);  
        //inisialisasi
        double us, euro, rupiah;
        //input
        System.out.print("Masukkan Nilai Rupiah = ");
        rupiah = a.nextDouble();
        //proses
        us =rupiah/14508;
        System.out.println("Jumlah Dalam USD = " + us);
        euro = rupiah/17064;
        System.out.println("Jumlah Dalam Euro = " + euro);
    }
    
}

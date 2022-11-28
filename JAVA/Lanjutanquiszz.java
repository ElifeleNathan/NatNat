
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
public class Lanjutanquiszz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float a, b, c;
        System.out.print("Masukkan Nilai B = ");
        b = input.nextFloat();
        System.out.print("Masukkan Nilai C = ");
        c = input.nextFloat();
        a = (b-c)*(b+c);
        System.out.println("Nilai A adalah = " + a);
    }
    
}

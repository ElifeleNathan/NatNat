
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
public class Latihan2Desicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int kondisi;
        System.out.print("Masukkan Kondisi (1 atau 0) = ");
        kondisi = a.nextInt();
        if (kondisi==1)
        {
            System.out.println("On");
        }
        else
        {
            System.out.println("Off");
        }
    }
    
}


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
public class LatihanDesicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int suhu;
        System.out.print("Masukkan Suhu : ");
        suhu = a.nextInt();
        if (suhu>=27)
        {
            System.out.println("Panas");
        }
        else
        {
            System.out.println("Normal");
        }
    }
    
}

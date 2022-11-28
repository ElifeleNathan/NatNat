
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
        String tanya;
        Scanner  a= new Scanner(System.in);
        System.out.print("Apakah Anda Lapar? (Ya atau Tidak) : ");
        tanya = a.next();
        if ("Ya".equalsIgnoreCase(tanya))
        {
            System.out.println("Makan");
        }    
        else
        {
            System.out.println("Tidak Makan");
        }
    }
    
}

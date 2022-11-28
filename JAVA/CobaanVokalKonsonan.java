
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
public class CobaanVokalKonsonan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String huruf;
        System.out.print("Masukkan Huruf = ");
        huruf = a.next();
        if ("a".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else if ("i".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else if ("u".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else if ("e".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else if ("o".equalsIgnoreCase(huruf))
        {
            System.out.println("Vokal");
        }
        else
        {
            System.out.println("Konsonan");
        }
    }
    
}

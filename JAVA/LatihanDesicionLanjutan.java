
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
public class LatihanDesicionLanjutan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y;
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Bilangan ke - 1 = ");
        x = a.nextInt();
        System.out.print("Masukkan Bilangan ke - 2 = ");
        y = a.nextInt();
        if (x>y)
        {
            System.out.println("Bilangan Pertama = "+x+" Lebih Besar ");
        }
        else
        {
            System.out.println("Bilangan Kedua = "+y+" Lebih Besar ");
        }
    }
    
}

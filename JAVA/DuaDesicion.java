/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duadesicion;

import java.util.Scanner;

/**
 *
 * @author MSI_2022
 */
public class DuaDesicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Suhu;
        System.out.print("Masukkan Suhu = ");
        Suhu = a.nextInt();
        if (Suhu<0)
        {
            System.out.println("Beku");
        }
        else if (Suhu>=0&&Suhu<100)
        {
            System.out.println("Cair");
        }
        else
        {
            System.out.println("Gas");
        }
    }
    
}

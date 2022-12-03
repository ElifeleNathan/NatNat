
import java.util.Scanner;
public class MenghitungLuasSegitigaRumusPhytagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double luas, keliling, alas, tinggi;
        System.out.println("Program Menghitung Luas dan Keliling Segitiga");
        System.out.print("Masukkan Alas Segitiga = ");
        alas = input.nextDouble();
        System.out.print("Masukkan Tinggi Segitiga = ");
        tinggi = input.nextDouble();
        luas = alas*tinggi/2;
        keliling = Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi, 2))*2+alas;
        System.out.println("Maka Luas Segitiga = "+luas+" dan Keliling Segitiga = "+keliling);
        
    }
    
}

import java.util.Scanner;
public class InputGanjilAtauGenap {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka = ");
        angka = a.nextInt();
        if (angka%2==0)
        {
            System.out.println("Bilangan Genap");
        }
        else
        {
            System.out.println("Bilangan Ganjil");
    }
    }
    
}

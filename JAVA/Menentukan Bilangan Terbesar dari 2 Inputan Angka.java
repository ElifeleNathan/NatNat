import java.util.Scanner;
public class LatihanDesicionLanjutan {
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

import java.util.Scanner;
public class LatihanDesicion {
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

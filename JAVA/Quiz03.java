
import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
      Scanner a = new Scanner(System.in);
      int A,B,C,D,E,nilai;
        System.out.print("Masukkan Nilai = ");
        nilai = a.nextInt();
        if (nilai<=100&&nilai>=80)
        {
            System.out.println("Nilai A");
        }
        else if (nilai<=79&&nilai>=70)
        {
            System.out.println("Nilai B");
        }
        else if (nilai<=69&&nilai>=60)
        {
            System.out.println("Nilai C");
        }
        else if (nilai<=59&&nilai>=50)
        {
            System.out.println("Nilai D");
        }
        else if (nilai<50&&nilai>=0)
        {
            System.out.println("Nilai E");
        }
        else
        {
            System.out.println("Error");
        }
    }
    
}

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Suhu;
        System.out.print("Masukkan Suhu = ");
        Suhu = a.nextInt();
        if (Suhu>=32)
        {
            System.out.println("Cuaca Sangat Panas");
        }
        else if (Suhu<32&&Suhu>=27)
        {
            System.out.println("Cuaca Panas");
        }
        else if(Suhu>5&&Suhu<15)
        {
            System.out.println("Cuaca Dingin");
        }
        else
        {
            System.out.println("Cuaca Sangat Dingin");
        }
    }
    
}

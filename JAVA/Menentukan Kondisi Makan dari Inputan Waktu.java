import java.util.Scanner;
public class DesicionElseIf {
    public static void main(String[] args) {
        String tanya;
        Scanner a = new Scanner(System.in);
        System.out.print("Apakah saat ini pagi atau siang atau malam? = ");
        tanya = a.next();
        if ("pagi".equalsIgnoreCase(tanya))
        {
            System.out.println("Saatnya makan pagi");
        }
        else if ("siang".equalsIgnoreCase(tanya))
        {
            System.out.println("Saatnya makan siang");
        }
        else if ("malam".equalsIgnoreCase(tanya))
        {
            System.out.println("Saatnya makan malam");
        }
        else
        {
            System.out.println("Inputan Salah!");
        }
    }
}

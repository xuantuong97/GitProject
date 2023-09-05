package Introduction_Java.Bai_tap;
import java.util.Scanner;
public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Enter the amount that you need to convert (USD)");
        float uSD = scanner.nextFloat();
        float vND = rate * uSD;
        System.out.println("The result is: " + vND + " VND");
    }
}

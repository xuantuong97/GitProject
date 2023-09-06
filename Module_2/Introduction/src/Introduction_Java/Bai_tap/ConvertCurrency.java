package Introduction_Java.Bai_tap;
import java.util.Scanner;
public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Enter the amount that you need to convert (USD)");
        float usd = scanner.nextFloat();
        float vnd = rate * usd;
        System.out.println("The result is: " + vnd + " VND");
    }
}

package Array;
import java.util.Scanner;
public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "The best of the best";
        System.out.println("Enter a character");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == character){
                count ++;
            }
        }
        System.out.println("Character "+ character + " appear " + count + " times in the string");
    }
}

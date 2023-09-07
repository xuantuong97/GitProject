package Loop.bai_tap;
import java.util.Scanner;
public class ArrayPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of first prime that you want to print!");
        int numberOfPrime = scanner.nextInt();
        int number = 2;
        int count = 0;
        boolean check;
        System.out.printf("The %d first prime numbers \n", numberOfPrime);
        while (count < numberOfPrime){
            check = true;
            for (int i = 2; i <= Math.sqrt(number); i++){
                    if (number % i == 0){
                        check = false;
                        break;
                    }
                }
            if (check){
                System.out.println(number);
                count ++;
            }
            number++;
        }
    }
}

package Loop.bai_tap;

public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        int number = 2;
        boolean check;
        System.out.println("Prime number less than 100");
        while (number < 100){
            check = true;
            for (int i = 2; i <= Math.sqrt(number); i++){
                    if (number % i == 0){
                        check = false;
                        break;
                    }
                }
            if (check){
                System.out.println(number);
            }
            number++;
        }
    }
}

package Loop.bai_tap;
import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Please choose that you want!");
            choose = scanner.nextInt();
        }
        while (choose < 1 || choose > 4);

        switch (choose) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*\t");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < 7 - i; j++) {
                        System.out.print("*\t");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");

                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < i + 1; j++) {
                        System.out.print("*\t");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");

                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < i ; j++) {
                        System.out.print(" \t");
                    }
                    for (int j = 1; j < 7-i; j++) {
                        System.out.print("*\t");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");

                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < 6 - i; j++) {
                        System.out.print(" \t");
                    }
                    for (int j = 1; j < i + 1; j++){
                        System.out.print("*\t");
                    }
                    System.out.print("\n");
                }
                    break;
            case 3:
                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < 6 - i; j++) {
                        System.out.print(" \t");
                    }
                    for (int j = 1; j <= 2*i - 1; j++){
                        System.out.print("*\t");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                break;
            }
        }
    }


package quadratic_equation_oop;

import quadratic_equation_oop.QuadraticEquation;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arguments a, b, c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        equation1.getResult();
    }
}
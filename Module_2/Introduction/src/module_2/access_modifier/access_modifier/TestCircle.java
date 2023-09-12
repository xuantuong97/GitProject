package module_2.access_modifier.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The color is " + circle.getArea());
    }
}
// Get error if set access modifier of getRadius(), getArea() is private.
// Can change access modifier to protected or default.

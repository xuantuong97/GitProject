package module_2.inheritance.inheritance_bai_1;

public class MainTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Blue");
        circle.setRadius(3);
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder();
        cylinder.setColor("Red");
        cylinder.setRadius(2);
        cylinder.setHeight(2);

        System.out.println(cylinder.toString());
    }
}

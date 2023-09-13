package module_2.abstract_class_and_interface.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape : shapes){
            if (shape instanceof Square){
                System.out.println("The area: " + shape.getArea());
                ((Square) shape).howToColor();
            }
            else {
                System.out.println("The area: " + shape.getArea());
            }
        }
    }
}

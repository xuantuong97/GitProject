package module_2.abstract_class_and_interface.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] arrShapes = new Shape[3];
        arrShapes[0] = new Circle();
        arrShapes[1] = new Rectangle();
        arrShapes[2] = new Square();

        System.out.println("Pre-increased:");
        for (Shape shape : arrShapes){
            System.out.println("The area: " + shape.getArea());
        }

        System.out.println("After-increased:");
        for (Shape shape : arrShapes){
            if (shape instanceof Circle){
                ((Circle) shape).resize(Math.random()*100);
                System.out.println(shape.getArea());
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.random()*100);
                System.out.println(shape.getArea());
            }
            else if (shape instanceof Square){
                ((Square) shape).resize(Math.random()*100);
                System.out.println(shape.getArea());
            }
        }
    }
}

package module_2.abstract_class_and_interface.colorable;


public class Square extends Shape implements IColorAble  {
    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(double size, String color, boolean filled) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPerimeter() {
        return 4 * size;
    }

    @Override
    public String toString() {
        return "A Square with size="
                + this.getSize()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}

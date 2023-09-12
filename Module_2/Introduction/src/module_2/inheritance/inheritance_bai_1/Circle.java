package module_2.inheritance.inheritance_bai_1;

public class Circle {
    private double radius ;
    private String color ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle has radius: " + radius
                + "\nColor: " + color
                + "\nArea: " + getArea();
    }
}

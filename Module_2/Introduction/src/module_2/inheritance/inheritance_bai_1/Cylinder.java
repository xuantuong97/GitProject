package module_2.inheritance.inheritance_bai_1;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder has radius: " + getRadius()
                + "\nColor: " + getColor()
                + "\nHeight: " + getHeight()
                + "\nVolume: " + getVolume();
    }
}

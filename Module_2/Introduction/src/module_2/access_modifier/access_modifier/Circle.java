package module_2.access_modifier.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle (){

    };

    Circle ( double radius ){
        this.radius = radius;
    };

    public double getRadius() {
        return radius;
    }


    public String getColor() {
        return color;
    }


    public double getArea(){
        return Math.PI * radius * radius;
    }
}

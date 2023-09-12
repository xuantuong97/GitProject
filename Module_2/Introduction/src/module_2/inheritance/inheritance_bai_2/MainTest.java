package module_2.inheritance.inheritance_bai_2;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2,4);
        System.out.println(point2D);;
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D();
        point3D.setXYZ(4, 5 ,6);
        System.out.println(point3D);;
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}

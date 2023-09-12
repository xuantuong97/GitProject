package module_2.inheritance.inheritance_bai_3;

public class MainTest {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point.toString());

        MoveablePoint moveablePoint = new MoveablePoint(5, 5);
        System.out.println(moveablePoint.toString());

        moveablePoint.move();
        System.out.println(moveablePoint.toString());

        System.out.println(moveablePoint.move());

        MoveablePoint moveablePoint1 = new MoveablePoint(2, 2, 3, 3);
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint1.move());
    }
}

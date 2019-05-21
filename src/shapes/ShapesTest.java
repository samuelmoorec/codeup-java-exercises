package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,4);
        Square box2 = new Square(5);
        System.out.println(box.getPerimeter());
        System.out.println(box.getArea());
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }
}

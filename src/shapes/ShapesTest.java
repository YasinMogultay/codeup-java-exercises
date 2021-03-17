package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Quadrilateral myShape = new Square(4);
        Quadrilateral myShape1 = new Rectangle(4,5);
        System.out.println(myShape.getArea());
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape.getWidth());
        System.out.println(myShape.getLength());
    }
}

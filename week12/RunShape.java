package week12;

public class RunShape {
    public static void main(String[] agrs) {

        Shape square = new Square(2);
        System.out.println(square.getArea());
        
        Shape rectangle = new Rectangle(30, 23);
        System.out.println(rectangle.getArea());
        
        Shape Triangle = new Triangle(4, 45);
        System.out.println(Triangle.getArea());
        
        
    }
}

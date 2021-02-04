package week9;

public class RunShape {
    public static void main(String[]agrs){
        Shape body1 = new Shape();
        Rectangle body2 = new Rectangle(10,20);
        Cube body3 = new Cube(20);
        System.out.println(body1.toString());
        System.out.println(body2.toString());
        System.out.println(body3.toString());
    }
}

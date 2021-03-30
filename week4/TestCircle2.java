package week41;

import week4.Circle;

public class TestCircle2 {
    public static void main(String[]agrs){
        Circle myCircle = new Circle(5.0);

        System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius()*1.1);
        System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
        //#test1
        System.out.println(myCircle.getRadius());
        
        //#test2
        System.out.println(myCircle.getNumberOfObjects());
        
        //#test3
        System.out.println("The number of object is "+ myCircle.getNumberOfObjects());
        
        //#test4
        myCircle.setNumberOfObject(10);
        System.out.println("The number of object is "+myCircle.getNumberOfObjects());
    }
}

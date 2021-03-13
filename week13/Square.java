package week13;

public class Square extends Shape {
    private double side;
    public Square(double side){
        this.side = side;
        
        System.out.println("This recatangle have side = "+side);
    }
    public double getArea() {
        return side*side;
    }
    


}

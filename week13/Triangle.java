package week13;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base,double height){
        this.base = base;
        this. height = height;
        
        System.out.println("This recatangle have base = "+base +" height " + height);
    }
    public double getArea() {
        return 0.5*base*height;
    }
    
}

package week9;

public class Rectangle extends Shape{
    private int width=0;
    private int height=0;
    public Rectangle(){

    }
    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
        this.body = "Rectangle";
    }
    public String toString(){
        return "This is a"+body+"with width as "+width+" and height as "+height;
    }
}

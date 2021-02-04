package week9;

public class Cube extends Rectangle{
    private int length=0;
    public Cube(){

    }
    public Cube(int length){
        this.length = length;
        this.body = "Cube";
    }
    public String toString(){
        return "This is a"+body+" with the side of "+ length;
    }
}

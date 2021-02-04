package week9;

public class Student {
    private String firstname = "Hello";
    private String lastname  = "World";

    public String toString(){
        return "My first name "+firstname+" last name "+lastname;
    }
    public Student(){

    }
    public Student(String fname,String lname){
        this.firstname = fname;
        this.lastname = lname;
    }
    public static void main(String[]agrs){
        Student p = new Student();
        System.out.println(p.toString());
        Student p2 = new Student("Krit","Tipnuan");
        System.out.println(p2.toString());
    }
}

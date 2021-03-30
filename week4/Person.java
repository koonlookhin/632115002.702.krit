package week4;

public class Person {
    private String name;
    private int age;
    private char gender;
    private int salary;
    private double GPA;

    public Person(){
        name = "Unassigned";
        age =0;
        gender ='M';
        salary =0;
        GPA=0.00;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }
    public int getSalary(){
        return salary;
    }
    public double getGPA(){
        return GPA;
    }
    public void setName(String personName){
        name = personName;
    }
    public void setAge(int personAge){
        age = personAge;
    }
    public void setGender(char personGender){
        gender = personGender;
    }
    public void setSalary(int personSalary){
        salary = personSalary;
    }
    public void setGPA(double personGPA){
        GPA =personGPA;
    }
}

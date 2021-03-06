package week11;

public class Student {
    String name;
    int age;
    double gpa;
   public Student(String name,int age,double gpa){
    this.name = name;
    this.age = age;
    this.gpa = gpa;
    }
    public int getAge(){
        return this.age;
    }
    public double getGPA(){
        return this.gpa;
    }
    public String getName(){
        return this.name;
    }
    /*public boolean equals(Object obj){
        if(obj == null){
            return false;
        }if(obj == this){
            return true;
        }
        return this.getName()==((Student)obj).getName() ;
    }*/
    /*public boolean equals(Object obj){
        if(obj == null){
            return false;
        }if(obj == this){
            return true;
        }
        return this.getAge()==((Student)obj).getAge() ;
    }*/
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }if(obj == this){
            return true;
        }
        return this.getGPA()==((Student)obj).getGPA() ;
    }
}

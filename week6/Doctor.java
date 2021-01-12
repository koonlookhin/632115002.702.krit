package week6;

public class Doctor extends Person{
    String whereDoWork;
    public Doctor(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void Where(){
        System.out.println(name+" work at "+ whereDoWork);
    }
}


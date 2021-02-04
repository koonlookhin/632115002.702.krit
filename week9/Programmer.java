package week9;

public class Programmer extends Person{
    String company;
    int salary;
    public Programmer(String name,int bornYear,String company,int salary ){
        super(name, bornYear);
        this.company = company;
        this.salary = salary;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm programmer in "+company+" company");
        System.out.println("My salary is "+salary);
    }
}

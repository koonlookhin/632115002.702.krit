package week6;

public class CEO extends Person {
    String company;

    public CEO(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void whatCom() {
        System.out.println(name+" is ceo of " + company+" company ");
    }
}

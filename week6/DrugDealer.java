package week6;

public class DrugDealer extends Person {
    String drug;
    int bath;
    public DrugDealer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void SellAndCost() {
        System.out.println(name + " sell " + drug + " in " + bath + " per 1 piece");
    }
}

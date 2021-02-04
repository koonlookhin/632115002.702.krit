package week9;

public class Testoverride1 {
    public static void main(String[]agrs){
        Person person1,person2,person3,person4;
        person1 = new Person("Mark",2001);
        person2 = new Sheriff("Mateo",1998,"California");
        person3 = new FootballPlayer("Messi", 1987, "Barcelona");
        person4 = new Programmer("Steve", 1998, "Apple", 3000000);
        person1.introduce();
        person2.introduce();
        person3.introduce();
        person4.introduce();
    }
}

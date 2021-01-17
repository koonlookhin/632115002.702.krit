package week7;

public class InheritancePet {
    public static void main(String[] agrs) {
        Dog dog = new Dog("Lucky", "Poddle", "Brown", 2);
        dog.size = "Small";
        dog.hair = "Short";
        dog.ShowPetData();
        dog.Run();
        dog.Bark();
        dog.isShortHair();
        System.out.println("------------------------------------------------------------");
        
        Fish fish = new Fish("Flash","Shark","Red",100);
        fish.speed="1000";
        fish.water="Salt water";
        fish.size="Small";
        fish.ShowPetData();
        fish.IsSwimToTheSea();
        fish.SwimFast();
        System.out.println("------------------------------------------------------------");

        Bird bird = new Bird("Breatle","Eagle","White",3);
        bird.country="USA";
        bird.fly="Thailand to Lao";
        bird.ShowPetData();
        bird.Speak();
        bird.CheckCountry();
        bird.IsCanFly();
        System.out.println("------------------------------------------------------------");
    }
}

package week7;

public class Bicycle {
    int speed;
    int brake;

    public Bicycle() {
        this.speed = 10;
        this.brake = 0;
    }

    public int IncreaseSpeed() {
        this.speed = speed + 5;
        return speed;
    }

    public int Brake() {
        this.speed = speed - 5;
        return speed;
    }

    public void CheckCurrentSpeed() {
        if (this.speed <= 99) {
            if (this.speed > 0) {
                System.out.println("The current speed : " + speed);
            } else {
                System.out.println("The bicycle have stop");
            }
        } else {
            System.out.println("The speed can't go to 100");
        }
    }
}

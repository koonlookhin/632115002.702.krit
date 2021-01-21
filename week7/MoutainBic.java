package week7;

public class MoutainBic extends Bicycle{
    int gear;
    int changeG;
    public MoutainBic() {
        this.gear=2;
        this.speed = 10;
        this.brake = 0;
    }
    public int ChangeGear(int change){
        this.changeG=change;
        this.speed=speed+(changeG*gear);
        return changeG;
    }
}

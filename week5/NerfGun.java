package week5;
public class NerfGun {
    private int bullet = 0;
    private static int idGun = 0;

    public NerfGun() {
        idGun++;
        this.bullet = 0;
    }

    public NerfGun(int number) {
        idGun++;
        this.bullet = number;
    }

    public void fire() {
        if (bullet == 0) {
            System.out.println("There is no ammunition");
        } else {
            this.bullet--;
            System.out.println("BANG !!!");
        }
    }

    public void displayNumOfAmmunition() {
        System.out.println(bullet + " bullet left");
    }

    public void reload(int num) {
        if (bullet + num <= 15) {
            this.bullet = bullet + num;
        } else {
            System.out.println("Error!! the ammunition is overload");
        }
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + idGun);
    }
}

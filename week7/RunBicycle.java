package week7;
public class RunBicycle {
    public static void main(String[]agrs){
        NormalBic bi1 = new NormalBic();
        bi1.IncreaseSpeed();
        bi1.CheckCurrentSpeed();
        bi1.Brake();
        bi1.CheckCurrentSpeed();
        bi1.Brake();
        bi1.CheckCurrentSpeed();
        System.out.println("-------------------------------------------------------");

        MoutainBic bi2 = new MoutainBic();
        bi2.CheckCurrentSpeed();
        bi2.ChangeGear(5);
        bi2.CheckCurrentSpeed();
        bi2.Brake();
        bi2.CheckCurrentSpeed();
        System.out.println("-------------------------------------------------------");
    }
}

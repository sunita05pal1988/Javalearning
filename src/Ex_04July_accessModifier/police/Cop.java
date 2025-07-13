package Ex_04July_accessModifier.police;

public class Cop {

    public int gun;
   private String iCard;


    public Cop(int bullet) {
        this.gun = bullet;

    }
// Method and / Behav

   public void canIShoot() {
        System.out.println("Yes you can !!");
    }
    public  void thisDefaultF1(){
    System.out.println("Hi, Cop!");
}


}
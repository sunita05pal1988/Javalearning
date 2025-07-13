package Ex_04July_accessModifier.criminal;

import Ex_04July_accessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief =new Cop(100);
        thief.gun = 100;
        thief.canIShoot();
        //thief.thisDefaultF1();

    }
}

package Ex_04July_accessModifier.criminal;

import Ex_04July_accessModifier.police.Cop;

public class SubClass extends Cop {

    public SubClass(int bullet){
        super(bullet);
    }

    public static void main(String[] args) {
       //new SubClass().thisisDefaultF1();
        // new SubClass().canIShoot();
    }
}

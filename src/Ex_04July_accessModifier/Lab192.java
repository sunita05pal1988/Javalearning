package Ex_04July_accessModifier;

public class Lab192 {
    public static void main(String[] args) {
       Son s = new Son();
        System.out.println(s.car);
    }
}

class Father {
    private int gold = 10;
    int car = 1;
            public int bhk3 = 1;

}
class Son extends Father{
    void weCanuse(){
        //System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}
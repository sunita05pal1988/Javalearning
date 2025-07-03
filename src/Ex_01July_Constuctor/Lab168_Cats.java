package Ex_01July_Constuctor;

public class Lab168_Cats {
    Lab168_Cats(){
        System.out.println("DC-Main Class");
    }

    public static void main(String[] args) {
        Cat c1= new Cat();
        new Cat();
        Cat c2;

        c1.running();
        new Cat().running();


    }
}

class Cat {
    String name;
    void running(){
        System.out.println("Running");
    }
}

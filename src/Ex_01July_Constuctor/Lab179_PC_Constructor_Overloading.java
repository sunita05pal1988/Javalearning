package Ex_01July_Constuctor;

public class Lab179_PC_Constructor_Overloading {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Amit",3928424,"abc");
        Person1 p2 = new Person1("Pramod",39230023,"XYZ");

        Person1 p3 = new Person1("thee",22442, "the");
        Person1 p4 = new Person1();
        p4.name= "test";
        System.out.println(p4.name);

        Person1 p5 =new Person1("lucky",3232);
        System.out.println(p5.address);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();

    }
}

class Person1{
    String name;
    long phone;
    String address;

    Person1(){

    }

    Person1(String name_arg, long phone_arg, String address_arg){
        this.name=name_arg;
        this.phone = phone_arg;
        this.address = address_arg;

    }

    Person1(String name_org, long phone_arg){
        this.name=name_org;
        this.phone=phone_arg;
    }

    void eat(){
        System.out.println(this.name+ "is eating!");
    }
}
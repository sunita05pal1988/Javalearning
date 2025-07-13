package Ex_09July_Wrapper;

public class Lab216_Wrapper {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1, "iphone 16", 12000.00);
        Mobile samsung = new Mobile(2, "ultra 24", 130000.00);

        iphone.setPrice(200000.00);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirPlaneMode();

        System.out.println(Covers.red.getColor());

    }
}

class Mobile extends OldPhone{
    private Integer phone;

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public Integer getPhone(){
        return phone;
    }

    public void setPhone(){
        this.phone =phone;
    }

    private String name;
    private Double price;
    static String mobile_carrier = "airtel";

    Mobile(){
        System.out.println("DC");
    }
    public Mobile(Integer phone, String name, Double price){
        this.phone = phone;
        this.name =name;
        this.price = price;
    }

    void display(){
        System.out.println(this.name+" "+ this.phone+" " +this.price);
    }

    static void switchOnAirPlaneMode(){
        System.out.println("Common Airplane Mode");
    }

    void priceChange(Integer price){
        System.out.println("Change price in Integers");
    }

    void priceChange(Double price){
        System.out.println("Change price in deicmals");
    }

    @Override
    void calling(){
        System.out.println("dialpad -> touce dialpad now!!");
    }
}

class OldPhone implements SIMCard{

    void calling(){
        System.out.println("dialpad");
    }

    @Override
    public void enterCard(){
        System.out.println("Card entered");
    }
}

enum Covers{
    red("red_pokeman"),
    blue("blue_pokeman");
    private String color;
    Covers(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;
    }
}
interface SIMCard{
    void enterCard();
}
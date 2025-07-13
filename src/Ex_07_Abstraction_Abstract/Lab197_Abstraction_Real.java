package Ex_07_Abstraction_Abstract;

public class Lab197_Abstraction_Real {
    public void main(String[] args) {
        Company c1 = new Company();
        c1.computePay();
    }


class Company extends Employee{
    @Override
    double computePay(){
        return 1000;
    }
}

abstract class Employee{
    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;

    }

    abstract double computePay();
    void mailCheck(){
        System.out.println("Mailing a check to  " + this.name + " " +this.address);
    }

}
}
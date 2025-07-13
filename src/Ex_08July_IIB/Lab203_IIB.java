package Ex_08July_IIB;



public class Lab203_IIB {
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when object is created
    public static void main(String[] args) {
        A a1= new A();

    }
}

class A{
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something, when object is created");
        //mysql connection
        //read a csv, xlxs file
        // read json, xml
        //read a text file or env file
    }
    {
        System.out.println("Hi, I am IIB2");
    }
    {
        System.out.println("Hi, I am IIB3");
    }
    static{
        System.out.println("Static");
    }
}

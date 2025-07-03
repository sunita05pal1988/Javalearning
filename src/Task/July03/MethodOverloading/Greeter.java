package Task.July03.MethodOverloading;

//Greet User - Greet users differently using overloading
public class Greeter {
    public static void main(String[] args) {
        GreetUser g1 =new GreetUser();
        System.out.println(g1.greet());
        g1.greet("Sunita");
    }
}
class GreetUser {
    String greet() {
        return "Hello!";
    }

    String greet (String name){
        System.out.println("Hello," +name+ "|");
        return name;
    }
}


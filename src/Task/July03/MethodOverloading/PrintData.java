package Task.July03.MethodOverloading;

// Print different data - Title: Create a universal printer with overloading
public class PrintData {
    public static void main(String[] args) {
        Print p = new Print();
        System.out.println(p.printData(10));
        System.out.println(p.printData(12.34f));
        System.out.println(p.printData(39.34));
        System.out.println(p.printData("Test"));
    }
}

class Print {
    String printData (String Data){
        System.out.println("Print String datatype");
        return Data;
    }

    int printData (int Data){
        System.out.println("Print int datatype");
        return Data;
    }

    float printData (float Data){
        System.out.println("Print float datatype");
        return Data;
    }

    double printData (double Data){
        System.out.println("Print double datatype");
        return Data;
    }
}
package Task.July03.MethodOverloading;

import org.w3c.dom.ls.LSOutput;

//Title: Find max using overloaded functions
public class Maximum {
    public static void main(String[] args) {
        Max m = new Max();
        System.out.println(m.max(10,5,67));
        System.out.println(m.max(10.93, 78.5,5.6));
    }


}

class Max{
    int max (int a, int b, int c) {
        int max = (a>b) ? (a>c)?a:c:(b>c)?b:c;
       // System.out.println(max);
        return max;
    }

    double max (double a, double b, double c) {
        double max = (a>b) ? (a>c)?a:c:(b>c)?b:c;
        //System.out.println(max);
        return max;
    }
}


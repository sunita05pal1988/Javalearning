package Ex_day23June_String_Immutable;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
      //  System.out.println(name.charAt(10));

        System.out.println(name.concat("Patel"));

        //Contains
        System.out.println(name.contains("om"));

        //equals()
        System.out.println(name.equals("Sonal"));

        //equalsIgnoreCAse()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //indexOF() // sonal -> 0
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("m"));

        //length
        System.out.println(name.length());

        // replace (,)
        System.out.println(name.replace('n', 'N'));

        //Split ()
        String name4 = "pramod@live.com@124";
        String[] split_name = name4.split("@");
        System.out.println(split_name[0]);
        System.out.println(split_name[2]);
        System.out.println(split_name[1]);

        //Substring ( , )
        System.out.println(name.substring(1, 3));

        //toLowerCAse
        System.out.println("SONAL".toLowerCase());

        //toUpperCase
        System.out.println("Sonal".toUpperCase());

        // startswith
        System.out.println(name.startsWith("S"));

        //endsWith()
        System.out.println(name.endsWith("d"));

        //totallehgth

        String anotherPalindrome = "Niagara, 0 roar again!";
        System.out.println(anotherPalindrome.length());

        //extract ()
        String extract = anotherPalindrome.substring(11, 15);
        System.out.println(extract);

        //Concatination(By +)

        String s111 = "Hello";
        String s222= "World";

        String s333= "ji";
        String result = s111+s222+s333;
        System.out.println(result);

    }
}

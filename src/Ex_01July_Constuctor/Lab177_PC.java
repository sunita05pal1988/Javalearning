package Ex_01July_Constuctor;

public class Lab177_PC {
    public static void main(String[] args) {

        BabyA b1= new BabyA();
        BabyA b2= new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);

        BabyA b3 = new BabyA("lucky","123456",2023,12,03);
        BabyA b4 = new BabyA("amit","123555",2012,04,13);
        System.out.println(b3.name);
        System.out.println(b4.name);

    }
}

class BabyA{
    String name;
    String aadhar_name;
    int year;
    int month;
    int date;

    //DC
    BabyA() {
        name = "Gugu";
        aadhar_name = "0000";
        year = 1991;
        month = 12;
        date = 12;
    }
        BabyA(String name_user,String aadhar_number_user,int year_user,int month_user,int date_user){
            this.name = name_user;
            this.aadhar_name = aadhar_number_user;
            this.month = month_user;
            this.year=year_user;
            this.date=date_user;


    }
}
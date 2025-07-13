package Ex_04July_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
    }
}
    class GOD{
        public int gold = 100;
        void sound(){
            System.out.println("GOD!!");
        }
        GOD(){
            System.out.println("GOD DC");
        }
    }

    class Animal extends GOD {
        @Override
        void sound() {
            super.sound();
        }

        Animal() {
            super();
        }

        Animal(int a, int b) {
            System.out.println(a + b);
        }

        void test() {
            System.out.println(super.gold);
        }

    }
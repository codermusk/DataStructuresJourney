package example;

public class anotherJava extends someJava{

    @Override
    public int value() {
        return 20 ;
    }
}

class main {
    public static void main(String[] args) {
        anotherJava anotherJava = new anotherJava() ;
        someJava someJava = new someJava() ;
        System.out.println(someJava.value());
        System.out.println(anotherJava.value());
    }
}

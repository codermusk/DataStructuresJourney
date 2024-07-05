package example;

public class printObject {
    int value ;
    String name ;

    public printObject() {
        this.value = 10 ;
        this.name = "Hello" ;
    }

    public static void main(String[] args) {
        printObject printObject = new printObject() ;
        System.out.println(printObject.value);
    }
}

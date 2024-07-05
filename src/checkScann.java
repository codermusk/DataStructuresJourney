import java.util.Scanner;

public class checkScann
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select any one");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name");
        String c = sc.nextLine();
        System.out.println("Enter the password");
        String b = sc.nextLine();
        System.out.println(c);
        System.out.println(b);
        int d = sc.nextInt();
        sc.nextLine() ;
        System.out.println(d);
        System.out.println("Enter some checking string");
        String f = sc.nextLine();
        sc.close();
    }
}

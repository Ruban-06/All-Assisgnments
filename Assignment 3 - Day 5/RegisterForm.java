
import java.util.Scanner;
class RegisterFrom
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Register Here !!!");
        System.out.println("Please Enter your name");
        String name = in.next();
        System.out.println("Enter your age");
        int age = in.nextInt();
        System.out.println("Enter your country");
        String country = in.next();
        System.out.println("Welcome" + name + "Your age is" + age + "You are from" + country);
        in.close();
    }
}
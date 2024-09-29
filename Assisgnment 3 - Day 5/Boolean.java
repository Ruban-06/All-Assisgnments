import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two values");
        int x= in.nextInt();
        int y= in.nextInt();
        boolean res=x>y;
        if(res)
        {
            System.out.println("The result of whether x is less than is true");
        }
        else{
            System.out.println("The result of whether y is less than is true");
        }
    }
}

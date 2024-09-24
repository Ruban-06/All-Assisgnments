package Assignment2;
public class Main {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.acc_no=1;
        a1.name="praveen";
        a1.balance=1000;
        a1.deposit(500);
        a1.withdraw(300);

        Account a2=new Account();
        a2.acc_no=2;
        a2.name="sujith";
        a2.balance=100;
        a2.deposit(500);
        a2.withdraw(30);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a1.balanceAmount());

    }
}
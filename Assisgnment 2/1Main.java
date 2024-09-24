package Assignment2;

public class Main {
    public static void main(String[] args) {
         Product p1=new Product();
         p1.pro_id=1;
         p1.pro_name="lemon";
         p1.pro_price=10;

         Product p2=new Product();
         p2.pro_id=2;
         p2.pro_name="apple";
         p2.pro_price=20;

        Product p3=new Product();
        p3.pro_id=3;
        p3.pro_name="orange";
        p3.pro_price=30;

        Product p4=new Product();
        p4.pro_id=4;
        p4.pro_name="kiwi";
        p4.pro_price=40;

        Product p5=new Product();
        p2.pro_id=5;
        p2.pro_name="graphs";
        p2.pro_price=50;

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
    }
}

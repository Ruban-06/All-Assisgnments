package Assignment2;

public class Product {
    int pro_id;
    String pro_name;
    int pro_price;

    @Override
    public String toString() {
        return "Product{" +
                "pro_id=" + pro_id +
                ", pro_name='" + pro_name + '\'' +
                ", pro_price=" + pro_price +
                '}';
    }
}

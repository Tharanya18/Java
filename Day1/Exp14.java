package Day1;

class Product {

    int productId;
    String productName;

    Product(int id, String name) {
        productId = id;
        productName = name;
    }
    void display() {

        System.out.println("Product Id : " + productId);
        System.out.println("Product Name : " + productName);

        System.out.println();
    }
}

public class Exp14 {

    public static void main(String[] args) {

        Product p1 = new Product(201, "Laptop");
        Product p2 = new Product(202, "Mobile");
        p1.display();
        p2.display();
    }
}
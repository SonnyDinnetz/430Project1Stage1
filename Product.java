import java.util.Scanner;

public class Product {
    private static Scanner scanner = new Scanner(System.in);

    // Ensures each uid is unique, would need to be stashed when a power cycle occurs
    private static int next_uid;
    private static int get_next_uid() {return next_uid++;}


    // Unique id for each product
    private int uid;
    public int get_uid() {return this.uid;}


    // Product name
    private String name;
    public String get_name() {return this.name;}
    public void set_name(String name) {this.name = name;}


    // Current qty of a product
    private int qty;
    public int get_qty() {return this.qty;}
    public void set_qty(int qty) {this.qty = qty;}


    // Price of a product
    private double price;
    public double get_price() {return this.price;}
    public void set_price(double price) {this.price = price;}


    // Used to prompt user for purchases
    public boolean prompt_user_to_purchase() {
        System.out.print(this);
        System.out.print("      Do you want to purchase this? Y/N   ");

        String input = scanner.nextLine().trim().toUpperCase();
        while (!input.equals("Y") && !input.equals("N")) {
            System.out.print("Please enter Y or N: ");
            input = scanner.nextLine().trim().toUpperCase();
        }

        return input.equals("Y");
    }


    // Primary Constructor
    public Product(String name, int qty, double price) {
        this.uid = get_next_uid();
        this.name = name;
        this.qty = qty;
        this.price = price;
    }


    // Copy Constructor
    public Product(Product product) {
        this.uid = product.get_uid();
        this.name = product.get_name();
        this.qty = product.get_qty();
        this.price = product.get_price();
    }


    // Operator overload for list comparison operations
    public boolean equals(Product other) {
        if (this.uid == other.get_uid()) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Product UID-" + this.uid + "  Name-" + this.name + "  Qty-" + this.qty + "  Price-" + this.price;
    }
}
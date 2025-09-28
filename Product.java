public class Product {
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
        // this needs to print to console and wait for a yes/no then conditionally return based on that.
        return true;
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

    static boolean Unit_Test() {
        return false;
    }
}
public class Product {
    private static int next_uid;
    private static int get_next_uid() {return next_uid++;}

    private int uid;
    public int get_uid() {return this.uid;}
    
    private String name;
    public String get_name() {return this.name;}
    public void set_name(String name) {this.name = name;}

    private int qty;
    public int get_address() {return this.qty;}
    public void set_address(int qty) {this.qty = qty;}

    private int price;
    public int get_balance() {return this.price;}
    public void set_balance(int price) {this.price = price;}

    public Product(String name, int qty, int price) {
        this.uid = get_next_uid();
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    // Need to overload .equals() for .indexOf and .remove
}

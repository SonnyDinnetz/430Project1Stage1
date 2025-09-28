public class Product {
    private static int next_uid;
    private static int get_next_uid() {return next_uid++;}

    private int uid;
    public int get_uid() {return this.uid;}
    
    private String name;
    public String get_name() {return this.name;}
    public void set_name(String name) {this.name = name;}

    private int qty;
    public int get_qty() {return this.qty;}
    public void set_qty(int qty) {this.qty = qty;}

    private int price;
    public int get_price() {return this.price;}
    public void set_price(int price) {this.price = price;}

    public Product(String name, int qty, int price) {
        this.uid = get_next_uid();
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public Product(Product product) {
        this.uid = product.get_uid();
        this.name = product.get_name();
        this.qty = product.get_qty();
        this.price = product.get_price();
    }

    public boolean equals(Product other) {
        if (this.uid == other.get_uid()) {
            return true;
        }
        return false;
    }
}

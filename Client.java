import java.util.List;
import java.util.ArrayList;

public class Client {
    // Ensures each uid is unique, would need to be stashed when a power cycle occurs
    private static int next_uid;
    private static int get_next_uid() {return next_uid++;}


    // Unique Identifier for each client.
    private int uid;
    public int get_uid() {return this.uid;}


    // Client name
    private String name;
    public String get_name() {return this.name;}
    public void set_name(String name) {this.name = name;}


    // Client address
    private String address;
    public String get_address() {return this.address;}
    public void set_address(String address) {this.address = address;}


    // Client's current balance
    private double balance;
    public double get_balance() {return this.balance;}
    public void accept_payment(double amount) {this.balance -= amount;}


    // History of all purchases created via this.process_order()
    private List<Invoice> transaction_history;
    // Returns a copy so that the actual history can't be edited
    public List<Invoice> get_transaction_history() {
        List<Invoice> copy = new ArrayList<Invoice>();
        for (Invoice invoice : this.transaction_history) {
            copy.add(new Invoice(invoice));
        }

        return copy;
    }
    // Makes a copy of invoice, actually charges client
    private void post_transaction(Invoice invoice) {
        this.balance -= invoice.get_total_price();
        this.transaction_history.add(new Invoice(invoice));
    }


    // Holds things the client wants to purchase
    private Wishlist wishlist;
    // Adds products to clients wishlist, makes a copy of product
    public void add_to_wishlist(Product product) {
        this.wishlist.add_product(new Product(product));
    }
    // Prompts user to purchase everything in thier wishlist.
    public Invoice process_order() {
        Wishlist purchase_list = new Wishlist(); // Create a new wishlist to hold our purchases

        // Go through the list and get everything we want from it.
        for (Product product : this.wishlist.get_product_list()) {
            if (product.prompt_user_to_purchase())
            {
                purchase_list.add_product(product);
            }
        }

        // Remove everything we want to purchase from our wishlist.
        for (Product product : purchase_list.get_product_list()) {
            this.wishlist.remove_product(product);
        }

        Invoice invoice = new Invoice(purchase_list);
        this.post_transaction(invoice);
        return invoice;
    }
    public Wishlist get_wishlist() {
        return new Wishlist(this.wishlist);
    }


    // Primary constructor
    public Client(String name, String address) {
        this.uid = get_next_uid();
        this.name = name;
        this.address = address;
        this.balance = 0;
        this.wishlist = new Wishlist();
        this.transaction_history = new ArrayList<Invoice>();
    }


    @Override
    public String toString() {
        return "Client UID-" + this.uid + "  Name-" + this.name + "  Address-" + this.address + "  Balance-" + this.balance;
    }
}



public class Invoice {
    // The cost of everything in this.product_list
    private int total_price;
    public int get_total_price() {return this.total_price;}

    // Reusing Wishlist to store the products of an invoice
    private Wishlist product_list;
    // Our list getter will return a copy so that this remains const
    private Wishlist get_product_list() {return new Wishlist(this.product_list);}

    // Primary Constructor
    public Invoice(Wishlist list) {
        // Copy the list
        this.product_list = new Wishlist(list);

        // Add price for everything in the list
        for (Product product : this.product_list.get_product_list()) {
            this.total_price += product.get_price();
        }
    }

    // Copy Constructor
    public Invoice(Invoice invoice) {
        this.product_list = new Wishlist(invoice.get_product_list());

        // Add price for everything in the list
        for (Product product : this.product_list.get_product_list()) {
            this.total_price += product.get_price();
        }
    }
}

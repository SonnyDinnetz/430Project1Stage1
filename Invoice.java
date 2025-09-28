public class Invoice {
    private int total_price;
    public int get_total_price() {return this.total_price;}

    private Wishlist product_list;
    private Wishlist get_product_list() {return new Wishlist(this.product_list);}

    public Invoice(Wishlist list) {
        this.product_list = new Wishlist(list);

        for (Product product : product_list.get_list()) {
            this.total_price += product.get_price();
        }
    }
}

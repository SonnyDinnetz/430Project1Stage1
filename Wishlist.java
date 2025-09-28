import java.util.List;
import java.util.ArrayList;

public class Wishlist {
    private List<Product> product_list;
    public void add_product(Product product) {this.product_list.add(product);}
    public void remove_product(Product product) {this.product_list.remove(product);}
    public Product get_product(Product product) {
        int index = this.product_list.indexOf(product);
        return product_list.remove(index);
    }

    public Wishlist(Product product) {
        this.product_list = new ArrayList<Product>();
        this.product_list.add(product);
    }
}

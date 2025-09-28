import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Driver {
    // List of fake products to use for testing
    public static final List<Object[]> RAW_PRODUCT_INFO = Arrays.asList(
        //              Name                    Quantity    Price
        new Object[] {  "Candy Bar",            10,         1.99    },
        new Object[] {  "Widget",               5,          2.50    },
        new Object[] {  "Gadget",               3,          4.99    },
        new Object[] {  "Thingamajig",          7,          9.99    },
        new Object[] {  "Doohickey",            12,         3.75    },
        new Object[] {  "Contraption",          2,          14.95   },
        new Object[] {  "Whatchamacallit",      6,          6.49    },
        new Object[] {  "Gizmo",                8,          7.25    },
        new Object[] {  "Device",               4,          11.00   },
        new Object[] {  "Tool",                 15,         5.99    },
        new Object[] {  "Instrument",           1,          29.99   },
        new Object[] {  "USB Cable",            20,         1.25    },
        new Object[] {  "Bluetooth Speaker",    3,          24.99   },
        new Object[] {  "Notebook",             10,         2.99    },
        new Object[] {  "Pen Pack",             25,         0.99    },
        new Object[] {  "Desk Lamp",            5,          18.75   },
        new Object[] {  "Monitor Stand",        2,          32.50   },
        new Object[] {  "Phone Case",           9,          6.95    },
        new Object[] {  "Mouse Pad",            14,         3.49    },
        new Object[] {  "Water Bottle",         6,          8.99    },
        new Object[] {  "Coffee Mug",           7,          4.25    },
        new Object[] {  "Sticky Notes",         30,         1.50    },
        new Object[] {  "Charging Brick",       4,          12.99   }
    );

    // List of fake clients to use for testing
    public static final List<Object[]> RAW_CLIENT_INFO = Arrays.asList(
        //              Name                    Address
        new Object[] {  "Alice Johnson",        "123 Maple St"      },
        new Object[] {  "Bob Smith",            "456 Oak Ave"       },
        new Object[] {  "Carol Martinez",       "789 Pine Rd"       },
        new Object[] {  "David Lee",            "321 Birch Blvd"    },
        new Object[] {  "Eva Chen",             "654 Cedar Ln"      },
        new Object[] {  "Frank Wright",         "987 Elm St"        },
        new Object[] {  "Grace Kim",            "159 Spruce Ct"     },
        new Object[] {  "Henry Thompson",       "753 Walnut Way"    },
        new Object[] {  "Isabel Garcia",        "852 Chestnut Dr"   },
        new Object[] {  "Jack Nguyen",          "951 Poplar Pl"     },
        new Object[] {  "Karen Patel",          "147 Redwood Ter"   },
        new Object[] {  "Leo Anderson",         "369 Sycamore St"   },
        new Object[] {  "Mona Rivera",          "258 Dogwood Cir"   },
        new Object[] {  "Nate Brooks",          "147 Willow Ln"     },
        new Object[] {  "Olivia Turner",        "753 Aspen Blvd"    },
        new Object[] {  "Paul Simmons",         "951 Fir St"        },
        new Object[] {  "Quinn Foster",         "369 Hemlock Ave"   },
        new Object[] {  "Rachel Adams",         "258 Magnolia Rd"   },
        new Object[] {  "Sam Bennett",          "147 Palm Ct"       },
        new Object[] {  "Tina Wallace",         "753 Hickory Dr"    },
        new Object[] {  "Uma Desai",            "951 Alder Way"     },
        new Object[] {  "Victor Morales",       "369 Beech St"      },
        new Object[] {  "Wendy Zhang",          "258 Larch Ln"      }
    );

    // Adds everything in add_these to to_this. Relies on the format in RAW_PRODUCT_INFO
    static public void add_products(List<Object[]> add_these, List<Product> to_this) {
        for (Object[] product : add_these) {
            Product new_product = new Product((String)product[0], (int)product[1], (int)product[2]);
            to_this.add(new_product);
        }
    }

    // Adds everything in add_these to to_this. Relies on the format in RAW_CLIENT_INFO
    static public void add_clients(List<Object[]> add_these, List<Client> to_this) {
        for (Object[] client : add_these) {
            Client new_client = new Client((String)client[0], (String)client[1]);
            to_this.add(new_client);
        }
    }


    public static void main(String[] args) {
        List<Product> master_product_list = new ArrayList<Product>();
        add_products(RAW_PRODUCT_INFO, master_product_list);

        List<Client> master_client_list = new ArrayList<Client>();
        add_clients(RAW_CLIENT_INFO, master_client_list);

        // Now we need to test stuff
    }
}

public class Client {
    private static int next_uid;
    private static int get_next_uid() {return next_uid++;}

    private int uid;
    public int get_uid() {return this.uid;}
    
    private String name;
    public String get_name() {return this.name;}
    public void set_name(String name) {this.name = name;}

    private String address;
    public String get_address() {return this.address;}
    public void set_address(String address) {this.address = address;}

    private int balance;
    public int get_balance() {return this.balance;}
    public void set_balance(int balance) {this.balance = balance;}

    public Client(String name, String address) {
        this.uid = get_next_uid();
        this.name = name;
        this.address = address;
        this.balance = 0;
    }
}

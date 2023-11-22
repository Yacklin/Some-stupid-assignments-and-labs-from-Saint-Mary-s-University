/**
 * javabean class called Item
 *
 * @author Yilin Huang (A00475433)
 */
public class Item {
    private String name;
    private int quantity;
    private double price;
    private double cost;
    public Item() {}
    public Item(String name, int quantity, double price, double cost) {
        this.name = name;
        if(quantity < 0){
            this.quantity = 0;
        }else {
            this.quantity = quantity;
        }
        if(price < 0){
            this.price = 0;
        }else {
            this.price = price;
        }
        if(cost < 0){
            this.cost = 0;
        }else {
            this.cost = cost;
        }
    }
    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     *set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *get quantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     *set quantity
     * @param quantity
     */
    public void setQuantity(int quantity) {
        if(quantity < 0) {
            System.out.println("Illegal quantity: "+quantity);
        }else {
            this.quantity = quantity;
        }
    }
    /**
     *get price
     * @return price
     */
    public double getPrice() {
        return price;
    }
    /**
     *set price
     * @param price
     */
    public void setPrice(double price) {
        if(price < 0) {
            System.out.println("Illegal price: "+price);
        }else {
            this.price = price;
        }
    }
    /**
     *
     * @return cost
     */
    public double getCost() {
        return cost;
    }
    /**
     *
     * @param cost
     */
    public void setCost(double cost) {
        if(cost < 0) {
            System.out.println("Illegal cost: "+cost);
        }else {
            this.cost = cost;
        }
    }
}

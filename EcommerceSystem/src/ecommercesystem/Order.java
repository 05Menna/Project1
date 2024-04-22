package ecommercesystem;
public class Order {
    private int customerId;
    private int orderId;
    Product[]products;
    private float totalPrice;
    public Order(){}
    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }
    public void printOrderInfo(){
        System.out.println("Here's your order summary:");
        System.out.println("Order ID: "+orderId);
        System.out.println("Costumer ID: "+customerId);
        System.out.println("Products:");
        for(int i=0;i<products.length;i++){
            System.out.println("  "+products[i].get_name()+"- $"+products[i].get_price());
        }
        System.out.println("Total Price: $"+totalPrice);
    }
}

package ecommercesystem;
import javax.swing.JOptionPane;
public class Cart {
    private int customerId;
    private int nProducts;
    Product[]products=new Product[nProducts];
    public Cart(){}
    public Cart( int size){
        nProducts=size;
        this.products = new Product[size];
    }
    public Cart(int customerId,int nProducts,Product[]products){
        this.customerId=customerId;
        this.nProducts=nProducts;
        this.products=products;
    }
    public void set_customerId(int customerId){
        if(customerId>0)
            this.customerId=customerId;
        else
            this.customerId=Math.abs(customerId);
    }
    public void set_nProducts(int nProducts){
        if(nProducts>0)
            this.nProducts=nProducts;
        else
            this.nProducts=Math.abs(nProducts);
        products = new Product[nProducts];
    }
    public void set_products(Product[]products){
        this.products=products;
    }
    public int get_customerId(){
        return customerId;
    }
    public int get_nProducts(){
        return this.nProducts;
    }
    public Product[] get_products(){
        return this.products;
    }
    public Product[] addProduct(Product p){
        for (int i = 0; i < nProducts; i++) {
            if (products[i] == null) {
                products[i] = p;
                break;
            }
        }
        return products;
    }
    public void removeProduct(Product productToRemove) {
        // Find the index of the product to remove
        int indexToRemove = -1;
        for (int i = 0; i < nProducts; i++) {
            if (products[i].get_productId() == productToRemove.get_productId()) {
                indexToRemove = i;
                break;
            }
        }
        // If the product is found, remove it by shifting the remaining products
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < nProducts - 1; i++) {
                products[i] = products[i + 1];
            }
            nProducts--;
            products[nProducts] = null; // Set the last element to null 
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Product not found in the cart.");
        }
    }
    public float calculatePrice(){
 float totalPrice = 0;
        for (int i = 0; i < nProducts; i++) {
            if (products[i] != null) {
                totalPrice += products[i].get_price();
            }
        }
        return totalPrice;
    }
    public void placeOrder(boolean u){
        if(u==true){
           JOptionPane.showMessageDialog(null,"your Order had been Placed successfully");
        }
        else{
           JOptionPane.showMessageDialog(null,"No Order had been Placed");
            products=null;}
    }
    
}





//            System.out.println("No Order had been Placed");
//            System.out.println("your Order had been Placed successfully");

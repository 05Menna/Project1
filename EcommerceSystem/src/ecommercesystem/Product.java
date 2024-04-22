package ecommercesystem;
public class Product {
    protected int productId;
    protected String name;
    protected float price;
    public Product(){}
    public Product(int productId,String name,float price){
        this.productId=Math.abs(productId);
        this.name=name;
        this.price=Math.abs(price);
    }
    public void set_productId(int productId){
        if(productId>0)
            this.productId=productId;
        else
            this.productId=Math.abs(productId);
    }
    public void set_name(String name){
        this.name=name;
    }
    public void set_price(float price){
        if(price>0)
            this.price=price;
        else
            this.price=Math.abs(price);
    }
    public int get_productId(){
        return productId;
    }
    public String get_name(){
        return name;
    }
    public float get_price(){
        return price;
    }
    
}

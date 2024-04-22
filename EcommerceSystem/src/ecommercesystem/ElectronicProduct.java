package ecommercesystem;
public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyPeriod;
    public ElectronicProduct(){}
    public ElectronicProduct(int productId,String name,float price,String brand,int warrantyPeriod){
        super(productId,name,price);
        this.brand=brand;
        this.warrantyPeriod=Math.abs(warrantyPeriod);
    }
    public void set_brand(String brand){
        this.brand=brand;
    }
    public void set_warrantyPeriod(int warrantyPeriod){
        if(warrantyPeriod>0)
            this.warrantyPeriod=warrantyPeriod;
        else
            this.warrantyPeriod=Math.abs(warrantyPeriod);
    }
    public String get_brand(){
        return brand;
    }
    public int get_warrantyPeriod(){
        return warrantyPeriod;
    }
    
}

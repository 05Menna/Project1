package ecommercesystem;
import javax.swing.JOptionPane;
public class EcommerceSystem {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the E-Commerce System!");
        ElectronicProduct e=new ElectronicProduct(1,"Smartphone",599.9f,"Sumsung",1);
        ClothingProduct c=new ClothingProduct(2,"T-shirt",19.99f,"Medium","Cotton");
        BookProduct b=new BookProduct(3,"OOP",39.99f,"O'Reilly","X Publications");
        Customer x=new Customer();
            int id=Integer.parseInt(JOptionPane.showInputDialog("Please enter your ID"));
            x.set_customerId(id);
            String n=JOptionPane.showInputDialog("Please enter your name");
            x.set_name(n);
            String a=JOptionPane.showInputDialog("Please enter your address");
            x.set_address(a);
        int np=Integer.parseInt(JOptionPane.showInputDialog("How many products you want to add to your cart?"));
        Cart cart=new Cart(np);
        cart.set_nProducts(np);
        for(int i=0;i<cart.get_nProducts();i++){
            Product p=null;
            int y=Integer.parseInt(JOptionPane.showInputDialog("which product you would like to add? "+e.get_productId()+"-"+e.get_name()
                    +" "+c.get_productId()+"-"+c.get_name()+" "+b.get_productId()+"-"+b.get_name()));
            if(y==e.get_productId())
                p=e;
            else if(y==c.get_productId())
                p=c;
            else if(y==b.get_productId()) 
                p=b;
            else
                JOptionPane.showMessageDialog(null,"Invalid product ID." );
            cart.addProduct(p);
        }
        Order o=new Order(x.get_customerId(),1,cart.get_products(),cart.calculatePrice());
        int choice=Integer.parseInt(JOptionPane.showInputDialog("Your total is $"+(cart.calculatePrice())+". Would you like to place the order? 1-Yes 2-No"));//input.nextInt();
        if(choice==1){
            cart.placeOrder(true);
            o.printOrderInfo();}
        else{
            cart.placeOrder(false);
            
        }
    }
}
//        System.out.println("Do you want to remove ");
//        String u=input.next();
//        if("yes".equals(u)){
//            System.out.println("Which one?");
//            int the_removedItem=input.nextInt();
//            for(int i=0;i<cart.products.length;i++){
//                if(cart.products[i].get_productId()==the_removedItem)
//                   cart.removeProduct(cart.products[i]);
//            }
//        }
//////////////////////////////////////////////////////////////////////////////////////////////
//import java.util.Scanner;
// Scanner input=new Scanner(System.in);

//        System.out.println("Welcome to the E-Commerce System!");
//System.out.println("Please enter your ID");
//            System.out.println("Please enter your name");
//            System.out.println("Please enter your address");
//        System.out.println("How many products you want to add to your cart?");
//            System.out.println("which product you would like to add? "+e.get_productId()+"-"+e.get_name()+" "
//                   +c.get_productId()+"-"+c.get_name()+" "+b.get_productId()+"-"+b.get_name());
//input.nextInt()
//input.next();
//input.next();
//input.nextInt();
//input.nextInt();
//System.out.println("Your total is $"+(cart.calculatePrice())+". Would you like to place the order? 1-Yes 2-No");
 //    System.out.println("Invalid product ID.");





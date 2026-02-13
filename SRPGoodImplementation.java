package DesignPrinciple;
import java.util.*;


class Product{
    private String name;
    private double price;

    public  Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}

class ShoppingCart{
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
        System.out.println("Added to the Cart: "+p.getName());
    }

    public void removeProduct(Product p){
        products.remove(p);
        System.out.println("Removed from the Cart: "+p.getName());
    }

    public List<Product> getProduct(){
        return products;
    }
}


class Billing{
   
    public double getBill(List<Product> p){
         double total=0;
        for(Product b :p){
            total += b.getPrice();   
        }

        return total;
    }  
}


class Invoice {
  
    public void getBill(List<Product> p, double total){
        System.out.println("Your Invoice:");
        for(Product g:p){
            System.out.println(g.getName() + " : Rs." +g.getPrice());
        }

        System.out.println("--------------------------");
        System.out.println("Total Bill: Rs."+total);
    }

}



public class SRPGoodImplementation {
    public static void main(String[] args) {
        
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 8000);
        Product p3 = new Product("Earbads", 1500);
        Product p4 = new Product("Iphone", 100000);
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct(p1);
        sc.addProduct(p2);
        sc.addProduct(p3);
        sc.addProduct(p4);

        sc.removeProduct(p4);

        Billing b = new Billing();
        double totalBill =b.getBill(sc.getProduct());

        Invoice in = new Invoice();
        in.getBill(sc.getProduct(),totalBill);


    }
}

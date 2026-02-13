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

abstract class Storage{
    abstract void save(List<Product> p);
}

class SqlStorage extends Storage{
     void save(List<Product> p){
        System.out.println("Saving to SQL Database...");
        for(Product s:p){
            System.out.println("Saved: "+s.getName());
        }
     }
}

class MongoStorage extends Storage{
     void save(List<Product> p){
        System.out.println("Saving to MongoDB...");
        for(Product s:p){
            System.out.println("Saved: "+s.getName());
        }
     }
}

class FileStorage extends Storage{
     void save(List<Product> p){
        System.out.println("Saving to File...");
        for(Product s:p){
            System.out.println("Saved: "+s.getName());
        }
     }
}

public class WithOCP {
    public static void main(String[] args) {
       
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);

        Storage storage = new SqlStorage();
        storage.save(products);

        storage = new MongoStorage();
        storage.save(products);

        storage = new FileStorage();
        storage.save(products);
        
    }
    
}

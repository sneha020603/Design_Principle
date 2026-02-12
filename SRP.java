package DesignPrinciple;

import java.util.ArrayList;
import java.util.List;

class Product{
     private  String name;
     private  double price;
     
     public  Product(String name, double price){
        this.name = name;
        this.price = price;
     }
     
     public  String getname(){
        return name;
     }

     public  double getprice(){
        return price;
     }
}

class ShoppingCart{

    private List<Product> products;

    public ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
        System.out.println("Product is added to the card.");
    }

    public void removeProduct(Product p){
        products.remove(p);
        System.out.println("Product is removed from  the card.");
    }

    public double totalBill(){
        double total = 0;
        for(Product p : products){
            total += p.getprice();
        }

        return total;
    }

    public void display(){

        System.out.println("\n Cart Items:");

        for (Product p : products) {
            System.out.println(p.getname() + " - Rs." + p.getprice());
        }

        System.out.println("Total: Rs." + totalBill());
    }
    }




public class SRP {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Mouse", 800);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.display();

        cart.removeProduct(p2);

        cart.display();
    }
    
}

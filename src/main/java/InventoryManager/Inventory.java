package InventoryManager;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Product> products = new ArrayList<Product>();


    public Inventory(){

    }

    public Inventory(Product... items){

    }


    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getTotalProduct(){
        return  0;
    }

    public double getTotalValue(){
        return 0; //total price together
    }
}

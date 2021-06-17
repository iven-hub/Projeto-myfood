
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.ArrayList;
import models.Product;
/**
 *
 * @author Joaquim Monteiro
 */
public class Products {
    public String name;
    
    private static  ArrayList<Product> products = new ArrayList<>();
    
    public Products(){ }
    
    public void addProduct(Product product){
        this.products.add(product);
    }
    
    public void printfProducts(){
        this.products.forEach(product -> 
        { System.out.println(product.getname());
    });      
}
    public String getName() {
        return name;
    }
    

   
    
}

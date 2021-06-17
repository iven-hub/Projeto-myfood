
package models;
import java.util.ArrayList;


public class Product {
    private String name;
    private float price; 
    
    public Product(String name, float price){
        this.name= name;
        this.price= price;
    }
    public String getname(){
	return name;
    }  
    public float getprice(){
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.List;
import java.util.ArrayList;
import models.Product;
import models.Products;

/**
 *
 * @author Joaquim Monteiro
 */
public class Products_controller {
    private static Products produtos = new Products();
//    private Product produto;
    
    //produtos();
    
    public static void addProdutos(String name, float price){
        Product pd = new Product(name,price);
        //produto.setName(name);
        //produto.setPrice(price);
        
        produtos.addProduct(pd);
        System.out.println(pd.getname());
        System.out.println(pd.getprice());
        System.out.println(produtos);
        //System.out.println(showlist);
       }
      public static String showlist(){
          // return this.produtos.forEach(pd ->{
             // pd.getName();
             return produtos.getName();
         }
          // return null;
        }



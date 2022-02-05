/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ruthwiksoudry
 */
public class ProductHistory {
    
    private ArrayList<Product> history;
    
    public ProductHistory() {
        
        this.history = new ArrayList<Product>();
    }

    public ArrayList<Product> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Product> history) {
        this.history = history;
    }
    
//    public Product addNewProduct(){
//        
//        Product newProduct = new Product();
//        history.add(newProduct);
//        return newProduct;
//    }

    public Product addNewProduct() {
        Product newProduct = new Product();
        history.add(newProduct);
        return newProduct;    }
    
    public void deleteProduct(Product selectedProduct) {
        history.remove(selectedProduct);
    }
    
    
}

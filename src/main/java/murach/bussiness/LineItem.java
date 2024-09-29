/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.bussiness;

import java.text.NumberFormat;

/**
 *
 * @author DELL
 */
public class LineItem {
    private Product product;
    private int quantity;
    public LineItem(){
        
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private double getTotal(){
        double total = product.getPrice() * quantity;
        return total;
    }
    public String getTotalCurrencyFormat(){
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        return currencyInstance.format(getTotal());
    }
}

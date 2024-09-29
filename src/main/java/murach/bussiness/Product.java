/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.bussiness;

import java.io.Serializable;
import java.text.NumberFormat;

/**
 *
 * @author DELL
 */
public class Product implements Serializable {
    private String code;
    private String description;
    private double price;

    public Product() {
        code="";
        description="";
        price=0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String currencyFormat(){
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        return currencyInstance.format(this.price);
    }
    
}

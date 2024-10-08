/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.bussiness;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Cart {
    private ArrayList<LineItem> items;
    
    public Cart(){
        items = new ArrayList<LineItem>();
    }

    public ArrayList<LineItem> getItems() {
        return items;
    }

    public int getCount(){
        return items.size();
    
    }
    public void addItem(LineItem item){
        String code = item.getProduct().getCode();
        int quantity = item.getQuantity();
        for(LineItem cartItem : items){
            if(cartItem.getProduct().getCode().equals(code)){
                cartItem.setQuantity(cartItem.getQuantity()+1);
                return;
            }
            
        }
        items.add(item);
    }
    public void removeItem(LineItem item){
        String code = item.getProduct().getCode();
        for(int i=0;i<items.size();i++){
            LineItem lineItem = items.get(i);
            if(lineItem.getProduct().getCode().equals(code)){
                items.remove(i);
                return;
            }
        }
    }
    
}

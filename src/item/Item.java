/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author AAzbuhanov
 */
public abstract class Item {
    private String nameItem;
    private double weigtItem; 
    private HashSet <String> properties = new HashSet <String>(1);
    private boolean itemPlaced = false;
    private static int itemStNumber = 1;
    private int itemNumber;
    
    private static double defaultWeigtItem = 1.0;

    public Item(String nameItem) {
        this.nameItem = nameItem;
        this.weigtItem = defaultWeigtItem; 
        this.itemNumber = itemStNumber;
        itemStNumber++;
    }
    
    public Item(String nameItem, double weigtItem) {
        this(nameItem);
        this.weigtItem = weigtItem;        
    }  
       
    public Item(String nameItem, String ... properties) {
        this(nameItem);  
        this.properties.addAll(Arrays.asList(properties)); //this.properties.add(properties);
    }
    
    public Item(String nameItem, double weigtItem, String ... properties) {
        this(nameItem, properties);
        this.weigtItem = weigtItem;        
    }   
    
    // функция будет объявлена в наследнике
    String getInfo() { return "NoName";} ;
            
    @Override
    public String toString()  {
        return "[" +nameItem + " " + itemNumber + "]";
    }

    public String getProperties() {
        return properties.isEmpty() ? "" : properties.toString();
    }

    public double getWeigtItem() {
        return weigtItem;
    }    

    public String getNameItem() {
        return nameItem;
    }   

    public boolean isItemPlaced() {
        return itemPlaced;
    }

    public void setItemPlaced(boolean itemPlaced) {
        this.itemPlaced = itemPlaced;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AAzbuhanov
 */
public class Box extends ItemCollection{
    private static String name = "коробка";
    private double maxWeigt;
    private boolean isClose;
    private ArrayList <Item> itemList = new ArrayList<Item> ();
    
    public Box(double maxWeigt,double weigtItem) {
        super(name,weigtItem,"плоский");
        this.setItemCollection(itemList);
        this.maxWeigt = maxWeigt;
        this.isClose = false;
    }


    @Override
    public Item removeItem () throws Exception{    
        if (!itemList.isEmpty()) {
        Random random = new Random();
        int i = random.nextInt(itemList.size());
        //itemList.
        Item it = itemList.remove(i);
        it.setItemPlaced(true);
        return it;
        } else {
            throw new ItemStoreException("коробка пуста");
        }
        
    }
    
    public Item findItemByName (String nameItem){
        ListIterator <Item> it = itemList.listIterator();
        while (it.hasNext()){
            Item item = it.next();
            if (nameItem.equals(item.toString())){
                return item;
            }
        }      
        return null;        
    }

    @Override
    public boolean addItem(Item it) throws Exception{       
        if (maxWeigt > this.getWeigtItem() + it.getWeigtItem()){
            return super.addItem(it); 
                    } 
        else { throw new ItemStoreException("превышение максимального веса коробки");
        } //To change body of generated methods, choose Tools | Templates.
    }
        
    public void openBox() {
        this.isClose = false;
    }

    public void closeBox() {
        this.isClose = true;
    }
    
    public boolean isClosed() {
        return this.isClose;
    }
    
}

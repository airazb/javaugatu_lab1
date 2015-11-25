/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author AAzbuhanov
 */
public class Bag extends ItemCollection {
    
    private static String name = "мешок";
    private double maxWeigt;
    private ArrayList <Item> itemList = new ArrayList<Item> ();
    
    public Bag(double maxWeigt,double weigtItem) {
        super(name,weigtItem);
        this.setItemCollection(itemList);
        this.maxWeigt = maxWeigt;
    }
/*
    public Bag(double maxWeigt,double weigtItem,String... properties) {
        super(name,weigtItem, properties);
        this.setItemCollection(itemList);
        this.maxWeigt = maxWeigt;
    }
*/    
    @Override
    public Item removeItem () throws Exception{    
        if (!itemList.isEmpty()) {
        Random random = new Random();
        return itemList.remove(random.nextInt(itemList.size()));
        } else {
            throw new ItemStoreException("Сумка пуста");
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
        else { throw new ItemStoreException("превышение максимального веса сумки");
        } //To change body of generated methods, choose Tools | Templates.
    }
       
    
}

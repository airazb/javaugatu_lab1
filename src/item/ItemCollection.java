/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author AAzbuhanov
 */
public abstract class ItemCollection extends Item implements Iterable <Item> {
    
    private Collection <Item> itemCollection;

    private int countItem;

    public ItemCollection(String nameItem) {
        super(nameItem);
    }

    public ItemCollection(String nameItem, String... properties) {
        super(nameItem, properties);
    }
    
    public ItemCollection(String nameItem, double weigtItem) {
        super(nameItem, weigtItem);
    }

    public ItemCollection(String nameItem, double weigtItem, String... properties) {
        super(nameItem, weigtItem, properties);
    }
    
    public boolean addItem(Item it) throws Exception{
        if (it.isItemPlaced()){
            throw new ItemAlreadyPlacedException("нельзя добавлять один и тот же предмет в разные контейнеры");
        } else {
            return itemCollection.add(it);
        }
    }
    
    public abstract Item removeItem () throws Exception;
    
    public void /*Item*/ getItems(){
        if (itemCollection.isEmpty()) {
            //return null;
            return;
        }
        System.out.println(itemCollection);
        /*Iterator <Item> it = itemCollection.iterator();
        
        while (it.hasNext()) {
            Item i = it.next();
            System.out.println(i);             
        }*/
    }; 

    public void setItemCollection(Collection<Item> itemCollection) {
        this.itemCollection = itemCollection;
    }

    @Override
    public double getWeigtItem() {
       
        double weigt = 0;
        weigt+=super.getWeigtItem();
        
        Iterator<Item> it = itemCollection.iterator();
        while (it.hasNext()) {
            Item item = it.next();
            weigt+=item.getWeigtItem();
        }
        return weigt;
    }

    @Override
    public Iterator<Item> iterator() {
        return itemCollection.iterator();
    }

    @Override
    String getInfo() {
        return this.getNameItem()+ " " + this.getProperties();//+ this.getWeigtItem(); //To change body of generated methods, choose Tools | Templates.
        
    }
}

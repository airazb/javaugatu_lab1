/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

import java.util.ArrayDeque;

/**
 *
 * @author AAzbuhanov
 */
public class Ream extends ItemCollection{
    private static String name = "стопка";
    private int maxItemCnt;
    private ArrayDeque <Item> itemList = new ArrayDeque<Item> (); 
    
    public Ream(int maxItemCnt) {
        super(name,0);
        this.maxItemCnt = maxItemCnt;
        this.setItemCollection(itemList);
    }
/*
    public Ream(int maxItemCnt, String... properties) {
        super(name, properties);        
        this.maxItemCnt = maxItemCnt;
        this.setItemCollection(itemList);
    }*/
    
    public boolean canAddItem(){
        return (itemList.size() < maxItemCnt) ? true : false;
    }

    @Override
    public boolean addItem(Item it) throws Exception {
        if (itemList.size() < maxItemCnt) {
            if (it.getProperties().toLowerCase().contains("плоский")){
                maxItemCnt +=1;
                return super.addItem(it); //To change body of generated methods, choose Tools | Templates.
            } else {
                throw new ItemStoreException("в стопку можно добавлять только плоские предметы");
            }
        } else {
            throw new ItemStoreException("в эту стопку нельзя складывать больше "+maxItemCnt+" предмета(ов)");
        }
        
    }

    @Override
    public Item removeItem() throws Exception{
        if (!itemList.isEmpty()) {
            maxItemCnt -=1;
            return itemList.removeLast();
        } else {
            throw new ItemStoreException("Стопка пуста");
        }
    }
      
}

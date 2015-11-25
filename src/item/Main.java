/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author AAzbuhanov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-Brick-----------");
        Brick br = new Brick(2.4,"fgh","ytru","34dfgsd33");
        Brick br1 = new Brick(2.4);
        Brick br2 = new Brick(3);
        
        System.out.println(br.toString()); 
        System.out.println(br.getNameItem());
        System.out.println(br.getWeigtItem());
        System.out.println(br.getProperties());
        System.out.println(br.getInfo());
        
        System.out.println("-Bag-----------");
        
        Bag bag = new Bag(20, 2.4);
        System.out.println(bag.toString()); 
        System.out.println(bag.getInfo()); 
        
        try {        
            bag.addItem(br);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try { 
            bag.addItem(br2);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {  
            bag.addItem(br1);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try { 
            System.out.println( bag.addItem(br1) );
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-1-----------");
        System.out.println(bag.findItemByName("[кирпич 3]"));
        
        bag.getItems();
        try {
            bag.removeItem();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        bag.getItems();
        System.out.println("-2-----------");
        System.out.println( bag.getWeigtItem());
        //System.out.println( bag.removeRandomItem());
        bag.getItems();
        
        System.out.println("-Stopka-----------");
        
        Ream r = new Ream(10);
        Brick br3 = new Brick(2.4,"плоский");
        Brick br4 = new Brick(3,"тяжелый","плоский","керамический");
        Brick br5 = new Brick(2.4,"круглый");
        
        try {
            r.addItem(br3);
            r.addItem(br4);
            //r.addItem(br5);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Iterator it = r.iterator();
        while (it.hasNext()) {
            System.out.println( it.next().toString());
        }
        System.out.println("-Stopka------del---");
        try {
            System.out.println( r.removeItem() );
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(r.getInfo());
        System.out.println(r.canAddItem());
        System.out.println("weigt= "+r.getWeigtItem());
        System.out.println("-Korobka-----------");
        
        Box bx1 = new Box(10, 1);
        Brick br6 = new Brick(2.2,"плоский");
        Brick br7 = new Brick(5,"тяжелый","плоский","керамический");
        
        try {
            bx1.addItem(br6);
            bx1.addItem(br7);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("weigtbx1= "+bx1.getWeigtItem());
        Box bx2 = new Box(10, 1);
        Brick br8 = new Brick(2.4,"плоский");
        Brick br9 = new Brick(3,"тяжелый","плоский","керамический");
        
        try {
            bx2.addItem(br8);
            bx2.addItem(br9);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            r.addItem(bx1);
            r.addItem(bx2);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("weigtbx2= "+bx2.getWeigtItem());
        System.out.println("weigt= "+r.getWeigtItem());
        
        
             
     }
    
          
    
    
}

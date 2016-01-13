/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AAzbuhanov
 */
public class TestItem {
    
    @Test
    public void test1() {
        try {
            Brick a = new Brick(2, "плоский"); 
            Brick b = new Brick(2, "плоский"); 
            Brick c = new Brick(2, "плоский");            
            Brick cc = new Brick(2, "плоский"); 

            Bag d = new Bag(5, 0.1);
            Box e = new Box(10, 0.5);

            d.addItem(a);
            d.addItem(b);
            System.out.println(d.getWeigtItem());                             
            assertEquals(d.getWeigtItem(),4.1,0);
            
            e.addItem(c);            
            System.out.println(e.getWeigtItem());
            assertEquals(e.getWeigtItem(),2.5,0);
            
            e.addItem(d);
            System.out.println(e.getWeigtItem());
            assertEquals(e.getWeigtItem(),6.6,0);
                        
            Ream f = new Ream(15);
            
            f.addItem(e);
            f.addItem(cc);
            assertEquals(f.removeItem(), cc);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(TestItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    @Test(expected=Exception.class)
    public void test2() throws Exception {                     
            Brick br = new Brick(2, "плоский");
            Box b = new Box(5, 0.1);
            
            b.addItem(br);
            b.addItem(br);
            b.addItem(br);         
    }
    
}

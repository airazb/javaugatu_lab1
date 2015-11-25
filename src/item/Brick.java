/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

/**
 *
 * @author AAzbuhanov
 */
public class Brick extends Item {
    private static String name = "кирпич";

    public Brick() {
        super(name);
    }

    public Brick(String ... properties) {
        super(name, properties);
    }

    public Brick(double weigtItem, String ... properties) {
        super(name, weigtItem, properties);
    }

    @Override
    String getInfo() {
        return this.getNameItem()+ " " + this.getProperties() ;//+ this.getWeigtItem(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

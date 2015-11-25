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
public class ItemAlreadyPlacedException extends Exception{

    public ItemAlreadyPlacedException() {
    }

    public ItemAlreadyPlacedException(String message) {
        super(message);
    }

    public ItemAlreadyPlacedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemAlreadyPlacedException(Throwable cause) {
        super(cause);
    }

    public ItemAlreadyPlacedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

   
        
}

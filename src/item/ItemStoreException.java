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
public class   ItemStoreException extends Exception{

    public ItemStoreException() {
    }

    public ItemStoreException(String message) {
        super(message);
    }

    public ItemStoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemStoreException(Throwable cause) {
        super(cause);
    }

    public ItemStoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalex.DB;

/**
 *
 * @author lcotti
 */
public class DBException extends Exception{ // extending the class exception
    public DBException(Exception e) {
        super(e);  // handlling exception from super method of the exception class
    }
}

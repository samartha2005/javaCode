/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javax.ejb.Singleton;

/**
 *
 * @author lenovo
 */
@Singleton
public class Counterbean {
    public Counterbean()
    {
        
    }
    private int count;
    public synchronized int hitcount()
    {
        return count++;
    }
}

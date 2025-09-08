/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javax.ejb.Stateless;

/**
 *
 * @author lenovo
 */
@Stateless
public class currency {
    public double rupeetodollar(double aa)
    {
        return aa/85;
    }
    public double dollartorupee(double aa)
    {
        return aa*85;
    }

}

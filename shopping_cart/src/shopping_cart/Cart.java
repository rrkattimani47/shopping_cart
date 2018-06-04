/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping_cart;

/**
 *
 * @author rashmikattimani47
 */

public class Cart {
    float bill;
    public void bread()
    {
    bill= (float) (bill+1.0);
    }
    
    public void milk()
    {
    bill=(float) (bill+0.6);
    }
    
    public void banana()
    {
    bill=(float) (bill+0.4);
    }
    
    
    public void bill()
    {
        System.out.println("Bill"+bill);
    }
    
}

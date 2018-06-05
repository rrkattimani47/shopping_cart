

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping_cart;

import java.util.Scanner;

/**
 *
 * @author rashmikattimani47
 */

public class Cart {
    int qty;
    float bill;

  /** 
   * All the below classes could be condensed to make one class as additem.
   * Need for an extra option like checkout to subtract items.
   * to make it more efficient we could use array to store the item name and list
   * 
   */
    
    
    public void bread()
    {
        System.out.println("Enter the quantity");
          Scanner in = new Scanner(System.in);
        qty=in.nextInt();
    bill= (float) (bill+1.0)*qty;
    }
    
    public void milk()
    {
        System.out.println("Enter the quantity");
         Scanner in = new Scanner(System.in);
        qty=in.nextInt();
    bill=(float) (bill+0.6)*qty;
    }
    
    public void banana()
    {
        System.out.println("Enter the quantity");
         Scanner in = new Scanner(System.in);
        qty=in.nextInt();
    bill=(float) (bill+0.4)*qty;
    }
    
   /* public void checkout()
    {
        System.out.println("Want to remove any item? \n");
        bill=bill-product;
    }*/
    
    
    public void bill()
    {
         
        System.out.println("Bill = "+bill);
    }
    
}

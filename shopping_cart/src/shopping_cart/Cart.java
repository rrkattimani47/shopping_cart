

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
    
    
    public void bill()
    {
         
        System.out.println("Bill = "+bill);
    }
    
}

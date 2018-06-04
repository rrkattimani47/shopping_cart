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
public class Shopping_cart {
    
    public static void main (String[] args){
    int ch;
    
            
        Cart c=new Cart();
       
       while(true)
       {
           System.out.println("\n\nMenu\n1.Bread price=1$\n2.Milk price=0.6$\n3.Banana price=0.4$\n4.Bill\n5.Exit");
           Scanner choice=new Scanner(System.in);
            ch=choice.nextInt();
            
            switch(ch){
                case 1: c.bread();
                break;
                
                case 2:c.milk();              
                break;
                
                case 3:c.banana();                
                break;
                
                
                case 4:c.bill();
                break;
                
                case 5:System.out.println("Visit again");
                 System.exit(0);
                    break;
                
                default:System.out.println("Invalid choice");
                break;
           
            
    
}  
       }
    }

}


        
    
    


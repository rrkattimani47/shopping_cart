/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rashmikattimani47
 */
public class ShoppingCartTest {
    
    ShoppingCart cart;
    
    public ShoppingCartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cart = new ShoppingCart();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
public void addOneItemToCart() {
    cart.add("Bread");
    assertThat(cart.getTotalItems(), is(1));
    assertThat(cart.doesContain("Bread"), is(true));
}

@Test
public void addTwoItemsToCart(){
    cart.add("Bread");
    cart.add("Milk");
    assertThat(cart.getTotalItems(), is(2));
    assertTrue(cart.doesContain("Bread"));
    assertTrue(cart.doesContain("Milk"));
}

@Test
public void addThreeItemsToCart(){
    cart.add("Bread");
    cart.add("Milk");
    cart.add("Banana");
    assertThat(cart.getTotalItems(), is(3));
    assertTrue(cart.doesContain("Bread"));
    assertTrue(cart.doesContain("Milk"));
    assertTrue(cart.doesContain("Banana"));
}

@Test
public void addAnItemTwice(){
    cart.add("Bread");
    cart.add("Bread");
    assertThat(cart.getTotalItems(), is(2));
}

@Test
public void checkOutOneItem(){
    cart.add("Bread");
    assertThat(cart.checkout(), is(1.0));
}

@Test
public void checkoutTwoSeparateItems(){
    cart.add("Bread");
    cart.add("Milk");
    assertThat(cart.checkout(), is(1.60));
}

@Test
public void checkoutThreeSeparateItems(){
    cart.add("Bread");
    cart.add("Milk");
    cart.add("Banana");
    assertThat(cart.checkout(), is(2.0));
}

@Test
public void checkoutTwoSameItems(){
    cart.add("Bread");
    cart.add("Bread");
    assertThat(cart.checkout(), is(2.0));
}

@Test
public void checkoutThreeItems(){
    cart.add("Bread");
    cart.add("Bread");
    cart.add("Milk");
    assertThat(cart.checkout(), is(2.6));
}

@Test
public void checkoutManyItems(){
    cart.add("Bread");
    cart.add("Bread");
    cart.add("Milk");
    cart.add("Milk");
    cart.add("Banana");
    assertThat(cart.checkout(), is(3.60));
}

@Test 
public void checkOutAnInvalidItem(){
    cart.add("InvalidItem");
    assertThat(cart.checkout(),is(0.0));
}}




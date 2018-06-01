/*
 * @author Jossue Cervantes Torres
 *INSY 4305 - 002
 *InvoiceTest.java
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jossue
 */
public class InvoiceTest {
    
    //Variables for Tests
    Invoice invoice1;
    String partNum = "12BG34C";
    String description = "Part is used for";
    int quantity = 20;
    double price = 4.99;
    double orderPrice = 99.80;
    
    
    public InvoiceTest() {
    }
    
    @Before
    public void setUp() {
        invoice1 = new Invoice(partNum, description, quantity, price);
    }
    
    @After
    public void tearDown() {
        invoice1 = null;
        
    }
    
    //getPartNumber() method test
    @Test
    public void testGetPartNumber() 
    {
        System.out.println("getPartNumber()");
   
        assertEquals(partNum, invoice1.getPartNumber());
        assertNotEquals("random", invoice1.getPartNumber());
    }
    
    //getDescription() method test
    @Test
    public void testGetDescription()
    {
        System.out.println("getDescription()");
        assertEquals(description, invoice1.getDescription());
        assertNotEquals("random", invoice1.getDescription());
    }
    
    //getPrice() method test
    @Test
    public void testGetQuantity()
    {
        System.out.println("getQuantity()");
        assertEquals(quantity, invoice1.getQuantity());
        assertNotEquals(34, invoice1.getQuantity());   
    }
    
    //getPrice() method test
    @Test
    public void testGetPrice()
    {
        System.out.println("getPrice()");
        assertEquals(price, invoice1.getPrice(), 0.00);
        assertNotEquals(34, invoice1.getPrice());  
    }
    
    //setPartNumber() method test
    @Test
    public void testSetPartNumber()
    {
        System.out.println("getPrice()");
        
        String newPart = "12DG33G";
        invoice1.setPartNumber(newPart);
        assertEquals(newPart,invoice1.getPartNumber());
        
        //Invalid part number(Part number constituted of 7 characters) Should print "Invalid Part Number"       
        newPart = "23jdasf232";
        invoice1.setPartNumber(newPart);
        assertNotEquals(newPart, invoice1.getPartNumber());
        
    }
    
    //setDescription() method test
    @Test
    public void testSetDescription()
    {
        System.out.println("setDescription()");
        
        String newDescription = "This part is used for stuff/things";
        invoice1.setDescription(newDescription);
        assertEquals(newDescription, invoice1.getDescription());
        assertNotEquals(description, invoice1.getDescription());
        
    }
    
    //setQuantity() test method
    @Test
    public void testSetQuantity()
    {
        System.out.println("setQuantity()");
        
        int newQuantity = 12;
        invoice1.setQuantity(newQuantity);
        assertNotEquals(quantity, invoice1.getQuantity());
        assertEquals(newQuantity, invoice1.getQuantity());
        
        //no negative quantity; if negative it should not change original quantity
        newQuantity = -45;
        invoice1.setQuantity(newQuantity);
        assertNotEquals(newQuantity,invoice1.getQuantity());
        assertEquals(12,invoice1.getQuantity());
    }
    
    //setPrice() test method
    @Test
    public void testSetPrice()
    {
        System.out.println("setPrice()");
        double newPrice = 12.96;
        invoice1.setPrice(newPrice);
        assertEquals(newPrice, invoice1.getPrice(),.00);
        assertNotEquals(price, invoice1.getPrice(),.00);
        
        //Price must not be negative if negative keep previous price
        newPrice = -12.988;
        invoice1.setPrice(newPrice);
        assertNotEquals(newPrice,invoice1.getPrice(),0.00);
        assertEquals(12.96, invoice1.getPrice(), 0.00);        
    }
    
    //getInvoiceAmount() test method
    @Test
    public void testGetInvoiceAmount()
    {
        System.out.println("getInvoiceAmount()");
        
        assertEquals(orderPrice,invoice1.getInvoiceAmount(), 0.01);
        
        price = 13.90;
        quantity = 12;
        orderPrice = 13.90 * 12;
        invoice1.setPrice(price);
        invoice1.setQuantity(quantity);

        assertEquals(orderPrice, invoice1.getInvoiceAmount(), .00);
        
    }
}

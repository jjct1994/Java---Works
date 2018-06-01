/**
 *  @author Jossue Cervantes Torres
 * INSY 4305 - 002
 * Invoice.java
 */
public class Invoice 
{
        // instance Variables
    private String partNumber;
    private String description;
    private int partQuantity = 1;
    private double itemPrice = 0.00;
    private double total = 0.00;
    
    //Constructor
    public Invoice(String partNumber, String description, int partQuantity, double itemPrice) 
    {
       this.partNumber = partNumber;
       this.description = description;
       this.partQuantity = partQuantity;
       this.itemPrice = itemPrice;
        
    }
    
    //Setters
        public void setPartNumber(String partNumber)
        {
            int charInString = partNumber.length();
            if(charInString == 7)
            {
                this.partNumber = partNumber;
            }else
            {System.out.println("Invalid Part Number");
            }
        }
        public void setDescription(String description)
        {
            this.description = description;
        }
        public void setQuantity(int partQuantity)
        {
            if (partQuantity > 0)
            {
            this.partQuantity = partQuantity;
            }else
            {System.out.println("Quantity should be at least 1.");
            }
        }
        public void setPrice(double itemPrice)
        {
            if(itemPrice >= 0)
            {
            this.itemPrice = itemPrice;
            }else
            {System.out.println("Price cannot be negative.");
            }
        }
        
    //Getters 
        public String getPartNumber()
        {
            return partNumber;
        }
        public String getDescription()
        {
            return description;
        }
        public int getQuantity()
        {
            return partQuantity;
        }
        public double getPrice()
        {
            return itemPrice;
        }
    
        //Calculations
        
        public double getInvoiceAmount()
        {
            total = itemPrice*partQuantity;
            
            if (total >= 0)
            {
                return total;
            }else
            {
                total = 0;
                return total;
            }
            
        }
    
}

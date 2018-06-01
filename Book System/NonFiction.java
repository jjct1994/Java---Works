
/*Jossue Cervantes Torres*/
public class NonFiction extends Book
{    
   private String categoryCode;
   
   public NonFiction(String title, String author, Publisher publisher, double price)
   {
       super(title, author, publisher, price);
   }
   
   public String getCategoryCode()
   {
       return categoryCode;      
   }
   
   public void setCategoryCode(String categoryCode)
   {
       this.categoryCode = categoryCode;       
   }
   
}

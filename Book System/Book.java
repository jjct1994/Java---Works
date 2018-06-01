
/*Jossue Cervantes Torres*/
public class Book 
{
    
    private String title;
    private String author;
    private Publisher publisher;
    private double price;
    
    public Book(String title, String author, Publisher publisher, double price)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
    
    public String getTitle() 
    {
        return title;    
    }
    
    public void setTitle(String title)
    {
        this.title = title;    
    }
    
    public String getAuthor()
    {
        return author;    
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public Publisher getPublisher()
    {
        return publisher;        
    }
    
    public void setPublisher(Publisher publisher)
    {
        this.publisher = publisher;
    }
    
    public double getPrice()
    {
        return price;
    }
    public double calculateCharge(int quantity)
    {
        return quantity * price;
    }
}

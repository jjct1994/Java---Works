

/*Jossue Cervantes Torres*/

public class Fiction extends Book
{
    private int fictionCode;
    
    public Fiction(String title, String author, Publisher publisher, double price)
    {
        super(title, author, publisher, price);
    }
    public void setFictionCode(int fictionCode)
    {
        this.fictionCode = fictionCode;
    }
    public int getFictionCode()
    {
        return fictionCode;        
    }    
}

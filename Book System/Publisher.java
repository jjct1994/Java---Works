
/* @author Jossue Cervantes Torres*/

public class Publisher 
{
    private String name;
    private String state;
    
    public Publisher(String name, String state)
    {
        this.name = name;
        this.state = state;
    }
    
    public void setName(String name)
    {
        this.name = name;   
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setState(String state)
    {
        this.state = state;     
    }
    
    public String getState()
    {
        return state;
    }
    public String toString()
    {
        return name + " " + state;
    }
}

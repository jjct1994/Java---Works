/*Jossue Cervantes Torres*/

import javax.swing.JOptionPane;

public class BookSystem 
{

    public static void main(String[] args) 
    {
        String[][] dataArray = {{"Fiction", "Abraham Lincoln Vampire Hunter", "Grahame-Smith", "Wiley", "NY", "13.99", "222"},
        {"Fiction", "Frankenstein", "Shelley", "Prescott", "GA", "7.99", "321"},
        {"NonFiction", "Life of Kennedy", "Jones", "Pearson", "MT","12.90", "biography"},
        {"Fiction", "Dracula", "Stoker", "Addison", "CA", "5.99", "145"},
        {"Fiction", "Curse of the Wolfman", "Hageman", "Wesley", "MA", "10.59", "876"},
        {"NonFiction", "How to Pass Java", "Willis", "Wiley", "NY", "1.99", "technology"},
        {"Fiction", "The Mummy", "Rice",  "Addision", "CA", "7.99", "954"},
        {"NonFiction", "History of Texas", "Smith", "Prescott", "CA", "9.75", "history"}};
        
        int[] quantityArray = {12, 8, 3, 53, 7, 23, 14, 5};
        
        Book[] bookArray = new Book[8];
        double total = 0;
        double grandTotal = 0;
        String message = "";
        
        for(int i = 0; i < dataArray.length; i++)
        {
            if(dataArray[i][0].equalsIgnoreCase("Fiction"))
            {
                bookArray[i] = new Fiction(dataArray[i][1], dataArray[i][2],new Publisher(dataArray[i][3], dataArray[i][4]), Double.parseDouble(dataArray[i][5]));
            }
            else
            {
                bookArray[i] = new NonFiction(dataArray[i][1], dataArray[i][2],new Publisher(dataArray[i][3], dataArray[i][4]), Double.parseDouble(dataArray[i][5])); 
            }
     
            total = bookArray[i].calculateCharge(quantityArray[i]);
            grandTotal += total;
            message += String.format("%20s $%.2f\n", dataArray[i][1], total);
        }
        message += "Grand Total = $"+grandTotal;
        JOptionPane.showMessageDialog(null, message);    
    }    
}

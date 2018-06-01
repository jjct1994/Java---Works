/*
 * @author Jossue Cervantes Torres
 * INSY 4305 - 002
 * SalesCommission.java
 */



package salescommission;

import java.util.Scanner;
//Class 
public class SalesCommission 
{
    
    //Instance Variables for class
    private double itemPrice;
    private double commission;
    private double salary;
    private double itemCommission;
    private int salesRepID;
    
//Constructor sets base salary and 9% commission  
    public SalesCommission()
    {
        this.commission = 0.09;
        this.salary = 200;      
    }
//Setter methods to set ID# and add commission to salary
    public void setSalesRepID(int representative)
    {
        this.salesRepID = representative;
    }
    public void setItemPrice(double itemPrice)
    {
        this.itemPrice = itemPrice;
        this.itemCommission = itemPrice * commission;
        this.salary += itemCommission;
    }
//Getter methods for ID# and Total Salary earned
    public int getSalesPerson()
    {
        return salesRepID;
    }
    
    public double getTotalSalary()
    {
        return salary;
    }

    
    /*Main function 
    *First While Loop creates instance of employee X
    *Nested While Loop calculates commission and adds it to base salary of X employee
    *Nested If Statements in both loops reset or finalize calculations
    */
    public static void main(String[] args) 
    {
        int salesPersonID = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sales Commission Application: Calculate Commission Based Salary");
        
        while(salesPersonID != -1)
        {
            SalesCommission salaryOfSalesPerson = new SalesCommission();
            System.out.println("Enter ID# of sales person or -1 to quit:");
            salesPersonID = input.nextInt();
            if(salesPersonID != -1)
            {
                double costOfItem = 0.0;
                int numberOfItems = 0;                
                salaryOfSalesPerson.setSalesRepID(salesPersonID);
                           
                while(costOfItem != -1)
                    {
                        System.out.println("Enter price of item sold or -1 to calculate total salary.");
                        costOfItem = input.nextDouble();
                        
                        if (costOfItem == -1)
                        {
                            double totalSalary = salaryOfSalesPerson.getTotalSalary();
                            double commissions = totalSalary - 200;
                            System.out.printf("Employee with ID# " + salesPersonID + " has a Salary of $%.2f%n", totalSalary );
                            System.out.println("Base Salary: $200");
                            System.out.printf("Commission: $%.2f on " + numberOfItems + " items sold.%n", commissions);
                            numberOfItems = 0;    
                        }else
                        {
                            numberOfItems += 1;
                            salaryOfSalesPerson.setItemPrice(costOfItem);
                        }                    
                    }
            }
            else
            {
                System.out.println("Calculation Complete");
            } 
        }   
    } 
}

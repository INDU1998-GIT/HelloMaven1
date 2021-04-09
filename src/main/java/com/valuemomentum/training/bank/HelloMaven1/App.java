package com.valuemomentum.training.bank.HelloMaven1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "**********banking application*********" );
        Customer c=new Customer(101,"Raj",5000);
        c.display();
    }
}

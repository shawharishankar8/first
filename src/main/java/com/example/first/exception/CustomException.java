package com.example.first.exception;
import java.util.Scanner;
class Custom extends Exception
{
    public String toString()
    {
        return "This  is toString method";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"This is getmessage method";
    }
}
public class CustomException {
    public static void main(String[] args)
    {
Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a ");
int a=sc.nextInt();
if(a<5)
{
    try
    {
        throw new Custom();

    }
    catch(Exception e)
    {
        System.out.println(e.toString());
        System.out.println(e.getMessage());
    }
}
        System.out.println("Thanks for using this program");
    }
}

package com.example.first.exception;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;
class TryCatch
{
    public static void main(String[] args) throws IOException {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
       // a=sc.nextInt();
        //b=sc.nextInt();
        int []  h= new int[3];
        h[0]=1;
        h[1]=2;
        h[2]=76;

        System.out.println("Enter the index to accessed");
        int x= sc.nextInt();

        System.out.println("Enter  the number to divide");
        int y=sc.nextInt();



        try
        {
            int z=sc.nextInt();
            System.out.println("The result is "+h[x]/y);
           // c=a/b;
            //System.out.println(c);
        } catch(ArithmeticException e )
        {
            System.out.println(e);
        } catch(Exception e )
        {
            System.out.println(e);
        }
    }

}
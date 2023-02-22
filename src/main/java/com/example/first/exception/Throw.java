package com.example.first.exception;
class NegativeradiousException extends  Exception{
    public String tostring()

    {
        return "Radious can not be zero";
    }
}
public class Throw{
    public int divide(int a,int b) throws ArithmeticException
    {
        return a/b;
    }
   public static double area(int r) throws NegativeradiousException
    { Double result;
        if (r<0)
        {
            throw new NegativeradiousException();
        }
        return  result= Math.PI*r*r;
    }
    public static void main(String[] args) {
        Throw t= new Throw();
        try {
            int c = t.divide(6, 0);
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Exception :"+e);
        }
        try {
            area(-5);
        }
        catch(Exception e)
        {
            System.out.println("Excpetion :"+ e);
        }
    }
}

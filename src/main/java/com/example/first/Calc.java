package com.example.first;

public class Calc {
    public static void main(String[] args) {
        int a=add(1,2);
        System.out.println(a);
        System.out.println(sub(10,5));
    }
    public static int add(int a , int b)
    {
        return a+b;
    }
    public static int sub(int a , int b)
    {
        return a-b;
    }
}

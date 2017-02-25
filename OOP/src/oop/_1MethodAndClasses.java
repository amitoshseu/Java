/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author amitoshseu
 */
public class _1MethodAndClasses {
    public static void main(String[] args) {
        int x = add(5,6);
        System.out.print("Addition:");
        System.out.println(x);
        
        x = subtract(10,5);
        System.out.print("Subtraction:");
        System.out.println(x);
        
        x = multiplication(10,5);
        System.out.print("Multiplication:");
        System.out.println(x);
        
        x = division(10,5);
        System.out.print("Division");
        System.out.println(x);
        
    }
    
    public static int add(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    
    public static int subtract(int a, int b)
    {
        int sub = a-b;
        return sub;
    }
    
    public static int multiplication(int a, int b)
    {
        int mul = a*b;
        return mul;
    }
    
    public static int division(int a, int b)
    {
        int div = a/b;
        return div;
    }
     
}

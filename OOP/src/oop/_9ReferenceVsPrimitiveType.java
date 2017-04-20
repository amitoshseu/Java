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
public class _9ReferenceVsPrimitiveType {
    public static void main(String[] args) {
        int x = 13;
        int y = x;
        
        //Primitive Type are independ to each other
        
        System.out.println(x+" "+y+" before");
        y=10;
        System.out.println(x+" "+y+" after");
        
        Test a = new Test();
        Test b = a;
        System.out.println(a.message+" "+b.message+" before");
        a.change();
//        b.change();
        System.out.println(a.message+" "+b.message+" after");
        
    }
}

class Test
{
    String message = "hi";
    
    public void change()
    {
        message = "bye";
    }
}

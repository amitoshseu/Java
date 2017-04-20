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
public class _11bThisKeyword {
    public static void main(String[] args) {
        SomeClass1 someClass = new SomeClass1();
        someClass.no=10;
        someClass.display();
       
        
        SomeClass1 s2 = new SomeClass1();
        s2.no=20;
        s2.display();
        
    }
    
    
    
}

class SomeClass1
{
    int no =1;
    public void display()
    {
        int no =5; 
        System.out.println(no);  
        
        
        System.out.println("Instance variable "+this.no);
    }
}

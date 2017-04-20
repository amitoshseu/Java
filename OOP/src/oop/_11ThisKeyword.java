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
public class _11ThisKeyword {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.display();
    }
    
    
}

class SomeClass
{
    int no =1;
    public void display()
    {
        int no =5; 
        System.out.println(no);  
    }
}

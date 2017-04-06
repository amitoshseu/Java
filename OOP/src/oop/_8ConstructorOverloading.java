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
public class _8ConstructorOverloading {
    public static void main(String[] args) {
        Person3 person = new Person3("Perfect");
        
        Person3 you = new Person3("Amitosh", "Gain", 23);
    }
}

class Person3
{
    String firstName;
    String lastName;
    int age;
    
    Person3()
    {
        System.out.println("Default constructor called here...");
        firstName = null; lastName = null; age=-1;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
    
    Person3(String f, String l, int a)
    {
        System.out.println("parameterized constructor called here...");
        firstName = f; lastName=l; age = a; 
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
    
    /*
    When you several constructors, try to find the one with the most arguments,
    let it do all the work, from within all the other constructors, try to call 
    the biggest one, the benefit = write all code at 1 place and everyone s goona
    run the same constructor and hence no matter which constructor your objects use, 
    the data will always be consistent. 
    */
    
    Person3(String f)
    {
//        System.out.println("parameterized constructor with 1 argument called here...");
//        firstName = "Mr "+f;
//        lastName = null;
//        age = -1;
//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(age);
        this(f,null,-1);
    }
}

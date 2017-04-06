
package oop;

/**
 *
 * @author amitoshseu
 */
public class _6VariableScope {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}


class Person
{
    String firstName;
    String lastName;
    boolean test;
    
    public void display()
    {
       
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(test);
        if(firstName != null)
        {
        System.out.println(firstName.length());
        }
    }
    public void test()
    {
        
    }
}
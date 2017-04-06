package oop;


public class _7Constructor {
    public static void main(String[] args) {
        Person2 p = new Person2("Amitosh","Gain",false);
        
        System.out.println(p.firstName);
        System.out.println(p.test);
//        
//        Person q  = new Person();
//        System.out.println(q.firstName);
//        System.out.println(q.test);
    }
 
}

/* 
    You dont have to define a defaulst constructor. java automatically 
    provides a default constructor that gives default values to all 
    instance variable as long as you dont start making constuctors inside your class.
*/
class Person2
{
    String firstName;
    String lastName;
    boolean test;
    
    Person2(String f, String l, boolean t)
    {   
        System.out.println("Constructor was called ");
        System.out.println(f+" "+l+" "+t);
        firstName = f;
        lastName = l;
        test = t;
    }
   
}
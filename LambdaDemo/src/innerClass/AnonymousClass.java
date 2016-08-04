/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerClass;

/**
 *
 * @author amitoshseu
 */
public class AnonymousClass {
    
    public static void main(String[] args) {
        B obj = new B(){
            public void show(){
                System.out.println("Hi, It's me");
            }
        };
        obj.show();
    }
}

class B{
    public void show(){
        System.out.println("Hello");
    }
}


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
public class _4CircleRadious {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.findArea(3.5);
        Circle c2 = new Circle();
        c2.findArea(4.1);
        
                    /*
                        c.radius = 3.5;
                        c.area = 3.14*c.radius*c.radius;
                        System.out.println(c.area);

                        Circle c2 = new Circle();
                        c2.radius = 4.1;
                        c2.area = 3.14*c2.radius*c2.radius;
                        System.out.println(c2.area);
                    */

       
        
    }
    
}

class Circle
{
    double radius;
    double area;
    public void findArea(double r)
    {
        radius = r; 
        area = radius*radius*3.14;
        System.out.println(area);
    }
}

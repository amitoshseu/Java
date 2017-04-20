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
public class _12OverriddingTest {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        cycle.printInfo();
        
        Bicycle bicycle = new Bicycle();
//        System.out.println(bicycle.weight);
//        System.out.println(bicycle.brand);
        bicycle.printInfo();
    }
}

class Cycle
{
    int weight = 10; 
    public void printInfo()
    {
        System.out.println("superclass" +weight);
    }
}

class Bicycle extends Cycle
{
    String brand = "hero";
    public void printInfo()
    {
        System.out.println("subclass" +brand);
    }
}

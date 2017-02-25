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
public class _3MethodOverloading {
    public static void main(String[] args) {
        Maths maths = new Maths();
        double no = maths.max(5.0, 7.0);
        System.out.println(no);
    }
    
}

  class Maths
    {
        public int max(int x, int y)
        {
            int max = 0;
            if(x>y)
            {
                max = x;
            }
            else
            {
                max = y;
            }
            System.out.println("Integer version called");
            return max;
        }
        
        public double max(double x, double y)
        {
            double max = 0;
            if(x>y)
            {
                max = x;
            }
            else
            {
                max = y;
            }
            System.out.println("Double version called");
            return max;
        }
    }


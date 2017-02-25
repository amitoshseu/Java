/*
    METHOD Callstack program are not complete
    UR:  https://www.youtube.com/watch?v=jAY-Zc5s0_o&list=PLonJJ3BVjZW6_q8gh7XoLUIhRIyBcYJLP&index=5#t=44.727596
 */
package oop;

/**
 *
 * @author amitoshseu
 */

public class _2Method {
    public static void main(String[] args) {
        int a =5, b = 7, result;
        result = max(a,b);
        System.out.println(result);
    }
    
    public static int max(int x, int y)
    {
        int max;
        if(x>y)
        {
            max = x; 
        }
        else
        {
            max =y;
        }
        return max;
    }
}

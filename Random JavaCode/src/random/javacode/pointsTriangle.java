package random.javacode;

import java.util.Scanner;

/**
 *
 * @author amitoshseu
 */
public class pointsTriangle {

    
    public static void main (String [] args) {
        int x1 = 1, y1 = 1;
        int x2 = 4, y2 = 2;
        int x3 = 2, y3 = 0;
        
        //obtain point (x,y) from user
        System.out.print("Enter a point's x- and y-coordinates: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        
       
        double ABC = Math.abs (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        double ABP = Math.abs (x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
        double APC = Math.abs (x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
        double PBC = Math.abs (x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));

        boolean isInTriangle = ABP + APC + PBC == ABC;

        if (isInTriangle)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
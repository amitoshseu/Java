/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.javacode;

/**
 *
 * @author amitoshseu
 */
public class Triangle_3 {
    public static void main(String[] args) {
        int size=5;
        for (int i = 1; i <=size; i++) 
        {
            for (int j = size; j>=1; j--)
            {
                if(j>=i)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

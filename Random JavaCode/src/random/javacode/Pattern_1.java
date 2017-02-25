/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.javacode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author amitoshseu
 */

/*
This pattern will be output if we enter number 10
    **********
    *        *
    *        *
    *        *
    *        *
    *        *
    *        *
    *        *
    *        *
    **********
*/




public class Pattern_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size");
        int size = Integer.parseInt(reader.readLine());
        
        //1st row 
        //make size-2 rows
        //last row
        for (int i = 1; i <=size; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        for(int j = 1; j<=size-2; j++){
          for (int i = 1; i <=size; i++) {
                if(i ==1 || i== size){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
       }
       
       
        
        for (int i = 1; i <=size; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        
    }
}

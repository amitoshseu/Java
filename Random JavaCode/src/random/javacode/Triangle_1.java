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
 *  
 */

public class Triangle_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size");
        int size = Integer.parseInt(reader.readLine());
        
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                if(j<=i)  //when column become bigger than row don't print
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

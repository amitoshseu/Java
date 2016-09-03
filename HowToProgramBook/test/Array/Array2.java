/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author amitoshseu
 */
public class Array2 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int [ARRAY_LENGTH]; //create array
        
        //calculate value for each array element
        for(int counter =0; counter<array.length; counter++)
            array[counter] = 2 +2 *counter;
        System.out.printf("%s%8s\n","Index","Value");//Column headings
        //ouput each array element's value
        for(int counter = 0; counter<array.length; counter++)
            System.out.printf("%5d%8d\n",counter,array[counter]);
    }
}

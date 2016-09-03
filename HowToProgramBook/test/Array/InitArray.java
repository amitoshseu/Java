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
public class InitArray {
    public static void main(String[] args) {
        int[] array; //declare array named array
        array = new int[10]; //create the array object
        System.out.printf("%s%8s\n","Index","Value");
        
        for(int counter = 0; counter<array.length; counter++)
            System.out.printf("%5d%8d\n",counter,array[counter]);
    }
}

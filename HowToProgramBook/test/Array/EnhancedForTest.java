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
public class EnhancedForTest {
    public static void main(String[] args) {
        int[] array ={87,68,94,100,83,78,85,91,76,87};
        int total = 0;
        //add each element's value for total
        for(int number: array)
            total +=number;
        System.out.printf("Total of array elements: %d%n",total);
    }
}

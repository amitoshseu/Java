/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.javacode;

/*
*              *
***           ***
*****        *****
*******     *******
*****        *****
***           ***
*              *
*/

public class Diamond_1 {
    public static void main(String[] args) {
        int size=9;
        int odd=1;
        int noOfSpaces=size/2;
        for(int i=1; i<=size; i++)
        {   
            for(int j=noOfSpaces; j>=1; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=odd;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
            if(i<size/2+1) //insde condtion is middle row of diamond
            {
                odd= odd+2;
                noOfSpaces = noOfSpaces-1;
            }
               
            else
            {
                odd = odd-2;
                noOfSpaces = noOfSpaces+1;
            }
                
        }
        
        
    }
}

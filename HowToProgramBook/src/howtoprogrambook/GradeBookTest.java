/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtoprogrambook;

import java.util.Scanner;

/**
 *
 * @author amitoshseu
 */
public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        GradeBook myGradeBook = new GradeBook();
        System.out.printf("Initial course name is: %s\n\n ",myGradeBook.getCourseName());
        
        System.out.println("Please enter the course name");
        String theName = input.nextLine();
        myGradeBook.setCourseName(theName);
        System.out.println();
        
        myGradeBook.displayMessage();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtoprogrambook;

/**
 *
 * @author amitoshseu
 */
public class GradeBook {
    String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void displayMessage(){
        System.out.printf("Welcome to the grade book for\n%s!\n",getCourseName());
    }
}

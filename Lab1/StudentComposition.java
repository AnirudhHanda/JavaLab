
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;
import java.util.*;
/**
 *
 * @author aniru
 */
public class StudentComposition {
    Computer comp;
    StudentNew st;
    void inputDetails(){
        this.st = new StudentNew();
        this.comp = new Computer();
        
        this.st.inputStudentDetails();
        this.comp.inputComputerDetails();
    }
    void displayDetails(){
        this.st.displayStudentDetails();
        this.comp.displayComputerDetails();
    }
    
    public static void main(String args[]){
        StudentComposition stud = new StudentComposition();
        stud.inputDetails();
        stud.displayDetails();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;
import java.util.*;

public class StudentNew{
    private String name = "";
    private String roll = "";
    
    void inputStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Student's roll: ");
        sc = new Scanner(System.in);
        this.roll = sc.nextLine();
    }
    
    void displayStudentDetails(){
        System.out.println("Student details: "+this.name+", "+ this.roll);
    }
}
/**
 *
 * @author aniru
 */
//public class StudentNew {
//    public static void main(String args[]){
//        // For Testing only
////        StudentNew st = new StudentNew();
////        st.inputStudentDetails();
////        st.displayStudentDetails();
//
//          StudentNew[] stuArr;
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the size of Student Array: ");
//          int size = sc.nextInt();
//          stuArr = new StudentNew[size];
//          for(int i = 0; i<size; i++){
//             stuArr[i] = new StudentNew();
//             stuArr[i].inputStudentDetails();
//          }
//          
//          for(StudentNew i : stuArr){
//              i.displayStudentDetails();
//          }
//          
//    }
//}

package Lab1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Student2 {
    Student2(){
        System.out.println("Object created using default constructor");
    }
    
    Student2(String s){
        System.out.println(s);
    }
    
    public static void main(String args[]){
        Student2 s = new Student2();
    }
}

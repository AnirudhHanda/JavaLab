/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;
import java.util.*;
/**
 *
 * @author aniru
 */
public class AccessModifiers {
    
    int roll = 1;
    String name = "A";
    
    private void display(){
        System.out.println("Name is "+this.name+" roll is "+this.roll);
    }
    
    static void demo(){
        System.out.println("Demo Function");
    }
    
    public static void main(String args[]){
        AccessModifiers obj = new AccessModifiers();
        obj.display();
        
        AccessModifiers.demo();
//        demo();
    }
}

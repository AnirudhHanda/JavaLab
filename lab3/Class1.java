/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author aniru
 */
public class Class1 {
    public static void display(){
        System.out.println("Hello world!");
    }
    
    public void display2(){
        System.out.println("Hello WOrld2!");
        
        Class1.display();
    }
    
    public static void main(String[] args){
        System.out.println("Main");
        Class1 c = new Class1();
        c.display2();
    }
}

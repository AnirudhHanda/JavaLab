/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author aniru
 */
public class MethodOverloading_MethodSignature {
    void display(){
        System.out.println("HEllo Dhiraj");
    }
    int display(int x){
        return x;                       // cuz signature is same for both display functions -> we cannot use them for Method Overloading
    }
    public static void main(String args[]){
        MethodOverloading_MethodSignature obj = new MethodOverloading_MethodSignature();
        
        System.out.println(obj.display(5));
    }
}

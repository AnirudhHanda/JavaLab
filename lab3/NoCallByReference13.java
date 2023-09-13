/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author aniru
 */
class A{
    private int x = 0;
    void setX(int a){
        this.x = a;
    }
    int getX(){
        return this.x;
    }
}

public class NoCallByReference13 {
   static void swap(A a1, A a2){
       A temp;
       temp = a1;
       a1 = a2;
       a2 = temp;
   }
   
   public static void main(String[] args){
       A a1 = new A();
       a1.setX(5);
       
       A a2 = new A();
       a2.setX(7);
       
       System.out.println("BEfore Swap: ");
       System.out.println("a1: "+a1.getX()+"a2: "+a2.getX());
       
       NoCallByReference13.swap(a1, a2);
       
       System.out.println("After Swap: ");
       System.out.println("a1: "+a1.getX()+"a2: "+a2.getX());
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author aniru
 */
public class PrivateMembersBest12 {
    private String name = "";
    private int age;
    
    PrivateMembersBest12(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    
    public static void main(String args[]){
        // creating a reference and an object to which it is reffering
        PrivateMembersBest12 obj = new PrivateMembersBest12("Anirudh", 19);
        
        // displaying initial values
        System.out.println("Initial Name:  "+obj.getName()+", Initial Age: "+obj.getAge());
        
        //updating values using setters
        obj.setName("Anirudh Handa");
        obj.setAge(20);
        
        // displying updated values using getters
        System.out.println("Updated Name: "+obj.getName()+", Updated Age: "+obj.getAge());
    }
}

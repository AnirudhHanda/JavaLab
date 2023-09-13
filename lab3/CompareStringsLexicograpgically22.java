/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;
import java.util.*;

/**
 *
 * @author aniru
 */
public class CompareStringsLexicograpgically22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("Comparing "+str1+" and "+str2+" Lexicographically: ");
        if(str1.compareToIgnoreCase(str2)<0){
            System.out.println(str2+" > "+str1);
        } else if(str1.compareToIgnoreCase(str2) > 0){
            System.out.println(str1+" > "+str2);
        } else{
            System.out.println(str1+" = "+str2);
        }
    }
    
}

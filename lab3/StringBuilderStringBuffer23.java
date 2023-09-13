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
public class StringBuilderStringBuffer23 {
    public static String toUpperCase(String str){
        char ch = Character.toUpperCase(str.charAt(0));
        StringBuilder sb = new StringBuilder("");
        sb.append(ch);
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("\nModified String: "+toUpperCase(str));
        
        StringBuffer sf = new StringBuffer("Welcome to SMVDU");
        sf.append(" Students");
        System.out.println(sf);
    }
}

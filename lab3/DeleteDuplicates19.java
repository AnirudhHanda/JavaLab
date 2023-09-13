/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author aniru
 */
import java.util.*;
public class DeleteDuplicates19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String of words: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder("");
//        for(String i:arr){
//            System.out.println(i+" ");
//        }
        
        for(int i = 0; i<arr.length; i++){
            boolean yes = false;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i].equalsIgnoreCase(arr[j])){
                    yes = true;
                    if(sb.indexOf(arr[i])==-1){
                        sb.append(arr[i]).append(" ");
                    }
                    else{
                        continue;
                    }
                }
            }
            if(yes!=true && sb.indexOf(arr[i])==-1){
                sb.append(arr[i]).append(" ");
            }
//            yes = false;
        }
        String res = sb.toString().trim();
        System.out.println("Without duplicates: "+res);
    }
    
}

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
public class ReplacingEvenIndeces21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        
        char[] arr = str.toCharArray();
        
        // handling the main case
        for(int i = 0; i<arr.length; i+=2){
            if((i+2)<arr.length){
                char temp = arr[i];
                arr[i] = arr[i+2];
                arr[i+2] = temp;
            }
        }
        
        // handling the last case
        if(arr.length%2==0){
            arr[arr.length-2] = '1';
        } else{
            arr[arr.length-1] = '1';
        }
        
        String newStr = "";
        for(int i = 0; i<arr.length; i++){
            newStr+=arr[i];
        }
        System.out.println("Modified String: "+newStr);
    }
}

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
public class OccurrenceOfString18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the required sequence: ");
        String seq = sc.next();
        
        
        int count = 0;
//        if(str.startsWith(seq)){
//            count++;
//        }
        if(str.endsWith(seq)){
            count++;
        }
        
        String[] strArr = str.split(seq);
        
        count += strArr.length - 1;

        System.out.println("Number of occurence of Sequence "+seq+": "+count);
        
    }
}
